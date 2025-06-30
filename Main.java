import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        Random random = new Random();
        int randomNumber1 = random.nextInt(6);
        int randomNumber2 = random.nextInt(6);

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + randomNumber1);
        System.out.println("Die 2: " + randomNumber2);
        System.out.println("Total value: " + (randomNumber1 + randomNumber2));
    }
}   
