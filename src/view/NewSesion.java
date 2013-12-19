package view;

import controller.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Cesar A. Villamizar C.
 */
public class NewSesion extends javax.swing.JFrame {

    /**
     * Creates new form NewSesion
     */
    public NewSesion() {
        initComponents();
        if(Kairos.getSubjects()!=null&&!Kairos.getSubjects().isEmpty());{
            for(Asignatura asig: Kairos.getSubjects()){
                Asignatura a= new Asignatura(asig.getNombre(),asig.getCodigo());
                a.setCreditos(asig.getCreditos());
                asignaturasToAdd.add(a);
                }
            refreshToAddList();
        }
        
        jProgressBar1.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionButtonPane = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        searchPane = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        addRemovePane = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        removeAllButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        creditsLabel1 = new javax.swing.JLabel();
        creditsLabel = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        resultsScrollPane = new javax.swing.JScrollPane();
        resultsList = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        toAddScrollPane = new javax.swing.JScrollPane();
        toAddList = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kairos "+Kairos.VERSION);
        setMinimumSize(new java.awt.Dimension(655, 520));

        okButton.setText("INICIAR");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Cargar archivo de sesión");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        jProgressBar1.setIndeterminate(true);

        javax.swing.GroupLayout optionButtonPaneLayout = new javax.swing.GroupLayout(optionButtonPane);
        optionButtonPane.setLayout(optionButtonPaneLayout);
        optionButtonPaneLayout.setHorizontalGroup(
            optionButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionButtonPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okButton)
                .addContainerGap())
        );
        optionButtonPaneLayout.setVerticalGroup(
            optionButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionButtonPaneLayout.createSequentialGroup()
                .addGroup(optionButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionButtonPaneLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(optionButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(okButton)
                            .addComponent(loadButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionButtonPaneLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese parte del nombre o código de la asignatura que desea buscar:");

        searchButton.setText("Buscar");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPaneLayout = new javax.swing.GroupLayout(searchPane);
        searchPane.setLayout(searchPaneLayout);
        searchPaneLayout.setHorizontalGroup(
            searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPaneLayout.createSequentialGroup()
                        .addComponent(searchTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton))
                    .addGroup(searchPaneLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        searchPaneLayout.setVerticalGroup(
            searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(20, 20, 20))
        );

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/plus.png"))); // NOI18N
        addButton.setText("Agregar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/minus white.png"))); // NOI18N
        removeButton.setText(" Eliminar");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        removeAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/edit_clear.png"))); // NOI18N
        removeAllButton.setText("Limpiar");
        removeAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Créditos totales:");

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.X_AXIS));
        jPanel4.add(filler1);

        creditsLabel1.setFont(new java.awt.Font("Serif", 0, 24));
        creditsLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/numbers/0.png"))); // NOI18N
        jPanel4.add(creditsLabel1);

        creditsLabel.setFont(new java.awt.Font("Serif", 0, 24));
        creditsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/numbers/0.png"))); // NOI18N
        jPanel4.add(creditsLabel);
        jPanel4.add(filler2);

        javax.swing.GroupLayout addRemovePaneLayout = new javax.swing.GroupLayout(addRemovePane);
        addRemovePane.setLayout(addRemovePaneLayout);
        addRemovePaneLayout.setHorizontalGroup(
            addRemovePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(removeAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(addRemovePaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addRemovePaneLayout.setVerticalGroup(
            addRemovePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRemovePaneLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(addButton)
                .addGap(2, 2, 2)
                .addComponent(removeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeAllButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setText("Resultados de la búsqueda:");

        jLabel5.setText("(Créditos:Nombre de la Asignatura)");

        resultsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultsListMouseClicked(evt);
            }
        });
        resultsScrollPane.setViewportView(resultsList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(resultsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultsScrollPane))
        );

        jLabel3.setText("(Créditos:Nombre de la Asignatura)");

        jLabel2.setText("Asignaturas a agregar:");

        toAddList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toAddListMouseClicked(evt);
            }
        });
        toAddScrollPane.setViewportView(toAddList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(toAddScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toAddScrollPane))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionButtonPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(119, 119, 119))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addRemovePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchPane, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addRemovePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionButtonPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchParameter = searchTextField.getText().replaceAll("-", "").replaceAll("%", "");
        if (searchParameter.length() >= 3) {
            class MyWorker extends SwingWorker {

                @Override
                protected String doInBackground() {
                    jProgressBar1.setVisible(true);
                    jLabel6.setText("Buscando...");
                    allButtonsSetEnable(false);
                    try {
                        asignaturas = buscador.buscarAsignaturas(searchParameter);
                    } catch (IOException ex) {
                        JFrame frame = new JFrame();
                        JOptionPane.showMessageDialog(frame, "No se ha podido establecer conexión con el servidor.\nCargue una sesion manualmente o vuelva a intentarlo mas tarde.", "Error de conexión", JOptionPane.WARNING_MESSAGE);
                    } finally {
                        return "Done.";
                    }
                }

                @Override
                protected void done() {
                    allButtonsSetEnable(true);
                    jProgressBar1.setVisible(false);
                    jLabel6.setText("");
                    refreshResultsList();
                }
            }
            new MyWorker().execute();
        } else {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Digite mínimo 3 caracteres.", "Busqueda inválida", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        if (Kairos.cargarSesion()) {
            invokeMainFrame();
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        searchButtonActionPerformed(evt);
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (!asignaturasToAdd.isEmpty()) {
            Kairos.getSubjects().clear();
            class MyWorker extends SwingWorker {

                @Override
                protected String doInBackground() {
                    jProgressBar1.setVisible(true);
                    allButtonsSetEnable(false);
                    try {
                        for (Asignatura asig : asignaturasToAdd) {
                            jLabel6.setText("Cargando \"" + asig.getNombre() + "\"...");
                            Kairos.getSubjects().add(buscador.asignaturaCompleta(asig));
                        }
                        Kairos.setSesionDate(new GregorianCalendar().getTime());
                        Kairos.setSavedSesion(false);
                        invokeMainFrame();
                    } catch (IOException ex) {
                        JFrame frame = new JFrame();
                        JOptionPane.showMessageDialog(frame, "No se ha podido establecer conexión con el servidor.\nCargue una sesion manualmente o vuelva a intentarlo mas tarde.", "Error de conexión", JOptionPane.WARNING_MESSAGE);
                        allButtonsSetEnable(true);
                        jProgressBar1.setVisible(false);
                        jLabel6.setText("");
                        Kairos.getSubjects().clear();
                    } finally {
                        return "Done.";
                    }
                }

                @Override
                protected void done() {
                }
            }
            new MyWorker().execute();
        } else {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Agregue una o mas asignaturas o cargue una sesión anterior para continuar.", "No hay asignaturas seleccionadas", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void resultsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultsListMouseClicked
        javax.swing.JList list = (javax.swing.JList) evt.getSource();
        if (evt.getClickCount() == 2) {
            addSubjectToSelection((Asignatura) list.getSelectedValue());
            refreshToAddList();
        }
    }//GEN-LAST:event_resultsListMouseClicked

    private void toAddListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toAddListMouseClicked
        javax.swing.JList list = (javax.swing.JList) evt.getSource();
        if (evt.getClickCount() == 2) {
            asignaturasToAdd.remove((Asignatura) list.getSelectedValue());
            refreshToAddList();
        }
    }//GEN-LAST:event_toAddListMouseClicked

    private void removeAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllButtonActionPerformed
        asignaturasToAdd.clear();
        refreshToAddList();
    }//GEN-LAST:event_removeAllButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        for (Object selected : toAddList.getSelectedValuesList()) {
            asignaturasToAdd.remove((Asignatura) selected);
        }
        refreshToAddList();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        for (Object selected : resultsList.getSelectedValuesList()) {
            addSubjectToSelection((Asignatura) selected);
        }
        refreshToAddList();
    }//GEN-LAST:event_addButtonActionPerformed
   
    private void addSubjectToSelection(Asignatura toAdd) {
        int credits= toAdd.getCreditos();
        for (Asignatura a : asignaturasToAdd) {
            credits+=a.getCreditos();
            if(a.equals(toAdd)){
                return;
            }
            if (credits>Kairos.MAX_CREDITS) {
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, "Máximo de "+Kairos.MAX_CREDITS+" créditos alcanzados", "Creditos máximos", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        asignaturasToAdd.add(toAdd);        
    }

    private void allButtonsSetEnable(boolean b) {
        okButton.setEnabled(b);
        addButton.setEnabled(b);
        removeButton.setEnabled(b);
        removeAllButton.setEnabled(b);
        searchButton.setEnabled(b);
        loadButton.setEnabled(b);
    }

    private void showCredits() {
        int creditos = 0;
        if (!asignaturasToAdd.isEmpty()) {
            for (Asignatura a : asignaturasToAdd) {
                creditos += a.getCreditos();
            }
        }
        int creditsDec= creditos/10;
        creditos=creditos%10;
        creditsLabel.setIcon(getNumberIcon(creditos));
        creditsLabel1.setIcon(getNumberIcon(creditsDec));
    }

    private void invokeMainFrame() {
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame fr = new MainFrame();
                fr.setExtendedState(MAXIMIZED_BOTH);
                fr.setVisible(true);
                fr.init();
            }
        });
    }

    private void refreshToAddList() {
        javax.swing.DefaultListModel listModel = new javax.swing.DefaultListModel();
        for (Asignatura a : asignaturasToAdd) {
            listModel.addElement(a);
        }
        toAddList.setModel(listModel);
        showCredits();
        jLabel2.setText("Asignaturas a agregar: " + asignaturasToAdd.size());
    }

    private void refreshResultsList() {
        javax.swing.DefaultListModel listModel = new javax.swing.DefaultListModel();
        resultsList.setModel(listModel);
        for (Asignatura asig : asignaturas) {
            listModel.addElement(asig);
        }
        jLabel4.setText("Resultados de la búsqueda: " + asignaturas.size());
    }
    
    private javax.swing.ImageIcon getNumberIcon(int i){
        javax.swing.ImageIcon icn= new javax.swing.ImageIcon(getClass().getResource("/view/icon/numbers/0.png"));
        if(i>0&&i<10){
            icn= new javax.swing.ImageIcon(getClass().getResource("/view/icon/numbers/"+i+".png"));
        }
        return icn;
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewSesion().setVisible(true);
            }
        });
    }
    private String searchParameter = null;
    private Buscador buscador = new Buscador();
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private ArrayList<Asignatura> asignaturasToAdd = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addRemovePane;
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JLabel creditsLabel1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel optionButtonPane;
    private javax.swing.JButton removeAllButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JList resultsList;
    private javax.swing.JScrollPane resultsScrollPane;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPane;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JList toAddList;
    private javax.swing.JScrollPane toAddScrollPane;
    // End of variables declaration//GEN-END:variables
}