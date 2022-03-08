/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.poo.bd;

/**
 *
 * @author AVRJR
 */
public class ProjetoPOOBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //MENU
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Menu----------");
        
        do {
            System.out.println("Escolha uma das opcoes abaixo:");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Listar");
            System.out.println("[3] - Editar");
            System.out.println("[4] - Apagar");
            System.out.println("[0] - Sair");
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    // chamar funcao cadastrar
                case 2:
                    // chamar funcao Listar
                case 3:
                    // chamar funcao Editar
                case 4:
                    // chamar funcao Apagar
            }
        } while (op != 0);
        
        
        
    }
    
}
