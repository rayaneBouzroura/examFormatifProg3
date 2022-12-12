package com.example.exerciceexam1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.exerciceexam1.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

    }
}