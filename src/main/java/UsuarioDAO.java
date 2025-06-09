import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    public boolean cadastrarUsuario(UsuarioDTO usuario) {
        String sql = "INSERT INTO usuario (nome, email, senha, data_cadastro, nivel_acesso) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = ConexaoDAO.conectaBD();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getEmail());
            pstmt.setString(3, usuario.getSenha()); // Em produção, usar hash!
            pstmt.setDate(4, new java.sql.Date(usuario.getDataCadastro().getTime()));
            pstmt.setString(5, usuario.getNivelAcesso());
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: " + e.getMessage(), 
                "Erro no Banco de Dados", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public UsuarioDTO buscarUsuarioPorEmailSenha(String email, String senha) {
        String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ?";
        
        try (Connection conn = ConexaoDAO.conectaBD();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    UsuarioDTO usuario = new UsuarioDTO();
                    usuario.setId(rs.getLong("id"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setNivelAcesso(rs.getString("nivel_acesso"));
                    return usuario;
                }
                return null;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuário: " + e.getMessage(), 
                "Erro no Banco de Dados", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<UsuarioDTO> listarUsuarios() {
        List<UsuarioDTO> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        
        try (Connection conn = ConexaoDAO.conectaBD();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                UsuarioDTO usuario = new UsuarioDTO();
                usuario.setId(rs.getLong("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setNivelAcesso(rs.getString("nivel_acesso"));
                usuarios.add(usuario);
            }
            
            return usuarios;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar usuários: " + e.getMessage(), 
                "Erro no Banco de Dados", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    // Exemplo de método para atualizar usuário
    public boolean atualizarUsuario(UsuarioDTO usuario) {
        String sql = "UPDATE usuario SET nome = ?, email = ?, nivel_acesso = ? WHERE id = ?";
        
        try (Connection conn = ConexaoDAO.conectaBD();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getEmail());
            pstmt.setString(3, usuario.getNivelAcesso());
            pstmt.setLong(4, usuario.getId());
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar usuário: " + e.getMessage(), 
                "Erro no Banco de Dados", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    // Exemplo de método para excluir usuário
    public boolean excluirUsuario(long id) {
        String sql = "DELETE FROM usuario WHERE id = ?";
        
        try (Connection conn = ConexaoDAO.conectaBD();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setLong(1, id);
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuário: " + e.getMessage(), 
                "Erro no Banco de Dados", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}