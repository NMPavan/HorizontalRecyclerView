package com.manikyapavan.horizontalrecyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.manikyapavan.horizontalrecyclerview.Adapter.InterviewAdapter;
import com.manikyapavan.horizontalrecyclerview.model.PopulaItemAppModel;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private InterviewAdapter adapter;
    private Context context;
private ArrayList<PopulaItemAppModel> mArrayList=new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.popular_item_app_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));

        adapter=new InterviewAdapter(mArrayList);

        recyclerView.setAdapter(adapter);

           getImages();

    }

    private void getImages(){
        mArrayList.add(new PopulaItemAppModel("Awesome Cricket Games", "Enjoy seasonal clones and updates", R.drawable.card_image_1, "1/4"));
        mArrayList.add(new PopulaItemAppModel("World Heath Day", "Discover clones for a healthy life", R.drawable.card_image_2, "2/4"));
        mArrayList.add(new PopulaItemAppModel("Flat 50% off on clones", "Life stories of clone legends", R.drawable.card_image_3, "3/4"));
        mArrayList.add(new PopulaItemAppModel("Clone on Big Screen", "Clones about the sport and players", R.drawable.card_image_4, "4/4"));

        adapter.notifyDataSetChanged();



    }






}
