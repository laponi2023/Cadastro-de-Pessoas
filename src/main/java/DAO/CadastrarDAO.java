
package DAO;

import DTO.CadastrarDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class CadastrarDAO {
        
    Connection conn; 
    PreparedStatement pstm; 
    ResultSet rs; 
    ArrayList<CadastrarDTO> lista = new ArrayList<>(); 

    /**
     *
     * @param objcadastrardto
     * @throws ClassNotFoundException
     */
    public void cadastrarPessoa (CadastrarDTO objcadastrardto) throws ClassNotFoundException{
        String sql = "INSERT INTO pessoas (nome, rg, cpf, limite) VALUES (?,?,?,?) "; 
        
        conn = new ConexaoDAO().ConectaBD(); 
        
        try {
            pstm = conn.prepareStatement(sql); 
            pstm.setString (1, (String)objcadastrardto.getNome());
            pstm.setString (2, (String)objcadastrardto.getCpf()); 
            pstm.setString (3, (String)objcadastrardto.getRg());
            pstm.setString (4, objcadastrardto.getLimite().toString());
            
            
            pstm.execute();
            pstm.close(); 
                    
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastrarDAO" + erro);
        }
        
        
    }

    /**
     *
     * @return
     * @throws ClassNotFoundException
     */
    public ArrayList<CadastrarDTO> PesquisarPessoa() throws ClassNotFoundException {
        String sql = "SELECT * FROM pessoas"; 
        conn = new ConexaoDAO().ConectaBD(); 
        
        
        try {
            pstm = conn.prepareStatement(sql); 
            rs = pstm.executeQuery(); 
            
            while (rs.next()) {
                CadastrarDTO objcadastrardto = new CadastrarDTO(); 
                objcadastrardto.setId_pessoa(rs.getInt("id"));
                objcadastrardto.setNome(rs.getString("nome"));
                objcadastrardto.setCpf(rs.getString("cpf"));
                objcadastrardto.setRg(rs.getString("rg"));
                objcadastrardto.setLimite(rs.getInt("limite"));
                lista.add(objcadastrardto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FUNCIONARIODAO pesquisar: "  + erro);
        }
        return lista; 
    }

    /**
     *
     * @param objcadastrardto
     * @throws ClassNotFoundException
     */
    public void alterarPessoa(CadastrarDTO objcadastrardto) throws ClassNotFoundException {
            String sql = "UPDATE pessoas set nome=?,cpf=?,rg=?,limite=? where id =?"; 
             conn = new ConexaoDAO().ConectaBD();
             
             try {
            pstm = conn.prepareStatement(sql); 
            pstm.setString (1, (String)objcadastrardto.getNome());
            pstm.setString (2, (String)objcadastrardto.getCpf()); 
            pstm.setString (3, (String)objcadastrardto.getRg());
            pstm.setString (4, objcadastrardto.getLimite().toString());
            pstm.setInt (5, objcadastrardto.getId_pessoa());
            
            
            pstm.execute();
            pstm.close(); 
                    
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "cadastrardao Alterar" + erro);
        }
        }

    /**
     *
     * @param objcadastrardto
     * @throws ClassNotFoundException
     */
    public void excluirPESSOA (CadastrarDTO objcadastrardto) throws ClassNotFoundException {
             String sql = "DELETE FROM pessoas WHERE id =?"; 
             conn = new ConexaoDAO().ConectaBD();
             
             try {
            pstm = conn.prepareStatement(sql); 
            
              pstm.setInt (1, objcadastrardto.getId_pessoa());
            
            /*pstm.setString (1, (String)objcadastrardto.getNome());
            pstm.setString (2, (String)objcadastrardto.getCpf()); 
            pstm.setString (3, (String)objcadastrardto.getRg());
            pstm.setString (4, objcadastrardto.getLimite().toString());*/
          
            
            pstm.execute();
            pstm.close(); 
        
             } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "cadastrardao Alterar" + erro);
             }
            
        }
}
 
    
    


   
        
    

