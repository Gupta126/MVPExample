package com.rahulgupta.cambiumnetworks_kickstarter.ui.project.presenter;

import android.util.Log;

import com.rahulgupta.cambiumnetworks_kickstarter.data.DataManager;
import com.rahulgupta.cambiumnetworks_kickstarter.data.model.ProjectInfo;
import com.rahulgupta.cambiumnetworks_kickstarter.network.KickStarterApiClient;
import com.rahulgupta.cambiumnetworks_kickstarter.ui.project.ProjectHomeView;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Gupta on 28/10/17.
 */

public class ProjectHomePresenterImpl implements ProjectHomePresenter {

    private ProjectHomeView projectHomeView;

    private DataManager dataManager;

    private static final String TAG = ProjectHomePresenterImpl.class.getName();

    @Inject
    public ProjectHomePresenterImpl(ProjectHomeView projectHomeView, DataManager dataManager) {
        this.projectHomeView = projectHomeView;
        this.dataManager = dataManager;
    }

    @Override
    public void init() {
        presentProjects();
        projectHomeView.showMessage();
    }

    private void presentProjects() {

        dataManager.fetchProject(new KickStarterApiClient<List<ProjectInfo>>() {
            @Override
            public void onSuccess(List<ProjectInfo> response) {
                Log.d(TAG, "onSuccess: " + response.toString());
                projectHomeView.renderProjectList(response);
            }

            @Override
            public void onError(Exception exception) {

            }
        });

    }
}
