public class Main {
    public static void main(String[] args) {
        int amount = 100; //сумма на счете
        int refill = 1100; // сумма пополнения
        int rubles = 1; //1 рубль за каждые 100 рублей пополнения
        if (refill > 1_000) {
            System.out.println("Начислены бонусы");
            System.out.println(refill / 100);
            System.out.println("Итоговый баланс");
            System.out.println(refill + amount + refill / 100);
        } else {
            System.out.println("Не начислены бонусы");
            System.out.println("Итоговый баланс");
            System.out.println(refill + amount);
        }
    }
}
