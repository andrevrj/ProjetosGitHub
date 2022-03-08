/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author AVRJR
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //hora do desafio
       
        Scanner teclado = new Scanner(System.in); //declarando o Scanner
        System.out.print("Entre com a nota NPA:");
        float npa = teclado.nextFloat(); //entrando com a nota NPA

        if (npa < 30) {
            System.out.println("Reprovado");

        } else if (npa < 60) {
            System.out.println("Entre com a nota da NP3:");
            float np3 = teclado.nextFloat(); //entrando com a nota da NP3

            if ((np3 + npa) / 2 >= 50) {
                System.out.println("Aprovado na NP3");
            } else {
                System.out.println("Reprovado na NP3");
            }
        } else {
            System.out.println("Aprovado");
        }
         
        
       
        }

    }

}
