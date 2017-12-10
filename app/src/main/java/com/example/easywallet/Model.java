package com.example.easywallet;

/**
 * Created by CHAI on 12/10/2017.
 */

public class Model {

    public final int id;
    public final String title;
    public int money;
    public final String picture;

    public Model(int id, String title, String number, String picture) {
        this.id = id;
        this.title = title;
        this.money = money;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return title;
    }
}
