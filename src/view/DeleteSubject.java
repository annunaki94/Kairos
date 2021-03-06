

package view;

import java.util.ArrayList;

/**
 *
 * @author Cesar A. Villamizar C.
 */
public class DeleteSubject extends javax.swing.JDialog {

    public DeleteSubject(java.awt.Frame parent, boolean modal,ArrayList<SubjectPanel> panels) {
        super(parent, modal);
        initComponents();
        this.panels=panels;
        refreshList();
        this.setLocationRelativeTo(null);
    }
    
    private void refreshList(){
        javax.swing.DefaultListModel listModel = new javax.swing.DefaultListModel();        
        for(SubjectPanel panel : panels){
            listModel.addElement(panel);            
        }
        this.subjectsList.setModel(listModel);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectsList = new javax.swing.JList();
        doneButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar asignaturas");
        setResizable(false);

        jLabel1.setText("Seleccione la(s) asignatura(s) a eliminar:");

        deleteButton.setText("Eliminar selección");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        subjectsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(subjectsList);

        doneButton.setText("Hecho");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doneButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(doneButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        for(Object panel: subjectsList.getSelectedValuesList()){
            panels.remove((SubjectPanel)panel);
            ((MainFrame)this.getParent()).deteleSubject((SubjectPanel)panel);            
        }        
        refreshList();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void subjectsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectsListMouseClicked
        javax.swing.JList list = (javax.swing.JList) evt.getSource();
        if (evt.getClickCount() == 2) {
            deleteButtonActionPerformed(null);
        }
    }//GEN-LAST:event_subjectsListMouseClicked

    private ArrayList<SubjectPanel> panels;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList subjectsList;
    // End of variables declaration//GEN-END:variables
}
