package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<NewsModel> newsList;

    NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        newsList = new ArrayList<>();

        NewsModel news1 = new NewsModel("Primeira noticia", "Essa foi a primeira noticia da lista que vai ser apresentada", R.drawable.imagecard);
        NewsModel news2 = new NewsModel("Segunda noticia", "Essa foi a Segunda noticia da lista que vai ser apresentada", R.drawable.imagecard);
        NewsModel news3 = new NewsModel("Terceira noticia", "Essa foi a Terceira noticia da lista que vai ser apresentada", R.drawable.imagecard);
        NewsModel news4 = new NewsModel("Quarta noticia", "Essa foi a Quarta noticia da lista que vai ser apresentada", R.drawable.imagecard);
        NewsModel news5 = new NewsModel("Quinta noticia", "Essa foi a Quinta noticia da lista que vai ser apresentada", R.drawable.imagecard);
        NewsModel news6 = new NewsModel("Sexta noticia", "Essa foi a Sexta noticia da lista que vai ser apresentada", R.drawable.imagecard);
        NewsModel news7 = new NewsModel("Setima noticia", "Essa foi a Setima noticia da lista que vai ser apresentada", R.drawable.imagecard);

        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);
        newsList.add(news4);
        newsList.add(news5);
        newsList.add(news6);
        newsList.add(news7);

        newsAdapter = new NewsAdapter(newsList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(newsAdapter);
    }
}