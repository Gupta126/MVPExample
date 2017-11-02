package com.rahulgupta.cambiumnetworks_kickstarter.ui.project;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.rahulgupta.cambiumnetworks_kickstarter.R;
import com.rahulgupta.cambiumnetworks_kickstarter.data.model.ProjectInfo;
import com.rahulgupta.cambiumnetworks_kickstarter.ui.project.adapter.ProjectRecyclerViewAdapter;
import com.rahulgupta.cambiumnetworks_kickstarter.ui.project.presenter.ProjectHomePresenter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import retrofit2.Retrofit;

public class ProjectHomeActivity extends Activity implements ProjectHomeView {


    @Inject
    ProjectHomePresenter projectHomePresenter;


    @BindView(R.id.recycler_view_project)
    RecyclerView projectRecyclerView;

    private ProjectRecyclerViewAdapter projectRecyclerViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_project_home);

        ButterKnife.bind(this);

        projectHomePresenter.init();
    }

    @Override
    public void renderProjectList(List<ProjectInfo> projectInfos) {

        if (projectRecyclerViewAdapter == null) {
            projectRecyclerViewAdapter = new ProjectRecyclerViewAdapter(projectInfos);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            projectRecyclerView.setLayoutManager(mLayoutManager);
            projectRecyclerView.setItemAnimator(new DefaultItemAnimator());
            projectRecyclerView.setAdapter(projectRecyclerViewAdapter);
        }else {
            projectRecyclerViewAdapter.setProjectInfoList(projectInfos);
            projectRecyclerViewAdapter.notifyDataSetChanged();
        }

    }

    @Override
    public void showMessage() {
        Log.d("ProjectHomeActivity", "showMessage: MMMMMM");
    }
}
