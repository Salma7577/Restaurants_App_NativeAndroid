package com.example.swe483restruntproject.placeholder;

import android.graphics.Bitmap;
import android.net.Uri;

public class restuntsHomePageListItemModel {
    String name,speiclty;
    double rating;
    Uri image;
    public restuntsHomePageListItemModel(Uri image,String name, String speiclty, double rating) {
        this.image = image;
        this.name = name;
        this.speiclty = speiclty;
        this.rating = rating;
    }

    public Uri getImage() {
        return image;
    }

    public void setImage(Uri image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeiclty() {
        return speiclty;
    }

    public void setSpeiclty(String speiclty) {
        this.speiclty = speiclty;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
