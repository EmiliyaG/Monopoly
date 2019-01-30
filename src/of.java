import java.util.Scanner;

public class of {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the number of players:");
        int players = input.nextInt();
        int[] price = {60, 0, 60, 200, 200, 100, 0, 100, 120, 200, 140, 150, 140, 160, 200, 180, 0, 180, 200, 0, 220, 0, 220, 240, 200, 260, 260, 150, 280, 0, 300, 300, 0, 320, 200, 350, 200, 0, 250, 100, 400};
        int field = 0;
        int[] playersMoney = {200, 2100, 1000, 2200};
        go(players, playersMoney, price);
    }


    public static void go(int players, int[] playersMoney, int[] price) {
        int playerMoney;
        int pricee;
        for (int i = 0; i < players; i++) {
            playerMoney = playersMoney[0];
            playerMoney += 200;
            System.out.println("Your money are " + playerMoney);

        }
        for (int i = 0; i < 1; i++) {
            pricee = price[i];
            System.out.println("Price" + pricee);
        }
    }
}
