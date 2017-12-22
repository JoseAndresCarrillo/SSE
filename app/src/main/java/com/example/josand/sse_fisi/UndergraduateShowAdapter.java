package com.example.josand.sse_fisi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.josand.sse_fisi.Model.UndergraduateShowModel;

import java.util.List;

/**
 * Created by josan on 22/12/2017.
 */

public class UndergraduateShowAdapter extends RecyclerView.Adapter<UndergraduateShowAdapter.ViewHolder>{

    public List<UndergraduateShowModel> ugdtList;

    public UndergraduateShowAdapter(List<UndergraduateShowModel> ugdtList) {
        this.ugdtList = ugdtList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_undergraduate_show,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        holder.univName.setText(ugdtList.get(i).getUnivName());
        holder.majorName.setText(ugdtList.get(i).getMajorName());
        holder.date.setText(ugdtList.get(i).getDate());
    }

    @Override
    public int getItemCount() {
        return ugdtList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView univName;
        public TextView majorName;
        public TextView date;

        public ViewHolder(View itemView) {
            super(itemView);
            univName=itemView.findViewById(R.id.ugdtshowUnivName);
            majorName=itemView.findViewById(R.id.ugdtshowMajor);
            date=itemView.findViewById(R.id.ugdtshowDate);
        }
    }
}
