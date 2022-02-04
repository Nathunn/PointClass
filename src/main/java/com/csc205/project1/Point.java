package com.csc205.project1;
import java.lang.Math;


public class Point {

    private double x;
    private double y;

    public Point()
    {
        x = 0;
        y = 0;
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
      this.y = y;
    }

    public void setPoint(double x, double y)
    {
        this.x = x;
        this.y = y;

    }
    public double distance(Point b) {
        return (Math.sqrt(Math.pow((b.getX() - this.x), 2) + Math.pow((b.getY() - this.y), 2)));
    }

    public String toString()
    {
        return "Point{x = " + this.x + ", y = " + this.y + "}";
    }

    public void rotate(double rotation)
    {
        this.x = Math.cos(this.x) * (0) - Math.sin(this.y) * (0);
        this.y = Math.sin(this.x) * (0) + Math.cos(this.y) * (0);
    }

    public void shiftX(int x)
    {
        this.x += x;
    }
    public void shiftY(int y)
    {
        this.y += y;
    }
}
