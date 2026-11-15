class HiloSumatoria extends Thread {
    int numero;    // número del que se calcula la sumatoria
    String nombre; // nombre del hilo

    HiloSumatoria(int numero, String nombre) {
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

public class SumatoriaThread {
    public static void main(String[] args) {
        HiloSumatoria hilo = new HiloSumatoria(24, "primero");
        HiloSumatoria hilo2 = new HiloSumatoria(34, "segundo");
        HiloSumatoria hilo3 = new HiloSumatoria(14, "tercero");

        hilo.start();
        hilo2.start();
        hilo3.start();
    }
}
