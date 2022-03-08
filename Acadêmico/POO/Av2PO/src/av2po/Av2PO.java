/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av2po;

/**
 *
 * @author AVRJR
 */
public class Av2PO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         // Instanciando Fantasma da casa Grifinoria
        Fantasma fan = new Fantasma();
        fan.setNome("Camarada");
        fan.setMotivoMorte("Morte");
        fan.setIdade(15);
        // Instanciando a casa Grifinoria
        new Grifinoria();
        Grifinoria g1 = new Grifinoria();
        g1.fundador = "Gabriel";
        g1.animal = "Gato";
        g1.caracteristica = "Genio";
        g1.pontuacao = 100;
        g1.espada = "Sabre de luz";

        new Sonserina();
        Sonserina s1 = new Sonserina();
        s1.fundador = "Silvio";
        s1.animal = "Sapo";
        s1.caracteristica = "Sabio";
        s1.pontuacao = 100;
        s1.medalhao = "De ouro";
           // Instanciando Fantasma da casa Sonserina
        Fantasma fan1 = new Fantasma();
        fan1.setNome("Invisivel");
        fan1.setMotivoMorte("Desaparecimento");
        fan1.setIdade(20);

        new Corvinal();
        Corvinal c1 = new Corvinal();
        c1.fundador = "Carlos";
        c1.animal = "Cavalo";
        c1.caracteristica = "Calmo";
        c1.pontuacao = 100;
        c1.diadema = "Dia dema";
          // Instanciando Fantasma da casa Corvinal
        Fantasma fan = new Fantasma();
        fan2.setNome("Brabo");
        fan2.setMotivoMorte("Vingança");
        fan2.setIdade(18);

    }

}
