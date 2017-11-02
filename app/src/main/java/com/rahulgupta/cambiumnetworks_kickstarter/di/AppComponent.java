package com.rahulgupta.cambiumnetworks_kickstarter.di;

import com.rahulgupta.cambiumnetworks_kickstarter.KickStarterApp;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

/**
 * Created by Gupta on 28/10/17.
 */

@Component(modules = {NetworkModule.class, AppModule.class})
public interface AppComponent extends AndroidInjector<KickStarterApp> {

}
