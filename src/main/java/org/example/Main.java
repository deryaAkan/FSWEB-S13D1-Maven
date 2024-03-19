package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean isBarking = true;
        int clock = 9;
        //
        int firstAge = 22;
        int secondAge = 23;
        int thirdAge = 34;

        //
        boolean isSummer = true;
        int temp = 35;
        //
        double width = -1.0;
        double height = 4.0;
        //
        double radius = 5.0;
        //
        System.out.println("Is cat playing?" + isCatPlaying(isSummer,temp));
        System.out.println("Should wake up? " + shouldWakeUp(isBarking,clock));
        System.out.println("Are they teen?" + hasTeen(firstAge, secondAge, thirdAge));
        System.out.println("Polygon area = " + area(width,height));
        System.out.println("Circle area = " + area(radius));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (isBarking) {
            if (clock < 0 || clock > 23) {
                return false;
            } else return clock < 8 || clock > 20;
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp <= 45;
        }
        else {
            return temp >= 25 && temp <= 35;

        }
    }

    public static double area(double width, double height) {
        if(width < 0 || height < 0){
            return -1;
        }
        else return width * height;
    }

    public static double area(double radius) {
        double pi = Math.PI;
        if(radius < 0){
            return -1;
        }

       return pi * radius * radius;
    }
}
