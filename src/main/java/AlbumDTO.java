import java.util.ArrayList;
import java.util.List;

public class AlbumDTO {
    private String titulo;
    private String artista;
    private String gravadora;
    private int anoLancamento;
    private List<MusicaDTO> musicas = new ArrayList<>();

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }
    public String getGravadora() { return gravadora; }
    public void setGravadora(String gravadora) { this.gravadora = gravadora; }
    public int getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(int anoLancamento) { this.anoLancamento = anoLancamento; }
    public List<MusicaDTO> getMusicas() { return musicas; }
    public void setMusicas(List<MusicaDTO> musicas) { this.musicas = musicas; }
}