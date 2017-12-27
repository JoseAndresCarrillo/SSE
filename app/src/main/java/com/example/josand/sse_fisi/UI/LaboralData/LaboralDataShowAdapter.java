package com.example.josand.sse_fisi.UI.LaboralData;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.josand.sse_fisi.Model.LaboralShowModel;
import com.example.josand.sse_fisi.R;

import java.util.List;

/**
 * Created by josan on 27/12/2017.
 */

public class LaboralDataShowAdapter extends RecyclerView.Adapter<LaboralDataShowAdapter.ViewHolder> {

    List<LaboralShowModel> list;

    public LaboralDataShowAdapter(List<LaboralShowModel> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.enterpriseName.setText(list.get(position).getEnterpriseName());
        holder.jobTitle.setText(list.get(position).getJobTitle());
        holder.hireDate.setText(list.get(position).getHireDate());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView enterpriseName, jobTitle, hireDate;

        public ViewHolder(View itemView) {
            super(itemView);
            enterpriseName=itemView.findViewById(R.id.itemPlace);
            jobTitle=itemView.findViewById(R.id.itemTitle);
            hireDate=itemView.findViewById(R.id.itemDate);
        }
    }
}
