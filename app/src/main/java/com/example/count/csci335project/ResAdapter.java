package com.example.count.csci335project;

import android.content.Context;
import android.nfc.Tag;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.content.ContentValues.TAG;
import static com.example.count.csci335project.DogModel.reservationBool;

public class ResAdapter extends RecyclerView.Adapter<ResAdapter.MyViewHolder> {
    private List<DogModel> objectList;
    private LayoutInflater inflater;

    public ResAdapter(Context context, List<DogModel> objectList) {
        inflater = LayoutInflater.from(context);
        this.objectList = objectList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
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
        private ImageView imgThumb, imgDelete;
        private int position;
        private DogModel currentObject;

        public MyViewHolder(View itemView) {
            super(itemView);
            dogName = (TextView) itemView.findViewById(R.id.dog_name);
            imgThumb = (ImageView) itemView.findViewById(R.id.dog_img);
            imgDelete = (ImageView) itemView.findViewById(R.id.cancel_res);
        }

        public void setData(DogModel currentObject, int position) {
            this.dogName.setText(currentObject.getName());
            this.imgThumb.setImageResource(currentObject.getImageID());
            this.position = position;
            this.currentObject = currentObject;
        }

        public void setListeners() {
            imgDelete.setOnClickListener(MyViewHolder.this);
            imgThumb.setOnClickListener(MyViewHolder.this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.cancel_res:
                    removeItem(position);
                    break;
            }
        }
    }

    public void removeItem(int position) {

        DogModel object = objectList.get(position);
        if (object.getName() == "Beyonce")
            reservationBool[0] = false;
        else if (object.getName() == "Jay-Z")
            reservationBool[1] = false;
        else if (object.getName() == "Kim")
            reservationBool[2] = false;
        else if (object.getName() == "Kanye")
            reservationBool[3] = false;
        else if (object.getName() == "Selena")
            reservationBool[4] = false;
        else if (object.getName() == "JB")
            reservationBool[5] = false;

        objectList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, objectList.size());
    }
}
