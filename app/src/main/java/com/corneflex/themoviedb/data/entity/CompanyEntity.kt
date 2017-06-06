package com.corneflex.themoviedb.data.entity

import com.squareup.moshi.Json

class CompanyEntity(val id: String, val description: String?, val headquarters: String?, val name: String, @Json(name = "logo_path") val logoPath: String?, val parentCompany: String?)

