package com.example.ak2_cardiobook.ui.mainrecordpressure;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ak2_cardiobook.R;

public class MainRecordPressureFragment extends Fragment {

    private MainRecordPressureViewModel mViewModel;

    public static MainRecordPressureFragment newInstance() {
        return new MainRecordPressureFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_record_pressure_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainRecordPressureViewModel.class);
        // TODO: Use the ViewModel
    }

}
