public class Main {
    public static void main(String[] args) {

        int fivePercentDiscount = 5;
        int tenPercentDiscount = 10;
        int twentyPercentDiscount = 20;

        int limitOfFivePercentDiscountInRub = 7_500;
        int limitOfTenPercentDiscountInRub = 15_000;
        int limitOfTwentyPercentDiscountInRub = 30_000;

        int totalAmountOfPurchasesInRub = 7000;
        int currentSumOfPurchaseInRub = 10_000;

        int hundredPercent = 100;

        int totalSumWithFivePercentDiscountInRub = currentSumOfPurchaseInRub * fivePercentDiscount / hundredPercent;
        int totalSumWithTenPercentDiscountInRub = currentSumOfPurchaseInRub * tenPercentDiscount / hundredPercent;
        int totalSumWithTwentyPercentDiscountInRub = currentSumOfPurchaseInRub * twentyPercentDiscount / hundredPercent;

        if (totalAmountOfPurchasesInRub >= limitOfTwentyPercentDiscountInRub) {
            System.out.println("The total amount of purchases is more 30_000 rub. The sum of current purchase with 20% discount is " + (currentSumOfPurchaseInRub - totalSumWithTwentyPercentDiscountInRub) + " rub.");
            System.out.println("The sum of 20% discount is " + totalSumWithTwentyPercentDiscountInRub + " rub.");
        } else if (totalAmountOfPurchasesInRub >= limitOfTenPercentDiscountInRub) {
            System.out.println("The total amount of purchases is more 15_000 rub and less 30_000 rub. The sum of current purchase with 10% discount is " + (currentSumOfPurchaseInRub - totalSumWithTenPercentDiscountInRub) + " rub.");
            System.out.println("The sum of 10% discount is " + totalSumWithTenPercentDiscountInRub + " rub.");
        } else if (totalAmountOfPurchasesInRub >= limitOfFivePercentDiscountInRub) {
            System.out.println("The total amount of purchases is more 7_500 rub and less 15_000 rub. The sum of current purchase with 5% discount is " + (currentSumOfPurchaseInRub - totalSumWithFivePercentDiscountInRub) + " rub.");
            System.out.println("The sum of 5% discount is " + totalSumWithFivePercentDiscountInRub + " rub.");
        } else {
            System.out.println("The total amount of purchases is less 7500 rub. The sum without discount is " + currentSumOfPurchaseInRub + " rub.");
        }
    }
}
