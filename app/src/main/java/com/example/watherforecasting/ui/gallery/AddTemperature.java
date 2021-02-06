package com.example.watherforecasting.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.watherforecasting.R;

public class AddTemperature extends Fragment {

    private AddTemperatureViewModel addTemperatureViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        addTemperatureViewModel =
                ViewModelProviders.of(this).get(AddTemperatureViewModel.class);
        View root = inflater.inflate(R.layout.fragment_addtemperature, container, false);

        EditText editText_minTemperature=root.findViewById(R.id.editText_minTemperature);
        EditText editText_maxTemperature=root.findViewById(R.id.editText_maxTemperature);
        EditText editText_humidity=root.findViewById(R.id.editText_humidity);
        Button button_calculated=root.findViewById(R.id.button_calculated);
        DatePicker datePicker=root.findViewById(R.id.datePicker);

        addTemperatureViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}