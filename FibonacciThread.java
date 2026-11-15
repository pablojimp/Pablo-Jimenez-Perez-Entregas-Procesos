class HiloFibonacci extends Thread {
    int numero; // cantidad de términos a calcular

    HiloFibonacci(int n) {
        numero = n;
    }

    public void run() {
        int a = 0; // término anterior
        int b = 1; // término actual

        for (int i = 1; i <= numero; i++) {
            System.out.println("Termino " + i + ": " + a);
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}

public class FibonacciThread {
    public static void main(String[] args) {
        HiloFibonacci hilo = new HiloFibonacci(10);
        hilo.start();
    }
}
