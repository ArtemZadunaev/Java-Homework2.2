import java.net.SocketOption;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 100;
        int bonusCost = 100;
        if (payment > 1000) {
            balance += payment + payment / bonusCost;
            System.out.println("Ваш баланс: " + balance + "\nВам начислено: " + payment / bonusCost + " баллов.");
        } else {
            balance += payment;
            System.out.println("Ваш баланс: " + balance + "\nВам начислено: 0 баллов.");
        }
    }
}