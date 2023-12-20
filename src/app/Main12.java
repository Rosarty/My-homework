package app;

import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {
        try {
            getOutput(getResult(getData()));
        } catch (Exception e) {
            getOutput("Exception: " + e.getMessage());
        }
    }

    private static TrafficLight getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one of the colors RED, YELLOW, GREEN: ");
        return TrafficLight.valueOf(scanner.nextLine().trim().toUpperCase());
    }

    private static String getResult(TrafficLight light) {
        return switch (light) {
            case RED -> "Traffic isn`t allowed";
            case YELLOW -> "Get ready to move";
            case GREEN -> "Traffic is allowed";
        };
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}