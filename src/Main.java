// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        int weight = 98;

        int bmi = service.calculate(weight,height);
        System.out.println("индекс массы тела равен " + bmi);

    }
}