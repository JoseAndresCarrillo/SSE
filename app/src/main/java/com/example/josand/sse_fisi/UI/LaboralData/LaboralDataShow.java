package com.example.josand.sse_fisi.UI.LaboralData;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.josand.sse_fisi.Model.LaboralShowModel;
import com.example.josand.sse_fisi.Model.PostgraduateShowModel;
import com.example.josand.sse_fisi.R;
import com.example.josand.sse_fisi.UI.Undergraduate.UndergraduateShowAdapter;

import java.util.ArrayList;
import java.util.List;

public class LaboralDataShow extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboral_data_show);

        List labList =new ArrayList();

        labList.add(new LaboralShowModel("Graña y Montero",
                "Analista de Sistemas","2019-2021"));

        recyclerView = findViewById(R.id.recyclerLaboral);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter =new UndergraduateShowAdapter(labList);
        recyclerView.setAdapter(adapter);
    }
}
