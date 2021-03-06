package view;

import controller.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Cesar A. Villamizar C.
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        this.subjectPanels = new ArrayList<>();
        jTable1.setDefaultRenderer(Object.class, new CustomCellRenderer());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                if (Kairos.showConfirmDialog()) {
                    System.exit(0);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        buttonsPane = new javax.swing.JPanel();
        datePane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        tabsPane = new javax.swing.JTabbedPane();
        file = new javax.swing.JPanel();
        openSesButton = new javax.swing.JButton();
        saveSesButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        newSesButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        saveToExcelButton = new javax.swing.JButton();
        edit = new javax.swing.JPanel();
        cleanButton = new javax.swing.JButton();
        randomChoiseButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        deleteSubjectButton = new javax.swing.JButton();
        AddSubjectButton = new javax.swing.JButton();
        view = new javax.swing.JPanel();
        deactivateButton = new javax.swing.JToggleButton();
        colorByPlacesButton = new javax.swing.JToggleButton();
        progressBarButton = new javax.swing.JToggleButton();
        colorSchedButton = new javax.swing.JToggleButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        help = new javax.swing.JPanel();
        aboutButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Kairos "+controller.Kairos.VERSION);
        setMinimumSize(new java.awt.Dimension(640, 580));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"6:00-7:00", null, null, null, null, null, null, null},
                {"7:00-8:00", null, null, null, null, null, null, null},
                {"8:00-9:00", null, null, null, null, null, null, null},
                {"9:00-10:00", null, null, null, null, null, null, null},
                {"10:00-11:00", null, null, null, null, null, null, null},
                {"11:00-12:00", null, null, null, null, null, null, null},
                {"12:00-13:00", null, null, null, null, null, null, null},
                {"13:00-14:00", null, null, null, null, null, null, null},
                {"14:00-15:00", null, null, null, null, null, null, null},
                {"15:00-16:00", null, null, null, null, null, null, null},
                {"16:00-17:00", null, null, null, null, null, null, null},
                {"17:00-18:00", null, null, null, null, null, null, null},
                {"18:00-19:00", null, null, null, null, null, null, null},
                {"19:00-20:00", null, null, null, null, null, null, null},
                {"20:00-21:00", null, null, null, null, null, null, null},
                {"21:00-22:00", null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(60);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Hora");
            jTable1.getColumnModel().getColumn(1).setMinWidth(60);
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Lunes");
            jTable1.getColumnModel().getColumn(2).setMinWidth(60);
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Martes");
            jTable1.getColumnModel().getColumn(3).setMinWidth(60);
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Miércoles");
            jTable1.getColumnModel().getColumn(4).setMinWidth(60);
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Jueves");
            jTable1.getColumnModel().getColumn(5).setMinWidth(60);
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Viernes");
            jTable1.getColumnModel().getColumn(6).setMinWidth(60);
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Sábado");
            jTable1.getColumnModel().getColumn(7).setMinWidth(60);
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Domingo");
        }

        buttonsPane.setLayout(new javax.swing.BoxLayout(buttonsPane, javax.swing.BoxLayout.X_AXIS));
        jScrollPane2.setViewportView(buttonsPane);

        jLabel1.setText("(Número del grupo - Nombre del docente)                 Grupos actualizados el dia:");

        dateLabel.setText("--/--/--  --:--");

        javax.swing.GroupLayout datePaneLayout = new javax.swing.GroupLayout(datePane);
        datePane.setLayout(datePaneLayout);
        datePaneLayout.setHorizontalGroup(
            datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        datePaneLayout.setVerticalGroup(
            datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(dateLabel))
        );

        openSesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/open alt.png"))); // NOI18N
        openSesButton.setText("Abrir sesión");
        openSesButton.setToolTipText("Abre una sesión anterior");
        openSesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        openSesButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        openSesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openSesButtonActionPerformed(evt);
            }
        });

        saveSesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/Save.png"))); // NOI18N
        saveSesButton.setText("Guardar sesión");
        saveSesButton.setToolTipText("Guarda tu sesión");
        saveSesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveSesButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveSesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSesButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/quit.png"))); // NOI18N
        exitButton.setText("Salir");
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        newSesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/new doc.png"))); // NOI18N
        newSesButton.setText("Nuevo");
        newSesButton.setToolTipText("Inicia una nueva sesión");
        newSesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newSesButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newSesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSesButtonActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        saveToExcelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/excelSaving.png"))); // NOI18N
        saveToExcelButton.setText("Exportar horario");
        saveToExcelButton.setToolTipText("Guarda tu horario en Excel");
        saveToExcelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveToExcelButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveToExcelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToExcelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fileLayout = new javax.swing.GroupLayout(file);
        file.setLayout(fileLayout);
        fileLayout.setHorizontalGroup(
            fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newSesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openSesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveSesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveToExcelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fileLayout.setVerticalGroup(
            fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileLayout.createSequentialGroup()
                .addGroup(fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(saveSesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(openSesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newSesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveToExcelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabsPane.addTab("Archivo", file);

        cleanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/gnome_edit_clear.png"))); // NOI18N
        cleanButton.setText("Limpiar selección");
        cleanButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cleanButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });

        randomChoiseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/knob_shuffle_on.png"))); // NOI18N
        randomChoiseButton.setText("Aleatorio");
        randomChoiseButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        randomChoiseButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        randomChoiseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomChoiseButtonActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11))
        );

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/refresh.png"))); // NOI18N
        refreshButton.setText("Actualizar grupos");
        refreshButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        deleteSubjectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/minus white.png"))); // NOI18N
        deleteSubjectButton.setText("Eliminar asignatura");
        deleteSubjectButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteSubjectButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSubjectButtonActionPerformed(evt);
            }
        });

        AddSubjectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/plus.png"))); // NOI18N
        AddSubjectButton.setText("Agregar asignatura");
        AddSubjectButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddSubjectButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubjectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(randomChoiseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cleanButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddSubjectButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteSubjectButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cleanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(randomChoiseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(editLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteSubjectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddSubjectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabsPane.addTab("Edición", edit);

        deactivateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/sad.png"))); // NOI18N
        deactivateButton.setText("Filtrar por cupos");
        deactivateButton.setToolTipText("Desactiva los grupos sin cupos disponibles");
        deactivateButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deactivateButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deactivateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deactivateButtonActionPerformed(evt);
            }
        });

        colorByPlacesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/colorFont.png"))); // NOI18N
        colorByPlacesButton.setText("Color por cupos");
        colorByPlacesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        colorByPlacesButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        colorByPlacesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorByPlacesButtonActionPerformed(evt);
            }
        });

        progressBarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/progress.png"))); // NOI18N
        progressBarButton.setText("Barra de cupos");
        progressBarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        progressBarButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        progressBarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progressBarButtonActionPerformed(evt);
            }
        });

        colorSchedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/color.png"))); // NOI18N
        colorSchedButton.setSelected(true);
        colorSchedButton.setText("Horario a color");
        colorSchedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        colorSchedButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        colorSchedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorSchedButtonActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deactivateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorByPlacesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorSchedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressBarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorByPlacesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deactivateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorSchedButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(viewLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabsPane.addTab("Vista", view);

        aboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/info.png"))); // NOI18N
        aboutButton.setText("Acerca de");
        aboutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aboutButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        javax.swing.GroupLayout helpLayout = new javax.swing.GroupLayout(help);
        help.setLayout(helpLayout);
        helpLayout.setHorizontalGroup(
            helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 648, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        helpLayout.setVerticalGroup(
            helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpLayout.createSequentialGroup()
                .addGroup(helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(helpLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        tabsPane.addTab("Ayuda", help);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(datePane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabsPane)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        clearSelection();
    }//GEN-LAST:event_cleanButtonActionPerformed

    private void randomChoiseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomChoiseButtonActionPerformed
        randomChoise();
    }//GEN-LAST:event_randomChoiseButtonActionPerformed

    private void newSesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSesButtonActionPerformed
        if (Kairos.showConfirmDialog()) {
            Kairos.getSubjects().clear();
            this.dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new NewSesion().setVisible(true);
                }
            });
        }
    }//GEN-LAST:event_newSesButtonActionPerformed

    private void openSesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openSesButtonActionPerformed
        if (Kairos.showConfirmDialog() && Kairos.cargarSesion()) {
            clearTable();
            deactivateViewFeatures();
            init();
        }
    }//GEN-LAST:event_openSesButtonActionPerformed

    private void saveSesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSesButtonActionPerformed
        Kairos.guardarSesion();
    }//GEN-LAST:event_saveSesButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        if (Kairos.showConfirmDialog()) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void deactivateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deactivateButtonActionPerformed
        filterByPlaces = !filterByPlaces;
        actualizarBotones();
    }//GEN-LAST:event_deactivateButtonActionPerformed

    private void colorByPlacesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorByPlacesButtonActionPerformed
        colorByPlaces = !colorByPlaces;
        for (Asignatura mat : Kairos.getSubjects()) {
            for (Button boton : mat.getButtons()) {
                boton.colorButton(colorByPlaces);
            }
        }
    }//GEN-LAST:event_colorByPlacesButtonActionPerformed

    private void progressBarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progressBarButtonActionPerformed
        progressBar = !progressBar;
        for (Asignatura mat : Kairos.getSubjects()) {
            for (Button boton : mat.getButtons()) {
                boton.enableProgressBar(progressBar);
            }
        }
    }//GEN-LAST:event_progressBarButtonActionPerformed

    private void colorSchedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorSchedButtonActionPerformed
        colorSched = !colorSched;
        if (colorSched) {
            jTable1.setDefaultRenderer(Object.class, new CustomCellRenderer());
        } else {
            jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer());
        }
        jTable1.repaint();
    }//GEN-LAST:event_colorSchedButtonActionPerformed

    private void saveToExcelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToExcelButtonActionPerformed
        Kairos.saveExcel();
    }//GEN-LAST:event_saveToExcelButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        new About(this, true).setVisible(true);
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        dateLabel.setText("ACTUALIZANDO GRUPOS, ESPERE...");
        dateLabel.setForeground(Color.red);

        class MyWorker extends SwingWorker {

            @Override
            protected String doInBackground() {
                SIAConnection sia;
                int retry = 1;
                while (retry == 1) {
                    try {
                        sia = new SIAConnection();
                        for (Asignatura asig : Kairos.getSubjects()) {
                            sia.asignaturaCompleta(asig);
                        }
                        Kairos.setSesionDate(new java.util.GregorianCalendar().getTime());
                        Kairos.setSavedSesion(false);
                        retry = 0;

                    } catch (Exception ex) {
                        retry = NewSesion.showConnectionProblemDialog(new javax.swing.JFrame());
                    }
                }
                return "Done";
            }

            @Override
            protected void done() {
                clearTable();
                deactivateViewFeatures();
                init();

                dateLabel.setForeground(null);
                if (Kairos.getSessionDate() != null) {
                    dateLabel.setText(sdf.format(Kairos.getSessionDate()));

                } else {
                    dateLabel.setText("--/--/--  --:--");
                }
            }
        }
        new MyWorker().execute();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSubjectButtonActionPerformed
        new DeleteSubject(this, true, subjectPanels).setVisible(true);
    }//GEN-LAST:event_deleteSubjectButtonActionPerformed

    private void AddSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubjectButtonActionPerformed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewSesion().setVisible(true);
            }
        });
    }//GEN-LAST:event_AddSubjectButtonActionPerformed

    public void init() {
        if (Kairos.getSessionDate() != null) {
            this.dateLabel.setText(sdf.format(Kairos.getSessionDate()));
        } else {
            this.dateLabel.setText("--/--/--  --:--");
        }
        this.buttonsPane.removeAll();
        this.buttonsPane.add(Box.createRigidArea(new Dimension(15, 0)));
        this.subjectPanels.clear();
        for (Asignatura asig : Kairos.getSubjects()) {
            SubjectPanel panel = new SubjectPanel(this, asig);
            this.subjectPanels.add(panel);
            this.buttonsPane.add(panel);
            this.buttonsPane.add(Box.createHorizontalGlue());
            this.buttonsPane.add(Box.createRigidArea(new Dimension(15, 0)));
        }
        this.buttonsPane.validate();
        for (Asignatura asig : Kairos.getSubjects()) {
            if (asig.getSelected() != null) {
                Button bot = asig.getSelected();
                asig.setSelected(null);
                bot.doClick();
            }
        }
        this.buttonsPane.repaint();
    }

    public void paintBloq(Button boton) {
        Group grupo = boton.getGrupo();
        for (Block bloque : grupo.getHorario()) {
            Block value = null;
            if (boton.isSelected()) {
                value = bloque;
            }
            for (int j = bloque.getHora(); j < bloque.getHoraFin(); j++) {
                jTable1.setValueAt(value, j - 6, bloque.getDia());
            }
        }
    }

    private void clearSelection() {
        for (Asignatura asig : Kairos.getSubjects()) {
            if (asig.getSelected() != null) {
                asig.getSelected().doClick();
            }
        }
    }

    private void deactivateViewFeatures() {
        if (filterByPlaces) {
            deactivateButton.doClick();
        }
        if (colorByPlaces) {
            colorByPlacesButton.doClick();
        }
        if (progressBar) {
            progressBarButton.doClick();
        }
        if (!colorSched) {
            colorSchedButton.doClick();
        }
    }

    private void clearTable() {
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < 16; j++) {
                jTable1.setValueAt(null, j, i);
            }
        }
    }

    private void randomChoise() {
        for (Asignatura materia : Kairos.getSubjects()) {
            if (materia.getSelected() == null) {
                ArrayList<Button> botones = new ArrayList<>();
                for (Button bot : materia.getButtons()) {
                    if (bot.isEnabled()) {
                        botones.add(bot);
                    }
                }
                if (!botones.isEmpty()) {
                    Random rand = new Random();
                    Button bot = botones.get(rand.nextInt(botones.size()));
                    bot.doClick();
                }
            }
        }
    }

    private void actualizarBotones() {
        for (Asignatura mat : Kairos.getSubjects()) {
            for (Button boton : mat.getButtons()) {
                onOffButton(boton);
            }
        }
    }

    private void onOffButton(Button boton) {
        boolean p = boton.getConflictiveAmount() == 0; // V= no tiene conflictos
        boolean r = boton.isSelected(); // V= boton actual esta activo
        boolean s = boton.getGrupo().getCupos() > 0;// V= el grupo tiene cupos disponibles
        if (r || (p && (!filterByPlaces || s))) {
            boton.setEnabled(true);
        } else {
            boton.setEnabled(false);
        }
    }

    public void selectButton(Button bot) {
        for (Button b : bot.getOverlapped()) {
            if (bot.isSelected()) {
                b.addConflictive();
            } else {
                b.removeConflictive();
            }
            onOffButton(b);
        }
    }

    public void deteleSubject(SubjectPanel panel) {
        Button b = panel.getSubject().getSelected();
        if (b != null) {
            b.doClick();
        }
        Kairos.getSubjects().remove(panel.getSubject());
        this.buttonsPane.removeAll();
        this.buttonsPane.add(Box.createRigidArea(new Dimension(15, 0)));
        for (SubjectPanel pan : this.subjectPanels) {
            this.buttonsPane.add(pan);
            this.buttonsPane.add(Box.createHorizontalGlue());
            this.buttonsPane.add(Box.createRigidArea(new Dimension(15, 0)));
        }
        this.buttonsPane.validate();
        Kairos.setSavedSesion(false);
    }

    private ArrayList<SubjectPanel> subjectPanels;
    private boolean colorSched = true;
    private boolean colorByPlaces = false;
    private boolean progressBar = false;
    private boolean filterByPlaces = false;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy  HH:mm");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSubjectButton;
    private javax.swing.JButton aboutButton;
    private javax.swing.JPanel buttonsPane;
    private javax.swing.JButton cleanButton;
    private javax.swing.JToggleButton colorByPlacesButton;
    private javax.swing.JToggleButton colorSchedButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JPanel datePane;
    private javax.swing.JToggleButton deactivateButton;
    private javax.swing.JButton deleteSubjectButton;
    private javax.swing.JPanel edit;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel file;
    private javax.swing.JPanel help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton newSesButton;
    private javax.swing.JButton openSesButton;
    private javax.swing.JToggleButton progressBarButton;
    private javax.swing.JButton randomChoiseButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveSesButton;
    private javax.swing.JButton saveToExcelButton;
    private javax.swing.JTabbedPane tabsPane;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables
}

class CustomCellRenderer extends DefaultTableCellRenderer {

    private final Color alt2 = new Color(242, 242, 242);
    private final Color alt1 = Color.WHITE;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cr = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (column > 0) {
            if (value != null) {
                Block b = (Block) value;
                Color color = b.getColors()[0];
                setBackground(color);
                setForeground(b.getColors()[1]);

            } else {
                setBackground(colorAlternator(row));
                setForeground(Color.BLACK);
            }
        } else {
            setBackground(colorAlternator(row));
            setForeground(Color.BLACK);
        }
        return cr;
    }

    private Color colorAlternator(int row) {
        if ((row % 2) == 0) {
            return alt1;
        } else {
            return alt2;
        }
    }
}
