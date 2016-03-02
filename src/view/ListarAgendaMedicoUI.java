package view;

import controller.ListarAgendaMedicoController;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import model.Clinica;
import model.Consulta;
import model.Medico;

/**
 *
 */
public class ListarAgendaMedicoUI extends javax.swing.JDialog {

    /**
     * Janela principal da aplicação.
     */
    private final java.awt.Frame framePai;

    /**
     * Controlador da funcionalidade que permite registar uma paciente.
     */
    private final ListarAgendaMedicoController controlador;

    /**
     * Creates new form ListarAgendaMedicoUI
     *
     * @param parent
     * @param modal
     * @param clinica
     */
    public ListarAgendaMedicoUI(java.awt.Frame parent, boolean modal, Clinica clinica) {
        super(parent, modal);
        this.framePai = parent;
        this.controlador = new ListarAgendaMedicoController(clinica);
        initComponents();
        propriedadesJanela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListMedicos = new javax.swing.JList<>(this.controlador.getListaMedicos());
        jLabelMedicos = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        jLabelConsultas = new javax.swing.JLabel();
        btnRetroceder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListConsultas = new javax.swing.JList<>();
        jLabelMes = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jListMedicos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListMedicos);

        jLabelMedicos.setText("Escolha o médico para o qual pretende visualizar a agenda:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        jLabelConsultas.setVisible(false);
        jLabelConsultas.setText("Consultas do médico selecionado:");

        btnRetroceder.setVisible(false);
        btnRetroceder.setText("Retroceder");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        jScrollPane2.setVisible(false);

        jListConsultas.setVisible(false);
        jScrollPane2.setViewportView(jListConsultas);

        jLabelMes.setText("Indique o mês:");

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSelecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRetroceder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(jLabelMedicos)
                    .addComponent(jLabelConsultas)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMedicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelConsultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSelecionar)
                    .addComponent(btnRetroceder))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (this.jListMedicos.getSelectedIndex() != -1) {
            int medico = this.jListMedicos.getSelectedValue().getId();
            int mes = this.jComboBoxMes.getSelectedIndex() + 1; // Somar um pois Janeiro tem indice 0.
            ListModel<Consulta> modelo = this.controlador.getListaConsultasMedicoMes(medico, mes);
            this.jListConsultas.setModel(modelo);

            this.jLabelMedicos.setVisible(false);
            this.jListMedicos.setVisible(false);
            this.jScrollPane1.setVisible(false);
            this.jLabelMes.setVisible(false);
            this.jComboBoxMes.setVisible(false);
            this.btnSelecionar.setVisible(false);
            this.jLabelConsultas.setVisible(true);
            this.jListConsultas.setVisible(true);
            this.jScrollPane2.setVisible(true);
            this.btnRetroceder.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Não selecionou um médico.",
                    "Selecionar Médico",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        this.jLabelMedicos.setVisible(true);
        this.jListMedicos.setVisible(true);
        this.jScrollPane1.setVisible(true);
        this.jLabelMes.setVisible(true);
        this.jComboBoxMes.setVisible(true);
        this.btnSelecionar.setVisible(true);
        this.jLabelConsultas.setVisible(false);
        this.jListConsultas.setVisible(false);
        this.jScrollPane2.setVisible(false);
        this.btnRetroceder.setVisible(false);
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void propriedadesJanela() {
        pack();
        setLocation(new Point(this.framePai.getX() + this.framePai.getWidth(), this.framePai.getY()));
        setResizable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JLabel jLabelConsultas;
    private javax.swing.JLabel jLabelMedicos;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JList<Consulta> jListConsultas;
    private javax.swing.JList<Medico> jListMedicos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}