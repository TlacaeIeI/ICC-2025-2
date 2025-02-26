
package calculadora;

import java.util.Scanner;


public class Calculadora {


    public static void main(String[] args) {

            
    System.out.println("CALCULADORA");
    System.out.println("En esta calculadora podrás realizar:");
    System.out.println("Suma (1)");
    System.out.println("Multiplicación (2)");
    System.out.println("División (3)");
    System.out.println("Para hacerlo, primero ingresa el número  que esta entre paréntesis al lado de la operación deseada");
        
    Scanner boton = new Scanner(System.in);
    int operador = boton.nextInt();
    
    double numero1;
    double numero2;
    double operacion;
    
    
    if(operador == 1){
    System.out.println("Añade el primer número");
    numero1 = boton.nextDouble();
    
    System.out.println("Añade el segundo número");
    numero2 = boton.nextDouble();
    
    operacion = numero1 + numero2;
    
    System.out.println("La operación da: " + operacion);
    
    }

    if(operador == 2){
    System.out.println("Añade el primer número");
    numero1 = boton.nextDouble();
    
    System.out.println("Añade el segundo número");
    numero2 = boton.nextDouble();
    
    operacion = numero1 * numero2;
    
    System.out.println("La operación da: " + operacion);
    
    }

    if(operador == 3){
    System.out.println("Añade el primer número");
    numero1 = boton.nextDouble();
    
    System.out.println("Añade el segundo número");
    numero2 = boton.nextDouble();
    
    operacion = numero1 / numero2;
    
    System.out.println("La operación da: " + operacion);
    
    }
    else{
        System.out.println("Error, elige una de las tres operaciones disponibles");
    }


  

        
        
        
        
        
        
        
    }
    
}
