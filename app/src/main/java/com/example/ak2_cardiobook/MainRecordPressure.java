package com.example.ak2_cardiobook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ak2_cardiobook.ui.mainrecordpressure.MainRecordPressureFragment;

public class MainRecordPressure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_record_pressure_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainRecordPressureFragment.newInstance())
                    .commitNow();
        }
    }
}
