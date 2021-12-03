package com.example.airost;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {
   @GET("path")
    Call<getjunction> getPosts(@Query("id")int id);
}
