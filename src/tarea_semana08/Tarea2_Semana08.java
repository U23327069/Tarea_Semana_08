package tarea_semana08;
import java.util.Scanner;
public class Tarea2_Semana08 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        //Declaramos variables para que el usuario ingrese un número para la tabla de multiplicar
        System.out.print("Ingrese un numero para ver su tabla de multiplicar: ");
        int numero = lectura.nextInt();
        //Aplicamos for para generar la tabla de multiplicar
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            //Salida de los datos
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
