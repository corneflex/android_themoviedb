package com.corneflex.themoviedb.inject.components

import android.app.Activity
import android.content.Context
import com.corneflex.themoviedb.MainActivity
import com.corneflex.themoviedb.MyApplication
import com.corneflex.themoviedb.inject.modules.ApplicationModule
import com.corneflex.themoviedb.inject.modules.MainActivityModule
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import javax.inject.Singleton




@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = arrayOf(ApplicationModule::class, MainActivityModule::class))
interface ApplicationComponent {
    fun inject(application: MyApplication)
    fun Context():Context
}