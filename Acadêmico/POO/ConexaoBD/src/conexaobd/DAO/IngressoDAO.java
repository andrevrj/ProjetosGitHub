/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaobd.DAO;

import conexaobd.model.Ingresso;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class IngressoDAO extends ConnectionDAO{
    
    boolean sucesso = false;
    
    public boolean inserirIngresso(Ingresso ingresso) {
        connectToDB();
        String sql = "INSERT INTO Ingresso (valor, poltrona, pessoa_rg) values(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(1, ingresso.getValor());
            pst.setInt(2, ingresso.getPoltrona());
            pst.setString(3, ingresso.getPessoa_rg());
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        
        return sucesso;
    }
    
    
    public boolean atualizarIngresso(int codigo, Ingresso ingresso) {
        connectToDB();
        String sql = "UPDATE Ingresso SET nomeFilme=?, poltrona=? where codigo=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(1, ingresso.getValor());
            pst.setInt(2, ingresso.getPoltrona());
            pst.setInt(3, codigo);
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    
    public boolean deletarIngresso(int codigo) {
        connectToDB();
        String sql = "DELETE FROM Ingresso where codigo=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, codigo);
            pst.execute();
            sucesso = true;
            
        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    
    public ArrayList<Ingresso> buscarIngressosSemFiltro() {
        ArrayList<Ingresso> listaDeIngressos = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Ingresso";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Ingressos: ");
            while (rs.next()) {
                Ingresso ingressoAux = new Ingresso();
                ingressoAux.setValor(rs.getFloat("valor"));
                ingressoAux.setPoltrona(rs.getInt("poltrona"));
                System.out.println("nomeFilme = " + ingressoAux.getValor());
                System.out.println("poltrona = " + ingressoAux.getPoltrona());
                System.out.println("--------------------------------");
                listaDeIngressos.add(ingressoAux);
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return listaDeIngressos;
    }
    
    public Ingresso buscarIngressoPorCodigo(int codigo) {
        
        connectToDB();
        Ingresso ingressoAux = null;
        String sql = "SELECT * FROM Ingresso WHERE codigo = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, codigo);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("nomeFilme");
                if(aux.isEmpty())
                {
                    sucesso = false;
                } else {
                    ingressoAux = new Ingresso();
                    ingressoAux.setValor(rs.getFloat("valor"));
                    ingressoAux.setPoltrona(rs.getInt("poltrona"));
                    System.out.println("nomeFilme = " + ingressoAux.getValor());
                    System.out.println("poltrona = " + ingressoAux.getPoltrona());
                    System.out.println("--------------------------------");
                }
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return ingressoAux;
    }
    
}
