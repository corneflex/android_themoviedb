package com.corneflex.themoviedb.data.entity

import android.util.Log
import com.squareup.moshi.Json
import java.util.*
import kotlin.reflect.KClass

class MovieEntity(
        val id: String,

        @Json(name = "imdb_id")
        val imdbId: String,

        @Json(name = "vote_average")
        val voteAverage: String,

        val budget: String,

        @Json(name = "backdrop_path")
        val backDropPath: String,

        val status: String,

        val runtime: String,

        val adult: Boolean,

        val homepage: String,

        val title: String,

        @Json(name = "original_language")
        val originalLanguage: String,

        val overview: String,

        @Json(name = "original_title")
        val originalTitle: String,

        @Json(name = "vote_count")
        val voteCount: Int,

        @Json(name = "poster_path")
        val posterPath: String,

        val video: Boolean,

        @Json(name = "tagline")
        val tagLine: String,

        val revenue: Long,

        val popularity: String,

        @Json(name = "release_date")
        val releaseDate: Date,

        @Json(name = "production_companies")
        val companies: List<CompanyEntity>,

        @Json(name = "spoken_languages")
        val spokenLanguages: List<LanguageEntity>
)

