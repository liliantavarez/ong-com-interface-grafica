package Telas;

import controle.ControleCadastro;
import javax.swing.JOptionPane;
import objetos.Animais;

public class FrameCadastro extends javax.swing.JFrame {

    private FrameHome telaPrincipal;

    private FrameCadastro() {
        initComponents();
    }

    public FrameCadastro(FrameHome telaPrincipal) {
        this();
        this.telaPrincipal = telaPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbEspecie = new javax.swing.JLabel();
        cbEspecieCad = new javax.swing.JComboBox<>();
        lbPorteCad = new javax.swing.JLabel();
        cbPorteCad = new javax.swing.JComboBox<>();
        lbNumIdCad = new javax.swing.JLabel();
        txtNumIdCad = new javax.swing.JTextField();
        lbDescricaoCad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btSalvarCad = new javax.swing.JButton();
        btCancelarCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTROS");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lbEspecie.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEspecie.setText("ESPECIE");

        cbEspecieCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbEspecieCad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "GATO", "CACHORRO" }));

        lbPorteCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbPorteCad.setText("PORTE");

        cbPorteCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbPorteCad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "PEQUENO", "MEDIO", "GRANDE" }));

        lbNumIdCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNumIdCad.setText("N. DE INDENTIFICAÇÃO:");

        txtNumIdCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lbDescricaoCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbDescricaoCad.setText("INSIRA UMA BREVE DESCRIÇÃO SOBRE O ANIMAL:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        btSalvarCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btSalvarCad.setText("SALVAR");
        btSalvarCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarCadActionPerformed(evt);
            }
        });

        btCancelarCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btCancelarCad.setText("CANCELAR");
        btCancelarCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(221, Short.MAX_VALUE)
                        .addComponent(btSalvarCad)
                        .addGap(19, 19, 19)
                        .addComponent(btCancelarCad))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(lbDescricaoCad)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbNumIdCad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumIdCad))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbEspecie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbEspecieCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbPorteCad)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPorteCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEspecieCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPorteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPorteCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumIdCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNumIdCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addComponent(lbDescricaoCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarCad)
                    .addComponent(btCancelarCad))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // o que fazer quando fechar a janela:
        telaPrincipal.setEnabled(true);
        new FrameHome().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btCancelarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarCadActionPerformed
        // TODO add your handling code here:
        this.dispose();
        telaPrincipal.setEnabled(true);
    }//GEN-LAST:event_btCancelarCadActionPerformed

    private void btSalvarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarCadActionPerformed
        // TODO add your handling code here:
        String descricao = txtDescricao.getText();
        String especie = cbEspecieCad.getSelectedItem().toString();
        String porte = cbPorteCad.getSelectedItem().toString();
        String numId = txtNumIdCad.getText();
        Animais novoCad = new Animais(descricao, especie, porte, numId);

        ControleCadastro controlador = new ControleCadastro();
        if (controlador.cadastrarAnimais(novoCad)) {
            JOptionPane.showMessageDialog(this, "CADASTRO REALIZADO COM SUCESSO!");
            this.dispose();
            telaPrincipal.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "CADASTRO NÃO REALIZADO\nREVISE OS DADOS");
        }
    }//GEN-LAST:event_btSalvarCadActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarCad;
    private javax.swing.JButton btSalvarCad;
    private javax.swing.JComboBox<String> cbEspecieCad;
    private javax.swing.JComboBox<String> cbPorteCad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDescricaoCad;
    private javax.swing.JLabel lbEspecie;
    private javax.swing.JLabel lbNumIdCad;
    private javax.swing.JLabel lbPorteCad;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNumIdCad;
    // End of variables declaration//GEN-END:variables
}
