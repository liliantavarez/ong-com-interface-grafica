package Telas;

import controle.ArmazenamentoDeDados;
import controle.ControleCadastro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import objetos.Animais;

public class FrameCadastrados extends javax.swing.JFrame {

    private FrameHome telaPrincipal;

    /**
     * Creates new form FrameCadastrados
     */
    public FrameCadastrados() {
        initComponents();
        carregarTabela();
        DefaultTableModel modelo = (DefaultTableModel)tbCadastro.getModel();
        tbCadastro.setRowSorter(new TableRowSorter(modelo) );
        }

    public FrameCadastrados(FrameHome telaPrincipal) {
        this();
        this.telaPrincipal = telaPrincipal;

    }

    private void carregarTabela() {
        ArrayList<Animais> lista = ArmazenamentoDeDados.getInstance().animaisCadastrados();

        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("ESPÉCIE");
        modelo.addColumn("PORTE");
        modelo.addColumn("DESCRIÇÃO");

        if (lista.size() == 0) {
            modelo.addRow(new String[]{"Sem dados",
                null,
                null,
                null,
                null});
        }

        for (int i = 0; i < lista.size(); i++) {
            Animais novo = lista.get(i);
            //System.out.println(p.toString());
            // Alimenta as linhas de dados  
            modelo.addRow(new String[]{novo.getNumId(),
                novo.getEspecie() + "",
                novo.getPorte(),
                novo.getDescricao() + ""});
        }

        tbCadastro.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jFrame1 = new javax.swing.JFrame();
        lbEspecie = new javax.swing.JLabel();
        cbEspecieCad = new javax.swing.JComboBox<>();
        lbPorteCad = new javax.swing.JLabel();
        cbPorteCad = new javax.swing.JComboBox<>();
        lbNumIdCad = new javax.swing.JLabel();
        txtNumIdCad = new javax.swing.JTextField();
        lbDescricaoCad = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btSalvarCad = new javax.swing.JButton();
        btCancelarCad = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCadastro = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setTitle("CADASTROS");
        jFrame1.setResizable(false);
        jFrame1.setSize(new java.awt.Dimension(0, 0));
        jFrame1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jFrame1formWindowClosed(evt);
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
        jScrollPane2.setViewportView(txtDescricao);

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

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addContainerGap(221, Short.MAX_VALUE)
                        .addComponent(btSalvarCad)
                        .addGap(19, 19, 19)
                        .addComponent(btCancelarCad))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(lbDescricaoCad)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(lbNumIdCad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumIdCad))
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(lbEspecie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbEspecieCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbPorteCad)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPorteCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEspecieCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPorteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPorteCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumIdCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(lbNumIdCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addComponent(lbDescricaoCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarCad)
                    .addComponent(btCancelarCad))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRADOS");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTitulo.setText("ANIMAIS CADASTRADOS");

        tbCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "ESPÉCIE", "PORTE", "DESCRIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCadastro);

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbTitulo)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVoltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        telaPrincipal.setEnabled(true);
        new FrameHome().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        telaPrincipal.setEnabled(true);
    }//GEN-LAST:event_btVoltarActionPerformed

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

    private void btCancelarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarCadActionPerformed
        // TODO add your handling code here:
        this.dispose();
        telaPrincipal.setEnabled(true);
    }//GEN-LAST:event_btCancelarCadActionPerformed

    private void jFrame1formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1formWindowClosed
        // o que fazer quando fechar a janela:
        telaPrincipal.setEnabled(true);
        new FrameHome().setVisible(true);
    }//GEN-LAST:event_jFrame1formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarCad;
    private javax.swing.JButton btSalvarCad;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbEspecieCad;
    private javax.swing.JComboBox<String> cbPorteCad;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDescricaoCad;
    private javax.swing.JLabel lbEspecie;
    private javax.swing.JLabel lbNumIdCad;
    private javax.swing.JLabel lbPorteCad;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbCadastro;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNumIdCad;
    // End of variables declaration//GEN-END:variables
}
