import java.util.Scanner;

public class of {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the number of players:");
        int players = input.nextInt();
        int[] price = {60, 0, 60, 200, 200, 100, 0, 100, 120, 200, 140, 150, 140, 160, 200, 180, 0, 180, 200, 0, 220, 0, 220, 240, 200, 260, 260, 150, 280, 0, 300, 300, 0, 320, 200, 350, 200, 0, 250, 100, 400};
        int field = 0;
        int[] playersMoney = {200, 2100, 1000, 2200};
        int playerMoney;
        for (int i = 0; i < players; i++) {
            players = playersMoney[i];
            playerMoney = playersMoney[i];
            playerMoney += 200;
            System.out.println("Your money are " + playerMoney);
        }
    }
}

//        int pricee;
//        for (int i = 0; i < players; i++) {
//            playerMoney = playersMoney[0];
//
//
//        }
//        for (int i = 0; i < 1; i++) {
//            pricee = price[i];
//            System.out.println("Price" + pricee);
//        }
//        String[] namesFields = {"Go", "first brown", "Community chest", "second brown", "income tax", "Reading railroad", "first light blue",
//                "chance", "second light blue", "third light blue", "jail", "first pink", "electric company", "second pink", "third pink", "Pennsylvania railroad", "first orange",
//                "community chest", "second orange", "third orange", "Free parking", "first red", "chance", "second red", "third red", "R. & O. railroad", "first yellow",
//                "second yellow", "water works", "third yellow", "Go to jail", "first green", "second green", "community chest", "third green",
//                "Short line", "chance", "first dark blue", "Luxury tax", "second blue"};
//        for (int i = 0; i < players; i++) {
//            price[i] = Integer.parseInt(namesFields[i]);
//            System.out.println("You have " + namesFields[i]);
//        }
//    }
//}
