import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Inmersion JAVA");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        double puntuacion = 5.4;
        boolean incluidoEnElPlanBasico = true;


        System.out.println("Esta Incluido en el Plan Basico: " + incluidoEnElPlanBasico);
        System.out.println("Puntuacion: " + puntuacion);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Ingrese el numero de la imagen");
        //int imagen = sc.nextInt();

        int i = 4;
        double notaGral = 0.0;

        while (i > 0) {
            Scanner numeroIngresado = new Scanner(System.in);
            System.out.println("Ingrese el Puntaje: ");
            double nota = numeroIngresado.nextDouble();
            System.out.println("Ingreso : " + nota);
            notaGral = notaGral + nota;
            i--;
        }
        System.out.println("Puntuacion Gral: " + notaGral / 4);





    }
}