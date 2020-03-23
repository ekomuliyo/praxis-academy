/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.ekomuliyo.factory.pattern.demo;

import main.java.com.ekomuliyo.factory.pattern.demo.Shape;
import main.java.com.ekomuliyo.factory.pattern.demo.ShapeFactory;

public class App {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // memanggil class object Circle dan memanggil method nya
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // memanggil method draw() dari object Circle
        shape1.draw();

        // memanggil class object Rectangle dan memanggil method nya
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // memanggil method draw() dari object Rectangle
        shape2.draw();
        
        // memanggil class object Square dan memanggil method nya
        Shape shape3 = shapeFactory.getShape("SQUARE");

        // memanggil method draw() dari object Square
        shape3.draw();



    }
}
