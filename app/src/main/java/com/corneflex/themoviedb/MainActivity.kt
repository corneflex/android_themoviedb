package com.corneflex.themoviedb

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.corneflex.themoviedb.data.entity.LanguageEntity
import com.corneflex.themoviedb.data.entity.mapper.LanguageMapper
import com.corneflex.themoviedb.data.net.MoviesService
import dagger.android.AndroidInjection
import fr.xebia.extras.selma.Selma
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class MainActivity @Inject constructor() : AppCompatActivity() {

    @Inject lateinit var movieService: MoviesService

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val res = movieService.getMovie(500)
        res.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(::println)


        val mapper = Selma.builder(LanguageMapper::class.java).build()
        val l = mapper.transform(LanguageEntity(name = "toto",iso = "en"))
        println(l.name)
    }
}
