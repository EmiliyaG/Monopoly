import java.util.Random;
import java.util.Scanner;

public class nzzzzzzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the number of players:");
        int players = input.nextInt();
        int[] price = {60, 0, 60, 200, 200, 100, 0, 100, 120, 200, 140, 150, 140, 160, 200, 180, 0, 180, 200, 0, 220, 0, 220, 240, 200, 260, 260, 150, 280, 0, 300, 300, 0, 320, 200, 350, 200, 0, 250, 100, 400};
        int field = 0;
        int[] playersMoney = {1000, 2500, 2100, 2000};
        //players(price, playersMoney, field, players);
        int playerMoney;
        for (int i = 0; i < players; i++) {
            playerMoney = playersMoney[i];
            System.out.println(String.format("%s\n%s\n%s\n%s\n%s", "You have 3 choices to get out of the jail.", "1. Pay 50.", "2. Throw a pair.", "3. With card.", "answer with 1, 2 or 3."));
            int answer = input.nextInt();
            switch (answer) {
                case 1:
                    playerMoney -= 50;
                    System.out.println("Your money are " + playerMoney);
                    System.out.println("Click enter to throw the dice");
                    String en = input.nextLine();

                    moveFirstPlayer(price, playersMoney, players);
                    break;
                case 2:
                    String enter = input.nextLine();
                    Random rollFirst = new Random();
                    int numberOne = rollFirst.nextInt(6) + 1;
                    System.out.println("The first die is " + numberOne);
                    String clickEnter = input.nextLine();
                    Random rollSecond = new Random();
                    int numberTwo = rollSecond.nextInt(6) + 1;
                    System.out.println("The second die is " + numberTwo);
                    if (numberOne == numberTwo) {
                        System.out.println("You get out of th jail. Click enter to throw the dice.");
                        moveFirstPlayer(price, playersMoney, players);
                        buySellRent(price, playersMoney, players);

                    } else while (numberOne != numberTwo) {
                        String ennter = input.nextLine();
                        Random rollF = new Random();
                        int numberO = rollFirst.nextInt(6) + 1;
                        System.out.println("The first die is " + numberO);
                        String Enter = input.nextLine();
                        Random rollS = new Random();
                        int numberT = rollSecond.nextInt(6) + 1;
                        System.out.println("The second die is " + numberT);
                        if (numberO == numberT) {
                            System.out.println("You get out of th jail. Click enter to throw the dice.");
                            moveFirstPlayer(price, playersMoney, players);
                            buySellRent(price, playersMoney, players);

                        }
                    }
                    break;
                case 3:
                    System.out.println("You get out of th jail. Click enter to throw the dice.");
                    moveFirstPlayer(price, playersMoney, players);
                    buySellRent(price, playersMoney, players);
                    break;
                default:
                    System.out.println("Answer with 1, 2, or 3!");
            }
        }
    }
    public static void buySellRent(int[] price, int[] playersMoney, int players) {
        Scanner input = new Scanner(System.in);
        int moneyAfterPaying;

        System.out.println("Do you want to buy, sell or rent a property");
        System.out.println("\n 1. Buy \n 2. Sell \n 3. Rent \n 4. No(1, 2, 3 or 4)");
        int answer = input.nextInt();
        int priceMoney;
        int playerMoney;
        for (int i = 0; i < players; i++) {
            priceMoney = price[i];
            playerMoney = playersMoney[i];
            switch (answer) {
                case 1:
                    moneyAfterPaying = playerMoney - priceMoney;
                    System.out.println("It cost " + price[i]);
                    System.out.println("Your money are " + moneyAfterPaying);
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Enter with number who of the players has got the property. ");
                    int rent = input.nextInt();
                    switch (rent) {
                        case 1:

                            System.out.println("If you are ready click enter.");
                            String eeEnter = input.nextLine();
                            break;
                        case 2:

                            System.out.println("If you are ready click enter.");
                            String eeeEnter = input.nextLine();
                            break;
                        case 3:

                            System.out.println("If you are ready click enter.");
                            String eEEEnter = input.nextLine();
                            break;

                        default:

                            System.out.println("Answer with number!");
                    }
                case 4:

                    break;
                default:
                    System.out.println("Answer with 1, 2, 3 or 4!");
                    int answerr = input.nextInt();
                    switch (answerr) {
                        case 1:
                            moneyAfterPaying = playersMoney[i] - price[i];
                            System.out.println("It cost " + price[i]);
                            System.out.println("Your money are " + moneyAfterPaying);
                            break;
                        case 2:

                            break;
                        case 3:
                            System.out.println("Enter with number who of the players has got the property. ");
                            int reent = input.nextInt();
                            switch (reent) {
                                case 1:

                                    System.out.println("If you are ready click enter.");
                                    String eeEnter = input.nextLine();
                                    break;
                                case 2:

                                    System.out.println("If you are ready click enter.");
                                    String eeeEnter = input.nextLine();
                                    break;
                                case 3:

                                    System.out.println("If you are ready click enter.");
                                    String eEEEnter = input.nextLine();
                                    break;

                                default:

                                    System.out.println("Answer with number!");
                            }
                        case 4:
                            break;
                    }
            }
        }
    }
    public static void moveFirstPlayer(int[] price, int[] playersMoney, int players) {
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
//fields
        int playerMoney;
        for (int i = 0; i < 1; i++) {
            field = count + field;
            playerMoney = playersMoney[i];
            if (field >= 40) {
                field = field - 40;
                System.out.println("You are at " + field);
                buySellRent(price, playersMoney, players);
            } else if (field == 30) {
                System.out.println("You are at " + field + "and you go to jail");
                field = 10;
                field = count + field;

            } else if (field == 7 || field == 22 || field == 36) {
                System.out.println("You have a chance card.");

                System.out.println("Your money are " + playerMoney);
                buySellRent(price, playersMoney, players);
            } else if (field == 2 || field == 17 || field == 33) {
                System.out.println("You have a community chest card.");
                System.out.println();

                System.out.println("Your money are " + playerMoney);
                buySellRent(price, playersMoney, players);
            } else if (field == 5 || field == 15 || field == 25 || field == 35) {
                System.out.println("You are at station.");

            } else if (field == 1 || field == 3) {
                System.out.println("You are at brown field and your money are " + playerMoney);

                buySellRent(price, playersMoney, players);
            } else if (field == 6 || field == 8 || field == 9) {
                System.out.println("You are at light blue field.");
                buySellRent(price, playersMoney, players);
            } else if (field == 11 || field == 13 || field == 14) {
                System.out.println("You are at pink field.");
                buySellRent(price, playersMoney, players);
            } else if (field == 16 || field == 18 || field == 19) {
                System.out.println("You are at orange field.");
                buySellRent(price, playersMoney, players);
            } else if (field == 21 || field == 23 || field == 24) {
                System.out.println("You are at red field.");
                buySellRent(price, playersMoney, players);
            } else if (field == 26 || field == 27 || field == 29) {
                System.out.println("You are at yellow field.");
                buySellRent(price, playersMoney, players);
            } else if (field == 31 || field == 32 || field == 34) {
                System.out.println("You are at green field.");
                buySellRent(price, playersMoney, players);
            } else if (field == 37 || field == 39) {
                System.out.println("You are at dark blue field.");
                buySellRent(price, playersMoney, players);

            } else if (field == 0) {
                System.out.println("You are at GO.");

            }
        }
    }
    public static void dice() {
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
        System.out.println("The sum of the dice is " + sum);
    }
}
