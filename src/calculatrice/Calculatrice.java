package calculatrice;

public class Calculatrice {
    public int Addition(int a, int b) {
        return a + b;
    }

    public int Soustraction(int a, int b) {
        return a - b;
    }

    public int Multiplication(int a, int b) {
        return a * b;
    }

    public int Division(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Division par zéro !");
        return a / b;
    }
}
