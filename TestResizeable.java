package com.company;

import java.util.Random;

public class TestResizeable {
    public static void main(String[] args) {
        Random random = new Random();
        Shape shapes[] = new Shape[5];
        shapes[0] = new Rectangle(1, 2);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Circle(5);
        shapes[3] = new Rectangle(6, 7);
        shapes[4] = new Circle(8);
        for (int i = 0; i < shapes.length; i++) {
            int ranNum = random.nextInt(100) + 1;
            System.out.println(shapes[i].toString());

            shapes[i].resize(ranNum);
            System.out.println("After adding " + ranNum + "%, the shape's figures turn to: ");
            System.out.println(shapes[i].toString() + "\n \n");
        }
    }
}
