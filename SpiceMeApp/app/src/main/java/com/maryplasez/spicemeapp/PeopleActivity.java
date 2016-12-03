package com.maryplasez.spicemeapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class PeopleActivity extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        context = this;
        LinearLayout julie = (LinearLayout) findViewById(R.id.julie);
        julie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title ="I want to lick you till you swear allegiance to the empire";
                Intent intent = new Intent(context, SpiceSelectionActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                intent.putExtra("USER", "Mary");
                startActivity(intent);
            }
        });
    }
}
