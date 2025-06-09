import DAO.AlbumDAO;
import DTO.AlbumDTO;
import DTO.MusicaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class cadastroAlbum extends javax.swing.JFrame {
    
    private List<MusicaDTO> musicasAdicionadas = new ArrayList<>();
    private AlbumDTO albumEmEdicao = null;
    
    public cadastroAlbum() {
        initComponents();
        finalizarCadastro.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        finalizarCadastroActionPerformed(evt);
    }
});
        
        inserirOutraMusica.addActionListener(new java.awt.event.ActionListener() {
     public void actionPerformed(java.awt.event.ActionEvent evt) {
        inserirOutraMusicaActionPerformed(evt);
    }
});
        
        setLocationRelativeTo(null); // Centralizar na tela
    }
    
    public cadastroAlbum(AlbumDTO album) {
        this();
        this.albumEmEdicao = album;
        preencherCamposAlbum();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inserirOutraMusica = new javax.swing.JButton();
        finalizarCadastro = new javax.swing.JButton();
        tituloAlbum = new javax.swing.JTextField();
        nomeArtista = new javax.swing.JTextField();
        nomeGravadora = new javax.swing.JTextField();
        anoLancamento = new javax.swing.JTextField();
        nomeMusica = new javax.swing.JTextField();
        faixaMusica = new javax.swing.JTextField();
        ladoFaixa = new javax.swing.JComboBox<>();
        usuarioResponsavel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro de Álbum");

        jLabel2.setText("Título:");

        jLabel3.setText("Artista:");

        jLabel4.setText("Gravadora:");

        jLabel5.setText("Ano de Lançamento:");

        jLabel6.setText("Música:");

        jLabel7.setText("Faixa da Música:");

        jLabel8.setText("Lado da Faixa:");

        jLabel9.setText("Usuário Responsável:");

        inserirOutraMusica.setText("Inserir outra Música");

        finalizarCadastro.setText("Finalizar Cadastro");

        ladoFaixa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "Duplo", "Único" }));

        usuarioResponsavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Colaborador" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tituloAlbum)
                            .addComponent(nomeArtista)
                            .addComponent(nomeGravadora)
                            .addComponent(anoLancamento)
                            .addComponent(nomeMusica)
                            .addComponent(faixaMusica)
                            .addComponent(ladoFaixa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usuarioResponsavel, 0, 508, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(inserirOutraMusica)
                        .addGap(176, 176, 176)
                        .addComponent(finalizarCadastro)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tituloAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(nomeGravadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(anoLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(nomeMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(faixaMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ladoFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(usuarioResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserirOutraMusica)
                    .addComponent(finalizarCadastro))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherCamposAlbum() {
        if (albumEmEdicao != null) {
            tituloAlbum.setText(albumEmEdicao.getTitulo());
            nomeArtista.setText(albumEmEdicao.getArtista());
            nomeGravadora.setText(albumEmEdicao.getGravadora());
            anoLancamento.setText(String.valueOf(albumEmEdicao.getAnoLancamento()));
            
            // Preencher músicas se houver
            if (albumEmEdicao.getMusicas() != null && !albumEmEdicao.getMusicas().isEmpty()) {
                musicasAdicionadas.addAll(albumEmEdicao.getMusicas());
                atualizarListaMusicas();
            }
        }
    }

    private void finalizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                 
       if (!validarCampos()) {
        return;
    }
    
    try {
        AlbumDTO album = new AlbumDTO();
        album.setTitulo(tituloAlbum.getText());
        album.setArtista(nomeArtista.getText());
        album.setGravadora(nomeGravadora.getText());
        album.setAnoLancamento(Integer.parseInt(anoLancamento.getText()));
        album.setMusicas(musicasAdicionadas);
        
        AlbumDAO albumDAO = new AlbumDAO();
        boolean sucesso;
        
        if (albumEmEdicao == null) {
            sucesso = albumDAO.cadastrarAlbum(album);
        } else {
            // sucesso = albumDAO.atualizarAlbum(album); // Implementar no DAO
            sucesso = false; // Temporário
        }
        
        if (sucesso) {
            JOptionPane.showMessageDialog(this, 
                "Álbum " + (albumEmEdicao == null ? "cadastrado" : "atualizado") + " com sucesso!",
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
            new cadastroPesquisa().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, 
                "Erro ao " + (albumEmEdicao == null ? "cadastrar" : "atualizar") + " álbum",
                "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
            "Ano de lançamento deve ser um número válido!",
            "Erro de Validação", JOptionPane.ERROR_MESSAGE);
    }
} 
    
private boolean validarCampos() {
    if (tituloAlbum.getText().isEmpty() || 
        nomeArtista.getText().isEmpty() || 
        nomeGravadora.getText().isEmpty() || 
        anoLancamento.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, 
            "Preencha todos os campos obrigatórios do álbum!",
            "Aviso", JOptionPane.WARNING_MESSAGE);
        return false;
    }
    
    if (musicasAdicionadas.isEmpty()) {
        JOptionPane.showMessageDialog(this, 
            "Adicione pelo menos uma música ao álbum!",
            "Aviso", JOptionPane.WARNING_MESSAGE);
        return false;
    }
    
    return true;
}

private void inserirOutraMusicaActionPerformed(java.awt.event.ActionEvent evt) {                                                  
     if (nomeMusica.getText().isEmpty() || faixaMusica.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Preencha todos os campos da música!",
                "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            MusicaDTO musica = new MusicaDTO();
            musica.setTitulo(nomeMusica.getText());
            musica.setNumeroFaixa(Integer.parseInt(faixaMusica.getText()));
            musica.setLadoFaixa((String) ladoFaixa.getSelectedItem());
            
            musicasAdicionadas.add(musica);
            atualizarListaMusicas();
            
            // Limpar campos para nova inserção
            nomeMusica.setText("");
            faixaMusica.setText("");
            
            JOptionPane.showMessageDialog(this, 
                "Música adicionada com sucesso!",
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Número da faixa deve ser um valor inteiro!",
                "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarListaMusicas() {
        // Implementar lógica para atualizar visualização das músicas adicionadas
        // Pode ser uma JList ou JTable mostrando as músicas já inseridas
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastroAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroAlbum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoLancamento;
    private javax.swing.JTextField faixaMusica;
    private javax.swing.JButton finalizarCadastro;
    private javax.swing.JButton inserirOutraMusica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> ladoFaixa;
    private javax.swing.JTextField nomeArtista;
    private javax.swing.JTextField nomeGravadora;
    private javax.swing.JTextField nomeMusica;
    private javax.swing.JTextField tituloAlbum;
    private javax.swing.JComboBox<String> usuarioResponsavel;
    // End of variables declaration//GEN-END:variables
}
