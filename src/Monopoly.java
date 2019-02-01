import java.util.Random;
import java.util.Scanner;

public class Monopoly {
    public static int field = 0;
    public static int[] playersMoney = {2000, 2000, 2000, 2000};
    public static int playerMoney;
    public static int[] price = {0, 60, 0, 60, 200, 200, 100, 0, 100, 120, 0, 140, 150, 140, 160, 0, 180, 0, 180, 200, 0, 220, 0, 220, 240, 0, 260, 260, 0, 280, 0, 300, 300, 0, 320, 0, 0, 350, 100, 400};
    public static int[] rent = {0, 4, 0, 8, 0, 25, 12, 0, 12, 16, 0, 20, 0, 20, 24, 0, 28, 0, 28, 32, 0, 36, 0, 36, 40, 0, 44, 44, 0, 48, 0, 52, 52, 0, 54, 0, 0, 70, 0, 100};
    public static int[] rentOneHouse = {0, 10, 0, 20, 0, 0, 30, 0, 30, 40, 0, 50, 0, 50, 60, 0, 70, 0, 70, 80, 0, 90, 0, 90, 100, 0, 110, 110, 0, 120, 0, 150, 150, 0, 160, 0, 0, 175, 0, 200};
    public static int[] rentTwoHouses = {0, 30, 0, 60, 0, 0, 90, 0, 90, 100, 0, 150, 0, 150, 180, 0, 200, 0, 200, 220, 0, 250, 0, 250, 300, 0, 330, 330, 0, 360, 0, 450, 450, 0, 460, 0, 0, 500, 0, 600};
    public static int[] rentThreeHouses = {0, 90, 0, 180, 0, 0, 270, 0, 270, 300, 0, 450, 0, 450, 500, 0, 550, 0, 550, 600, 0, 700, 0, 700, 750, 0, 800, 800, 0, 850, 0, 1000, 1000, 0, 1100, 0, 0, 1100, 0, 1400};
    public static int[] rentFourHouses = {0, 160, 0, 320, 0, 0, 400, 0, 400, 450, 0, 625, 0, 625, 700, 0, 750, 0, 750, 800, 0, 875, 0, 875, 925, 0, 975, 975, 0, 1025, 0, 1200, 1200, 0, 1300, 0, 0, 1300, 0, 1700};
    public static int[] rentHotel = {0, 250, 0, 450, 0, 0, 550, 0, 550, 600, 0, 750, 0, 750, 900, 0, 950, 0, 950, 1000, 0, 1050, 0, 1050, 1100, 0, 1050, 1050, 0, 1200, 0, 1400, 1400, 0, 1500, 0, 0, 1500, 0, 2000};
    public static String[] namesFields = {"Go", "first brown", "Community chest", "second brown", "income tax", "Reading railroad", "first light blue",
            "chance", "second light blue", "third light blue", "jail", "first pink", "electric company", "second pink", "third pink", "Pennsylvania railroad", "first orange",
            "community chest", "second orange", "third orange", "Free parking", "first red", "chance", "second red", "third red", "R. & O. railroad", "first yellow",
            "second yellow", "water works", "third yellow", "Go to jail", "first green", "second green", "community chest", "third green",
            "Short line", "chance", "first dark blue", "Luxury tax", "second blue"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the number of players:");
        int players = input.nextInt();
        for (int i = 0; i < players; i++) {
            playerMoney = playersMoney[i];
            playersRoll(players);
        }
    }
    public static void playersRoll(int players) {
        Scanner input = new Scanner(System.in);
        switch (players) {
            case 2:
                System.out.println("Enter the name of the first player:");
                String firstName = input.nextLine();
                System.out.println("Enter the name of the second player:");
                String secondName = input.nextLine();
                while (playersMoney[0] >= 0 || playersMoney[1] >= 0) {
                    System.out.println(firstName + " it is your turn. Click enter to throw the dice.");
                    move(players);
                    System.out.println(secondName + " it is your turn. Click enter to throw the dice.");
                    move(players);
                }
                break;
            case 3:
                System.out.println("Enter the name of the first player:");
                String firstPlayer = input.nextLine();
                System.out.println("Enter the name of the second player:");
                String secondPlayer = input.nextLine();
                System.out.println("Enter the name of the third player:");
                String thirdPlayer = input.nextLine();
                while (playersMoney[0] >= 0 || playersMoney[1] >= 0 || playersMoney[2] >= 0) {
                    System.out.println(firstPlayer + " it is your turn. Click enter to throw the dice.");
                    move(players);
                    System.out.println(secondPlayer + " it is your turn. Click enter to throw the dice.");
                    move(players);
                    System.out.println(thirdPlayer + " it is your turn. Click enter to throw the dice.");
                    move(players);
                }
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
                while (playersMoney[0] >= 0 || playersMoney[1] >= 0 || playersMoney[2] >= 0 || playersMoney[3] >= 0) {
                    System.out.println(firstNickname + " it is your turn. Click enter to throw the dice.");
                    move(players);
                    System.out.println(secondNickname + " it is your turn. Click enter to throw the dice.");
                    move(players);
                    System.out.println(thirdNickname + " it is your turn. Click enter to throw the dice.");
                    move(players);
                    System.out.println(fourthNickname + " it is your turn. Click enter to throw the dice.");
                    move(players);
                }
                break;
            default:
                System.out.println("The players can be from 2 to 4!");

        }
    }

    public static void move(int players) {
        //dice
        Scanner input = new Scanner(System.in);
        int sum;
        String enter = input.nextLine();
        Random rollFirst = new Random();
        int numberOne = rollFirst.nextInt(6) + 1;
        System.out.println("The first die is " + numberOne);
        Random rollSecond = new Random();
        int numberTwo = rollSecond.nextInt(6) + 1;
        System.out.println("The second die is " + numberTwo);
        sum = numberOne + numberTwo;
        System.out.println("The sum of the dice is " + sum);
        field = sum + field;
        //fields
        if (field == 0) {
            System.out.println("You are at field GO.");
            go(players);
        } else if (field == 1) {
            System.out.println("You are at te first brown field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 2 || field == 17 || field == 33) {
            System.out.println("You have a community chest card.");
            communityChest(players);
        } else if (field == 3) {
            System.out.println("You are at the second brown field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 4) {
            playerMoney -= 200;
            System.out.println("Income tax = 200. Money: " + playerMoney);
        } else if (field == 5) {
            System.out.println("You are at a station.");
            station(players);
        } else if (field == 6) {
            System.out.println("You are at the first light blue field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 7 || field == 22 || field == 36) {
            System.out.println("You have a chance card.");
            chance(players);
        } else if (field == 8) {
            System.out.println("You are at the second light blue field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 9) {
            System.out.println("You are at the third light blue field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 10) {
            System.out.println("Jail");
        } else if (field == 11) {
            System.out.println("You are at the first pink field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 12) {
            playerMoney -= 150;
            System.out.println("Electric company = 150. Money: " + playerMoney);
        } else if (field == 13) {
            System.out.println("You are at the second pink field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 14) {
            System.out.println("You are at the third pink field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 15) {
            System.out.println("You are at a station.");
            station(players);
        } else if (field == 16) {
            System.out.println("You are at the first orange field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 18) {
            System.out.println("You are at the second orange field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 19) {
            System.out.println("You are at the third orange field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 20) {
            System.out.println("Free parking");
        } else if (field == 21) {
            System.out.println("You are at the first red field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 23) {
            System.out.println("You are at the second red field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 24) {
            System.out.println("You are at the third red field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 25) {
            System.out.println("You are at a station.");
            station(players);
        } else if (field == 26) {
            System.out.println("You are at the first yellow field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 27) {
            System.out.println("You are at the second yellow field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 28) {
            playerMoney -= 150;
            System.out.println("Water works = 150. Money: " + playerMoney);
        } else if (field == 29) {
            System.out.println("You are at the third yellow field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 30) {
            System.out.println("You are atthe field \"Go to jail\"and you go to jail.");
            jail(players);
        } else if (field == 31) {
            System.out.println("You are at the first green field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 32) {
            System.out.println("You are at the second green field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 34) {
            System.out.println("You are at the third green field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 35) {
            System.out.println("You are at a station.");
            station(players);
        } else if (field == 37) {
            System.out.println("You are at the first dark blue field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field == 38) {
            playerMoney -= 100;
            System.out.println("Luxury tax = 100. Money: " + playerMoney);
        } else if (field == 39) {
            System.out.println("You are at the second dark blue field. Money: " + playerMoney);
            buySellRent(players);
        } else if (field >= 40) {
            field = field - 40;
            System.out.println("You are at " + field);
            buySellRent(players);
        }
    }

    public static void go(int players) {
        playerMoney += 200;
        System.out.println("Your money are " + playerMoney);

    }

    public static void station(int players) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have the fourth stations? (Answer with true(yes) or false(no))");
        boolean answerFiveS = input.nextBoolean();
        if (answerFiveS == true) {
            System.out.println("Do you want to travel? (Answer with true(yes) or false(no))");
            boolean answerStation = input.nextBoolean();
            if (answerStation == true) {
                System.out.println("Where? (answer with 5/15/25/35)");
                int answer = input.nextInt();
                switch (answer) {
                    case 5:
                        field = 5;
                        System.out.println("You are at Reading railroad.");
                        break;
                    case 15:
                        field = 15;
                        System.out.println("You are at Pennsylvania railroad.");
                        break;
                    case 25:
                        field = 25;
                        System.out.println("You are at B. & O. railroad.");
                        break;
                    case 35:
                        field = 35;
                        System.out.println("You are at Short line.");
                        break;
                    default:
                        System.out.println("Enter one of the three stations. (5, 15, 25 or 35)");
                        break;
                }

            } else if (answerStation == false) {
            } else {
                System.out.println("Answer with true(yes) or false(no)");
            }
        } else if (answerFiveS == false) {
        } else {
            System.out.println("Answer with true(yes) or false(no)");
        }
    }

    public static void chance(int players) {

        Random rand = new Random();
        int card = rand.nextInt(16) + 1;
        if (card == 1) {
            System.out.println("Advance to \"Go\". (Collect $200) ");
            go(players);
            System.out.println("Money: " + playerMoney);
        } else if (card == 2) {
            System.out.println("Advance to Illinois Avenue. If you pass Go, collect $200. ");
            field = 24;
            System.out.println("Money: " + playerMoney);
        } else if (card == 3) {
            System.out.println("Advance to St. Charles Place. If you pass Go, collect $200. ");
            if (field >= 11) {
                playerMoney += 200;
                field = 11;
            } else {
                field = 11;
            }
            System.out.println("Money: " + playerMoney);
        } else if (card == 4) {
            System.out.println("Bank pays you dividend of $50.");
            playerMoney += 50;
            System.out.println("Money: " + playerMoney);
        } else if (card == 5) {
            System.out.println("Go Back Three Spaces.");
            field -= 3;
            System.out.println("You are at " + field);
        } else if (card == 6) {
            System.out.println("Go to Jail. Go directly to Jail.");
            jail(players);
        } else if (card == 7) {
            System.out.println("Pay poor tax of $15.");
            System.out.println("Money: " + playerMoney);
            playerMoney -= 15;
        } else if (card == 8) {
            System.out.println("Take a trip to Reading Railroad. If you pass Go, collect $200. ");
            if (field >= 5) {
                playerMoney += 200;
                field = 5;
            } else {
                field = 5;
            }
            System.out.println("Money: " + playerMoney);
        } else if (card == 9) {
            System.out.println("Bank pays you dividend of $100.");
            playerMoney += 100;
            System.out.println("Money: " + playerMoney);
        } else if (card == 10) {
            System.out.println("Your building and loan matures. Collect $150. ");
            playerMoney += 150;
            System.out.println("Money: " + playerMoney);
        } else if (card == 11) {
            System.out.println("You have won a crossword competition. Collect $100.");
            playerMoney += 100;
            System.out.println("Money: " + playerMoney);
        } else if (card == 12) {
            System.out.println("Pay 30.");
            playerMoney -= 30;
            System.out.println("Money: " + playerMoney);
        } else if (card == 13) {
            System.out.println("Pay tax of $40. ");
            playerMoney -= 40;
            System.out.println("Money: " + playerMoney);
        } else if (card == 14) {
            System.out.println("Bank error. You receive 50");
            playerMoney += 50;
            System.out.println("Money: " + playerMoney);
        } else if (card == 15) {
            System.out.println("Take a trip to B. & O. Railroad. If you pass Go, collect $200. ");
            if (field >= 25) {
                playerMoney += 200;
                field = 25;
            } else {
                field = 25;
            }
            System.out.println("Money: " + playerMoney);
        } else if (card == 16) {
            System.out.println("Get out of Jail Free. ");
        }
    }

    public static void communityChest(int players) {
        Random rand = new Random();
        int card = rand.nextInt(16) + 1;
        if (card == 1) {
            System.out.println("Advance to Go. You receive 200.");
            field = 0;
            playerMoney += 200;
            System.out.println("Money: " + playerMoney);
        } else if (card == 2) {
            System.out.println("Bank error in your favor—Collect $200.");
            playerMoney += 200;
            System.out.println("Money: " + playerMoney);
        } else if (card == 3) {
            System.out.println("Doctor's fee—Pay $50.");
            playerMoney -= 50;
            System.out.println("Money: " + playerMoney);
        } else if (card == 4) {
            System.out.println("From sale of stock you get $50.");
            playerMoney += 50;
            System.out.println("Money: " + playerMoney);
        } else if (card == 5) {
            System.out.println("Grand Opera Night—Collect $50.");
            playerMoney += 50;
            System.out.println("Money: " + playerMoney);
        } else if (card == 6) {
            System.out.println("Go to Jail–Go directly to jail.");
            jail(players);
        } else if (card == 7) {
            System.out.println("Holiday Fund matures—Receive $100.");
            playerMoney += 100;
            System.out.println("Money: " + playerMoney);
        } else if (card == 8) {
            System.out.println("Income tax refund–Collect $20.");
            playerMoney += 20;
            System.out.println("Money: " + playerMoney);
        } else if (card == 9) {
            System.out.println("It is your birthday—Collect $10.");
            playerMoney += 10;
            System.out.println("Money: " + playerMoney);
        } else if (card == 10) {
            System.out.println("Life insurance matures–Collect $100.");
            playerMoney += 100;
            System.out.println("Money: " + playerMoney);
        } else if (card == 11) {
            System.out.println("Pay hospital fees of $100.");
            playerMoney -= 100;
            System.out.println("Money: " + playerMoney);
        } else if (card == 12) {
            System.out.println("Pay school fees of $150.");
            playerMoney -= 150;
            System.out.println("Money: " + playerMoney);
        } else if (card == 13) {
            System.out.println("Receive $25 consultancy fee.");
            playerMoney += 25;
            System.out.println("Money: " + playerMoney);
        } else if (card == 14) {
            System.out.println("You have won second prize in a beauty contest–Collect $10.");
            playerMoney += 10;
            System.out.println("Money: " + playerMoney);
        } else if (card == 15) {
            System.out.println("You inherit $100.");
            playerMoney += 100;
            System.out.println("Money: " + playerMoney);
        } else if (card == 16) {
            System.out.println("Get Out of Jail Free.");
        }
    }

    public static void buySellRent(int players) {
        Scanner input = new Scanner(System.in);
        int moneyAfterPaying;
        int moneyAfterSelling;
        System.out.println("It costs " + price[field]);
        System.out.println("Do you want to buy, sell or rent the property?(1, 2, 3 or 4)");
        System.out.println("\n 1. Buy \n 2. Sell \n 3. Rent \n 4. No");
        int answer = input.nextInt();

        switch (answer) {
            case 1:
                moneyAfterPaying = playerMoney - price[field];
                System.out.println("Money: " + moneyAfterPaying);
                System.out.println("You have " + namesFields[field]);
                housesAndHotel(players);
                break;
            case 2:
                moneyAfterSelling = playerMoney + price[field];
                System.out.println("Money: " + moneyAfterSelling);
                break;
            case 3:
                System.out.println("Enter with number who of the players has got the property. ");
                int answerCase3 = input.nextInt();
                switch (answerCase3) {
                    case 1:
                        playersMoney[0] += rent[field];
                        playerMoney -= rent[field];
                        System.out.println("Your money:" + playerMoney);
                        System.out.println("The money of the first player player " + playersMoney[0]);
                        String enter = input.nextLine();
                        break;
                    case 2:
                        playersMoney[1] += rent[field];
                        playerMoney -= rent[field];
                        System.out.println("Your money:" + playerMoney);
                        System.out.println("The money of the second player player " + playersMoney[1]);
                        String enter1 = input.nextLine();
                        break;
                    case 3:
                        playersMoney[2] += rent[field];
                        playerMoney -= rent[field];
                        System.out.println("Your money:" + playerMoney);
                        System.out.println("The money of the third player player " + playersMoney[2]);
                        String enter2 = input.nextLine();
                        break;
                    case 4:
                        playersMoney[3] += rent[field];
                        playerMoney -= rent[field];
                        System.out.println("Your money:" + playerMoney);
                        System.out.println("The money of the fourth player player " + playersMoney[3]);
                        String enter3 = input.nextLine();
                        break;
                    default:
                        System.out.println("Answer with number!");
                        int defaultCase3 = input.nextInt();
                        switch (defaultCase3) {
                            case 1:
                                playersMoney[0] += rent[field];
                                playerMoney -= rent[field];
                                System.out.println("Your money:" + playerMoney);
                                System.out.println("The money of the first player player " + playersMoney[0]);
                                String enter4 = input.nextLine();
                                break;
                            case 2:
                                playersMoney[1] += rent[field];
                                playerMoney -= rent[field];
                                System.out.println("Your money:" + playerMoney);
                                System.out.println("The money of the second player player " + playersMoney[1]);
                                String enter5 = input.nextLine();
                                break;
                            case 3:
                                playersMoney[2] += rent[field];
                                playerMoney -= rent[field];
                                System.out.println("Your money:" + playerMoney);
                                System.out.println("The money of the third player player " + playersMoney[2]);
                                String enter6 = input.nextLine();
                                break;
                            case 4:
                                playersMoney[3] += rent[field];
                                playerMoney -= rent[field];
                                System.out.println("Your money:" + playerMoney);
                                System.out.println("The money of the fourth player player " + playersMoney[3]);
                                String enter7 = input.nextLine();
                                break;
                        }
                        break;
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Answer with 1, 2, 3 or 4!");
                int answerDefault = input.nextInt();
                switch (answerDefault) {
                    case 1:
                        moneyAfterPaying = playersMoney[field] - price[field];
                        System.out.println("Your money are " + moneyAfterPaying);
                        housesAndHotel(players);
                        break;
                    case 2:
                        moneyAfterSelling = playerMoney + price[field];
                        System.out.println("Money: " + moneyAfterSelling);
                        break;
                    case 3:
                        System.out.println("Enter with number who of the players has got the property. ");
                        int rent1 = input.nextInt();
                        switch (rent1) {
                            case 1:
                                playersMoney[0] += rent[field];
                                playerMoney -= rent[field];
                                System.out.println("Your money:" + playerMoney);
                                System.out.println("The money of the first player player " + playersMoney[0]);
                                String enter8 = input.nextLine();
                                break;
                            case 2:
                                playersMoney[1] += rent[field];
                                playerMoney -= rent[field];
                                System.out.println("Your money:" + playerMoney);
                                System.out.println("The money of the second player player " + playersMoney[1]);
                                String enter9 = input.nextLine();
                                break;
                            case 3:
                                playersMoney[2] += rent[field];
                                playerMoney -= rent[field];
                                System.out.println("Your money:" + playerMoney);
                                System.out.println("The money of the third player player " + playersMoney[2]);
                                String enter10 = input.nextLine();
                                break;
                            case 4:
                                playersMoney[3] += rent[field];
                                playerMoney -= rent[field];
                                System.out.println("Your money:" + playerMoney);
                                System.out.println("The money of the fourth player player " + playersMoney[3]);
                                String enter11 = input.nextLine();
                                break;
                        }
                    case 4:
                        break;
                }
        }
    }


    public static void jail(int players) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            playerMoney = playersMoney[i];
            System.out.println(String.format("%s\n%s\n%s\n%s\n%s", "You have 3 choices to get out of the jail.", "1. Pay 50.", "2. Throw a pair.", "3. With card.", "answer with 1, 2 or 3."));
            int answer = input.nextInt();
            switch (answer) {
                case 1:
                    playerMoney -= 50;
                    System.out.println("Your money are " + playerMoney);
                    System.out.println("Click enter to throw the dice");
                    String enter0 = input.nextLine();
                    move(players);
                    break;
                case 2:
                    String enter = input.nextLine();
                    Random rollFirst = new Random();
                    int numberOne = rollFirst.nextInt(6) + 1;
                    System.out.println("The first die is " + numberOne);
                    String enter1 = input.nextLine();
                    Random rollSecond = new Random();
                    int numberTwo = rollSecond.nextInt(6) + 1;
                    System.out.println("The second die is " + numberTwo);
                    if (numberOne == numberTwo) {
                        System.out.println("You get out of th jail. Click enter to throw the dice.");
                        move(players);
                    }
//                    } else while (numberOne != numberTwo) {
//                        String enter2 = input.nextLine();
//                        Random rollFirst1 = new Random();
//                        int numberO = rollFirst1.nextInt(6) + 1;
//                        System.out.println("The first die is " + numberO);
//                        String enter3 = input.nextLine();
//                        Random rollSecond2 = new Random();
//                        int numberT = rollSecond2.nextInt(6) + 1;
//                        System.out.println("The second die is " + numberT);
//                        if (numberO == numberT) {
//                            System.out.println("You get out of th jail. Click enter to throw the dice.");
//                            move(players);
//                        }
//                    }
                    break;
                case 3:
                    System.out.println("Do you have a cart? (Answer with true(yes) or false(no))");
                    boolean answerCase3 = input.nextBoolean();
                    if (answerCase3 == true) {
                        System.out.println("You get out of th jail.");
                        move(players);
                    } else if (answerCase3 == false) {
                        System.out.println("Click enter.");
                        String enter4 = input.nextLine();
                    } else {
                        System.out.println("Answer with true or false!");
                        boolean answer1 = input.nextBoolean();
                        if (answer1 == true) {
                            System.out.println("You get out of th jail.");
                            move(players);
                        } else if (answer1 == false) {
                            System.out.println("Click enter.");
                            String enter5 = input.nextLine();
                        }
                    }
                    break;
                default:
                    System.out.println("Answer with 1, 2, or 3!");
                    int answer1 = input.nextInt();
                    switch (answer1) {
                        case 1:
                            playerMoney -= 50;
                            System.out.println("Your money are " + playerMoney);
                            System.out.println("Click enter to throw the dice");
                            String enter6 = input.nextLine();
                            move(players);
                            break;
                        case 2:
                            String enter7 = input.nextLine();
                            Random rollFirst11 = new Random();
                            int numberOne1 = rollFirst11.nextInt(6) + 1;
                            System.out.println("The first die is " + numberOne1);
                            String enter8 = input.nextLine();
                            Random rollSecond22 = new Random();
                            int numberTwo2 = rollSecond22.nextInt(6) + 1;
                            System.out.println("The second die is " + numberTwo2);
                            if (numberOne1 == numberTwo2) {
                                System.out.println("You get out of th jail. Click enter to throw the dice.");
                                move(players);
                            } else while (numberOne1 != numberTwo2) {
                                String enter9 = input.nextLine();
                                Random rollFirst1 = new Random();
                                int numberO = rollFirst1.nextInt(6) + 1;
                                System.out.println("The first die is " + numberO);
                                String enter10 = input.nextLine();
                                Random rollSecond2 = new Random();
                                int numberT = rollSecond2.nextInt(6) + 1;
                                System.out.println("The second die is " + numberT);
                                if (numberO == numberT) {
                                    System.out.println("You get out of th jail. Click enter to throw the dice.");
                                    move(players);
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Do you have a cart? (Answer with true(yes) or false(no))");
                            boolean answerCasee3 = input.nextBoolean();
                            if (answerCasee3 == true) {
                                System.out.println("You get out of th jail.");
                                move(players);
                            } else if (answerCasee3 == false) {
                                System.out.println("Click enter.");
                                String enter11 = input.nextLine();
                            } else {
                                System.out.println("Answer with true or false!");
                                boolean answer2 = input.nextBoolean();
                                if (answer2 == true) {
                                    System.out.println("You get out of th jail.");
                                    move(players);
                                } else if (answer2 == false) {
                                    System.out.println("Click enter.");
                                    String enter12 = input.nextLine();
                                }
                            }
                            break;
                    }
            }
        }

    }

    public static void housesAndHotel(int players) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have all the fields of one color? (Answer with true(yes) or false(no))");
        boolean answer = input.nextBoolean();
        if (answer == true) {
            buildHousesAndHotel(players);
        } else if (answer == false) {
            System.out.println("You can not build.");
        } else {
            System.out.println("Do you have all the fields of one color? (Answer with true(yes) or false(no))");
            boolean answer1 = input.nextBoolean();
            if (answer1 == true) {
                buildHousesAndHotel(players);
            } else if (answer1 == false) {
                System.out.println("You can not build.");
            }
        }
    }

    public static void buildHousesAndHotel(int players) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many houses are built? (0, 1, 2, 3, 4 or 5-hotel)");
        int houses = input.nextInt();
        switch (houses) {
            case 0:
                System.out.println("\n1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n" +
                        "6. yellow\n7. green\n8. dark blue\nAnswer with number from 1 to 8");
                int color = input.nextInt();
                switch (color) {
                    case 1:
                        buildHouses();
                        brownRentWithOneHouse();
                        System.out.println("You have 1 house on each field.");
                        break;
                    case 2:
                        buildHouses();
                        lightBlueRentWithOneHouse();
                        System.out.println("You have 1 house on each field.");
                        break;
                    case 3:
                        buildHouses();
                        pinkRentWithOneHouse();
                        System.out.println("You have 1 house on each field.");
                        break;
                    case 4:
                        buildHouses();
                        orangeRentWithOneHouse();
                        System.out.println("You have 1 house on each field.");
                        break;
                    case 5:
                        buildHouses();
                        redRentWithOneHouse();
                        System.out.println("You have 1 house on each field.");
                        break;
                    case 6:
                        buildHouses();
                        yellowRentWithOneHouse();
                        System.out.println("You have 1 house on each field.");
                        break;
                    case 7:
                        buildHouses();
                        greenRentWithOneHouse();
                        System.out.println("You have 1 house on each field.");
                        break;
                    case 8:
                        buildHouses();
                        darkBlueRentWithOneHouse();
                        System.out.println("You have 1 house on each field.");
                        break;
                }
                break;
            case 1:
                System.out.println("\n1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n" +
                        "6. yellow\n7. green\n8. dark blue\nAnswer with number from 1 to 8 of which color you have all fields.");
                int color1 = input.nextInt();
                switch (color1) {
                    case 1:
                        buildHouses();
                        brownRentWithTwoHouses();
                        System.out.println("You have 2 houses on each field.");
                        break;
                    case 2:
                        buildHouses();
                        lightBlueRentWithTwoHouses();
                        System.out.println("You have 2 houses on each field.");
                        break;
                    case 3:
                        buildHouses();
                        pinkRentWithTwoHouses();
                        System.out.println("You have 2 houses on each field.");
                        break;
                    case 4:
                        buildHouses();
                        orangeRentWithTwoHouses();
                        System.out.println("You have 2 houses on each field.");
                        break;
                    case 5:
                        buildHouses();
                        redRentWithTwoHouses();
                        System.out.println("You have 2 houses on each field.");
                        break;
                    case 6:
                        buildHouses();
                        yellowRentWithTwoHouses();
                        System.out.println("You have 2 houses on each field.");
                        break;
                    case 7:
                        buildHouses();
                        greenRentWithTwoHouses();
                        System.out.println("You have 2 houses on each field.");
                        break;
                    case 8:
                        buildHouses();
                        darkBlueRentWithTwoHouses();
                        System.out.println("You have 2 houses on each field.");
                        break;
                }
                break;
            case 2:
                System.out.println("\n1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n" +
                        "6. yellow\n7. green\n8. dark blue\nAnswer with number from 1 to 8 of which color you have all fields.");
                int color2 = input.nextInt();
                switch (color2) {
                    case 1:
                        buildHouses();
                        brownRentWithThreeHouses();
                        System.out.println("You have 3 houses on each field.");
                        break;
                    case 2:
                        buildHouses();
                        lightBlueRentWithThreeHouses();
                        System.out.println("You have 3 houses on each field.");
                        break;
                    case 3:
                        buildHouses();
                        pinkRentWithThreeHouse();
                        System.out.println("You have 3 houses on each field.");
                        break;
                    case 4:
                        buildHouses();
                        orangeRentWithThreeHouses();
                        System.out.println("You have 3 houses on each field.");
                        break;
                    case 5:
                        buildHouses();
                        redRentWithThreeHouses();
                        System.out.println("You have 3 houses on each field.");
                        break;
                    case 6:
                        buildHouses();
                        yellowRentWithThreeHouses();
                        System.out.println("You have 3 houses on each field.");
                        break;
                    case 7:
                        buildHouses();
                        greenRentWithThreeHouses();
                        System.out.println("You have 3 houses on each field.");
                        break;
                    case 8:
                        buildHouses();
                        darkBlueRentWithThreeHouses();
                        System.out.println("You have 3 houses on each field.");
                        break;
                }
                break;
            case 3:
                System.out.println("\n1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n" +
                        "6. yellow\n7. green\n8. dark blue\nAnswer with number from 1 to 8 of which color you have all fields.");
                int color3 = input.nextInt();
                switch (color3) {
                    case 1:
                        buildHouses();
                        brownRentWithFourHouses();
                        System.out.println("You have 4 houses on each field.");
                        break;
                    case 2:
                        buildHouses();
                        lightBlueRentWithFourHouses();
                        System.out.println("You have 4 houses on each field.");
                        break;
                    case 3:
                        buildHouses();
                        pinkRentWithFourHouse();
                        System.out.println("You have 4 houses on each field.");
                        break;
                    case 4:
                        buildHouses();
                        orangeRentWithFourHouses();
                        System.out.println("You have 4 houses on each field.");
                        break;
                    case 5:
                        buildHouses();
                        redRentWithFourHouses();
                        System.out.println("You have 4 houses on each field.");
                        break;
                    case 6:
                        buildHouses();
                        yellowRentWithFourHouses();
                        System.out.println("You have 4 houses on each field.");
                        break;
                    case 7:
                        buildHouses();
                        greenRentWithFourHouses();
                        System.out.println("You have 4 houses on each field.");
                        break;
                    case 8:
                        buildHouses();
                        darkBlueRentWithFourHouses();
                        System.out.println("You have 4 houses on each field.");
                        break;
                }
                break;
            case 4:
                System.out.println("\n1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n" +
                        "6. yellow\n7. green\n8. dark blue\nAnswer with number from 1 to 8 of which color you have all fields.");
                int color4 = input.nextInt();
                switch (color4) {
                    case 1:
                        buildHotel();
                        brownRentWithHotel();
                        System.out.println("You have a hotel on each field.");
                        break;
                    case 2:
                        buildHotel();
                        lightBlueRentWithHotel();
                        System.out.println("You have a hotel on each field.");
                        break;
                    case 3:
                        buildHotel();
                        pinkRentWithHotel();
                        System.out.println("You have a hotel on each field.");
                        break;
                    case 4:
                        buildHotel();
                        orangeRentWithHotel();
                        System.out.println("You have 2 houses on each field.");
                        break;
                    case 5:
                        buildHotel();
                        redRentWithHotel();
                        System.out.println("You have a hotel on each field.");
                        break;
                    case 6:
                        buildHotel();
                        yellowRentWithHotel();
                        System.out.println("You have a hotel on each field.");
                        break;
                    case 7:
                        buildHotel();
                        greenRentWithHotel();
                        System.out.println("You have a hotel on each field.");
                        break;
                    case 8:
                        buildHotel();
                        darkBlueRentWithHotel();
                        System.out.println("You have a hotel on each field.");
                        break;
                }
                break;
            case 5:
                System.out.println("You have a hotel and you can't built yet.");
                break;
            default:
                //repetition
                System.out.println("Answer with number from 0 to 5!");
                int housess = input.nextInt();
                switch (housess) {
                    case 0:
                        System.out.println("\n1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n" +
                                "6. yellow\n7. green\n8. dark blue\nAnswer with number from 1 to 8");
                        int color01 = input.nextInt();
                        switch (color01) {
                            case 1:
                                buildHouses();
                                brownRentWithOneHouse();
                                System.out.println("You have 1 house on each field.");
                                break;
                            case 2:
                                buildHouses();
                                lightBlueRentWithOneHouse();
                                System.out.println("You have 1 house on each field.");
                                break;
                            case 3:
                                buildHouses();
                                pinkRentWithOneHouse();
                                System.out.println("You have 1 house on each field.");
                                break;
                            case 4:
                                buildHouses();
                                orangeRentWithOneHouse();
                                System.out.println("You have 1 house on each field.");
                                break;
                            case 5:
                                buildHouses();
                                redRentWithOneHouse();
                                System.out.println("You have 1 house on each field.");
                                break;
                            case 6:
                                buildHouses();
                                yellowRentWithOneHouse();
                                System.out.println("You have 1 house on each field.");
                                break;
                            case 7:
                                buildHouses();
                                greenRentWithOneHouse();
                                System.out.println("You have 1 house on each field.");
                                break;
                            case 8:
                                buildHouses();
                                darkBlueRentWithOneHouse();
                                System.out.println("You have 1 house on each field.");
                                break;
                        }
                        break;
                    case 1:
                        System.out.println("\n1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n" +
                                "6. yellow\n7. green\n8. dark blue\nAnswer with number from 1 to 8 of which color you have all fields.");
                        int color11 = input.nextInt();
                        switch (color11) {
                            case 1:
                                buildHouses();
                                brownRentWithTwoHouses();
                                System.out.println("You have 2 houses on each field.");
                                break;
                            case 2:
                                buildHouses();
                                lightBlueRentWithTwoHouses();
                                System.out.println("You have 2 houses on each field.");
                                break;
                            case 3:
                                buildHouses();
                                pinkRentWithTwoHouses();
                                System.out.println("You have 2 houses on each field.");
                                break;
                            case 4:
                                buildHouses();
                                orangeRentWithTwoHouses();
                                System.out.println("You have 2 houses on each field.");
                                break;
                            case 5:
                                buildHouses();
                                redRentWithTwoHouses();
                                System.out.println("You have 2 houses on each field.");
                                break;
                            case 6:
                                buildHouses();
                                yellowRentWithTwoHouses();
                                System.out.println("You have 2 houses on each field.");
                                break;
                            case 7:
                                buildHouses();
                                greenRentWithTwoHouses();
                                System.out.println("You have 2 houses on each field.");
                                break;
                            case 8:
                                buildHouses();
                                darkBlueRentWithTwoHouses();
                                System.out.println("You have 2 houses on each field.");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\n1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n" +
                                "6. yellow\n7. green\n8. dark blue\nAnswer with number from 1 to 8 of which color you have all fields.");
                        int color21 = input.nextInt();
                        switch (color21) {
                            case 1:
                                buildHouses();
                                brownRentWithThreeHouses();
                                System.out.println("You have 3 houses on each field.");
                                break;
                            case 2:
                                buildHouses();
                                lightBlueRentWithThreeHouses();
                                System.out.println("You have 3 houses on each field.");
                                break;
                            case 3:
                                buildHouses();
                                pinkRentWithThreeHouse();
                                System.out.println("You have 3 houses on each field.");
                                break;
                            case 4:
                                buildHouses();
                                orangeRentWithThreeHouses();
                                System.out.println("You have 3 houses on each field.");
                                break;
                            case 5:
                                buildHouses();
                                redRentWithThreeHouses();
                                System.out.println("You have 3 houses on each field.");
                                break;
                            case 6:
                                buildHouses();
                                yellowRentWithThreeHouses();
                                System.out.println("You have 3 houses on each field.");
                                break;
                            case 7:
                                buildHouses();
                                greenRentWithThreeHouses();
                                System.out.println("You have 3 houses on each field.");
                                break;
                            case 8:
                                buildHouses();
                                darkBlueRentWithThreeHouses();
                                System.out.println("You have 3 houses on each field.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("\n1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n" +
                                "6. yellow\n7. green\n8. dark blue\nAnswer with number from 1 to 8 of which color you have all fields.");
                        int color31 = input.nextInt();
                        switch (color31) {
                            case 1:
                                buildHouses();
                                brownRentWithFourHouses();
                                System.out.println("You have 4 houses on each field.");
                                break;
                            case 2:
                                buildHouses();
                                lightBlueRentWithFourHouses();
                                System.out.println("You have 4 houses on each field.");
                                break;
                            case 3:
                                buildHouses();
                                pinkRentWithFourHouse();
                                System.out.println("You have 4 houses on each field.");
                                break;
                            case 4:
                                buildHouses();
                                orangeRentWithFourHouses();
                                System.out.println("You have 4 houses on each field.");
                                break;
                            case 5:
                                buildHouses();
                                redRentWithFourHouses();
                                System.out.println("You have 4 houses on each field.");
                                break;
                            case 6:
                                buildHouses();
                                yellowRentWithFourHouses();
                                System.out.println("You have 4 houses on each field.");
                                break;
                            case 7:
                                buildHouses();
                                greenRentWithFourHouses();
                                System.out.println("You have 4 houses on each field.");
                                break;
                            case 8:
                                buildHouses();
                                darkBlueRentWithFourHouses();
                                System.out.println("You have 4 houses on each field.");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("\n1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n" +
                                "6. yellow\n7. green\n8. dark blue\nAnswer with number from 1 to 8 of which color you have all fields.");
                        int color41 = input.nextInt();
                        switch (color41) {
                            case 1:
                                buildHotel();
                                brownRentWithHotel();
                                System.out.println("You have a hotel on each field.");
                                break;
                            case 2:
                                buildHotel();
                                lightBlueRentWithHotel();
                                System.out.println("You have a hotel on each field.");
                                break;
                            case 3:
                                buildHotel();
                                pinkRentWithHotel();
                                System.out.println("You have a hotel on each field.");
                                break;
                            case 4:
                                buildHotel();
                                orangeRentWithHotel();
                                System.out.println("You have 2 houses on each field.");
                                break;
                            case 5:
                                buildHotel();
                                redRentWithHotel();
                                System.out.println("You have a hotel on each field.");
                                break;
                            case 6:
                                buildHotel();
                                yellowRentWithHotel();
                                System.out.println("You have a hotel on each field.");
                                break;
                            case 7:
                                buildHotel();
                                greenRentWithHotel();
                                System.out.println("You have a hotel on each field.");
                                break;
                            case 8:
                                buildHotel();
                                darkBlueRentWithHotel();
                                System.out.println("You have a hotel on each field.");
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("You have a hotel and you can't built yet.");
                        break;
                }
        }
    }

    public static void buildHouses() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to build? (Answer with true(yes) or false(no))");
        boolean answer = input.nextBoolean();
        if (answer == true) {
            System.out.println("Money: " + playerMoney);
        } else if (answer == false) {
            System.out.println("Click enter.");
            String enter = input.nextLine();
        } else {
            //repetition
            System.out.println("Answer with true or false!");
            boolean answer2 = input.nextBoolean();
            if (answer2 == true) {
                playerMoney -= 100;
                System.out.println("Money: " + playerMoney);
                System.out.println("You have 1 house on each field.");
            } else if (answer2 == false) {
                System.out.println("Click enter.");
                String enter = input.nextLine();
            }
        }
    }

    public static void buildHotel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to build? (Answer with true(yes) or false(no)");
        boolean answer51 = input.nextBoolean();
        if (answer51 == true) {
            playerMoney -= 400;
            System.out.println("Money: " + playerMoney);
            System.out.println("You have a hotel on each field.");
        } else if (answer51 == false) {
            System.out.println("Click enter.");
            String enter = input.nextLine();
        } else {
            //repetition
            System.out.println("Answer with true or false!");
            boolean answer151 = input.nextBoolean();
            if (answer151 == true) {
                playerMoney -= 400;
                System.out.println("Money: " + playerMoney);
                System.out.println("You have a hotel on each field.");
            } else if (answer151 == false) {
                System.out.println("Click enter.");
                String enter = input.nextLine();
            }
        }
    }

    //brown
    public static void brownRentWithOneHouse() {
        rent[1] += rentOneHouse[1];
        rent[3] += rentOneHouse[3];
    }

    public static void brownRentWithTwoHouses() {
        rent[1] += rentTwoHouses[1];
        rent[3] += rentTwoHouses[3];
    }

    public static void brownRentWithThreeHouses() {
        rent[1] += rentThreeHouses[1];
        rent[3] += rentThreeHouses[3];
    }

    public static void brownRentWithFourHouses() {
        rent[1] += rentFourHouses[1];
        rent[3] += rentFourHouses[3];
    }

    public static void brownRentWithHotel() {
        rent[1] += rentHotel[1];
        rent[3] += rentHotel[3];
    }

    //light blue
    public static void lightBlueRentWithOneHouse() {
        rent[6] += rentOneHouse[6];
        rent[8] += rentOneHouse[8];
        rent[9] += rentOneHouse[9];
    }

    public static void lightBlueRentWithTwoHouses() {
        rent[6] += rentTwoHouses[6];
        rent[8] += rentTwoHouses[8];
        rent[9] += rentTwoHouses[9];
    }

    public static void lightBlueRentWithThreeHouses() {
        rent[6] += rentThreeHouses[6];
        rent[8] += rentThreeHouses[8];
        rent[9] += rentThreeHouses[9];
    }

    public static void lightBlueRentWithFourHouses() {
        rent[6] += rentFourHouses[6];
        rent[8] += rentFourHouses[8];
        rent[9] += rentFourHouses[9];
    }

    public static void lightBlueRentWithHotel() {
        rent[6] += rentHotel[6];
        rent[8] += rentHotel[8];
        rent[9] += rentHotel[9];
    }

    //pink
    public static void pinkRentWithOneHouse() {
        rent[11] += rentOneHouse[11];
        rent[13] += rentOneHouse[13];
        rent[14] += rentOneHouse[14];
    }

    public static void pinkRentWithTwoHouses() {
        rent[11] += rentTwoHouses[11];
        rent[13] += rentTwoHouses[13];
        rent[14] += rentTwoHouses[14];
    }

    public static void pinkRentWithThreeHouse() {
        rent[11] += rentThreeHouses[11];
        rent[13] += rentThreeHouses[13];
        rent[14] += rentThreeHouses[14];
    }

    public static void pinkRentWithFourHouse() {
        rent[11] += rentFourHouses[11];
        rent[13] += rentFourHouses[13];
        rent[14] += rentFourHouses[14];
    }

    public static void pinkRentWithHotel() {
        rent[11] += rentHotel[11];
        rent[13] += rentHotel[13];
        rent[14] += rentHotel[14];
    }

    //orange
    public static void orangeRentWithOneHouse() {
        rent[16] += rentOneHouse[16];
        rent[18] += rentOneHouse[18];
        rent[19] += rentOneHouse[19];
    }

    public static void orangeRentWithTwoHouses() {
        rent[16] += rentTwoHouses[16];
        rent[18] += rentTwoHouses[18];
        rent[19] += rentTwoHouses[19];
    }

    public static void orangeRentWithThreeHouses() {
        rent[16] += rentThreeHouses[16];
        rent[18] += rentThreeHouses[18];
        rent[19] += rentThreeHouses[19];
    }

    public static void orangeRentWithFourHouses() {
        rent[16] += rentFourHouses[16];
        rent[18] += rentFourHouses[18];
        rent[19] += rentFourHouses[19];
    }

    public static void orangeRentWithHotel() {
        rent[16] += rentHotel[16];
        rent[18] += rentHotel[18];
        rent[19] += rentHotel[19];
    }

    //red
    public static void redRentWithOneHouse() {
        rent[21] += rentOneHouse[21];
        rent[23] += rentOneHouse[23];
        rent[24] += rentOneHouse[24];
    }

    public static void redRentWithTwoHouses() {
        rent[21] += rentTwoHouses[21];
        rent[23] += rentTwoHouses[23];
        rent[24] += rentTwoHouses[24];
    }

    public static void redRentWithThreeHouses() {
        rent[21] += rentThreeHouses[21];
        rent[23] += rentThreeHouses[23];
        rent[24] += rentThreeHouses[24];
    }

    public static void redRentWithFourHouses() {
        rent[21] += rentFourHouses[21];
        rent[23] += rentFourHouses[23];
        rent[24] += rentFourHouses[24];
    }

    public static void redRentWithHotel() {
        rent[21] += rentHotel[21];
        rent[23] += rentHotel[23];
        rent[24] += rentHotel[24];
    }

    //yellow
    public static void yellowRentWithOneHouse() {
        rent[26] += rentOneHouse[26];
        rent[27] += rentOneHouse[27];
        rent[29] += rentOneHouse[29];
    }

    public static void yellowRentWithTwoHouses() {
        rent[26] += rentTwoHouses[26];
        rent[27] += rentTwoHouses[27];
        rent[29] += rentTwoHouses[29];
    }

    public static void yellowRentWithThreeHouses() {
        rent[26] += rentThreeHouses[26];
        rent[27] += rentThreeHouses[27];
        rent[29] += rentThreeHouses[29];
    }

    public static void yellowRentWithFourHouses() {
        rent[26] += rentFourHouses[26];
        rent[27] += rentFourHouses[27];
        rent[29] += rentFourHouses[29];
    }

    public static void yellowRentWithHotel() {
        rent[26] += rentHotel[26];
        rent[27] += rentHotel[27];
        rent[29] += rentHotel[29];
    }

    //green
    public static void greenRentWithOneHouse() {
        rent[31] += rentOneHouse[31];
        rent[32] += rentOneHouse[32];
        rent[34] += rentOneHouse[34];
    }

    public static void greenRentWithTwoHouses() {
        rent[31] += rentTwoHouses[31];
        rent[32] += rentTwoHouses[32];
        rent[34] += rentTwoHouses[34];
    }

    public static void greenRentWithThreeHouses() {
        rent[31] += rentThreeHouses[31];
        rent[32] += rentThreeHouses[32];
        rent[34] += rentThreeHouses[34];
    }

    public static void greenRentWithFourHouses() {
        rent[31] += rentFourHouses[31];
        rent[32] += rentFourHouses[32];
        rent[34] += rentFourHouses[34];
    }

    public static void greenRentWithHotel() {
        rent[31] += rentHotel[31];
        rent[32] += rentHotel[32];
        rent[34] += rentHotel[34];
    }

    //dark blue
    public static void darkBlueRentWithOneHouse() {
        rent[37] += rentOneHouse[37];
        rent[39] += rentOneHouse[39];

    }

    public static void darkBlueRentWithTwoHouses() {
        rent[37] += rentTwoHouses[37];
        rent[39] += rentTwoHouses[39];

    }

    public static void darkBlueRentWithThreeHouses() {
        rent[37] += rentThreeHouses[37];
        rent[39] += rentThreeHouses[39];

    }

    public static void darkBlueRentWithFourHouses() {
        rent[37] += rentFourHouses[37];
        rent[39] += rentFourHouses[39];

    }

    public static void darkBlueRentWithHotel() {
        rent[37] += rentHotel[37];
        rent[39] += rentHotel[39];

    }
}