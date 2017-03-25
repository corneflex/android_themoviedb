package com.corneflex.themoviedb.domain.model

import java.util.*

class Language (var name: String? = "", var iso: String? = ""){
  /*  constructor(name: String? = null, iso: String?){

    }*/
}

class Company(var id:String = "", var description:String? = null, var headquarters:String? = null, var name: String = "", var logoPath:String? = null, var parentCompany: String? = null )

class Movie (
            var id: String = "",
            var imdbId: String?= null,
            var voteAverage: String? = null,
            var budget: String? = null,
            var backDropPath: String? = null,
            var status: String? = null,
            var runtime: String? = null,
            var adult: Boolean? = false,
            var homepage: String? = null,
            var title: String? = null,
            var originalLanguage: String? = "en",
            var overview: String? = null,
            var originalTitle: String? = null,
            var voteCount: Int = 0,
            var posterPath: String? = null,
            var video: Boolean? = false,
            var tagline: String? = null,
            var revenue: Long = 0,
            var popularity: String? = null,
            var releaseDate: Date? = null,
            var compagnies: List<Company>? = null,
            var spokenLanguages: List<Language>? = null
    )