package com.example.newsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder>{

    private List<NewsModel> newlist;

    public NewsAdapter(List<NewsModel> newlist) {
        this.newlist = newlist;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card, parent, false);
        return new NewsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        NewsModel news = newlist.get(position);
    }

    @Override
    public int getItemCount() {
        return newlist.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tv_title, tv_description;
        ConstraintLayout card_layout;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tvTitle);
            tv_description = itemView.findViewById(R.id.tvDescription);
            card_layout = itemView.findViewById(R.id.cardLayout);

            this.tv_title.setOnClickListener(this);
            this.tv_description.setOnClickListener(this);
            this.card_layout.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Você clicou no item"+tv_title.getText(), Toast.LENGTH_SHORT).show();
        }
    }

}
