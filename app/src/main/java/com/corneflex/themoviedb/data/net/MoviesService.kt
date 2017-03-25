package com.corneflex.themoviedb.data.net

import com.corneflex.themoviedb.data.entity.MovieEntity
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface MoviesService {
    @GET("movie/{id}")
    fun getMovie(@Path("id") id:Int): Observable<MovieEntity>

    @GET("movie/latest")
    fun getLatest():Observable<MovieEntity>



}
