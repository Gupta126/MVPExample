package com.rahulgupta.cambiumnetworks_kickstarter.data;

import com.rahulgupta.cambiumnetworks_kickstarter.data.model.ProjectInfo;
import com.rahulgupta.cambiumnetworks_kickstarter.network.KickStarterApiClient;

import java.util.List;

/**
 * Created by Gupta on 28/10/17.
 */

public interface DataManager {

    void fetchProject(KickStarterApiClient<List<ProjectInfo>> kickStarterApiClient);
}
