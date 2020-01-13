package com.example.ak2_cardiobook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ak2_cardiobook.ui.viewrecord.ViewRecordFragment;

public class view_record extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_record_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ViewRecordFragment.newInstance())
                    .commitNow();
        }
    }
}
