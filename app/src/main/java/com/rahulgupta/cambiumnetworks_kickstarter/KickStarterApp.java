package com.rahulgupta.cambiumnetworks_kickstarter;

import android.app.Activity;
import android.app.Application;

import com.rahulgupta.cambiumnetworks_kickstarter.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by Gupta on 28/10/17.
 */

public class KickStarterApp extends Application implements HasActivityInjector {


    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().build().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
