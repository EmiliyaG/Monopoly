import java.util.Random;
import java.util.Scanner;

public class move {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the number of players:");
        int players = input.nextInt();
        int[] price = {60, 0, 60, 200, 200, 100, 0, 100, 120, 200, 140, 150, 140, 160, 200, 180, 0, 180, 200, 0, 220, 0, 220, 240, 200, 260, 260, 150, 280, 0, 300, 300, 0, 320, 200, 350, 200, 0, 250, 100, 400};
        int field = 0;
        int[] playersMoney = {2000, 2000, 2000, 2000};
        int playerMoney = 2000;
        players(price, playerMoney, playersMoney, field, players);


    }

    public static void players(int[] price, int playerMoney, int[] playersMoney, int field, int players) {
        Scanner input = new Scanner(System.in);
        switch (players) {
            case 2:
                System.out.println("Enter the name of the first player:");
                String firstName = input.nextLine();
                System.out.println("Enter the name of the second player:");
                String secondName = input.nextLine();
                while (playersMoney[0] >= 0 || playersMoney[1] >= 0) {
                    System.out.println(firstName + " it is your turn. Click enter to throw the dice.");
                    move(price, field, playersMoney, players, playerMoney);
                    System.out.println(secondName + " it is your turn. Click enter to throw the dice.");
                    move(price, field, playersMoney, players, playerMoney);
                }
                break;
        }
    }

    public static void move(int[] price, int field, int[] playersMoney, int players, int playerMoney) {
        Scanner input = new Scanner(System.in);
        int sum1;
        String enter = input.nextLine();
        Random rollFirst = new Random();
        int numberOne = rollFirst.nextInt(6) + 1;
        System.out.println("The first die is " + numberOne);
        Random rollSecond = new Random();
        int numberTwo = rollSecond.nextInt(6) + 1;
        System.out.println("The second die is " + numberTwo);
        sum1 = numberOne + numberTwo;
        System.out.println();
        System.out.println("The sum of the dice is " + sum1);
        System.out.println();
        int sum2 = 0;
        //fields
        for (int i = 0; i < 1; i++) {
            field = sum1 + field;
            playerMoney = playersMoney[i];
            if (field >= 40) {
                field = field - 40;
                System.out.println("You are at " + field);
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 30) {
                System.out.println("You are at " + field + "and you go to jail");
                field = 10;
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 7 || sum2 == 22 || sum2 == 36) {
                System.out.println("You have a chance card.");
                System.out.println();

                System.out.println("Your money are " + playerMoney);
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 2 || sum2 == 17 || sum2 == 33) {
                sum2 = sum1 + sum2;
                System.out.println("You have a community chest card.");
                System.out.println();

                System.out.println("Your money are " + playerMoney);

                System.out.println(sum2);

            } else if (sum2 == 5 || sum2 == 15 || sum2 == 25 || sum2 == 35) {
                System.out.println("You are at station.");
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 1 || sum2 == 3) {
                System.out.println("You are at brown field and your money are " + playerMoney);
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 6 || sum2 == 8 || sum2 == 9) {
                System.out.println("You are at light blue field.");
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 11 || sum2 == 13 || sum2 == 14) {
                System.out.println("You are at pink field.");
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 16 || sum2 == 18 || sum2 == 19) {
                System.out.println("You are at orange field.");
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 21 || sum2 == 23 || sum2 == 24) {
                System.out.println("You are at red field.");
                sum2 = sum1 + sum2;
                System.out.println(sum2);

            } else if (sum2 == 26 || sum2 == 27 || sum2 == 29) {
                System.out.println("You are at yellow field.");
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 31 || sum2 == 32 || sum2 == 34) {
                System.out.println("You are at green field.");
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 37 || sum2 == 39) {
                System.out.println("You are at dark blue field.");
                sum2 = sum1 + sum2;
                System.out.println(sum2);

            } else if (sum2 == 0) {
                System.out.println("You are at GO.");
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 4) {
                System.out.println("Income tax = 200. Money: " + playerMoney);
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 10) {
                System.out.println("Jail");
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 12) {
                System.out.println("Electric company = 150. Money: " + playerMoney);
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 20) {
                System.out.println("Free parking");
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            } else if (sum2 == 18) {
                System.out.println("Water works = 150. Money: " + playerMoney);
                sum2 = sum1 + sum2;
                System.out.println(sum2);

            } else if (sum2 == 38) {
                System.out.println("Lixury tax = 100. Money: " + playerMoney);
                sum2 = sum1 + sum2;
                System.out.println(sum2);
            }
        }
    }

    int playerRoll = 1;
//        int name = 2;
//        String nameFirst = "";
//        String nameSecond = "";
//        String nameThird = "";
//        String nameFourth = "";
//        if (players == 2) {
//            System.out.println("Enter a player's name:");
//            String firstPlayer = input.nextLine();
//            nameFirst = firstPlayer;
//            System.out.println("Enter a player's name:");
//            String secondPlayer = input.nextLine();
//            nameSecond = secondPlayer;
//        } else if (players == 3) {
//            System.out.println("Enter a player's name:");
//            String firstPlayer = input.nextLine();
//            nameFirst = firstPlayer;
//            System.out.println("Enter a player's name:");
//            String secondPlayer = input.nextLine();
//            nameSecond = secondPlayer;
//            System.out.println("Enter a player's name:");
//            String thirdPlayer = input.nextLine();
//            nameThird = thirdPlayer;
//        } else if (players == 4) {
//            System.out.println("Enter a player's name:");
//            String firstPlayer = input.nextLine();
//            nameFirst = firstPlayer;
//            System.out.println("Enter a player's name:");
//            String secondPlayer = input.nextLine();
//            nameSecond = secondPlayer;
//            System.out.println("Enter a player's name:");
//            String thirdPlayer = input.nextLine();
//            nameThird = thirdPlayer;
//            System.out.println("Enter a player's name:");
//            String fourthPlayer = input.nextLine();
//            nameFourth = fourthPlayer;
//        }
//
//        while (playerRoll <= players) {
//            System.out.println("It is your turn " + nameFirst);
//            playerRoll++;
//            System.out.println("It is your turn "+ nameSecond);
//            playerRoll++;
//            System.out.println("It is your turn "+ nameThird);
//            playerRoll++;
//            break;
//
//            if (playerRoll > players) {
//                playerRoll = 1;
//            }
//        }
      // System.out.println("Board: ");
//        String[][] board = {{"0. GO", "1. Mediterranean Avenue", "2. Community Chest ", "3. Baltic Avenue", "4. INCOME TAX", "5. Reading Railroad < RR >", "6. Oriental Avenue", "7. Chance ", "8. Vermont Avenue", "9. Connecticut Avenue", "10. Jail"},
//                {
//                        "11. Saint Charles Place [magenta]", "12. Electic Company", "13. States Avenue [magenta]", "14. Virginia Avenue [magenta]", "15. Pennsylvania RR < RR >", "16. Saint James Place [orange]", "17. Community Chest ", "18. Tennessee Avenue [orange]", "19. New York Avenue [orange]", "20. Free Parking"
//                },
//                {
//                        "21. Kentucky Avenue [red]", "22. Chance ", "23. Indiana Avenue [red]", "24. Illinois Avenue [red]", "25. B&O Railroad < RR >", "26. Atlantic Avenue [yellow]", "27. Ventnor Avenue [yellow]", "28. Water Works", "29. Marvin Gardens [yellow]", "30. GO TO JAIL"
//                },
//                {
//                        "31. Pacific Avenue [green]", "31. North Carolina Avenue[green]", "32. Community Chest ", "33. Pennsylvania Avenue [green]", "34. Short Line RR < RR >", "35. Park Place [blue]", "36. LUXURY TAX", "37. Boardwalk [blue]"}
//        };


   // public static void dice() {
//        Scanner input = new Scanner(System.in);
//        int sum;
//        String enter = input.nextLine();
//        Random rollFirst = new Random();
//        int numberOne = rollFirst.nextInt(6) + 1;
//        System.out.println("The first die is " + numberOne);
//        String clickEnter = input.nextLine();
//        Random rollSecond = new Random();
//        int numberTwo = rollSecond.nextInt(6) + 1;
//        System.out.println("The second die is " + numberTwo);
//        sum = numberOne + numberTwo;
//        System.out.println("The sum of the dice is " + sum);
//    }
}
