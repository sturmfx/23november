package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Bullet
{
    public static ArrayList<Bullet> list = new ArrayList<Bullet>();
    Color color;
    boolean alive = false;
    long creation_time;
    int life = 1000;
    int speed = 50;
    public double x = 0;
    public double y = 0;
    int click_x = 0;
    int click_y = 0;
    int fire_x = 0;
    int fire_y = 0;
    double dx = 1.0;
    double dy = 1.0;
    double k;

    public Bullet(Color color1, int speed1, int life1, int click_x1, int click_y1, int fire_x1, int fire_y1)
    {
        creation_time = System.currentTimeMillis();
        life = life1;
        speed = speed1;
        alive = true;
        click_x = click_x1;
        click_y = click_y1;

        fire_x = fire_x1;
        fire_y = fire_y1;
        color = color1;

        calculatedxdy();
    }

    public void update()
    {
        if(alive)
        {
            if (System.currentTimeMillis() - creation_time < life)
            {
                x = x + dx;
                y = y + dy;
            }
            else
            {
                alive = false;
            }
        }
    }

    public void calculatedxdy()
    {
        boolean x_minus = false;
        boolean y_minus = false;
        int tempx = click_x - fire_x;
        int tempy = click_y - fire_y;
        double k = 0.0;

        if(tempx < 0)x_minus = true;
        if(tempy < 0)y_minus = true;
    }

}
