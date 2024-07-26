package com.company;
import java.util.Scanner;
import java.util.Random;
public class rpsrps {
    public static void main(String[] args) {

        int computer;
        int userinput;
        System.out.println("1:rock , 2:paper , 3:scissor ");
        Random rd = new Random();
        computer = rd.nextInt(1, 4);

        Scanner sc = new Scanner(System.in);
        userinput = sc.nextInt();

        {
            if (computer == userinput) {
                System.out.println("match draw");
            } else if (computer == 1 && userinput == 3 || computer == 2 && userinput == 1 || computer == 3 && userinput == 2) {
                System.out.println("computer won");
            } else {
                System.out.println("user won");
            }
        }
    }
}
