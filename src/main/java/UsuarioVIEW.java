package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class UsuarioVIEW {
    public static void main(String[] args) {
        // Exemplo de cadastro
        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setNome("João Silva");
        objUsuarioDTO.setEmail("joao@example.com");
        objUsuarioDTO.setSenha("123456");
        objUsuarioDTO.setDataCadastro(Date.valueOf(LocalDate.now()));
        objUsuarioDTO.setNivelAcesso("BASICO");

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.cadastrarUsuario(objUsuarioDTO);

        // Exemplo de listagem
        StringBuilder listaUsuarios = new StringBuilder("Usuários cadastrados:\n");

        List<UsuarioDTO> usuarios = usuarioDAO.listarUsuarios();
        for (UsuarioDTO usuario : usuarios) {
            listaUsuarios.append("ID: ").append(usuario.getId())
                         .append(" | Nome: ").append(usuario.getNome())
                         .append(" | Email: ").append(usuario.getEmail())
                         .append("\n");
        }

        JOptionPane.showMessageDialog(null, listaUsuarios.toString());
    }
}
