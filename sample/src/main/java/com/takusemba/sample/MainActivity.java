package com.takusemba.sample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.simple_target).setOnClickListener(view -> {
    });

    findViewById(R.id.custom_target).setOnClickListener(view -> {
    });
  }
}
