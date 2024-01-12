
/**
 * Класс CreditCard c полями номер счета, текущая сумма на счету.
 */
public class CreditCard {
int accountNumber;
int summ;

    public CreditCard(int summ, int accountNumber) {
        this.summ = summ;
        this.accountNumber = accountNumber;
    }

    /**
     * Метод, который позволяет начислять сумму на кредитную карточку.
     */
    public void plusSummCard(int summ) {
        this.summ += summ;
        System.out.println("Ваш баланс пополнен, сумма в настоящий момент составляет: " + this.summ);
    }

    /**
     * Метод, который позволяет снимать с карточки некоторую сумму.
     */
    public void minusSummCard(int summ) {
        this.summ -= summ;
        System.out.println("С вашего баланса сняты денежные средства, сумма в настоящий момент составляет: " + this.summ);
    }

    /**
     * Метод, который выводит текущую информацию о карточке.
     */
    public void showInformation() {
        System.out.println("Сумма по счёту '" + accountNumber + "' в настоящий момент: '" + this.summ + "'");
    }
}

