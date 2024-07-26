import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y: ");
        double y = scanner.nextDouble();

        double r = Math.sqrt(x * x + y * y);

        double theta = Math.atan2(y, x);

        double thetaDegrees = Math.toDegrees(theta);

        System.out.println("Coordenadas polares:");
        System.out.println("r = " + r);
        System.out.println("θ (en radianes) = " + theta);
        System.out.println("θ (en grados) = " + thetaDegrees);

        scanner.close();
    }
}
