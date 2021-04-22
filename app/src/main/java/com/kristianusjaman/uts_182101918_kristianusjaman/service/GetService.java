package com.kristianusjaman.uts_182101918_kristianusjaman.service;

import com.kristianusjaman.uts_182101918_kristianusjaman.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("users")
    Call<List<User>> getUsersList();
}
