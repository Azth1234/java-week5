import java.util.Scanner;

class Simple_Calculator {
    public void add(double a, double b) {
        double addition = a + b;
        System.out.println("Addition: " + addition);
    }

    public void sub(double a, double b) {
        double subtraction = a - b;
        System.out.println("Subtraction: " + subtraction);
    }

    public void mult(double a, double b) {
        double multiplication = a * b;
        System.out.println("Multiplication: " + multiplication);
    }

    public void div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return;
        }
        double division = a / b;
        System.out.println("Division: " + division);
    }
}

class Adv_calculator extends Simple_Calculator {
    public void floor_div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return;
        }
        double division = Math.floor(a / b);
        System.out.println("Floor Division: " + division);
    }

    public void mod_div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Modulus by zero.");
            return;
        }
        double mod = a % b;
        System.out.println("Modulus: " + mod);
    }
}

class Super_calculator extends Adv_calculator {
    public double Square(double num) {
        return num * num;
    }

    public double SquareRoot(double num) {
        return Math.sqrt(num);
    }

    public double CubeRoot(double num) {
        return Math.cbrt(num);
    }

    public double Floor(double num) {
        return Math.floor(num);
    }

    public double Ceil(double num) {
        return Math.ceil(num);
    }
}

// ✅ Your main method goes here
public class calculator {
    public static void main(String[] args) {
        Super_calculator calc = new Super_calculator();

        //taking input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Basic operations
        calc.add(a, b);
        calc.sub(a, b);
        calc.mult(a, b);
        calc.div(a, b);

        // Advanced operations
        calc.floor_div(a, b);
        calc.mod_div(a, b);

        // // Super operations
        double num = 7.8;
        System.out.println("Square: " + calc.Square(num));
        System.out.println("Square Root: " + calc.SquareRoot(num));
        System.out.println("Cube Root: " + calc.CubeRoot(num));
        System.out.println("Floor Value: " + calc.Floor(num));
        System.out.println("Ceil Value: " + calc.Ceil(num));
    }
}
