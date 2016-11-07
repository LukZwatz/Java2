package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Main main = new Main(); //Create a Object of the class

        main.doIt();
    }

    private void doIt() {


        List<GeometricShape> shapeList = new ArrayList<>(); //List|GeometricShape> --> in der Liste darf nur Objecte von GeomtricShape
        fillList(shapeList);
        printList(shapeList);

        List<Circle> circleList = new ArrayList<>();

        for (GeometricShape geometricShape : shapeList) {
            if (geometricShape instanceof Circle){
                circleList.add((Circle)geometricShape);
            }
        }
        System.out.println("-----------------------------------------------------");
        for (Circle circle : circleList) {
            System.out.println(circle);
        }
    }


    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(4,5,8.0));
        shapeList.add(new Circle(1,2,6.0));
        shapeList.add(new Circle(9,2,10.0));
        shapeList.add(new Circle(8,5,1.0));
        shapeList.add(new Circle(77,12,9.0));
        shapeList.add(new Circle(1,5,6.0));

        shapeList.add(new Rectangle(2,4,4.5,5.4));

        shapeList.add(new RightTriangle(3,4,3.3,4.4));

    }


    public void printList(List<GeometricShape> shapeList) {

        System.out.println(".........for........");
        for (int pos = 0; pos < shapeList.size(); pos++) {//fori
            System.out.println(shapeList.get(pos));
        }
        System.out.println(".........foreach........");
        for (GeometricShape geometricShape : shapeList) { //iter
            System.out.println(geometricShape); //sout
        }
        System.out.println(".........stream 1........"); //high performance version of foreach
        shapeList.stream()
                .forEach(shape-> System.out.println(shape));

        System.out.println(".........stream 2........");
        shapeList.stream()
                .forEach(System.out::println);





    }

}
