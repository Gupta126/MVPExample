package com.rahulgupta.cambiumnetworks_kickstarter.network;

import com.rahulgupta.cambiumnetworks_kickstarter.data.model.ProjectInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Gupta on 28/10/17.
 */

public interface KickStarterApi {

    @GET("kickstarter")
    Call<List<ProjectInfo>> getProject();

}
