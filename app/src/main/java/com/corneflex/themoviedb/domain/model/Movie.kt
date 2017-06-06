package com.corneflex.themoviedb.domain.model

import java.util.*

data class Movie(
    val id: String,
    val imdbId: String = "",
    val voteAverage: String = "",
    val budget: String = "",
    val backDropPath: String = "",
    val status: String = "",
    val runtime: String = "",
    val adult: Boolean = false,
    val homepage: String = "",
    val title: String = "",
    val originalLanguage: String = "en",
    val overview: String = "",
    val originalTitle: String = "",
    val voteCount: Int = 0,
    val posterPath: String = "",
    val video: Boolean = false,
    val tagline: String = "",
    val revenue: Long = 0,
    val popularity: String = "",
    val releaseDate: Date? = null,
    val companies: List<Company> = arrayListOf(),
    val spokenLanguages: List<Language> = arrayListOf()
)

