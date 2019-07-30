package com.example.EksamesOpgave.demo.service;

public class MyImage {
    int id;
    String name;
    double top;
    double left;

    public MyImage(){}
    public MyImage(int id, String name, double top, double left) {
        this.id = id;
        this.name = name;
        this.top = top;
        this.left = left;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTop() {
        return top;
    }
    public void setTop(int top) {
        this.top = top;
    }
    public double getLeft() {
        return left;
    }
    public void setLeft(int left) {
        this.left = left;
    }
}
