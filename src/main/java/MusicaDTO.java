public class MusicaDTO {
    private String titulo;
    private int numeroFaixa;
    private String ladoFaixa; // Este campo deve existir

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroFaixa() {
        return numeroFaixa;
    }

    public void setNumeroFaixa(int numeroFaixa) {
        this.numeroFaixa = numeroFaixa;
    }

    public String getLadoFaixa() {
        return ladoFaixa;
    }

    public void setLadoFaixa(String ladoFaixa) {
        this.ladoFaixa = ladoFaixa;
    }
}
