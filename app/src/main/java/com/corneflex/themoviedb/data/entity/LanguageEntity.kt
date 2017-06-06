package com.corneflex.themoviedb.data.entity

import com.squareup.moshi.Json

class LanguageEntity(val name: String = "", @Json(name = "iso_639_1") val iso: String = "")
