public class BmiService {
    public double calculate(double weight, double growth) {
        growth = growth / 100;
        double index = weight / Math.pow(growth, 2);

        return index;
    }
}
