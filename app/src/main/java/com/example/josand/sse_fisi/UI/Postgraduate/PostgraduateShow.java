package com.example.josand.sse_fisi.UI.Postgraduate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.josand.sse_fisi.Model.PostgraduateShowModel;
import com.example.josand.sse_fisi.R;
import com.example.josand.sse_fisi.UI.Undergraduate.UndergraduateShowAdapter;

import java.util.ArrayList;
import java.util.List;

public class PostgraduateShow extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postgraduate_show);

        List pgdtList =new ArrayList();

        pgdtList.add(new PostgraduateShowModel(getText(R.string.univName).toString(),
                "Maestría en Ingeniería de Software","2021-2022"));

        recyclerView = findViewById(R.id.recyclerUndergraduate);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter =new UndergraduateShowAdapter(pgdtList);
        recyclerView.setAdapter(adapter);
    }
}
