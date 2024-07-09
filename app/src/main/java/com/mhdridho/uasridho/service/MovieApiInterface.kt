package com.mhdridho.uasridho.service

import com.mhdridho.uasridho.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=a8813f2da5ba9fe9a7c06695ae7f4993")
    fun getMovieList(): Call<MovieResponse>

}