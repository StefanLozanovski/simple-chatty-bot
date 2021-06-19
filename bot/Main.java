package bot; 

import java.util.Scanner;

public class Main {
    
    static final Scanner sc = new Scanner(System.in);
    static String userName;

    public static void main(String[] args) {
        greet("Aid", "2020");
        remindName();
        guessAge();
        count();
        test();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        userName = sc.nextLine();
        System.out.println("What a great name you have, " + userName + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Tell me the remainders from dividing your age by 3, 5 and 7. (separate by space)");
        int rem3 = sc.nextInt();
        int rem5 = sc.nextInt();
        int rem7 = sc.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.printf("%d!%n", i);
        }
        System.out.println("Done.");
    }

    static void test() {
        System.out.println("Let's test your programming knowledge!");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        answer();
    }

    static void answer() {
        if (sc.nextInt() != 2) {
            System.out.println("Please, try again.");
            answer();
        } else {
            end();
        }
    }

    static void end() {
        System.out.println("Congratulations " + userName + ", have a nice day!");
    }
}