

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JLabel titleLabel;
    private JLabel emailLabel;
    private JLabel senhaLabel;
    private JLabel tipoUsuarioLabel;
    private JTextField emailField;
    private JPasswordField senhaField;
    private JComboBox<String> tipoUsuarioCombo;
    private JButton entrarButton;
    private JButton cadastrarButton;

    public LoginView() {
        super("Amaral Músicas - Login");
        initComponents();
        setupLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }
    
private void initComponents() {
        titleLabel = new JLabel("Amaral Músicas - Login", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        
        emailLabel = new JLabel("E-mail:");
        senhaLabel = new JLabel("Senha:");
        tipoUsuarioLabel = new JLabel("Tipo de Usuário:");
        
        emailField = new JTextField(20);
        senhaField = new JPasswordField(20);
        tipoUsuarioCombo = new JComboBox<>(new String[]{"Admin", "Colaborador"});
        
        entrarButton = new JButton("Entrar");
        cadastrarButton = new JButton("Cadastrar Novo Usuário");
        
        // Tooltips
        emailField.setToolTipText("Digite seu e-mail cadastrado");
        senhaField.setToolTipText("Digite sua senha");
    }

    private void setupLayout() {
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Title panel
        JPanel titlePanel = new JPanel();
        titlePanel.add(titleLabel);
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        
        // Form panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        
        // Row 0
        gbc.gridx = 0; gbc.gridy = 0;
        formPanel.add(tipoUsuarioLabel, gbc);
        
        gbc.gridx = 1;
        formPanel.add(tipoUsuarioCombo, gbc);
        
        // Row 1
        gbc.gridx = 0; gbc.gridy = 1;
        formPanel.add(emailLabel, gbc);
        
        gbc.gridx = 1;
        formPanel.add(emailField, gbc);
        
        // Row 2
        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(senhaLabel, gbc);
        
        gbc.gridx = 1;
        formPanel.add(senhaField, gbc);
        
        mainPanel.add(formPanel, BorderLayout.CENTER);
        
        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.add(entrarButton);
        buttonPanel.add(cadastrarButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
    }

    // Getters
    public String getEmail() {
        return emailField.getText();
    }

    public String getSenha() {
        return new String(senhaField.getPassword());
    }

    public String getTipoUsuario() {
        return (String) tipoUsuarioCombo.getSelectedItem();
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoUsuario = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        entrar = new javax.swing.JButton();
        cadastrarNovoUsuario = new javax.swing.JButton();
        senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Amaral Músicas - Login");

        jLabel2.setText("Tipo de Usuário:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Senha:");

        tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Colaborador" }));
        tipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoUsuarioActionPerformed(evt);
            }
        });

        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        cadastrarNovoUsuario.setText("Cadastrar Novo Usuário");

        senha.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(email)
                            .addComponent(tipoUsuario, 0, 446, Short.MAX_VALUE)
                            .addComponent(senha))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(entrar)
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadastrarNovoUsuario)
                        .addGap(274, 274, 274))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(entrar)
                .addGap(18, 18, 18)
                .addComponent(cadastrarNovoUsuario)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoUsuarioActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
       if (email.getText().isEmpty() || senha.getPassword().length == 0) {
        JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }if (email.getText().isEmpty() || senha.getPassword().length == 0) {
        JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Desabilita componentes
    setComponentsEnabled(false);
    
    // Cria e mostra o diálogo de progresso
    final JDialog progressDialog = createProgressDialog();
    SwingUtilities.invokeLater(() -> progressDialog.setVisible(true));
    
    // Executa em thread separada
    new Thread(() -> {
        try {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            String emailUsuario = email.getText();
            String senhaUsuario = new String(senha.getPassword());
            
            // Adiciona um pequeno delay para testes (remover em produção)
            Thread.sleep(500);
            
            UsuarioDTO usuario = usuarioDAO.buscarUsuarioPorEmailSenha(emailUsuario, senhaUsuario);
            
            SwingUtilities.invokeLater(() -> {
                progressDialog.dispose();
                handleLoginResult(usuario);
            });
            
        } catch (Exception e) {
            SwingUtilities.invokeLater(() -> {
                progressDialog.dispose();
                handleLoginError(e);
            });
        }
    }).start();
    }//GEN-LAST:event_entrarActionPerformed

    private JDialog createProgressDialog() {
    JDialog dialog = new JDialog(this, "Autenticando...", true);
    
    // Usando FlowLayout como alternativa mais simples
    dialog.setLayout(new FlowLayout());
    
    JProgressBar progressBar = new JProgressBar();
    progressBar.setIndeterminate(true);
    dialog.add(progressBar);
    
    JLabel label = new JLabel("Por favor, aguarde...");
    dialog.add(label);
    
    dialog.pack();
    dialog.setSize(300, 100);
    dialog.setLocationRelativeTo(this);
    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    return dialog;
}

private void handleLoginResult(UsuarioDTO usuario) {
    if (usuario != null) {
        new cadastroPesquisa().setVisible(true);
        dispose();  // Fecha a janela atual após abrir a próxima
    } else {
        JOptionPane.showMessageDialog(this, 
            "Credenciais inválidas!", "Erro de Login", 
            JOptionPane.ERROR_MESSAGE);
    }
    setComponentsEnabled(true);  // Habilita os componentes novamente
}

private void handleLoginError(Exception e) {
    JOptionPane.showMessageDialog(this, 
        "Erro ao realizar login:\n" + e.getMessage(), 
        "Erro", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
    setComponentsEnabled(true);  // Habilita os componentes novamente
}


private void setComponentsEnabled(boolean enabled) {
    entrar.setEnabled(enabled);
    cadastrarNovoUsuario.setEnabled(enabled);
    email.setEnabled(enabled);
    senha.setEnabled(enabled);
    tipoUsuario.setEnabled(enabled);
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarNovoUsuario;
    private javax.swing.JTextField email;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField senha;
    private javax.swing.JComboBox<String> tipoUsuario;
    // End of variables declaration//GEN-END:variables
}

package VIEW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JLabel titleLabel;
    private JLabel emailLabel;
    private JLabel senhaLabel;
    private JLabel tipoUsuarioLabel;
    private JTextField emailField;
    private JPasswordField senhaField;
    private JComboBox<String> tipoUsuarioCombo;
    private JButton entrarButton;
    private JButton cadastrarButton;

    public LoginView() {
        super("Amaral Músicas - Login");
        initComponents();
        setupLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        titleLabel = new JLabel("Amaral Músicas - Login", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        
        emailLabel = new JLabel("E-mail:");
        senhaLabel = new JLabel("Senha:");
        tipoUsuarioLabel = new JLabel("Tipo de Usuário:");
        
        emailField = new JTextField(20);
        senhaField = new JPasswordField(20);
        tipoUsuarioCombo = new JComboBox<>(new String[]{"Admin", "Colaborador"});
        
        entrarButton = new JButton("Entrar");
        cadastrarButton = new JButton("Cadastrar Novo Usuário");
        
        // Tooltips
        emailField.setToolTipText("Digite seu e-mail cadastrado");
        senhaField.setToolTipText("Digite sua senha");
    }

    private void setupLayout() {
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Title panel
        JPanel titlePanel = new JPanel();
        titlePanel.add(titleLabel);
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        
        // Form panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        
        // Row 0
        gbc.gridx = 0; gbc.gridy = 0;
        formPanel.add(tipoUsuarioLabel, gbc);
        
        gbc.gridx = 1;
        formPanel.add(tipoUsuarioCombo, gbc);
        
        // Row 1
        gbc.gridx = 0; gbc.gridy = 1;
        formPanel.add(emailLabel, gbc);
        
        gbc.gridx = 1;
        formPanel.add(emailField, gbc);
        
        // Row 2
        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(senhaLabel, gbc);
        
        gbc.gridx = 1;
        formPanel.add(senhaField, gbc);
        
        mainPanel.add(formPanel, BorderLayout.CENTER);
        
        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.add(entrarButton);
        buttonPanel.add(cadastrarButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
    }

    // Getters
    public String getEmail() {
        return emailField.getText();
    }

    public String getSenha() {
        return new String(senhaField.getPassword());
    }

    public String getTipoUsuario() {
        return (String) tipoUsuarioCombo.getSelectedItem();
    }

    // Listeners
    public void addEntrarListener(ActionListener listener) {
        entrarButton.addActionListener(listener);
    }

    public void addCadastrarListener(ActionListener listener) {
        cadastrarButton.addActionListener(listener);
    }

    // Métodos de feedback
    public void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarProgresso(boolean mostrar) {
        // Implementar diálogo de progresso se necessário
    }
}