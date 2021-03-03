package com.example.task01;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    void flip() {
        int adv = -x;
        x = -y;
        y = adv;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.x-this.x,2)+Math.pow(point.y-this.y,2));
    }
    public String toString() {
        return "(" + Integer.toString(x) + "," + Integer.toString(y) + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
