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
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                System.out.print(board[i][j] + "  ");
//            }
//            System.out.println();
//        }

//        System.out.println("\nProperties:");
//        System.out.println("purple  = " + (board[1] + board[3]));
//        System.out.println("cyan    = " + (board[6] + board[8] + board[9]));
//        System.out.println("magenta = " + (board[11] + board[13] + board[14]));
//        System.out.println("orange  = " + (board[16] + board[18] + board[19]));
//        System.out.println("red     = " + (board[21] + board[23] + board[24]));
//        System.out.println("yellow  = " + (board[26] + board[27] + board[29]));
//        System.out.println("green   = " + (board[31] + board[32] + board[34]));
//        System.out.println("blue    = " + (board[37] + board[39]));
//        System.out.println("RR      = " + (board[5] + board[15] + board[25] + board[35]));
//        System.out.println("Utility = " + (board[12] + board[28]));
//        System.out.println("chance  = " + (board[7] + board[22] + board[36]));
//        System.out.println("chest   = " + (board[2] + board[17] + board[33]));
//        System.out.println("fucked  = " + (board[4] + board[30] + board[38]));
//        System.out.println();
        int[] board = new int[40];
        System.out.println("Select the number of players:");
        int players = input.nextInt();
        int firstPlayerMoney = 2000;
        int secondPlayerMoney = 2000;
        int thirdPlayerMoney = 2000;
        int fourthPlayerMoney = 2000;
        int[] price = {60, 0, 60, 200, 200, 100, 0, 100, 120, 200, 140, 150, 140, 160, 200, 180, 0, 180, 200, 0, 220, 0, 220, 240, 200, 260, 260, 150, 280, 0, 300, 300, 0, 320, 200, 350, 200, 0, 250, 100, 400};

        players(price, players, board, firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
    }


    public static void players(int[] price, int players, int[] board, int firstPlayerMoney, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
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
            case 0:
                System.out.println("Players can be from 2 to 4!");
                break;
            case 1:
                System.out.println("Players can be from 2 to 4!");
                break;
            case 2:
                System.out.println("Enter the name of the first player:");
                String firstName = input.nextLine();
                System.out.println("Enter the name of the second player:");
                String secondName = input.nextLine();
                while (firstPlayerMoney >= 0 || secondPlayerMoney >= 0) {
                    System.out.println(firstName + " it is your turn. Click enter to throw the dice.");
                    dice();
                    moveFirstPlayer(price, firstPlayerMoney, board, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);

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


    public static void dice() {
        int sum;
        Scanner input = new Scanner(System.in);
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

    public static void moveFirstPlayer(int[] price,int firstPlayerMoney, int[] board, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
        Scanner input = new Scanner(System.in);
        int field = 0;
        for (int i = 0; i < board.length; i++) {
            if (field >= board.length) {
                field = field - 40;
                System.out.println("You are at " + field);
            } else if (field == board[30]) {
                field = board[10];
            } else if (field == board[7] || field == board[22] || field == board[36]) {
                chance();
            } else if (field == board[2] || field == board[17] || field == board[33]) {
                communityChest(firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
            } else if (field == board[5] || field == board[15] || field == board[25] || field == board[35]) {
                station(field, board);
            } else if (field == board[1] || field == board[3]) {
                //brown
                System.out.println("You are at brown field.");
            } else if (field == board[6] || field == board[8] || field == board[9]) {
                // light blue
                System.out.println("You are at light blue field.");
            } else if (field == board[11] || field == board[13] || field == board[14]) {
                //pink
                System.out.println("You are at pink field.");
            } else if (field == board[16] || field == board[18] || field == board[19]) {
                //orange
                System.out.println("You are at orange field.");
            } else if (field == board[21] || field == board[23] || field == board[24]) {
                //red
                System.out.println("You are at red field.");
            } else if (field == board[26] || field == board[27] || field == board[29]) {
                //yellow
                System.out.println("You are at yellow field.");
            } else if (field == board[31] || field == board[32] || field == board[34]) {
                //green
                System.out.println("You are at green field.");
            } else if (field == board[37] || field == board[39]) {
                //dark blue
                System.out.println("You are at dark blue field.");
            } else if (field == board[0]) {
                System.out.println("You are at .");
                go();
            }
        }
    }

    public static void moveSecondPlayer(int[] price,int firstPlayerMoney, int[] board, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
        Scanner input = new Scanner(System.in);
        int field = 0;
        for (int i = 0; i < board.length; i++) {
            if (field >= board.length) {
                field = field - 40;
                System.out.println("You are at " + field);
            } else if (field == board[30]) {
                field = board[10];
            } else if (field == board[7] || field == board[22] || field == board[36]) {
                chance();
            } else if (field == board[2] || field == board[17] || field == board[33]) {
                communityChest(firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
            } else if (field == board[5] || field == board[15] || field == board[25] || field == board[35]) {
                station(field, board);
            } else if (field == board[1] || field == board[3]) {
                //brown
                System.out.println("You are at brown field.");
            } else if (field == board[6] || field == board[8] || field == board[9]) {
                // light blue
                System.out.println("You are at light blue field.");
            } else if (field == board[11] || field == board[13] || field == board[14]) {
                //pink
                System.out.println("You are at pink field.");
            } else if (field == board[16] || field == board[18] || field == board[19]) {
                //orange
                System.out.println("You are at orange field.");
            } else if (field == board[21] || field == board[23] || field == board[24]) {
                //red
                System.out.println("You are at red field.");
            } else if (field == board[26] || field == board[27] || field == board[29]) {
                //yellow
                System.out.println("You are at yellow field.");
            } else if (field == board[31] || field == board[32] || field == board[34]) {
                //green
                System.out.println("You are at green field.");
            } else if (field == board[37] || field == board[39]) {
                //dark blue
                System.out.println("You are at dark blue field.");
            } else if (field == board[0]) {
                System.out.println("You are at .");
                go();
            }
        }
    }

    public static void moveThirdPlayer(int[] price,int firstPlayerMoney, int[] board, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
        Scanner input = new Scanner(System.in);
        int field = 0;
        for (int i = 0; i < board.length; i++) {
            if (field >= board.length) {
                field = field - 40;
                System.out.println("You are at " + field);
            } else if (field == board[30]) {
                field = board[10];
            } else if (field == board[7] || field == board[22] || field == board[36]) {
                chance();
            } else if (field == board[2] || field == board[17] || field == board[33]) {
                communityChest(firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
            } else if (field == board[5] || field == board[15] || field == board[25] || field == board[35]) {
                station(field, board);
            } else if (field == board[1] || field == board[3]) {
                //brown
                System.out.println("You are at brown field.");
            } else if (field == board[6] || field == board[8] || field == board[9]) {
                // light blue
                System.out.println("You are at light blue field.");
            } else if (field == board[11] || field == board[13] || field == board[14]) {
                //pink
                System.out.println("You are at pink field.");
            } else if (field == board[16] || field == board[18] || field == board[19]) {
                //orange
                System.out.println("You are at orange field.");
            } else if (field == board[21] || field == board[23] || field == board[24]) {
                //red
                System.out.println("You are at red field.");
            } else if (field == board[26] || field == board[27] || field == board[29]) {
                //yellow
                System.out.println("You are at yellow field.");
            } else if (field == board[31] || field == board[32] || field == board[34]) {
                //green
                System.out.println("You are at green field.");
            } else if (field == board[37] || field == board[39]) {
                //dark blue
                System.out.println("You are at dark blue field.");
            } else if (field == board[0]) {
                System.out.println("You are at .");
                go();
            }
        }
    }

    public static void moveFourthPlayer(int[] price,int secondPlayerMoney, int[] board, int firstPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
        Scanner input = new Scanner(System.in);
        int field = 0;
        for (int i = 0; i < board.length; i++) {
            if (field >= board.length) {
                field = field - 40;
                System.out.println("You are at " + field);
            } else if (field == board[30]) {
                field = board[10];
            } else if (field == board[7] || field == board[22] || field == board[36]) {
                chance();
            } else if (field == board[2] || field == board[17] || field == board[33]) {
                communityChest(firstPlayerMoney, secondPlayerMoney, thirdPlayerMoney, fourthPlayerMoney);
            } else if (field == board[5] || field == board[15] || field == board[25] || field == board[35]) {
                station(field, board);
            } else if (field == board[1] || field == board[3]) {
                //brown
                System.out.println("You are at brown field.");
            } else if (field == board[6] || field == board[8] || field == board[9]) {
                // light blue
                System.out.println("You are at light blue field.");
            } else if (field == board[11] || field == board[13] || field == board[14]) {
                //pink
                System.out.println("You are at pink field.");
            } else if (field == board[16] || field == board[18] || field == board[19]) {
                //orange
                System.out.println("You are at orange field.");
            } else if (field == board[21] || field == board[23] || field == board[24]) {
                //red
                System.out.println("You are at red field.");
            } else if (field == board[26] || field == board[27] || field == board[29]) {
                //yellow
                System.out.println("You are at yellow field.");
            } else if (field == board[31] || field == board[32] || field == board[34]) {
                //green
                System.out.println("You are at green field.");
            } else if (field == board[37] || field == board[39]) {
                //dark blue
                System.out.println("You are at dark blue field.");
            } else if (field == board[0]) {
                System.out.println("You are at .");
                go();
            }
        }
    }

    public static void go() {

    }

    public static void station(int field, int[] board) {
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
                        field = board[5];
                        System.out.println("You are at Reading railroad.(5)" + field);
                        break;
                    case 15:
                        field = board[15];
                        System.out.println("You are at Pennsylvania railroad.(15)" + field);
                        break;
                    case 25:
                        field = board[25];
                        System.out.println("You are at B. & O. railroad.(25)" + field);
                        break;
                    case 35:
                        field = board[35];
                        System.out.println("You are at Short line.(35)" + field);
                        break;
                    default:
                        System.out.println("Enter one of the three stations. (5, 15, 25 or 35)");
                        break;
                }

            } else if (answerStation == "no" || answerStation == "No" || answerStation == "NO") {
                //ipoteka i tn
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

    public static void buySellRent(int[] price,int firstPlayerMoney, int secondPlayerMoney, int thirdPlayerMoney, int fourthPlayerMoney) {
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