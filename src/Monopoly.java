import java.util.Random;
import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Board: ");
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

        System.out.println("Select the number of players:");
        int players = input.nextInt();
        int firstPlayerMoney = 2000;
        int secondPlayerMoney = 2000;
        int thirdPlayerMoney = 2000;
        int fourthPlayerMoney = 2000;
        int[] price = {60, 0, 60, 200, 200, 100, 0, 100, 120, 200, 140, 150, 140, 160, 200, 180, 0, 180, 200, 0, 220, 0, 220, 240, 200, 260, 260, 150, 280, 0, 300, 300, 0, 320, 200, 350, 200, 0, 250, 100, 400};
        int field = 0;
        players(price, field, players, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
    }


    public static void players(int[] price, int field, int players, int firstPlayerMoney, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
        Scanner input = new Scanner(System.in);
//        int playerRoll = 1;
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


        switch (players) {
            case 2:
                System.out.println("Enter the name of the first player:");
                String firstName = input.nextLine();
                System.out.println("Enter the name of the second player:");
                String secondName = input.nextLine();
                while (firstPlayerMoney >= 0 || secondPlayerMoney >= 0) {
                    System.out.println(firstName + " it is your turn. Click enter to throw the dice.");
                    moveFirstPlayer(price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
                    System.out.println(secondName + " it is your turn. Click enter to throw the dice.");
                    moveSecondPlayer(price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
                }
                break;
            case 3:
                System.out.println("Enter the name of the first player:");
                String firstPlayer = input.nextLine();
                System.out.println("Enter the name of the second player:");
                String secondPlayer = input.nextLine();
                System.out.println("Enter the name of the third player:");
                String thirdPlayer = input.nextLine();
                break;
            case 4:
                System.out.println("Enter the name of the first player:");
                String firstNickname = input.nextLine();
                System.out.println("Enter the name of the second player:");
                String secondNickname = input.nextLine();
                System.out.println("Enter the name of the third player:");
                String thirdNickname = input.nextLine();
                System.out.println("Enter the name of the fourth player:");
                String fourthNickname = input.nextLine();
                break;
            default:
                System.out.println("The players can be from 2 to 4!");
                break;
        }
    }

    public static void moveFirstPlayer(int[] price, int firstPlayerMoney, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
        //dice
        Scanner input = new Scanner(System.in);
        int sum;
        String enter = input.nextLine();
        Random rollFirst = new Random();
        int numberOne = rollFirst.nextInt(6) + 1;
        System.out.println("The first die is " + numberOne);
        String clickEnter = input.nextLine();
        Random rollSecond = new Random();
        int numberTwo = rollSecond.nextInt(6) + 1;
        System.out.println("The second die is " + numberTwo);
        sum = numberOne + numberTwo;
        System.out.println();
        System.out.println("The sum of the dice is " + sum);
        System.out.println();
        int count = sum;
        int field = 0;
        field = count + field;
//fields

        if (field >= 40) {
            field = field - 40;
            System.out.println("You are at " + field);
        } else if (field == 30) {
            System.out.println("You are at " + field + "and you go to jail");
            field = 10;
            field = count + field;
            jail();
        } else if (field == 7 || field == 22 || field == 36) {
            System.out.println("You have a chance card. Click enter to see it.");
            int Enter = input.nextInt();
            chance();
        } else if (field == 2 || field == 17 || field == 33) {
            System.out.println("You have a community chest card. Click enter to see it.");
            int Enter = input.nextInt();
            communityChest(firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
        } else if (field == 5 || field == 15 || field == 25 || field == 35) {
            System.out.println("You are at station.");
            station(field, price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
        } else if (field == 1 || field == 3) {
            System.out.println("You are at brown field.");
            buySellRent(price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
        } else if (field == 6 || field == 8 || field == 9) {
            System.out.println("You are at light blue field.");
            buySellRent(price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
        } else if (field == 11 || field == 13 || field == 14) {
            System.out.println("You are at pink field.");
            buySellRent(price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
        } else if (field == 16 || field == 18 || field == 19) {
            System.out.println("You are at orange field.");
            buySellRent(price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
        } else if (field == 21 || field == 23 || field == 24) {
            System.out.println("You are at red field.");
            buySellRent(price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
        } else if (field == 26 || field == 27 || field == 29) {
            System.out.println("You are at yellow field.");
            buySellRent(price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
        } else if (field == 31 || field == 32 || field == 34) {
            System.out.println("You are at green field.");
            buySellRent(price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
        } else if (field == 37 || field == 39) {
            System.out.println("You are at dark blue field.");
            buySellRent(price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);

        } else if (field == 0) {
            System.out.println("You are at GO.");
            go();
        }
    }

    public static void moveSecondPlayer(int[] price, int firstPlayerMoney, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
        Scanner input = new Scanner(System.in);
        int sum;
        String enter = input.nextLine();
        Random rollFirst = new Random();
        int numberOne = rollFirst.nextInt(6) + 1;
        System.out.println("The first die is " + numberOne);
        String clickEnter = input.nextLine();
        Random rollSecond = new Random();
        int numberTwo = rollSecond.nextInt(6) + 1;
        System.out.println("The second die is " + numberTwo);
        sum = numberOne + numberTwo;
        System.out.println();
        System.out.println("The sum of the dice is " + sum);
        System.out.println();

    }

    public static void moveThirdPlayer(int[] price, int firstPlayerMoney, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {

    }

    public static void moveFourthPlayer(int[] price, int secondPlayerMoney, int firstPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {

    }

    public static void go() {

    }

    public static void station(int field, int[] price, int firstPlayerMoney, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have the fourth stations? (yes/no)");
        String answerFiveS = input.nextLine();
        if (answerFiveS == "yes" || answerFiveS == "Yes" || answerFiveS == "YES") {
            System.out.println("Do you want to travel? (yes/no)");
            String answerStation = input.nextLine();
            if (answerStation == "yes" || answerStation == "Yes" || answerStation == "YES") {
                System.out.println("Where? (answer with 5/15/25/35)");
                int answer = input.nextInt();
                switch (answer) {
                    case 5:
                        field = 5;
                        System.out.println("You are at Reading railroad.(5)" + field);
                        break;
                    case 15:
                        field = 15;
                        System.out.println("You are at Pennsylvania railroad.(15)" + field);
                        break;
                    case 25:
                        field = 25;
                        System.out.println("You are at B. & O. railroad.(25)" + field);
                        break;
                    case 35:
                        field = 35;
                        System.out.println("You are at Short line.(35)" + field);
                        break;
                    default:
                        System.out.println("Enter one of the three stations. (5, 15, 25 or 35)");
                        break;
                }

            } else if (answerStation == "no" || answerStation == "No" || answerStation == "NO") {
                buySellRent(price, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
            }

        }
    }


    public static void chance() {
        Random rand = new Random();
        int card = rand.nextInt(16) + 1;
        if (card == 1) {

        } else if (card == 2) {

        } else if (card == 3) {

        } else if (card == 4) {

        } else if (card == 5) {

        } else if (card == 6) {

        } else if (card == 7) {

        } else if (card == 8) {

        } else if (card == 9) {

        } else if (card == 10) {

        } else if (card == 11) {

        } else if (card == 12) {

        } else if (card == 13) {

        } else if (card == 14) {

        } else if (card == 15) {

        } else if (card == 16) {

        }
    }

    public static void communityChest(int firstPlayerMoney, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
        Random rand = new Random();
        int card = rand.nextInt(16) + 1;
        if (card == 1) {
            System.out.println("Advance to Go. You receive 200.");
            firstPlayerMoney += 200;
        } else if (card == 2) {

        } else if (card == 3) {

        } else if (card == 4) {

        } else if (card == 5) {

        } else if (card == 6) {

        } else if (card == 7) {

        } else if (card == 8) {

        } else if (card == 9) {

        } else if (card == 10) {

        } else if (card == 11) {

        } else if (card == 12) {

        } else if (card == 13) {

        } else if (card == 14) {

        } else if (card == 15) {

        } else if (card == 16) {

        }
    }

    public static void buySellRent(int[] price, int firstPlayerMoney, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to buy, sell or rent a property? (answer with 1,2 or 3)");
        int answer = input.nextInt();
        switch (answer) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                System.out.println("Enter with number who of the players has got the property. ");
                int rent = input.nextInt();
                switch (rent) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Answer with number!");
                }
                break;
            default:
                System.out.println("Answer with 1,2 or 3!");
        }
    }

    public static void jail() {

    }

}