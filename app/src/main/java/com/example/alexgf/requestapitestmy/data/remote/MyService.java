package com.example.alexgf.requestapitestmy.data.remote;

import com.example.alexgf.requestapitestmy.data.model.MyAnswersResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyService {

    @GET("/expenses")
    Call<MyAnswersResponse> getAnswers();
}
