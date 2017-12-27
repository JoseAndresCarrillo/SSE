package com.example.josand.sse_fisi.UI.Postgraduate;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.josand.sse_fisi.Model.PostgraduateShowModel;
import com.example.josand.sse_fisi.R;

import java.util.List;

/**
 * Created by josan on 27/12/2017.
 */

public class PostgraduateShowAdapter extends RecyclerView.Adapter<PostgraduateShowAdapter.ViewHolder> {

    private List<PostgraduateShowModel> list;

    public PostgraduateShowAdapter(List<PostgraduateShowModel> list) {
        this.list = list;
    }

    @Override
    public PostgraduateShowAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PostgraduateShowAdapter.ViewHolder holder, int position) {
        holder.univName.setText(list.get(position).getUnivName());
        holder.courseName.setText(list.get(position).getCourseName());
        holder.courseDate.setText(list.get(position).getDateCourse());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView univName, courseName, courseDate;

        public ViewHolder(View itemView) {
            super(itemView);
            univName=itemView.findViewById(R.id.itemPlace);
            courseName=itemView.findViewById(R.id.itemTitle);
            courseDate=itemView.findViewById(R.id.itemDate);
        }
    }
}
