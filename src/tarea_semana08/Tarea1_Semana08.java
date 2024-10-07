package tarea_semana08;
import java.util.Scanner;
public class Tarea1_Semana08 {
    public static void main(String[] args) {
    Scanner lectura=new Scanner (System.in);
    //Consideramos un número entero positivo
        System.out.print("Ingrese cualquier numero entero positivo: ");
        int N = lectura.nextInt();        
        //Aplicamos una variable acumuladora para la suma
        int suma = 0;        
        //Aplicamos for para sumar los primeros N números
        for (int i = 1; i <= N; i++) {
            suma += i;
        }        
        //Mostrar los resultados
        System.out.println("La suma de los primeros " + N + " numeros naturales es: " + suma);
    }    
}
