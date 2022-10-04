package PracticalQuestion;

import java.util.Scanner;

class Circle_next{
    private double x, y;
    private int radius;
    public Circle_next(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show() {
        System.out.println("("+x+","+y+")"+radius);
    }
    public int getRadius() {
        return radius;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle_next c [] = new Circle_next[3];
        for(int i=0; i<c.length;i++) {
            System.out.print("x, y, radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle_next(x,y,radius);
        }
        int maxR = c[0].getRadius();
        double maxX=0,maxY=0;
        for(int i=0; i<c.length;i++) {
            int r = c[i].getRadius();
            if(maxR<=r) {
                maxR = r;
                maxX = c[i].getX();
                maxY = c[i].getY();
            }
        }
        System.out.println("가장 면적이 큰 원은 ("+maxX+","+maxY+")"+maxR);
        sc.close();
    }

}