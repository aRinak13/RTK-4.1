public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index;
        index = service.calculate(103.2, 158);

        System.out.format("%.1f", index);
    }
}
