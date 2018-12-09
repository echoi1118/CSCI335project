package com.example.count.csci335project;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static com.example.count.csci335project.DogModel.reservationBool;
import static com.example.count.csci335project.DogModel.reservationDate;

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
        private TextView dogName, resDate;
        private ImageView imgThumb;
        private Button imgDelete;
        private int position;
        private DogModel currentObject;

        public MyViewHolder(View itemView) {
            super(itemView);
            dogName = (TextView) itemView.findViewById(R.id.res_dog_name);
            resDate = (TextView) itemView.findViewById(R.id.res_date);
            imgThumb = (ImageView) itemView.findViewById(R.id.res_dog_img);
            imgDelete = itemView.findViewById(R.id.cancel_res);
        }

        public void setData(DogModel currentObject, int position) {
            CharSequence date = reservationDate[5];
            DogModel object = objectList.get(position);
            if (object.getName().equals("Beyonce")) {
                date = reservationDate[0];
            } else if (object.getName().equals("Jay-Z")) {
                date = reservationDate[1];
            } else if (object.getName().equals("Kim")) {
                date = reservationDate[2];
            } else if (object.getName().equals("Kanye")) {
                date = reservationDate[3];
            } else if (object.getName().equals("Selena")) {
                date = reservationDate[4];
            }

            this.dogName.setText(currentObject.getName());
            this.resDate.setText(date);
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
        if (object.getName().equals("Beyonce")) {
            reservationBool[0] = false;
            reservationDate[0] = "No date picked";
        } else if (object.getName().equals("Jay-Z")) {
            reservationBool[1] = false;
            reservationDate[1] = "No date picked";
        } else if (object.getName().equals("Kim")) {
            reservationBool[2] = false;
            reservationDate[2] = "No date picked";
        } else if (object.getName().equals("Kanye")) {
            reservationBool[3] = false;
            reservationDate[3] = "No date picked";
        } else if (object.getName().equals("Selena")) {
            reservationBool[4] = false;
            reservationDate[4] = "No date picked";
        } else if (object.getName().equals("JB")) {
            reservationBool[5] = false;
            reservationDate[5] = "No date picked";
        }

        objectList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, objectList.size());
    }
}
