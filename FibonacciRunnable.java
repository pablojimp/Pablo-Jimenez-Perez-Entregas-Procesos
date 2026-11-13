class Fibonacci implements Runnable {
    int numero; // dato del hilo

    Fibonacci(int n) {         
        numero = n;      
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + numero + " = " + (numero * numero));
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
