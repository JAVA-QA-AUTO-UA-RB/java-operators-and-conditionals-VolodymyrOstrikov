import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("The hero has entered an enchanted forest full of adventures");


        int health = 100;
        int luck = 50;


        System.out.println("\nEvent 1: Crossroads");
        System.out.println("\nChoose a road:");
        System.out.println("1 - old trail (-20 health)");
        System.out.println("2 - find a treasure (+30 luck)");
        System.out.println("any other number - get lost (-10 health)");
        int choice1 = scanner.nextInt();

        if (choice1 == 1) {
            health -= 20;
            System.out.println("You took the old trail and lost 20 health points.");
        } else if (choice1 == 2) {
            luck += 30;
            System.out.println("You found a treasure! Luck increased by 30.");
        } else {
            health -= 10;
            System.out.println("You got lost and lost 10 health points.");
        }


        System.out.println("\nEvent 2: Mysterious well");
        System.out.println("\nWhat will you do?");
        System.out.println("1 - drink the magical water (+50 health)");
        System.out.println("2 - ignore the well (-10 luck)");
        System.out.println("any other number - nothing happens");
        int choice2 = scanner.nextInt();

        if (choice2 == 1) {
            health += 50;
            System.out.println("You drank the magical whiskey! Health increased by 50.");
        } else if (choice2 == 2) {
            luck -= 10;
            System.out.println("You ignored the well and got tired. Luck decreased by 10.");
        } else {
            System.out.println("Nothing changed.");
        }


        System.out.println("\nEvent 3: Encounter with a magical creature");
        System.out.println("\nChoose creature type:");
        System.out.println("1 - friendly (+20 здоров’я)");
        System.out.println("2 - hostile (-30 здоров’я)");
        System.out.println("3 - indifferent (нічого)");
        int creatureType = scanner.nextInt();

        switch (creatureType) {
            case 1:
                health += 20;
                System.out.println("The creature was friendly and shared food. Health +20.");
                break;
            case 2:
                health -= 30;
                System.out.println("The creature was hostile and attacked! Health -30.");
                break;
            case 3:
                System.out.println("The creature was indifferent. Nothing changed.");
                break;
            default:
                System.out.println("Unknown creature. Nothing changed.");
        }

        // Підсумок
        System.out.println("\n--- Final Status ---");
        System.out.println("\nHealth: " + health);
        System.out.println("Luck: " + luck);

        if (health <= 0 || luck <= 0) {
            System.out.println("You failed to pass through the forest... Try again!");
        } else {
            System.out.println("Congratulations! You successfully passed through the enchanted forest!");
        }

        scanner.close();
    }
}
