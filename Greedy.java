public class Greedy {
    public static void main(String[] args) {
        int chocolatePrice = 10;   // price of one chocolate
        int money = 1000;          // total money you have
        int target = 50;           // number of chocolates you want to buy

        // How many chocolates can you afford?
        int maxChocolates = money / chocolatePrice;

        // But you only want 50
        int chocolatesBought = Math.min(target, maxChocolates);

        int spent = chocolatesBought * chocolatePrice;
        int remaining = money - spent;

        System.out.println("Bought " + chocolatesBought + " chocolates at Rs." + chocolatePrice);
        System.out.println("Total spent = " + spent);
        System.out.println("Remaining money = " + remaining);
    }
}
