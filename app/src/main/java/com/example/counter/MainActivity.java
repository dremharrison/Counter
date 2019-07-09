package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CounterTextViewFragment counterTextViewFragment = new CounterTextViewFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame_layout, counterTextViewFragment, "CounterTexViewFragment")
                .commit();
    }
}
