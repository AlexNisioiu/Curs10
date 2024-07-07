package Enums;

import java.util.Scanner;

public class EnumsMain {
    public static void main(String[] args) {
        CardinalPoints south = CardinalPoints.SOUTH;
        CardinalPoints north = CardinalPoints.NORTH;
        System.out.println(south);
        System.out.println(north);
        CardinalPoints anotherSouth = CardinalPoints.SOUTH;
        System.out.println(anotherSouth);
        Scanner s = new Scanner(System.in);
        System.out.println("Chose a cardinal point: ");
        String line = s.nextLine();
        CardinalPoints southFromString = CardinalPoints.fromNameCaseInsensitive(line);
        System.out.println(southFromString);


        System.out.println("Chose a cardinal point (Symbol): ");
        line = s.nextLine();
        southFromString = CardinalPoints.fromSymbolCaseInsensitive(line);
        if (southFromString != null) {
            System.out.println(southFromString.toDirection());
        }

    }
}
