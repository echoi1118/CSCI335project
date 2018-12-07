package com.example.count.csci335project;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.count.csci335project.favoriteFragment.OnListFragmentInteractionListener;
import com.example.count.csci335project.dummy.DummyContent.DummyItem;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyfavoriteRecyclerViewAdapter extends RecyclerView.Adapter<MyfavoriteRecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> mFavoriteDogs;
    private ArrayList<Integer> mFavoriteImages;
    private OnListFragmentInteractionListener mContext;

    public MyfavoriteRecyclerViewAdapter(ArrayList<String> mFavoriteDogs, ArrayList<Integer> mFavoriteImages, OnListFragmentInteractionListener mContext) {
        this.mFavoriteDogs = mFavoriteDogs;
        this.mFavoriteImages = mFavoriteImages;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_favorite, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mIdView.setText(mFavoriteDogs.get(position));
        holder.mContentView.setImageResource(mFavoriteImages.get(position));

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mFavoriteDogs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final ImageButton mContentView;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.dog_name);
            mContentView = (ImageButton) view.findViewById(R.id.dog_button);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mIdView.getText() + "'";
        }
    }
}
