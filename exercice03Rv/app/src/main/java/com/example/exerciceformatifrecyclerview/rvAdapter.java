package com.example.exerciceformatifrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.MyViewHolder> {
    List<Integer> liste;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvChiffre;
        public Button btnSupprimer;
        public MyViewHolder(LinearLayout v) {
            super(v);
            tvChiffre = v.findViewById(R.id.tvChiffre);
            btnSupprimer = v.findViewById(R.id.btnSupprimer);

        }
    }
    public rvAdapter(){
        liste = new ArrayList<>();
    }
    @NonNull
    @Override
    public rvAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull rvAdapter.MyViewHolder holder, int position) {
        holder.tvChiffre.setText(liste.get(position).toString());
        holder.btnSupprimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liste.remove(holder.getAbsoluteAdapterPosition());
                notifyDataSetChanged();

            }
        });
    }

    @Override
    public int getItemCount() {
        return liste.size();
    }


}
