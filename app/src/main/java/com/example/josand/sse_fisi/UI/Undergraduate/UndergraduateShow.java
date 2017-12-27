package com.example.josand.sse_fisi.UI.Undergraduate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.josand.sse_fisi.Model.UndergraduateShowModel;
import com.example.josand.sse_fisi.R;

import java.util.ArrayList;
import java.util.List;

public class UndergraduateShow extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_undergraduate_show);

        List ugdtList =new ArrayList();

        ugdtList.add(new UndergraduateShowModel(getText(R.string.univName).toString(),
                getText(R.string.major).toString(),getText(R.string.majorDate).toString()));
        ugdtList.add(new UndergraduateShowModel("Universidad Nacional Federico Villareal",
                "Ingeniería Industrial","2012-2017"));

        recyclerView = findViewById(R.id.recyclerUndergraduate);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter =new UndergraduateShowAdapter(ugdtList);
        recyclerView.setAdapter(adapter);
    }
}
