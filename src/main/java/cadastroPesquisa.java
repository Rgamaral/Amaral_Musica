import javax.swing.JOptionPane;
import VIEW.cadastroAlbum;

public class cadastroPesquisa extends javax.swing.JFrame {

    public class UsuarioDAO {
    // conteúdo da classe
}
    
    public cadastroPesquisa() {
        initComponents();
        cadastroPesquisa cp = new cadastroPesquisa();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        icone = new javax.swing.JButton();
        tituloAlbum = new javax.swing.JButton();
        artista = new javax.swing.JButton();
        gravadora = new javax.swing.JButton();
        ano = new javax.swing.JButton();
        genero = new javax.swing.JButton();
        status = new javax.swing.JButton();
        acoes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        album = new javax.swing.JButton();
        cadastroArtista = new javax.swing.JButton();
        emprestimo = new javax.swing.JButton();
        cadastrarGravadora = new javax.swing.JButton();
        musicas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tipoCadastro = new javax.swing.JComboBox<>();
        adicionar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PESQUISA:");

        icone.setText("Ícone");
        icone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconeActionPerformed(evt);
            }
        });

        tituloAlbum.setText("Título do Álbum");
        tituloAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloAlbumActionPerformed(evt);
            }
        });

        artista.setText("Artista");
        artista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistaActionPerformed(evt);
            }
        });

        gravadora.setText("Gravadora");
        gravadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravadoraActionPerformed(evt);
            }
        });

        ano.setText("Ano");
        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });

        genero.setText("Gênero");
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });

        status.setText("Status");

        acoes.setText("Ações");

        jLabel2.setText("CADASTRO");

        album.setText("Álbum");

        cadastroArtista.setText("Artista");

        emprestimo.setText("Empréstimo");

        cadastrarGravadora.setText("Gravadora");

        musicas.setText("Músicas");

        jLabel3.setText("Tipo de Cadastro:");

        tipoCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Álbum", "Artista", "Empréstimo", "Gravadora", "Músicas" }));

        adicionar.setText("Adicionar");

        excluir.setText("Excluir");

        editar.setText("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(icone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tituloAlbum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(artista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gravadora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acoes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cadastroArtista)
                            .addComponent(musicas)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(album)
                                    .addComponent(emprestimo)
                                    .addComponent(cadastrarGravadora))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(adicionar)
                                        .addGap(152, 152, 152)
                                        .addComponent(editar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(excluir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(tipoCadastro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(icone)
                    .addComponent(tituloAlbum)
                    .addComponent(artista)
                    .addComponent(gravadora)
                    .addComponent(ano)
                    .addComponent(genero)
                    .addComponent(status)
                    .addComponent(acoes))
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(album)
                    .addComponent(jLabel3)
                    .addComponent(tipoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cadastroArtista)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(emprestimo)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarGravadora))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionar)
                            .addComponent(excluir)
                            .addComponent(editar))))
                .addGap(18, 18, 18)
                .addComponent(musicas)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iconeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iconeActionPerformed

    private void tituloAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloAlbumActionPerformed

    private void artistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artistaActionPerformed

    private void gravadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gravadoraActionPerformed

    private void anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoActionPerformed

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void albumActionPerformed(java.awt.event.ActionEvent evt) {                                     
        new cadastroAlbum().setVisible(true);
        this.dispose();
}
    
    private void cadastroArtistaActionPerformed(java.awt.event.ActionEvent evt) {                                               
    JOptionPane.showMessageDialog(this, "Tela de cadastro de artista será implementada");
} 
    
    private void tipoCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                            
    String selecionado = (String) tipoCadastro.getSelectedItem();
    JOptionPane.showMessageDialog(this, "Tipo selecionado: " + selecionado);
}
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acoes;
    private javax.swing.JButton adicionar;
    private javax.swing.JButton album;
    private javax.swing.JButton ano;
    private javax.swing.JButton artista;
    private javax.swing.JButton cadastrarGravadora;
    private javax.swing.JButton cadastroArtista;
    private javax.swing.JButton editar;
    private javax.swing.JButton emprestimo;
    private javax.swing.JButton excluir;
    private javax.swing.JButton genero;
    private javax.swing.JButton gravadora;
    private javax.swing.JButton icone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton musicas;
    private javax.swing.JButton status;
    private javax.swing.JComboBox<String> tipoCadastro;
    private javax.swing.JButton tituloAlbum;
    // End of variables declaration//GEN-END:variables
}
