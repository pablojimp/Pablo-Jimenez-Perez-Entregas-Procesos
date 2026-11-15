class Sumatoria implements Runnable {
    int numero;    // número del que se calcula la sumatoria
    String nombre; // nombre del hilo

    Sumatoria(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public void run() {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma = suma + i;
        }
        System.out.println("Suma calculada por el hilo " + nombre + ": " + suma);
    }
}

public class SumatoriaRunnable {
    public static void main(String[] args) {
        Sumatoria tarea = new Sumatoria(24, "primero");
        Sumatoria tarea2 = new Sumatoria(34, "segundo");
        Sumatoria tarea3 = new Sumatoria(14, "tercero");

        Thread hilo = new Thread(tarea);
        Thread hilo2 = new Thread(tarea2);
        Thread hilo3 = new Thread(tarea3);

        hilo.start();
        hilo2.start();
        hilo3.start();
    }
}
