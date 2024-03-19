package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        return isBarking && (clock < 8 || clock > 20);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        return !isSummer || temp <= 45;
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
