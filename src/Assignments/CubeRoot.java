package Assignments;

import java.util.Scanner;

public class CubeRoot {
    public static double cuberoot(int x, int y , int z){
        double result=0.0;
        result= Math.cbrt((Math.pow(x,2)+Math.pow(y,2))-Math.abs(z));

        return result;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the X value");
        int x = sc.nextInt();
        System.out.println("enter the y value");
        int y = sc.nextInt();
        System.out.println("enter the z value");
        int z = sc.nextInt();
        System.out.println(cuberoot(x,y,z));
    }
}
