import java.util.Scanner;
import java.text.DecimalFormat;
import ru.netology.finances.Finances;
class Main {
  
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("###.##");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введи общую сумму покупки");
    double amount = scanner.nextDouble();
    System.out.println("Введи первоначальный взнос");
    double start = scanner.nextDouble();
    System.out.println("Введи количество лет, на которое дана рассрочка");
    double years = scanner.nextDouble();
    double payment  = Finances.calcPayment(start, amount, years);
    System.out.println("Ежемесячный платёж" + " " + df.format(payment) + "рублей" );
  }
}