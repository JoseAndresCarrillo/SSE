package com.example.josand.sse_fisi.UI.PersonalData;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.josand.sse_fisi.R;

public class PersonalDataShow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data_show);

        ImageView editIcon = findViewById(R.id.pdEditIcon);
        editIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),PersonalDataEdit.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
