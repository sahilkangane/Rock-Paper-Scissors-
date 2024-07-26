package com.company;
import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("0 to rock ,1 to paper and 2 to scissor:");
            int person_choice = sc.nextInt();


            Random rand = new Random();  // created random object
            System.out.println("0 to rock ,1 to paper and 2 to scissor:");
            int computer_choice = rand.nextInt(3);  // generate a random int
            System.out.println("computer choice "+ computer_choice);


            if (computer_choice==person_choice){
                System.out.println("match is draw ");
            } else if (computer_choice==0 && person_choice==2||computer_choice==2 && person_choice==1||computer_choice==1 && person_choice==0) {
                System.out.println("computer is won ");
            } else {
                System.out.println("person is won ");
            }
    }
}
