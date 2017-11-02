package com.rahulgupta.cambiumnetworks_kickstarter.ui.project.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rahulgupta.cambiumnetworks_kickstarter.R;
import com.rahulgupta.cambiumnetworks_kickstarter.data.model.ProjectInfo;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Gupta on 28/10/17.
 */

public class ProjectRecyclerViewAdapter extends RecyclerView.Adapter<ProjectRecyclerViewAdapter.ViewHolder> {

    private List<ProjectInfo> projectInfoList;

    public ProjectRecyclerViewAdapter(List<ProjectInfo> projectInfoList) {
        this.projectInfoList = projectInfoList;
    }

    public void setProjectInfoList(List<ProjectInfo> projectInfoList) {
        this.projectInfoList = projectInfoList;
    }

    @Override
    public ProjectRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_project_info, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProjectRecyclerViewAdapter.ViewHolder holder, int position) {

        ProjectInfo projectInfo = projectInfoList.get(position);
        holder.txtProjectTitle.setText(projectInfo.getTitle());

        holder.txtProjectPleadge.setText(projectInfo.getAmtPledged());

        holder.txtProjectBackers.setText(projectInfo.getNumBackers());

        holder.txtProjectLeftDays.setText(projectInfo.getEndTime());

    }

    @Override
    public int getItemCount() {
        return projectInfoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.txt_project_title)
        TextView txtProjectTitle;

        @BindView(R.id.txt_project_pleadge)
        TextView txtProjectPleadge;

        @BindView(R.id.txt_project_backers)
        TextView txtProjectBackers;

        @BindView(R.id.txt_project_days_left)
        TextView txtProjectLeftDays;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(itemView);
        }
    }
}
