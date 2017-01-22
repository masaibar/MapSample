package com.masaibar.mapsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_open_map_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MapActivity.start(getApplicationContext());
            }
        });

        findViewById(R.id.button_open_map_floating).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FloatingService.start(getApplicationContext());
            }
        });

        findViewById(R.id.button_close_map_floating).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FloatingService.stop(getApplicationContext());
            }
        });
    }
}
