package com.example.josand.sse_fisi.UI.LaboralData;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

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
        FloatingActionButton fab= findViewById(R.id.fabLaboral);

        labList.add(new LaboralShowModel("Graña y Montero",
                "Analista de Sistemas","2019-2021"));

        recyclerView = findViewById(R.id.recyclerLaboral);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter =new LaboralDataShowAdapter(labList);
        recyclerView.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),LaboralDataEdit.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
