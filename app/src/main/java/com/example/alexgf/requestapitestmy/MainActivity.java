package com.example.alexgf.requestapitestmy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.alexgf.requestapitestmy.data.model.MyAnswersResponse;
import com.example.alexgf.requestapitestmy.data.remote.ApiUtils;
import com.example.alexgf.requestapitestmy.data.remote.MyService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private MyService mService;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.RV_answer);
        mService = ApiUtils.getMyService();

        loadAnswers();
    }



    public void loadAnswers(){
        mService.getAnswers().enqueue(new Callback<MyAnswersResponse>() {
            @Override
            public void onResponse(Call<MyAnswersResponse> call, Response<MyAnswersResponse> response) {
                if(response.isSuccessful()){
                    String s  = response.body().getExpenses().get(0).getDescription();
                    tv1.setText(s);
                }else {
                    int statusCode = response.code();
                }
            }

            @Override
            public void onFailure(Call<MyAnswersResponse> call, Throwable t) {
                tv1.setText("error en api");
                Log.d("Main activity","error loading from api");
            }
        });
    }
}


