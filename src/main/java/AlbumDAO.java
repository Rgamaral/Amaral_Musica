import DTO.AlbumDTO;
import DTO.MusicaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class AlbumDAO {
    
    public boolean cadastrarAlbum(AlbumDTO album) {
        Connection conn = ConexaoDAO.conectaBD();
        PreparedStatement pstmtAlbum = null;
        PreparedStatement pstmtMusica = null;
        
        try {
            // Primeiro, inserir o álbum
            String sqlAlbum = "INSERT INTO album (titulo, artista, gravadora, ano_lancamento) VALUES (?, ?, ?, ?)";
            pstmtAlbum = conn.prepareStatement(sqlAlbum, PreparedStatement.RETURN_GENERATED_KEYS);
            
            pstmtAlbum.setString(1, album.getTitulo());
            pstmtAlbum.setString(2, album.getArtista());
            pstmtAlbum.setString(3, album.getGravadora());
            pstmtAlbum.setInt(4, album.getAnoLancamento());
            
            int rowsAffected = pstmtAlbum.executeUpdate();
            
            if (rowsAffected == 0) {
                return false;
            }
            
            // Obter o ID gerado para o álbum
            ResultSet generatedKeys = pstmtAlbum.getGeneratedKeys();
            long albumId = -1;
            if (generatedKeys.next()) {
                albumId = generatedKeys.getLong(1);
            } else {
                return false;
            }
            
            // Agora inserir as músicas
            if (album.getMusicas() != null && !album.getMusicas().isEmpty()) {
                String sqlMusica = "INSERT INTO musica (album_id, titulo, numero_faixa, lado_faixa) VALUES (?, ?, ?, ?)";
                pstmtMusica = conn.prepareStatement(sqlMusica);
                
                for (MusicaDTO musica : album.getMusicas()) {
                    pstmtMusica.setLong(1, albumId);
                    pstmtMusica.setString(2, musica.getTitulo());
                    pstmtMusica.setInt(3, musica.getNumeroFaixa());
                    pstmtMusica.setString(4, musica.getLadoFaixa());
                    pstmtMusica.addBatch();
                }
                
                pstmtMusica.executeBatch();
            }
            
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar álbum: " + e.getMessage());
            return false;
        } finally {
            try {
                if (pstmtAlbum != null) pstmtAlbum.close();
                if (pstmtMusica != null) pstmtMusica.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }
    
    // Outros métodos para buscar, listar, atualizar e excluir álbuns
}
