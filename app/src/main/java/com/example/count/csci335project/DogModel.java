package com.example.count.csci335project;

import java.util.ArrayList;
import java.util.List;

public class DogModel {
    private int imageID;
    private String name;

    public static boolean[] reservationBool = {
            false,
            false,
            false,
            false,
            false,
            false
    };

    public static CharSequence[] reservationDate = {
            "No Date Selected",
            "No Date Selected",
            "No Date Selected",
            "No Date Selected",
            "No Date Selected",
            "No Date Selected"
    };

    public static boolean[] favoriteBool = {
            false,
            false,
            false,
            false,
            false,
            false
    };


    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<DogModel> getObjectList() {
        List<DogModel> dataList = new ArrayList<>();
        int[] images = getImages();
        String[] names = getNames();

        for (int i = 0; i < images.length; i++) {
            DogModel dog = new DogModel();
            dog.setImageID(images[i]);
            dog.setName(names[i]);
            dataList.add(dog);
        }
        return dataList;
    }

    public static List<DogModel> getResList() {
        List<DogModel> dataList = new ArrayList<>();
        int[] images = getImages();
        String[] names = getNames();
        boolean[] res = getRes();

        for (int i = 0; i < res.length; i++) {
            if (res[i])
            {
                DogModel dog = new DogModel();
                dog.setImageID(images[i]);
                dog.setName(names[i]);
                dataList.add(dog);
            }
        }
        return dataList;
    }

    public static List<DogModel> getFavList() {
        List<DogModel> dataList = new ArrayList<>();
        int[] images = getImages();
        String[] names = getNames();
        boolean[] fav = getFav();

        for (int i = 0; i < fav.length; i++) {
            if (fav[i])
            {
                DogModel dog = new DogModel();
                dog.setImageID(images[i]);
                dog.setName(names[i]);
                dataList.add(dog);
            }
        }
        return dataList;
    }

    private static String[] getNames() {
        String[] names = {
                "Beyonce",
                "Jay-Z",
                "Kim",
                "Kanye",
                "Selena",
                "JB"
        };
        return names;
    }

    private static int[] getImages() {

        int[] images = {
                R.drawable.dog1image,
                R.drawable.dog2image,
                R.drawable.dog3image,
                R.drawable.dog4image,
                R.drawable.dog5image,
                R.drawable.dog6image
        };
        return images;
    }

    private static boolean[] getRes(){
        return reservationBool;
    }

    private static boolean[] getFav(){
        return favoriteBool;
    }
}
