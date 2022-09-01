public class Main {
    public static void main(String[] args) {
        int sum =200;
        int newsum =1300;
        int bonus;

        if (newsum > 1000) {
            bonus = newsum / 100;
        }
        else {
            bonus = 0;
        }

        int balance = sum + newsum + bonus;
        System.out.println("Баланс: " + balance + " рублей + бонус: " + bonus + " рублей");
    }
}
