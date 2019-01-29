import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the number of players:");
        int players = input.nextInt();
        int[] price = {60, 0, 60, 200, 200, 100, 0, 100, 120, 200, 140, 150, 140, 160, 200, 180, 0, 180, 200, 0, 220, 0, 220, 240, 200, 260, 260, 150, 280, 0, 300, 300, 0, 320, 200, 350, 200, 0, 250, 100, 400};
        int[] rent = {0, 4, 0, 8, 0, 0, 12, 0, 12, 16, 0, 20, 0, 20, 24, 0, 28, 0, 28, 32, 0, 36, 0, 36, 40, 0, 44, 44, 0, 48, 0, 52, 52, 0, 54, 0, 0, 70, 0, 100};
        int[] rent1 = {0, 10, 0, 20, 0, 0, 30, 0, 30, 40, 0, 50, 0, 50, 60, 0, 70, 0, 70, 80, 0, 90, 0, 90, 100, 0, 110, 110, 0, 120, 0, 150, 150, 0, 160, 0, 0, 175, 0, 200};
        int[] rent2 = {0, 30, 0, 60, 0, 0, 90, 0, 90, 100, 0, 150, 0, 150, 180, 0, 200, 0, 200, 220, 0, 250, 0, 250, 300, 0, 330, 330, 0, 360, 0, 450, 450, 0, 460, 0, 0, 500, 0, 600};
        int[] rent3 = {0, 90, 0, 180, 0, 0, 270, 0, 270, 300, 0, 450, 0, 450, 500, 0, 550, 0, 550, 600, 0, 700, 0, 700, 750, 0, 800, 800, 0, 850, 0, 1000, 1000, 0, 1100, 0, 0, 1100, 0, 1400};
        int[] rent4 = {0, 160, 0, 320, 0, 0, 400, 0, 400, 450, 0, 625, 0, 625, 700, 0, 750, 0, 750, 800, 0, 875, 0, 875, 925, 0, 975, 975, 0, 1025, 0, 1200, 1200, 0, 1300, 0, 0, 1300, 0, 1700};
        int[] rentHotel = {0, 250, 0, 450, 0, 0, 550, 0, 550, 600, 0, 750, 0, 750, 900, 0, 950, 0, 950, 1000, 0, 1050, 0, 1050, 1100, 0, 1050, 1050, 0, 1200, 0, 1400, 1400, 0, 1500, 0, 0, 1500, 0, 2000};

        int field = 0;
        int[] playersMoney = {2000, 2000, 2000, 2000};
        int playerMoney;
        for (int i = 0; i < players; i++) {
            playerMoney = playersMoney[i];
            playersRoll(price, playerMoney, playersMoney, field, players, rent, rent1, rent2, rent3, rent4, rentHotel);
        }

    }


    public static void playersRoll(int[] price, int playerMoney, int[] playersMoney, int field, int players,int[] rent, int[] rent1, int[] rent2, int[] rent3, int[] rent4, int[] rentHotel) {
        Scanner input = new Scanner(System.in);
        switch (players) {
            case 2:
                System.out.println("Enter the name of the first player:");
                String firstName = input.nextLine();
                System.out.println("Enter the name of the second player:");
                String secondName = input.nextLine();
                while (playersMoney[0] >= 0 || playersMoney[1] >= 0) {
                    System.out.println(firstName + " it is your turn. Click enter to throw the dice.");
                    move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                    System.out.println(secondName + " it is your turn. Click enter to throw the dice.");
                    move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
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
                    move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                    System.out.println(secondPlayer + " it is your turn. Click enter to throw the dice.");
                    move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                    System.out.println(thirdPlayer + " it is your turn. Click enter to throw the dice.");
                    move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
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
                    move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                    System.out.println(secondNickname + " it is your turn. Click enter to throw the dice.");
                    move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                    System.out.println(thirdNickname + " it is your turn. Click enter to throw the dice.");
                    move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                    System.out.println(fourthNickname + " it is your turn. Click enter to throw the dice.");
                    move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                }
                break;
            default:
                System.out.println("The players can be from 2 to 4!");

        }
    }

    public static void move(int[] price, int field, int[] playersMoney, int players, int playerMoney,int[] rent,
                            int[] rent1, int[] rent2, int[] rent3, int[] rent4, int[] rentHotel) {
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
        if (numberOne == numberTwo) {
            String e = input.nextLine();
            Random firstRoll = new Random();
            int oneNumber = rollFirst.nextInt(6) + 1;
            System.out.println("The first die is " + oneNumber);
            String en = input.nextLine();
            Random secondRoll = new Random();
            int twoNumber = rollSecond.nextInt(6) + 1;
            System.out.println("The second die is " + twoNumber);
            sum = numberOne + numberTwo;
            System.out.println();
            System.out.println("The sum of the dice is " + sum);
            System.out.println();
        }

        //fields
        field = sum + field;

        if (field == 0) {
            System.out.println("You are at field GO.");
            go(players, playersMoney, playerMoney, field);
        } else if (field == 1) {
            System.out.println("You are at te first brown field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 2 || field == 17 || field == 33) {
            System.out.println("You have a community chest card.");
            System.out.println();
            communityChest(playersMoney, players, playerMoney, field, price,rent,  rent1,  rent2,
                    rent3,  rent4, rentHotel);
            System.out.println("Money: " + playerMoney);
        } else if (field == 3) {
            System.out.println("You are at the second brown field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 4) {
            playerMoney -= 200;
            System.out.println("Income tax = 200. Money: " + playerMoney);
        } else if (field == 5) {
            System.out.println("You are at a station.");
            station(field, playerMoney, price, playersMoney, players,rent,  rent1,  rent2,
                    rent3,  rent4, rentHotel);
        } else if (field == 6) {
            System.out.println("You are at the first light blue field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 7 || field == 22 || field == 36) {
            System.out.println("You have a chance card.");
            System.out.println();
            chance(players, playersMoney, playerMoney, field, price,rent,  rent1,  rent2,
                    rent3,  rent4, rentHotel);
            System.out.println("Your money are " + playerMoney);
        } else if (field == 8) {
            System.out.println("You are at the second light blue field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 9) {
            System.out.println("You are at the third light blue field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 10) {
            System.out.println("Jail");
        } else if (field == 11) {
            System.out.println("You are at the first pink field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 12) {
            playerMoney -= 150;
            System.out.println("Electric company = 150. Money: " + playerMoney);
        } else if (field == 13) {
            System.out.println("You are at the second pink field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 14) {
            System.out.println("You are at the third pink field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 15) {
            System.out.println("You are at a station.");
            station(field, playerMoney, price, playersMoney, players,rent,  rent1,  rent2,
                    rent3,  rent4, rentHotel);
        } else if (field == 16) {
            System.out.println("You are at the first orange field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 18) {
            System.out.println("You are at the second orange field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 19) {
            System.out.println("You are at the third orange field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 20) {
            System.out.println("Free parking");
        } else if (field == 21) {
            System.out.println("You are at the first red field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 23) {
            System.out.println("You are at the second red field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 24) {
            System.out.println("You are at the third red field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 25) {
            System.out.println("You are at a station.");
            station(field, playerMoney, price, playersMoney, players,rent,  rent1,  rent2,
            rent3,  rent4, rentHotel);
        } else if (field == 26) {
            System.out.println("You are at the first yellow field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 27) {
            System.out.println("You are at the second yellow field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 28) {
            playerMoney -= 150;
            System.out.println("Water works = 150. Money: " + playerMoney);
        } else if (field == 29) {
            System.out.println("You are at the third yellow field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 30) {
            System.out.println("You are atthe field \"Go to jail\"and you go to jail.");
            field = 10;
        } else if (field == 31) {
            System.out.println("You are at the first green field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 32) {
            System.out.println("You are at the second green field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 34) {
            System.out.println("You are at the third green field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 35) {
            System.out.println("You are at a station.");
            station(field, playerMoney, price, playersMoney, players, rent, rent1,  rent2, rent3, rent4, rentHotel);
        } else if (field == 37) {
            System.out.println("You are at the first dark blue field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        } else if (field == 38) {
            playerMoney -= 100;
            System.out.println("Lixury tax = 100. Money: " + playerMoney);
        } else if (field == 39) {
            System.out.println("You are at the second dark blue field. Money: " + playerMoney);
            buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
        }
    }


    public static void go(int players, int[] playersMoney, int playerMoney, int field) {
        playerMoney += 200;
        field = 0;
        System.out.println("Your money are " + playerMoney);

    }

    public static void station(int field, int playerMoney, int[] price, int[] playersMoney, int players,int[] rent,int[] rent1, int[] rent2, int[] rent3, int[] rent4, int[] rentHotel) {
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
                buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);

            } else if (answerFiveS == "no" || answerFiveS == "No" || answerFiveS == "NO") {
                buySellRent(price, playersMoney, players, playerMoney,field, rent, rent1, rent2, rent3, rent4, rentHotel);
            }
        }
    }

    public static void chance(int players, int[] playersMoney, int playerMoney, int field, int[] price,
                              int[] rent, int[] rent1, int[] rent2, int[] rent3, int[] rent4, int[] rentHotel) {
        Random rand = new Random();
        int card = rand.nextInt(16) + 1;
        if (card == 1) {
            System.out.println("Advance to \"Go\". (Collect $200) ");
            go(players, playersMoney, playerMoney, field);
        } else if (card == 2) {
            System.out.println("Advance to Illinois Avenue. If you pass Go, collect $200. ");
            field = 24;
        } else if (card == 3) {
            System.out.println("Advance to St. Charles Place. If you pass Go, collect $200. ");
            if (field >= 11) {
                playerMoney += 200;
                field = 11;
            } else {
                field = 11;
            }
        } else if (card == 4) {
            System.out.println("Bank pays you dividend of $50.");
            playerMoney += 50;
        } else if (card == 5) {
            System.out.println("Go Back Three Spaces.");
            field -= 3;
            System.out.println("You are at " + field);
        } else if (card == 6) {
            System.out.println("Go to Jail. Go directly to Jail.");
            jail(price, field, playersMoney, players, playerMoney, rent,  rent1, rent2,
            rent3, rent4, rentHotel);
        } else if (card == 7) {
            System.out.println("Pay poor tax of $15.");
            playerMoney -= 15;
        } else if (card == 8) {
            System.out.println("Take a trip to Reading Railroad. If you pass Go, collect $200. ");
            if (field >= 5) {
                playerMoney += 200;
                field = 5;
            } else {
                field = 5;
            }
        } else if (card == 9) {
            System.out.println("Bank pays you dividend of $100.");
            playerMoney += 100;
        } else if (card == 10) {
            System.out.println("Your building and loan matures. Collect $150. ");
            playerMoney += 150;
        } else if (card == 11) {
            System.out.println("You have won a crossword competition. Collect $100.");
            playerMoney += 100;
        } else if (card == 12) {
            System.out.println("Pay 30.");
            playerMoney -= 30;
        } else if (card == 13) {
            System.out.println("Pay tax of $40. ");
            playerMoney -= 40;
        } else if (card == 14) {
            System.out.println("Bank error. You receive 50");
            playerMoney += 50;
        } else if (card == 15) {
            System.out.println("Take a trip to B. & O. Railroad. If you pass Go, collect $200. ");
            if (field >= 25) {
                playerMoney += 200;
                field = 25;
            } else {
                field = 25;
            }
        } else if (card == 16) {
            System.out.println("Get out of Jail Free. ");
        }
    }

    public static void communityChest(int[] playersMoney, int players, int playerMoney, int field, int[] price,
                                      int[] rent, int[] rent1, int[] rent2, int[] rent3, int[] rent4, int[] rentHotel) {
        Random rand = new Random();
        int card = rand.nextInt(16) + 1;
        if (card == 1) {
            System.out.println("Advance to Go. You receive 200.");
            field = 0;
            playerMoney += 200;
        } else if (card == 2) {
            System.out.println("Bank error in your favor—Collect $200.");
            playerMoney += 200;
        } else if (card == 3) {
            System.out.println("Doctor's fee—Pay $50.");
            playerMoney -= 50;
        } else if (card == 4) {
            System.out.println("From sale of stock you get $50.");
            playerMoney += 50;
        } else if (card == 5) {
            System.out.println("Grand Opera Night—Collect $50.");
            playerMoney += 50;
        } else if (card == 6) {
            System.out.println("Go to Jail–Go directly to jail.");
            jail(price, field, playersMoney, players, playerMoney,rent, rent1,  rent2,
            rent3,  rent4,  rentHotel);
        } else if (card == 7) {
            System.out.println("Holiday Fund matures—Receive $100.");
            playerMoney += 100;
        } else if (card == 8) {
            System.out.println("Income tax refund–Collect $20.");
            playerMoney += 20;
        } else if (card == 9) {
            System.out.println("It is your birthday—Collect $10.");
            playerMoney += 10;
        } else if (card == 10) {
            System.out.println("Life insurance matures–Collect $100.");
            playerMoney += 100;
        } else if (card == 11) {
            System.out.println("Pay hospital fees of $100.");
            playerMoney -= 100;
        } else if (card == 12) {
            System.out.println("Pay school fees of $150.");
            playerMoney -= 150;
        } else if (card == 13) {
            System.out.println("Receive $25 consultancy fee.");
            playerMoney += 25;
        } else if (card == 14) {
            System.out.println("You have won second prize in a beauty contest–Collect $10.");
            playerMoney += 10;
        } else if (card == 15) {
            System.out.println("You inherit $100.");
            playerMoney += 100;
        } else if (card == 16) {
            System.out.println("Get Out of Jail Free.");
        }
    }

    public static void buySellRent(int[] price, int[] playersMoney, int players, int playerMoney, int field, int[] rent,
                                   int[] rent1, int[] rent2, int[] rent3, int[] rent4, int[] rentHotel) {
        Scanner input = new Scanner(System.in);
        int moneyAfterPaying;
        int moneyAfterSelling;
        System.out.println("Do you want to buy, sell or rent the property?(1, 2, 3 or 4)");
        System.out.println("\n 1. Buy \n 2. Sell \n 3. Rent \n 4. No");
        int answer = input.nextInt();
        for (int i = 0; i < 1; i++) {
            switch (answer) {
                case 1:
                    System.out.println("It costs " + price[i]);
                    moneyAfterPaying = playerMoney - price[i];
                    System.out.println("Money: " + moneyAfterPaying);
                    houseHotel(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                    break;
                case 2:
                    System.out.println("It costs " + price[i]);
                    moneyAfterSelling = playerMoney + price[i];
                    System.out.println("Money: " + moneyAfterSelling);
                    break;
                case 3:
                    System.out.println("Enter with number who of the players has got the property. ");
                    int rentPlayer = input.nextInt();
                    switch (rentPlayer) {
                        case 1:
                            playersMoney[0] += price[i];
                            playerMoney -= price[i];
                            System.out.println("If you are ready click enter.");
                            String e = input.nextLine();
                            break;
                        case 2:
                            playersMoney[1] += price[i];
                            playerMoney -= price[i];
                            System.out.println("If you are ready click enter.");
                            String en = input.nextLine();
                            break;
                        case 3:
                            playersMoney[2] += price[i];
                            playerMoney -= price[i];
                            System.out.println("If you are ready click enter.");
                            String ent = input.nextLine();
                            break;
                        case 4:
                            playersMoney[3] += price[i];
                            playerMoney -= price[i];
                            System.out.println("If you are ready click enter.");
                            String ente = input.nextLine();
                            break;

                        default:
                            System.out.println("Answer with number!");
                            int anss = input.nextInt();
                            switch (anss) {
                                case 1:

                                    System.out.println("If you are ready click enter.");
                                    String eeEenter = input.nextLine();
                                    break;
                                case 2:

                                    System.out.println("If you are ready click enter.");
                                    String eeeeEnter = input.nextLine();
                                    break;
                                case 3:

                                    System.out.println("If you are ready click enter.");
                                    String eEeEEnter = input.nextLine();
                                    break;
                            }
                            break;
                    }
                    break;
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

    public static void jail(int[] price, int field, int[] playersMoney, int players, int playerMoney,
                            int[] rent, int[] rent1, int[] rent2, int[] rent3, int[] rent4, int[] rentHotel) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < players; i++) {
            playerMoney = playersMoney[i];
            System.out.println(String.format("%s\n%s\n%s\n%s\n%s", "You have 3 choices to get out of the jail.", "1. Pay 50.", "2. Throw a pair.", "3. With card.", "answer with 1, 2 or 3."));
            int answer = input.nextInt();
            switch (answer) {
                case 1:
                    playerMoney -= 50;
                    System.out.println("Your money are " + playerMoney);
                    System.out.println("Click enter to throw the dice");
                    String e = input.nextLine();
                    move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                    break;
                case 2:
                    String en = input.nextLine();
                    Random rollFirst = new Random();
                    int numberOne = rollFirst.nextInt(6) + 1;
                    System.out.println("The first die is " + numberOne);
                    String clickEnter = input.nextLine();
                    Random rollSecond = new Random();
                    int numberTwo = rollSecond.nextInt(6) + 1;
                    System.out.println("The second die is " + numberTwo);
                    if (numberOne == numberTwo) {
                        System.out.println("You get out of th jail. Click enter to throw the dice.");
                        move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                    } else while (numberOne != numberTwo) {
                        String ent = input.nextLine();
                        Random rollF = new Random();
                        int numberO = rollFirst.nextInt(6) + 1;
                        System.out.println("The first die is " + numberO);
                        String ente = input.nextLine();
                        Random rollS = new Random();
                        int numberT = rollSecond.nextInt(6) + 1;
                        System.out.println("The second die is " + numberT);
                        if (numberO == numberT) {
                            System.out.println("You get out of th jail. Click enter to throw the dice.");
                            move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Do you have a cart? (yes or no)");
                    String answ = input.nextLine();
                    if (answ == "yes" || answ == "Yes" || answ == "YES") {
                        System.out.println("You get out of th jail.");
                        move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                    } else if (answ == "no" || answ == "No" || answ == "NO") {
                        System.out.println("Click enter.");
                        String ent = input.nextLine();
                    } else {
                        System.out.println("Answer with yes or no!");
                        String answe = input.nextLine();
                        if (answe == "yes" || answe == "Yes" || answe == "YES") {
                            System.out.println("You get out of th jail.");
                            move(price, field, playersMoney, players, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
                        } else if (answe == "no" || answe == "No" || answe == "NO") {
                            System.out.println("Click enter.");
                            String ent = input.nextLine();
                        }
                    }
                    break;
                default:
                    System.out.println("Answer with 1, 2, or 3!");
            }
        }
    }

    public static void houseHotel(int[] price, int field, int[] playersMoney, int players, int playerMoney, int[] rent, int[] rent1, int[] rent2, int[]
            rent3, int[] rent4, int[] rentHotel) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have all the fields of one color?(yes/no)");
        String answe = input.nextLine();
        if (answe == "yes" || answe == "Yes" || answe == "YES") {
            build(price, playerMoney, rent, rent1, rent2, rent3, rent4, rentHotel);
//            System.out.println("Which color?(1-8)\n 1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n6. yellow\n7. green\n8. dark blue");
//            int answer = input.nextInt();
//            switch (answer) {
//                case 1:
//
//build(price,playerMoney,rent,rent1,rent2,rent3,rent4,rentHotel);
////                    price[1] +=;
////                    price[3] +=;
//                    break;
//                case 2:
//                    build(price,playerMoney,rent,rent1,rent2,rent3,rent4,rentHotel);
////                    price[6] +=;
////                    price[8] +=;
////                    price[9] +=;
//                    break;
//                case 3:
//                    build(price,playerMoney,rent,rent1,rent2,rent3,rent4,rentHotel);
////                    price[11] +=;
////                    price[13] +=;
////                    price[14] +=;
//                    break;
//                case 4:
////                    price[16] +=;
////                    price[18] +=;
////                    price[19] +=;
//                    break;
//                case 5:
//                    build(price,playerMoney,rent,rent1,rent2,rent3,rent4,rentHotel);
////                    price[21] +=;
////                    price[23] +=;
////                    price[24] +=;
//                    break;
//                case 6:
//                    build(price,playerMoney,rent,rent1,rent2,rent3,rent4,rentHotel);
////                    price[26] +=;
////                    price[27] +=;
////                    price[29] +=;
//                    break;
//                case 7:
//                    build(price,playerMoney,rent,rent1,rent2,rent3,rent4,rentHotel);
////                    price[31] +=;
////                    price[32] +=;
////                    price[34] +=;
//                    break;
//                case 8:
//                    build(price,playerMoney,rent,rent1,rent2,rent3,rent4,rentHotel);
////                    price[37] +=;
////                    price[39] +=;
//                    break;
//
//                default:
//                    System.out.println("Answer with number from 1 to 9!");
//            }
        } else if (answe == "no" || answe == "No" || answe == "NO") {
            System.out.println("You can not build.");
        }
    }

    public static void build(int[] price, int playerMoney, int[] rent, int[] rent1, int[] rent2, int[] rent3, int[] rent4, int[] rentHotel) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many houses are built? (0, 1, 2, 3, 4 or 5-hotel)");
        int houses = input.nextInt();
        switch (houses) {
            case 0:
                System.out.println("Do you want to build?(yes/no)");
                String answer = input.nextLine();
                if (answer == "yes" || answer == "Yes" || answer == "YES") {
                    for (int i = 0; i < rent.length; i++) {
                        rent[i] += rent1[i];
                        playerMoney -= 50;
                        rent[i] += rent1[i];
                        playerMoney -= 50;
                        System.out.println("Money: " + playerMoney);
                    }
                } else if (answer == "no" || answer == "No" || answer == "NO") {
                    System.out.println("Click enter.");
                    String enter = input.nextLine();
                } else {
                    System.out.println("Answer with yes or no!");
                }

                break;
            case 1:
                System.out.println("Do you want to build?(yes/no)");
                String answer1 = input.nextLine();
                if (answer1 == "yes" || answer1 == "Yes" || answer1 == "YES") {
                    for (int i = 0; i < rent.length; i++) {
                        rent[i] += rent1[i];
                        playerMoney -= 50;
                        rent[i] += rent1[i];
                        playerMoney -= 50;
                        System.out.println("Money: " + playerMoney);
                    }
                } else if (answer1 == "no" || answer1 == "No" || answer1 == "NO") {
                    System.out.println("Click enter.");
                    String enter = input.nextLine();
                } else {
                    System.out.println("Answer with yes or no!");
                }
                break;
            case 2:
                System.out.println("Do you want to build?(yes/no)");
                String answer2 = input.nextLine();
                if (answer2 == "yes" || answer2 == "Yes" || answer2 == "YES") {
                    for (int i = 0; i < rent.length; i++) {
                        rent[i] += rent2[i];
                        playerMoney -= 50;
                        rent[i] += rent2[i];
                        playerMoney -= 50;
                        System.out.println("Money: " + playerMoney);
                    }
                } else if (answer2 == "no" || answer2 == "No" || answer2 == "NO") {
                    System.out.println("Click enter.");
                    String enter = input.nextLine();
                } else {
                    System.out.println("Answer with yes or no!");
                }
                break;
            case 3:
                System.out.println("Do you want to build?(yes/no)");
                String answer3 = input.nextLine();
                if (answer3 == "yes" || answer3 == "Yes" || answer3 == "YES") {
                    for (int i = 0; i < rent.length; i++) {
                        rent[i] += rent3[i];
                        playerMoney -= 50;
                        rent[i] += rent3[i];
                        playerMoney -= 50;
                        System.out.println("Money: " + playerMoney);
                    }
                } else if (answer3 == "no" || answer3 == "No" || answer3 == "NO") {
                    System.out.println("Click enter.");
                    String enter = input.nextLine();
                } else {
                    System.out.println("Answer with yes or no!");
                }
                break;
            case 4:
                System.out.println("Do you want to build?(yes/no)");
                String answer4 = input.nextLine();
                if (answer4 == "yes" || answer4 == "Yes" || answer4 == "YES") {
                    for (int i = 0; i < rent.length; i++) {
                        rent[i] += rent4[i];
                        playerMoney -= 50;
                        rent[i] += rent4[i];
                        playerMoney -= 50;
                        System.out.println("Money: " + playerMoney);
                    }
                } else if (answer4 == "no" || answer4 == "No" || answer4 == "NO") {
                    System.out.println("Click enter.");
                    String enter = input.nextLine();
                } else {
                    System.out.println("Answer with yes or no!");
                }
                break;
            case 5:
                System.out.println("Do you want to build?(yes/no)");
                String answer5 = input.nextLine();
                if (answer5 == "yes" || answer5 == "Yes" || answer5 == "YES") {
                    for (int i = 0; i < rent.length; i++) {
                        rent[i] += rentHotel[i];
                        playerMoney -= 200;
                        rent[i] += rentHotel[i];
                        playerMoney -= 200;
                        System.out.println("Money: " + playerMoney);
                    }
                } else if (answer5 == "no" || answer5 == "No" || answer5 == "NO") {
                    System.out.println("Click enter.");
                    String enter = input.nextLine();
                } else {
                    System.out.println("Answer with yes or no!");
                }
                break;
            default:
                System.out.println("Answer with number from 0 to 5!");
        }
    }
}