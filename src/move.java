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
        int sum2;
        switch (players) {
            case 2:
                System.out.println("Enter the name of the first player:");
                String firstName = input.nextLine();
                System.out.println("Enter the name of the second player:");
                String secondName = input.nextLine();

                while (playersMoney[0] >= 0 || playersMoney[1] >= 0) {
                    System.out.println(firstName + " it is your turn. Click enter to throw the dice.");
                    String enter = input.nextLine();

                    Random rollFirst = new Random();
                    int numberOne = rollFirst.nextInt(6) + 1;
                    System.out.println("The first die is " + numberOne);
                    Random rollSecond = new Random();
                    int numberTwo = rollSecond.nextInt(6) + 1;
                    System.out.println("The second die is " + numberTwo);
                    sum2 = numberOne + numberTwo;
                    System.out.println();
                    System.out.println("The sum of the dice is " + sum2);
                    System.out.println();

                    move(price, sum2, field, playersMoney, players, playerMoney);

                    System.out.println(secondName + " it is your turn. Click enter to throw the dice.");

                    String enteer = input.nextLine();
                    Random rollFirrst = new Random();
                    int numberOnee = rollFirst.nextInt(6) + 1;
                    System.out.println("The first die is " + numberOnee);
                    Random rollSecondd = new Random();
                    int numberTwoo = rollSecond.nextInt(6) + 1;
                    System.out.println("The second die is " + numberTwoo);
                    sum2 = numberOnee + numberTwoo;
                    System.out.println("The sum of the dice is " + sum2);
                    System.out.println();
                    aredeee(price, sum2, field, playersMoney, players, playerMoney);
                }
                break;
        }
    }

    public static void players(int[] price, int sum2, int playerMoney, int[] playersMoney, int field, int players) {
        Scanner input = new Scanner(System.in);

    }

    public static void move(int[] price, int sum2, int field, int[] playersMoney, int players, int playerMoney) {
        for (int i = 0; i < 1; i++) {
            Scanner input = new Scanner(System.in);
            playerMoney = playersMoney[i];
            if (field >= 40) {
                field = field - 40;
                System.out.println("You are at " + field);
            } else if (sum2 == 30) {
                System.out.println("You are at " + field + "and you go to jail");
                field = 10;

            } else if (sum2 == 7 || sum2 == 22 || sum2 == 36) {
                System.out.println("You have a chance card.");
                System.out.println();
                System.out.println("Your money are " + playerMoney);
            } else if (sum2 == 2 || sum2 == 17 || sum2 == 33) {
                System.out.println("You have a community chest card.");
                System.out.println(sum2);

            } else if (sum2 == 5 || sum2 == 15 || sum2 == 25 || sum2 == 35) {
                System.out.println("You are at station.");

            } else if (sum2 == 1 || sum2 == 3) {
                System.out.println("You are at brown field and your money are " + playerMoney);

            } else if (sum2 == 6 || sum2 == 8 || sum2 == 9) {
                System.out.println("You are at light blue field.");

            } else if (sum2 == 11 || sum2 == 13 || sum2 == 14) {
                System.out.println("You are at pink field.");

            } else if (sum2 == 16 || sum2 == 18 || sum2 == 19) {
                System.out.println("You are at orange field.");

            } else if (sum2 == 21 || sum2 == 23 || sum2 == 24) {
                System.out.println("You are at red field.");


            } else if (sum2 == 26 || sum2 == 27 || sum2 == 29) {
                System.out.println("You are at yellow field.");

            } else if (sum2 == 31 || sum2 == 32 || sum2 == 34) {
                System.out.println("You are at green field.");

            } else if (sum2 == 37 || sum2 == 39) {
                System.out.println("You are at dark blue field.");
            } else if (sum2 == 0) {
                System.out.println("You are at GO.");
            } else if (sum2 == 4) {
                System.out.println("Income tax = 200. Money: " + playerMoney);
            } else if (sum2 == 10) {
                System.out.println("Jail");
            } else if (sum2 == 12) {
                System.out.println("Electric company = 150. Money: " + playerMoney);
            } else if (sum2 == 20) {
                System.out.println("Free parking");
            } else if (sum2 == 28) {
                System.out.println("Water works = 150. Money: " + playerMoney);
            } else if (sum2 == 38) {
                System.out.println("Lixury tax = 100. Money: " + playerMoney);
            }

        }
    }

    public static void M(int sum2) {
        int sum3;
        int sum1;
        Scanner input = new Scanner(System.in);
        String enter = input.nextLine();
        Random rollFirst = new Random();
        int numberOnee = rollFirst.nextInt(6) + 1;
        System.out.println("The first die is " + numberOnee);
        Random rollSecond = new Random();
        int numberTwoo = rollSecond.nextInt(6) + 1;
        System.out.println("The second die is " + numberTwoo);
        sum1 = numberOnee + numberTwoo;
        System.out.println();
        System.out.println("The sum of the dice is " + sum1);
        System.out.println();
        sum3 = sum1 + sum2;
        System.out.println("Sum3" + sum3);
    }

    public static void aredeee(int[] price, int sum2, int field, int[] playersMoney, int players, int playermoney) {
        while (playersMoney[0] >= 0) {
            move(price, sum2, field, playersMoney, players, playermoney);
            int sum3;
            int sum1;
            Scanner input = new Scanner(System.in);
            String enter = input.nextLine();
            Random rollFirst = new Random();
            int numberOnee = rollFirst.nextInt(6) + 1;
            System.out.println("The first die is " + numberOnee);
            Random rollSecond = new Random();
            int numberTwoo = rollSecond.nextInt(6) + 1;
            System.out.println("The second die is " + numberTwoo);
            sum1 = numberOnee + numberTwoo;
            System.out.println();
            System.out.println("The sum of the dice is " + sum1);
            System.out.println();
            sum3 = sum1 + sum2;
            System.out.println("Sum3" + sum3);
            for (int i = 0; i < 1; i++) {

                if (sum3 >= 40) {
                    sum3 = sum3 - 40;
                    System.out.println("You are at " + sum3);
                } else if (sum3 == 30) {
                    System.out.println("You are at " + sum3 + "and you go to jail");
                } else if (sum3 == 7 || sum3 == 22 || sum3 == 36) {
                    System.out.println("You have a chance card.");
                } else if (sum3 == 2 || sum3 == 17 || sum3 == 33) {
                    System.out.println("You have a community chest card.");
                } else if (sum3 == 5 || sum3 == 15 || sum3 == 25 || sum3 == 35) {
                    System.out.println("You are at station.");
                } else if (sum3 == 1 || sum3 == 3) {
                    System.out.println("You are at brown field and your money are ");
                } else if (sum3 == 6 || sum3 == 8 || sum3 == 9) {
                    System.out.println("You are at light blue field.");
                } else if (sum3 == 11 || sum3 == 13 || sum3 == 14) {
                    System.out.println("You are at pink field.");
                } else if (sum3 == 16 || sum3 == 18 || sum3 == 19) {
                    System.out.println("You are at orange field.");
                } else if (sum3 == 21 || sum3 == 23 || sum3 == 24) {
                    System.out.println("You are at red field.");
                } else if (sum3 == 26 || sum3 == 27 || sum3 == 29) {
                    System.out.println("You are at yellow field.");
                } else if (sum3 == 31 || sum3 == 32 || sum3 == 34) {
                    System.out.println("You are at green field.");
                } else if (sum3 == 37 || sum3 == 39) {
                    System.out.println("You are at dark blue field.");
                } else if (sum3 == 0) {
                    System.out.println("You are at GO.");
                } else if (sum3 == 4) {
                    System.out.println("Income tax = 200.");
                } else if (sum3 == 10) {
                    System.out.println("Jail");
                } else if (sum3 == 12) {
                    System.out.println("Electric company = 150. Money: ");
                } else if (sum3 == 20) {
                    System.out.println("Free parking");
                } else if (sum3 == 28) {
                    System.out.println("Water works = 150. Money: ");
                } else if (sum3 == 38) {
                    System.out.println("Lixury tax = 100. Money: ");
                }
            }
        }

        //  int playerRoll = 1;
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


        // System.out.println("Which color?(1-8)\n 1. brown\n2. light blue\n3. pink\n4. orange\n5. red\n6. yellow\n7. green\n8. dark blue");
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
}
