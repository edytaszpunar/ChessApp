package pl.szpunar.chessapp;

import java.util.Scanner;

public class UserDialogs {

    public static Move getMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move in format X1, Y1, X2, Y2:");
            String s = scanner.nextLine();
            String[] numbers = s.split(",");
            try {
                int col1 = Integer.parseInt(numbers[0]);
                int row1 = Integer.parseInt(numbers[1]);
                int col2 = Integer.parseInt(numbers[2]);
                int row2 = Integer.parseInt(numbers[3]);
                return new Move(col1, row1, col2, row2);
            } catch (Exception e){
                System.out.println("Wrong move, try again");
            }
        }
    }
}
