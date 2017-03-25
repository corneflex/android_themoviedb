package com.corneflex.themoviedb.inject.components

import com.corneflex.themoviedb.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent()
interface MainActivitySubComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}
