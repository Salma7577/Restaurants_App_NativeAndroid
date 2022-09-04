package com.example.swe483restruntproject.placeholder;

import android.net.Uri;

import java.net.URI;

public class photoModel {

    Uri photo;

    public photoModel(Uri photo) {
        this.photo = photo;
    }

    public Uri getPhoto() {
        return photo;
    }

    public void setPhoto(Uri photo) {
        this.photo = photo;
    }
}
