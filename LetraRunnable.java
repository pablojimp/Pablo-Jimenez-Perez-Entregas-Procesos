class Letras implements Runnable {
    char letra;
    int numero;

    Letras(char letra, int numero) {
        this.letra = letra;
        this.numero = numero;
    }

    public void run() {
        for (int i = 1; i <= numero; i++) {
            System.out.print(letra + " ");
        }
    }
}

public class LetraRunnable {
    public static void main(String[] args) {
        Letras tarea = new Letras('t', 1000);
        Letras tarea2 = new Letras('x', 1000);
        Letras tarea3 = new Letras('a', 1000);

        Thread hilo = new Thread(tarea);
        Thread hilo2 = new Thread(tarea2);
        Thread hilo3 = new Thread(tarea3);

        hilo.start();
        hilo2.start();
        hilo3.start();
    }
}
