package com.example.ansam.stackviewexample;

/**
 * Created by ansam on 11/16/2016.
 */

public class stackItem {
    private String itemText;
    private String imageName;
    public stackItem(String text, String imageName) {
        this.imageName = imageName;
        this.itemText = text;
    }

    public String getImageName() {
        return imageName;
    }


    public String getItemText() {
        return itemText;
    }
}
