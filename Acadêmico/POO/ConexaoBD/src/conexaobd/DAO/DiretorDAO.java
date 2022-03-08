/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaobd.DAO;

import conexaobd.model.Diretor;
import conexaobd.model.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class DiretorDAO extends ConnectionDAO {
    
    boolean sucesso = false;
    
    public boolean inserirDiretor(Diretor diretor) {
        connectToDB();
        String sql = "INSERT INTO Diretor (cpf, nome, idade) values(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, diretor.getCpf());
            pst.setString(2, diretor.getNome());
            pst.setInt(3, diretor.getIdade());
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
    
    
    public boolean atualizarDiretor(String cpf, Diretor diretor) {
        connectToDB();
        String sql = "UPDATE Diretor SET nome=?, idade=? where cpf=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, diretor.getNome());
            pst.setInt(2, diretor.getIdade());
            pst.setString(3, cpf);
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
    
    public boolean deletarDiretor(String cpf) {
        connectToDB();
        String sql = "DELETE FROM Diretor where cpf=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
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
    
    public ArrayList<Diretor> buscarDiretoresSemFiltro() {
        ArrayList<Diretor> listaDeDiretores = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Diretor";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Diretores: ");
            while (rs.next()) {
                Diretor diretorAux = new Diretor();
                diretorAux.setCpf(rs.getString("cpf"));
                diretorAux.setNome(rs.getString("nome"));
                diretorAux.setIdade(rs.getInt("idade"));
                System.out.println("nome = " + diretorAux.getNome());
                System.out.println("idade = " + diretorAux.getIdade());
                System.out.println("--------------------------------");
                listaDeDiretores.add(diretorAux);
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
        return listaDeDiretores;
    }
    
    public Diretor buscarDiretorPorCpf(String cpf) {
        
        connectToDB();
        Diretor diretorAux = null;
        String sql = "SELECT * FROM Diretor WHERE cpf = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("nome");
                if(aux.isEmpty())
                {
                    sucesso = false;
                } else {
                    diretorAux = new Diretor();
                    diretorAux.setNome(rs.getString("nome"));
                    diretorAux.setIdade(rs.getInt("idade"));
                    System.out.println("nome = " + diretorAux.getNome());
                    System.out.println("idade = " + diretorAux.getIdade());
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
        return diretorAux;
    }
    
}
