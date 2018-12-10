package com.example.count.csci335project;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class FavAdapter extends RecyclerView.Adapter<FavAdapter.MyViewHolder> {
    private List<DogModel> objectList;
    private LayoutInflater inflater;


    public FavAdapter(Context context, List<DogModel> objectList) {
        inflater = LayoutInflater.from(context);
        this.objectList = objectList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.example_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DogModel current = objectList.get(position);
        holder.setData(current, position);
        holder.setListeners();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView dogName;
        private ImageView imgThumb;
        private int position;
        private DogModel currentObject;

        public MyViewHolder(View itemView) {
            super(itemView);
            dogName = itemView.findViewById(R.id.fav_dog_name);
            imgThumb = itemView.findViewById(R.id.fav_dog_pic);
        }

        public void setData(DogModel currentObject, int position) {
            this.dogName.setText(currentObject.getName());
            this.imgThumb.setImageResource(currentObject.getImageID());
            this.position = position;
            this.currentObject = currentObject;
        }

        public void setListeners() {
            dogName.setOnClickListener(MyViewHolder.this);
            imgThumb.setOnClickListener(MyViewHolder.this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.fav_dog_name:
                case R.id.fav_dog_pic:

                    DogModel object = objectList.get(position);
                    if (object.getName().equals("Beyonce")) {
                        Intent intent = new Intent(v.getContext(), Beyonce.class);
                        v.getContext().startActivity(intent);
                    } else if (object.getName().equals("Jay-Z")) {
                        Intent intent = new Intent(v.getContext(), JayZ.class);
                        v.getContext().startActivity(intent);
                    } else if (object.getName().equals("Kim")) {
                        Intent intent = new Intent(v.getContext(), Kim.class);
                        v.getContext().startActivity(intent);
                    } else if (object.getName().equals("Kanye")) {
                        Intent intent = new Intent(v.getContext(), Kanye.class);
                        v.getContext().startActivity(intent);
                    } else if (object.getName().equals("Selena")) {
                        Intent intent = new Intent(v.getContext(), Selena.class);
                        v.getContext().startActivity(intent);
                    } else if (object.getName().equals("JB")) {
                        Intent intent = new Intent(v.getContext(), JB.class);
                        v.getContext().startActivity(intent);
                    }

                    break;


            }


        }
    }


}


