public class Main {
    public static void main(String[] args) {

        int currentBalance = 100;
        int payment = 2000;

        if (payment > 1000) {
            int bonus = payment / 100;
            currentBalance += payment + bonus;
            System.out.println("Спасибо за Ваш платеж. Сумма пополнения: " + payment);
            System.out.println("Количество зачисленных бонусов: " + bonus);
            System.out.println("Текущий баланс счета: " + currentBalance);
        } else {
            currentBalance += payment;
            System.out.println("Спасибо за Ваш платеж. Сумма пополнения: " + payment);
            System.out.println("Текущий баланс счета: " + currentBalance);
        }
    }
}