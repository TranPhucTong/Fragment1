package com.example.myapplication111;

public class Contact {
    private  int hinh;
    private String name;

    public Contact(int hinh, String name) {
        super();
        this.hinh = hinh;
        this.name = name;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
