package com.rahulgupta.cambiumnetworks_kickstarter.di;

import com.rahulgupta.cambiumnetworks_kickstarter.BuildConfig;
import com.rahulgupta.cambiumnetworks_kickstarter.KickStarterApp;
import com.rahulgupta.cambiumnetworks_kickstarter.network.KickStarterApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Gupta on 28/10/17.
 */

@Module
public class NetworkModule {

    @Provides
    public KickStarterApp provideKickStarterApp() {

        return new KickStarterApp();
    }


    @Provides
    public OkHttpClient provideOkHttp() {

        return new OkHttpClient.Builder().build();
    }


    @Provides
    public Retrofit provideRetrofit(OkHttpClient okHttpClient) {

        return new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BuildConfig.BASE_URL)
                .build();
    }

    @Provides
    public KickStarterApi provideKickStarterApi(Retrofit retrofit) {

        return retrofit.create(KickStarterApi.class);
    }


}
