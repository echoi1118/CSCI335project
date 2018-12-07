package com.example.count.csci335project;


import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class Info {


    public static ArrayList<String> mDogs = new ArrayList<>();
    public static ArrayList<Integer> mImages = new ArrayList<>();
    public static ArrayList<String> mDesc = new ArrayList<>();
    public static ArrayList<String> mFaveDogs = new ArrayList<>();
    public static ArrayList<Integer> mFaveImages = new ArrayList<>();
    public static ArrayList<String> mResDogs = new ArrayList<>();
    public static ArrayList<Integer> mResImages = new ArrayList<>();

    public void setmDogs(ArrayList<String> mDogs) {
        this.mDogs = mDogs;
    }

    public void setmImages(ArrayList<Integer> mImages) {
        this.mImages = mImages;
    }

    public void setmDesc(ArrayList<String> mDesc) {
        this.mDesc = mDesc;
    }

    public void setmFaveDogs(ArrayList<String> mFaveDogs) {
        this.mFaveDogs = mFaveDogs;
    }

    public void setmFaveImages(ArrayList<Integer> mFaveImages) {
        this.mFaveImages = mFaveImages;
    }

    public void setmResDogs(ArrayList<String> mResDogs) {
        this.mResDogs = mResDogs;
    }

    public void setmResImages(ArrayList<Integer> mResImages) {
        this.mResImages = mResImages;
    }

    public ArrayList<String> getmDogs() {
        return mDogs;
    }

    public ArrayList<Integer> getmImages() {
        return mImages;
    }

    public ArrayList<String> getmDesc() {
        return mDesc;
    }

    public ArrayList<String> getmFaveDogs() {
        return mFaveDogs;
    }

    public ArrayList<Integer> getmFaveImages() {
        return mFaveImages;
    }

    public ArrayList<String> getmResDogs() {
        return mResDogs;
    }

    public ArrayList<Integer> getmResImages() {
        return mResImages;
    }

    public static void initalizeArrays(){
        mDogs.add("Beyonce");
        mDogs.add("Jay-Z");
        mDogs.add("Kim");
        mDogs.add("Kanye");
        mDogs.add("Selena");
        mDogs.add("JB");
        mImages.add(R.drawable.dog1image);
        mImages.add(R.drawable.dog2image);
        mImages.add(R.drawable.dog3image);
        mImages.add(R.drawable.dog4image);
        mImages.add(R.drawable.dog5image);
        mImages.add(R.drawable.dog6image);
        mDesc.add("Cute, medium-build puppy with light-brown, downy fur and an adorable wet nose.");
        mDesc.add("I\\'m a sleepy little chihuahua with an attitude. Won\\'t you take me home?");
        mDesc.add("What is that? Is that a husky?");
        mDesc.add("I don\\'t know what I am, but if you take me home, I love you long time. Arf! Arf!");
        mDesc.add("Am I a hot dog? Why, yes I am. And I\\'m the hottest dog around.");
        mDesc.add("Do I look a little hairy to you? You should take me home and give me a haircut.");
    }




}
