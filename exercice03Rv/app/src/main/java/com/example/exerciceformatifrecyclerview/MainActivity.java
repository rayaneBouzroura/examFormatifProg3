package com.example.exerciceformatifrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.exerciceformatifrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    RecyclerView rv;
    rvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initRecycler();
        remplirRecycler();
    }

    private void remplirRecycler() {
        List<Integer> listeRv = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listeRv.add(i);
        }
        adapter.liste = listeRv;
        adapter.notifyDataSetChanged();
    }

    private void initRecycler() {
        rv = binding.rv;
        rv.setHasFixedSize(false);
        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        // specify an adapter (see also next example)
        adapter = new rvAdapter();
        rv.setAdapter(adapter);

    }
}