package com.epam.devtraining.sportrental.domain;

/**
 * Created by Yahor_Fralou on 6/7/2017.
 */
public class SportEquipment {
    private Category category;
    private String title;
    private int price;

    public SportEquipment() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
