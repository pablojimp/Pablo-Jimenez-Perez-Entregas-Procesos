class Fibonacci implements Runnable {
    int numero; // cantidad de términos a calcular

    Fibonacci(int n) {
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

public class FibonacciRunnable {
    public static void main(String[] args) {
        Fibonacci tarea = new Fibonacci(10);
        Thread hilo = new Thread(tarea);
        hilo.start();
    }
}
