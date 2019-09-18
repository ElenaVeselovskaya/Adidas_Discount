public class Main {
    public static void main(String[] args) {

        int fivePercentDiscount = 5;
        int tenPercentDiscount = 10;
        int twentyPercentDiscount = 20;
        int totalAmountOfPurchasesInRub = 10000;
        int currentSumOfPurchaseInRub = 10000;
        int hundredPercent = 100;

        int totalSumWithFivePercentDiscountInRub = currentSumOfPurchaseInRub * fivePercentDiscount / hundredPercent;
        int totalSumWithTenPercentDiscountInRub = currentSumOfPurchaseInRub * tenPercentDiscount / hundredPercent;
        int totalSumWithTwentyPercentDiscountInRub = currentSumOfPurchaseInRub * twentyPercentDiscount / hundredPercent;

        if (totalAmountOfPurchasesInRub >= 30000) {
            System.out.println("The total amount of purchases is more 30000 rub. The sum of current purchase with 20% discount is " + (currentSumOfPurchaseInRub - totalSumWithTwentyPercentDiscountInRub) + " rub.");
            System.out.println("The sum of 20% discount is " + totalSumWithTwentyPercentDiscountInRub + " rub.");
        } else if (totalAmountOfPurchasesInRub >= 15000 && totalAmountOfPurchasesInRub < 30000) {
            System.out.println("The total amount of purchases is more 15000 rub and less 30000 rub. The sum of current purchase with 10% discount is " + (currentSumOfPurchaseInRub - totalSumWithTenPercentDiscountInRub) + " rub.");
            System.out.println("The sum of 10% discount is " + totalSumWithTenPercentDiscountInRub + " rub.");
        } else if (totalAmountOfPurchasesInRub >= 7500 && totalAmountOfPurchasesInRub < 15000) {
            System.out.println("The total amount of purchases is more 7500 rub and less 15000 rub. The sum of current purchase with 5% discount is " + (currentSumOfPurchaseInRub - totalSumWithFivePercentDiscountInRub) + " rub.");
            System.out.println("The sum of 5% discount is " + totalSumWithFivePercentDiscountInRub + " rub.");
        } else {
            System.out.println("The total amount of purchases is less 7500 rub. The sum without discount is " + currentSumOfPurchaseInRub + " rub.");
        }
    }
}
