package com.unifsa.tabalho2notabd;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConsultasView extends javax.swing.JFrame {

    public ConsultasView() {
        initComponents(); 
        setLocationRelativeTo(null);
        carregarRelatorio();
    }

    public void carregarRelatorio() {
    DefaultTableModel modelo = (DefaultTableModel) tabelaDados.getModel();
    modelo.setNumRows(0);

    String sql = "SELECT p.nome AS nome_paciente, t.nome AS nome_terapeuta, " +
                 "c.data_consulta, c.status_consulta, c.valor, c.id_consulta " +
                 "FROM consultas c " +
                 "INNER JOIN pacientes p ON c.fk_id_paciente = p.id_paciente " +
                 "INNER JOIN terapeutas t ON c.fk_id_terapeuta = t.id_terapeuta";

    try (Connection conn = Conexao.getConexao();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("nome_paciente"),
                rs.getString("nome_terapeuta"),
                rs.getDate("data_consulta"),
                rs.getString("status_consulta"),
                rs.getDouble("valor"),
                rs.getInt("id_consulta")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao carregar: " + e.getMessage());
    }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        txtTerapeuta = new javax.swing.JTextField();
        txtPaciente = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        bntSalvar = new javax.swing.JButton();
        bntAtualizar = new javax.swing.JButton();
        bntDeletar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtIDConsulta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CONSULTAS");

        jLabel2.setText("Id terapeuta:");

        jLabel3.setText("Id paciente:");

        jLabel4.setText("Data:");

        jLabel5.setText("Status:");

        jLabel6.setText("Valor:");

        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Paciente", "Terapeuta", "Data", "Status", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        txtTerapeuta.addActionListener(this::txtTerapeutaActionPerformed);

        bntSalvar.setText("SALVAR");
        bntSalvar.addActionListener(this::bntSalvarActionPerformed);

        bntAtualizar.setText("ATUALIZAR");
        bntAtualizar.addActionListener(this::bntAtualizarActionPerformed);

        bntDeletar.setText("DELETAR");
        bntDeletar.addActionListener(this::bntDeletarActionPerformed);

        jButton1.setText("Voltar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        txtIDConsulta.addActionListener(this::txtIDConsultaActionPerformed);

        jLabel7.setText("Id Consulta:");

        jLabel8.setText("Para Atualizar e Deletar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTerapeuta, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtIDConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bntAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bntDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(129, 129, 129)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTerapeuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(bntSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(bntAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntDeletar)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTerapeutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerapeutaActionPerformed
        
    }//GEN-LAST:event_txtTerapeutaActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
    try (Connection conn = Conexao.getConexao()) {
    String sql = "INSERT INTO consultas (fk_id_paciente, fk_id_terapeuta, data_consulta, status_consulta, valor) VALUES (?, ?, ?, ?, ?)";
    PreparedStatement stmt = conn.prepareStatement(sql);

    stmt.setInt(1, Integer.parseInt(txtPaciente.getText()));
    stmt.setInt(2, Integer.parseInt(txtTerapeuta.getText()));
    stmt.setDate(3, java.sql.Date.valueOf(txtData.getText()));
    stmt.setString(4, txtStatus.getText());
    stmt.setDouble(5, Double.parseDouble(txtValor.getText().replace(",", ".")));

    stmt.executeUpdate();
    JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    carregarRelatorio();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
}
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void bntAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarActionPerformed
    try (Connection conn = Conexao.getConexao()) {
    String sql = "UPDATE consultas SET fk_id_paciente=?, fk_id_terapeuta=?, data_consulta=?, status_consulta=?, valor=? WHERE id_consulta=?";
    PreparedStatement stmt = conn.prepareStatement(sql);

    stmt.setInt(1, Integer.parseInt(txtPaciente.getText()));
    stmt.setInt(2, Integer.parseInt(txtTerapeuta.getText()));
    stmt.setDate(3, java.sql.Date.valueOf(txtData.getText()));
    stmt.setString(4, txtStatus.getText());
    stmt.setDouble(5, Double.parseDouble(txtValor.getText().replace(",", ".")));
    stmt.setInt(6, Integer.parseInt(txtIDConsulta.getText()));

    stmt.executeUpdate();
    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
    carregarRelatorio();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
}
    }//GEN-LAST:event_bntAtualizarActionPerformed

    private void bntDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeletarActionPerformed
    try (Connection conn = Conexao.getConexao()) {
    String sql = "DELETE FROM consultas WHERE id_consulta = ?";
    PreparedStatement stmt = conn.prepareStatement(sql);
    
    stmt.setInt(1, Integer.parseInt(txtIDConsulta.getText()));

    int confirm = JOptionPane.showConfirmDialog(null, "Deseja excluir?");
    if (confirm == JOptionPane.YES_OPTION) {
        stmt.executeUpdate();
        carregarRelatorio();
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Erro ao deletar: " + e.getMessage());
}
    }//GEN-LAST:event_bntDeletarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Terapeuta telaAnterior = new Terapeuta();

    telaAnterior.setVisible(true);

    this.dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIDConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDConsultaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("Erro na interface: " + ex.getMessage());
        }
        
        java.awt.EventQueue.invokeLater(() -> new ConsultasView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAtualizar;
    private javax.swing.JButton bntDeletar;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtIDConsulta;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTerapeuta;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
