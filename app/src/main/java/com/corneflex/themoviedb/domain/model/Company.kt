package com.corneflex.themoviedb.domain.model

/**
 * Created by steve on 03/06/2017.
 */

data class Company(var id:String = "", var description:String? = null, var headquarters:String? = null, var name: String = "", var logoPath:String? = null, var parentCompany: String? = null )
