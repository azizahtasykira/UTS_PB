package com.example.githubuserapp.retrofit

import com.example.githubuserapp.data.response.DetailUserResponse
import com.example.githubuserapp.data.response.User
import com.example.githubuserapp.data.response.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail (
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>
}