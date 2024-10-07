package tarea_semana08;
import java.util.Scanner;
public class Tarea3_Semana08 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        //Declaramos las variables
        System.out.print("Ingrese el primer numero (a): ");
        int a = lectura.nextInt();
        System.out.print("Ingrese el segundo numero (b): ");
        int b = lectura.nextInt();        
        //Usaremos una variable para contar los números pares
        int contadorPares = 0;
        //Aplcamos la estructura for para contar los números pares entre a y b
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                contadorPares++;
            }
        }        
        //Mostrar el resultado
        System.out.println("Hay " + contadorPares + " numeros pares entre " + a + " y " + b + ".");
    }        
}
    
  
