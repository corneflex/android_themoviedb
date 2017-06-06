package com.corneflex.themoviedb

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.corneflex.themoviedb.data.entity.LanguageEntity
import com.corneflex.themoviedb.data.net.MoviesService
import com.corneflex.themoviedb.data.repository.MovieDataRepository
import dagger.android.AndroidInjection
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class MainActivity @Inject constructor() : AppCompatActivity() {

    @Inject lateinit var movieService: MoviesService
    @Inject lateinit var repo: MovieDataRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val res = repo.getMovie(500)
        res.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(::println)

    }
}
