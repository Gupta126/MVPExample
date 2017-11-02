package com.rahulgupta.cambiumnetworks_kickstarter.data;

import android.util.Log;

import com.rahulgupta.cambiumnetworks_kickstarter.data.model.ProjectInfo;
import com.rahulgupta.cambiumnetworks_kickstarter.network.KickStarterApi;
import com.rahulgupta.cambiumnetworks_kickstarter.network.KickStarterApiClient;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Gupta on 28/10/17.
 */

public class DataManagerImpl implements DataManager {


    private static final String TAG = DataManagerImpl.class.getName();
    private KickStarterApi kickStarterApi;

    @Inject
    public DataManagerImpl(KickStarterApi kickStarterApi) {
        this.kickStarterApi = kickStarterApi;
    }

    @Override
    public void fetchProject(final KickStarterApiClient<List<ProjectInfo>> kickStarterApiClient) {


        kickStarterApi.getProject().enqueue(new Callback<List<ProjectInfo>>() {
            @Override
            public void onResponse(Call<List<ProjectInfo>> call, Response<List<ProjectInfo>> response) {
                Log.d(TAG, "onResponse: " + response.body());
            }

            @Override
            public void onFailure(Call<List<ProjectInfo>> call, Throwable t) {

            }
        });


    }
}
