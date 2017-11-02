package com.rahulgupta.cambiumnetworks_kickstarter.di;

import com.rahulgupta.cambiumnetworks_kickstarter.data.DataManager;
import com.rahulgupta.cambiumnetworks_kickstarter.data.DataManagerImpl;
import com.rahulgupta.cambiumnetworks_kickstarter.network.KickStarterApi;
import com.rahulgupta.cambiumnetworks_kickstarter.ui.project.ProjectHomeActivity;
import com.rahulgupta.cambiumnetworks_kickstarter.ui.project.ProjectHomeView;
import com.rahulgupta.cambiumnetworks_kickstarter.ui.project.presenter.ProjectHomePresenter;
import com.rahulgupta.cambiumnetworks_kickstarter.ui.project.presenter.ProjectHomePresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Gupta on 28/10/17.
 */

@Module
public class PresenterModule {


    @Provides
    public DataManager provideDataManager(KickStarterApi kickStarterApi) {
        return new DataManagerImpl(kickStarterApi);
    }

    @Provides
    public ProjectHomePresenter provideProjectHomePresenter(ProjectHomeView projectHomeView,
                                                            DataManager dataManager) {
        return new ProjectHomePresenterImpl(projectHomeView, dataManager);
    }

}
