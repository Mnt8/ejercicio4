/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;
import java.util.Scanner;

/**
 *
 * @author fabian
 */
public class Ejercicio_4 {

    /**
     Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si 
     no lo es, también debemos indicarlo.
     */
    public static void main(String[] args) {
        int var;
        Scanner scn= new Scanner (System.in);
        var = scn.nextInt();
        int resultado = var % 2; 
        if (resultado == 0 ){
            System.out.println("el numero ingresado es perfectamente divisible entre 2");
        }else if (resultado != 0 ){
            System.out.println("el numero indicado no es divisible entre 2");
        }
        
    }
    
}
