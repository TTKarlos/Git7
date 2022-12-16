public class Main {
    public static void main(String[] args) {
        imprimir20Numeros(50);
    }
    public static void imprimir20Numeros (int numeros) {
        for (int i = 1; i < numeros + 1; i++) {
            System.out.print(i + " ");
        }
    }
}