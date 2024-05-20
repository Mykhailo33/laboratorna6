import java.util.Scanner;

public class DateConverter {
    private int day;
    private int month;
    private int year;

    // Конструктор класу
    public DateConverter() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    // Метод для введення дати
    public void inputDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть день:");
        this.day = scanner.nextInt();
        System.out.println("Введіть місяць:");
        this.month = scanner.nextInt();
        System.out.println("Введіть рік:");
        this.year = scanner.nextInt();
    }

    // Метод для виведення дати в європейському форматі
    public void printEuropeanDate() {
        System.out.printf("Європейський формат: %02d.%02d.%d%n", this.day, this.month, this.year);
    }

    // Метод для виведення дати в американському форматі
    public void printAmericanDate() {
        System.out.printf("Американський формат: %02d.%02d.%d%n", this.month, this.day, this.year);
    }

    public static void main(String[] args) {
        DateConverter date = new DateConverter();
        date.inputDate();
        date.printEuropeanDate();
        date.printAmericanDate();
    }
}
