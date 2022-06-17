package array;

public class idades {
    public static void main(String[] args) {
        double[] idades = new double[3];
        for (int i = 0; i < idades.length ; i++) {

            idades[i] = i * i;
        }
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
