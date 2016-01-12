package com.VikingRobotics580.AutonomousGenerator;

import java.util.ArrayList;

public class Point {
    private int x;
    private int y;
    private ArrayList<String> actions;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        actions = new ArrayList<String>();
    }

    public int getX(){ return x; }
    public int getY(){ return y; }
    public ArrayList<String> getActions(){ return actions; }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void addAction(String s){
        this.actions.add(s);
    }

    public String removeAction(int idx){
        return this.actions.remove(idx);
    }
}

