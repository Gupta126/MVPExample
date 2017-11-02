package com.rahulgupta.cambiumnetworks_kickstarter.di;

import com.rahulgupta.cambiumnetworks_kickstarter.ui.project.ProjectHomeActivity;
import com.rahulgupta.cambiumnetworks_kickstarter.ui.project.ProjectHomeView;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Gupta on 28/10/17.
 */

@Module
public abstract class BindingModule {

    @Binds
    abstract ProjectHomeView provideProjectHomeView(ProjectHomeActivity projectHomeActivity);

}
