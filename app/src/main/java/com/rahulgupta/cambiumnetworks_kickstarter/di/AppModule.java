package com.rahulgupta.cambiumnetworks_kickstarter.di;

import com.rahulgupta.cambiumnetworks_kickstarter.ui.project.ProjectHomeActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Gupta on 28/10/17.
 */

@Module
public abstract class AppModule {

    @ContributesAndroidInjector(modules = {BindingModule.class, PresenterModule.class})
    abstract ProjectHomeActivity bindProjectHomeActivity();
}
