package com.example.ikeda.listviewcustom;

import android.graphics.Bitmap;


public class ItemData {
    private Bitmap _image;
    private String _text;

    public void setImage(Bitmap image) {
        _image = image;
    }

    public  Bitmap getImage() {
        return _image;
    }

    public void setText(String text) {
        _text = text;
    }

    public String getText() {
        return _text;
    }
}
