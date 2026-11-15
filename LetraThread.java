class LetrasHilo extends Thread {
    char letra;
    int numero;

    LetrasHilo(char letra, int numero) {
        this.letra = letra;
        this.numero = numero;
    }

    public void run() {
        for (int i = 1; i <= numero; i++) {
            System.out.print(letra+" ");
        }
    }

}

public class LetraThread {
    public static void main(String[] args) {
        LetrasHilo hilo = new LetrasHilo('t',1000);
        LetrasHilo hilo2 = new LetrasHilo('x',1000);
        LetrasHilo hilo3 = new LetrasHilo('a',1000);
        hilo.start();
        hilo2.start();
        hilo3.start();
    }
}
