package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three coordinates of 1st vector: ");
        double x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        Vector v1 = new Vector(x, y, z);
        System.out.println("Enter three coordinates of 2nd vector: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        Vector v2 = new Vector(x, y, z);

        System.out.println("Lengths 1st and 2nd, respectively: ");
        System.out.println(v1.length() + " and " + v2.length());

        System.out.println("Scalar product: ");
        System.out.println(v1.scalarProduct(v2));

        System.out.println("Cross product: ");
        System.out.println(v1.crossProduct(v2));

        System.out.println("Cosine of the angle between the vectors: ");
        System.out.println(v1.cos(v2));

        System.out.println("Sum of the vectors: ");
        System.out.println(v1.add(v2));

        System.out.println("Difference between 1st and 2nd: ");
        System.out.println(v1.subtract(v2));

        if(v1.equals(v2)) {
            System.out.println("The vectors are equal");
        }
        else {
            System.out.println("The vectors are not equal");
        }

        System.out.println("Hashcodes of 1st and 2nd, respectively: ");
        System.out.printf("%d and %d", v1.hashCode(), v2.hashCode());
    }
}