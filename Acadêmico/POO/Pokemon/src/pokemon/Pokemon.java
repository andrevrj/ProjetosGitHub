/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.Scanner;

/**
 *
 * @author AVRJR
 */
public class Pokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Entre com o valor do elemental:");
        System.out.println("1 - Fogo");
        System.out.println("2 - Agua");
        System.out.println("3 - Eletricidade");
        System.out.println("4 - Pedra");
        System.out.println("5 - Gelo");
        System.out.println("6 - Planta");
        Scanner teclado = new Scanner(System.in); //declarando o Scanner
        String elemento = teclado.nextLine();

        switch (elemento) {
            case "1":
                System.out.println("A fraqueza é Agua");
                break;
            case "2":
                System.out.println("A fraqueza é Eletricidade");
                break;
            case "3":
                System.out.println("A fraqueza é Pedra");
                break;
            case "4":
                System.out.println("A fraqueza é Gelo");
                break;
            case "5":
                System.out.println("A fraqueza é Fogo");
                break;
            case "6":
                System.out.println("A fraqueza é Fogo");
                break;
            default:
                System.out.println("Outro");
        }
    }
}
