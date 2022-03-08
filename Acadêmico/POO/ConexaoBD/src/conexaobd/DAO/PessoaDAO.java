/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaobd.DAO;

import conexaobd.model.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PessoaDAO extends ConnectionDAO{
    
    boolean sucesso = false;
    
    public boolean inserirPessoa(Pessoa pessoa) {
        connectToDB();
        String sql = "INSERT INTO Pessoa (rg, nome, idade) values(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, pessoa.getRg());
            pst.setString(2, pessoa.getNome());
            pst.setInt(3, pessoa.getIdade());
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
    
    
    public boolean atualizarPessoa(String rg, Pessoa pessoa) {
        connectToDB();
        String sql = "UPDATE Pessoa SET nome=?, idade=? where rg=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, pessoa.getNome());
            pst.setInt(2, pessoa.getIdade());
            pst.setString(4, rg);
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
    
    public boolean deletarPessoa(String rg) {
        connectToDB();
        String sql = "DELETE FROM Pessoa where rg=?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, rg);
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
    
    public ArrayList<Pessoa> buscarPessoasSemFiltro() {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        
        connectToDB();
        
        String sql = "SELECT * FROM Pessoa";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Pessoas: ");
            while (rs.next()) {
                Pessoa pessoaAux = new Pessoa();
                pessoaAux.setRg(rs.getString("rg"));
                pessoaAux.setNome(rs.getString("nome"));
                pessoaAux.setIdade(rs.getInt("idade"));
                System.out.println("nome = " + pessoaAux.getNome());
                System.out.println("idade = " + pessoaAux.getIdade());
                System.out.println("--------------------------------");
                listaDePessoas.add(pessoaAux);
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
        return listaDePessoas;
    }
    
    public Pessoa buscarPessoaPorRg(String rg) {
        
        connectToDB();
        Pessoa pessoaAux = null;
        String sql = "SELECT * FROM Pessoa WHERE rg = ?";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, rg);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("nome");
                if(aux.isEmpty())
                {
                    sucesso = false;
                } else {
                    pessoaAux = new Pessoa();
                    pessoaAux.setNome(rs.getString("nome"));
                    pessoaAux.setIdade(rs.getInt("idade"));
                    System.out.println("nome = " + pessoaAux.getNome());
                    System.out.println("idade = " + pessoaAux.getIdade());
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
        return pessoaAux;
    }
    
}
