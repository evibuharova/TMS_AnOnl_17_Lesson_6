/**
 * Программа, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек
 */
public class Main {

    public static void main(String[] args) {
        CreditCard evi1 = new CreditCard(1, 12345);
        evi1.plusSummCard(123);
        CreditCard evi2 = new CreditCard(2, 23456);
        evi2.plusSummCard(123);
        CreditCard evi3 = new CreditCard(123, 34567);
        evi3.minusSummCard(122);
        evi1.showInformation();
        evi2.showInformation();
        evi3.showInformation();
    }
}