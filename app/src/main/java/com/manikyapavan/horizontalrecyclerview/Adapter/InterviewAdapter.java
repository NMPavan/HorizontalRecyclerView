package com.manikyapavan.horizontalrecyclerview.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.manikyapavan.horizontalrecyclerview.R;
import com.manikyapavan.horizontalrecyclerview.model.PopulaItemAppModel;


import java.util.ArrayList;

public class InterviewAdapter extends RecyclerView.Adapter<InterviewAdapter.MyViewHolder> {

    private ArrayList<PopulaItemAppModel> mArrayList;
    private Context mContext;



   public InterviewAdapter(ArrayList<PopulaItemAppModel> mArrayList) {
        this.mArrayList = mArrayList;
    }

    @NonNull
    @Override
    public InterviewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        mContext =viewGroup.getContext();
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InterviewAdapter.MyViewHolder myViewHolder, int i) {
        Glide.with(mContext)
                .asBitmap()
                .load(mArrayList.get(i).getItemImage())
                .into(myViewHolder.iv_card_graphics);
        myViewHolder.tv_card_header.setText(mArrayList.get(i).getItemHeader());
        myViewHolder.tv_card_sub_header.setText(mArrayList.get(i).getItemSubHeader());
        myViewHolder.tv_card_number.setText(mArrayList.get(i).getItemNumber());


        Log.d("MyAdapter", "position: " + i);
    }


    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iv_card_graphics;
        private final TextView tv_card_header;
        private final TextView tv_card_sub_header;
        private final TextView tv_card_number;

        MyViewHolder(View view) {
            super(view);
            iv_card_graphics = view.findViewById(R.id.pop_item_image);
            tv_card_header = view.findViewById(R.id.pop_item_header);
            tv_card_sub_header = view.findViewById(R.id.pop_item_sub_header);
            tv_card_number = view.findViewById(R.id.tv_card_number);
        }
    }


}
