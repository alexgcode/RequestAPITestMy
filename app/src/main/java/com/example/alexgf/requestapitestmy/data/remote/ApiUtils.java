package com.example.alexgf.requestapitestmy.data.remote;

public class ApiUtils {

    public static final String BASE_URL = "http://3.93.246.120:5000/";

    public static MyService getMyService(){
        return RetrofitClient.getClient(BASE_URL).create(MyService.class);
    }
}
