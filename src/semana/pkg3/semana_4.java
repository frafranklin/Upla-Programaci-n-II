package semana.pkg3;

import java.util.Scanner;

public class semana_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     BIENVENIDO A MI PROGRAMA 🚀");
        System.out.println("====================================");

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.println("\nProcesando datos...\n");

        // Simulación elegante
        for (int i = 0; i <= 100; i += 20) {
            System.out.println("Cargando... " + i + "%");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Error en la carga");
            }
        }

        System.out.println("\n====================================");
        System.out.println(" Hola " + nombre + " 👋");
        System.out.println(" Tienes " + edad + " años");
        System.out.println(" Estás listo para programar en Java 🔥");
        System.out.println("====================================");

        // Extra: condición
        if (edad >= 18) {
            System.out.println("Eres mayor de edad ✔");
        } else {
            System.out.println("Eres menor de edad ⚠");
        }

        System.out.println("\nGracias por usar el programa 💻✨");

        sc.close();
    }
}