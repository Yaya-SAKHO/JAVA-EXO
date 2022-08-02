package Seqence2;

import org.w3c.dom.events.EventException;

import java.lang.invoke.MethodHandles;

public class Point {

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int valY) {

        this.y = valY;

    }

    public void deplaceXY(int dX, int dY){
        x = x + dX;
        y = y + dY;
    }

    public void affiche(){
        System.out.println(toString());
    }

    public String toString() {
        return "Point(" + getX() + "," + getY() + ")" ;
    }
}
