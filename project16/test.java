package project16;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First player: ");
        String[] s1 = scan.nextLine().split(" ");
        System.out.println("Second player: ");
        String[] s2 = scan.nextLine().split(" ");

        game game = new game(s1, s2);
        game.startGame();

    }
}