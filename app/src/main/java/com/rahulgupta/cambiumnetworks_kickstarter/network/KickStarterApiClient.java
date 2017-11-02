package com.rahulgupta.cambiumnetworks_kickstarter.network;

/**
 * Created by Gupta on 28/10/17.
 */

public interface KickStarterApiClient<T> {

    void onSuccess(T response);

    void onError(Exception exception);
}
