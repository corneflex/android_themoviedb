package com.corneflex.themoviedb

import android.app.Activity
import android.app.Application
import com.corneflex.themoviedb.inject.components.ApplicationComponent
import com.corneflex.themoviedb.inject.components.DaggerApplicationComponent
import com.corneflex.themoviedb.inject.modules.ApplicationModule
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingActivityInjector
import javax.inject.Inject

class MyApplication  @Inject constructor() : Application(), HasDispatchingActivityInjector {

    @Inject lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
       return dispatchingActivityInjector
    }


    val component : ApplicationComponent
        get() = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()


    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}

