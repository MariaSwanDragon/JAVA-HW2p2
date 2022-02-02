public class Main {
        public static void main(String[] args) {
            int current = 100;
            int refill = 2000;
            // Объявляете переменные для входных данных и
            // параметров программы: начального счёта,
            // суммы пополнения и тп
            int bonus;
            int finacc;
            if (refill > 1000) {
                bonus = (refill/100);
                finacc = (refill + bonus + current);
            } else {
                bonus = 0;
                finacc = (current + refill);
            }
            // Условным оператором проверяете превысила ли
            // сумма пополнения порог и для этих двух разных
            // сценариев рассчитываете сумму бонуса и выводите
            // на экран.
            System.out.println("на счёту: " + finacc);
            System.out.println("бонусов: " + bonus);
        }
    }
