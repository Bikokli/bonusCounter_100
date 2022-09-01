public class Main {
    public static void main(String[] args) {
        int refill = 700;

        int customerAccount = 100;
        final int converter = 100;
        final int discountConditions = 1000;
        if (refill >= discountConditions) {
            int bonus = (refill / converter);
            customerAccount += bonus + refill;
            System.out.println("Вам начислено " + bonus);
        } else {
            customerAccount += refill;
        }
        System.out.println("Выш баланс " + customerAccount);

        ///
    }
}



