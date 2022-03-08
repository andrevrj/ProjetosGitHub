/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaobd.DAO;

import conexaobd.model.Filme;
import conexaobd.model.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class FilmeDAO extends ConnectionDAO{
    
    boolean sucesso = false;
    
    public boolean inserirFilme(Filme filme) {
        connectToDB();
        String sql = "INSERT INTO Filme (genero, nome, diretor_cpf) values(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, filme.getGenero());
            pst.setString(2, filme.getNome());
            pst.setString(3, filme.getDiretor_cpf());
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
    
    
    public boolean atualizarFilme(int idFilme, Filme filme) {
        connectToDB();
        String sql = "UPDATE Filme SET genero=?, nome=? where idFilme=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, filme.getGenero());
            pst.setString(2, filme.getNome());
            pst.setInt(3, idFilme);
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
    
    public boolean deletarFilme(int idFilme) {
        connectToDB();
        String sql = "DELETE FROM Filme where idFilme=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idFilme);
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
    
    public ArrayList<Filme> buscarFilmesSemFiltro() {
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Filme";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Filmes: ");
            while (rs.next()) {
                Filme filmeAux = new Filme();
                filmeAux.setGenero(rs.getString("genero"));
                filmeAux.setNome(rs.getString("nome"));
                System.out.println("genero = " + filmeAux.getGenero());
                System.out.println("nome = " + filmeAux.getNome());
                System.out.println("--------------------------------");
                listaDeFilmes.add(filmeAux);
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
        return listaDeFilmes;
    }
    
    public Filme buscarFilmePorIdFilme(int idFilme) {
        
        connectToDB();
        Filme filmeAux = null;
        String sql = "SELECT * FROM Filme WHERE idFilme = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idFilme);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("nome");
                if(aux.isEmpty())
                {
                    sucesso = false;
                } else {
                    filmeAux = new Filme();
                    filmeAux.setGenero(rs.getString("genero"));
                    filmeAux.setNome(rs.getString("nome"));
                    System.out.println("genero = " + filmeAux.getGenero());
                    System.out.println("nome = " + filmeAux.getNome());
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
        return filmeAux;
    }
    
}
