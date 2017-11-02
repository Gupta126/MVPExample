package com.rahulgupta.cambiumnetworks_kickstarter.ui.project;

import com.rahulgupta.cambiumnetworks_kickstarter.data.model.ProjectInfo;

import java.util.List;

/**
 * Created by Gupta on 28/10/17.
 */

public interface ProjectHomeView {

    void renderProjectList(List<ProjectInfo> projectInfos);

    void showMessage();
}
