package com.example.husnalmuslim;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

public class CounterFragment extends Fragment {
    private int num;
    static int numChek;
    private Button btnCounter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_counter, container, false);

        return layout;

    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.v("testing2",numChek+"");
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = view.findViewById(R.id.toolbar_counter);
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        appCompatActivity.setSupportActionBar(toolbar);
        appCompatActivity.getSupportActionBar().setTitle(null);

        btnCounter = view.findViewById(R.id.counter_button);
        if (numChek > 0) {
            btnCounter.setText(numChek + "");
        }
        btnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    num = Integer.valueOf(btnCounter.getText().toString());
                    btnCounter.setText((num += 1) + "");


            }
        });
        ImageButton btnReset = view.findViewById(R.id.restart_button_counter);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCounter.setText(0 + "");
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        numChek=num;
        Log.v("onPause",numChek+"");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v("onStop",numChek+"");
    }
}
