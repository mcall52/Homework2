package com.example.michael.homework2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Numbers extends Activity {
    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private String[] numsAsStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        myRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        myRecyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(layoutManager);

        numsAsStrings = createList();

        adapter = new MyAdapter(numsAsStrings);
        myRecyclerView.setAdapter(adapter);

    }

    private String[] createList() {
        String[] listOfStrings = new String[1000];

        for (int i = 0; i < 1000; i++) {
            listOfStrings[i] = EnglishNumberToWords.convert(i);
        }

        return listOfStrings;
    }
}
