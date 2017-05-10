package restaurante;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Bienvenida extends javax.swing.JFrame {

    public Bienvenida() {
        initComponents();

    }
    ArrayList<String> r = new ArrayList<>();

    String direccion = "src\\archivos\\registro.txt";
    File registrom = new File(direccion);
    String direccion2 = "src\\archivos\\camareros.txt";
    File archivo2 = new File(direccion2);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registro = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        clave1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        coclave1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        guardar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        clave2 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        coclave2 = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        guardar2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        clave3 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        coclave3 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nombre3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        guardar3 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        clave4 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        coclave4 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        nombre4 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        guardar4 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        clavegerente = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtclave = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        registro.setMinimumSize(new java.awt.Dimension(710, 650));
        registro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                registroKeyTyped(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("REGISTRO");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 11, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setMinimumSize(new java.awt.Dimension(267, 261));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(clave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 104, 109, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("CLave");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 106, -1, -1));
        jPanel2.add(coclave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 142, 107, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Confirmar clave");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });
        nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre1KeyTyped(evt);
            }
        });
        jPanel2.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 110, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("MESERO 1");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        guardar1.setBackground(new java.awt.Color(255, 255, 255));
        guardar1.setText("Guardar");
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });
        jPanel2.add(guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mesas:(1,2,3,4,5)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 61, 313, 261));

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMinimumSize(new java.awt.Dimension(267, 261));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(clave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 104, 109, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("CLave");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 106, -1, -1));
        jPanel5.add(coclave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 142, 107, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Confirmar clave");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Nombre");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        nombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre2KeyTyped(evt);
            }
        });
        jPanel5.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 110, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("MESERO 2");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        guardar2.setText("Guardar");
        guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar2ActionPerformed(evt);
            }
        });
        jPanel5.add(guardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Mesas:(6,7,8,9,10)");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 61, 319, 261));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMinimumSize(new java.awt.Dimension(267, 261));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(clave3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 104, 109, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("CLave");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 106, -1, -1));
        jPanel6.add(coclave3, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 142, 107, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Confirmar clave");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Nombre");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        nombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre3ActionPerformed(evt);
            }
        });
        nombre3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre3KeyTyped(evt);
            }
        });
        jPanel6.add(nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 110, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("MESERO 3");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        guardar3.setBackground(new java.awt.Color(255, 255, 255));
        guardar3.setText("Guardar");
        guardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar3ActionPerformed(evt);
            }
        });
        jPanel6.add(guardar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Mesas:(11,12,13,14,15)");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 333, 313, 233));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setMinimumSize(new java.awt.Dimension(267, 261));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(clave4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 104, 109, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("CLave");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 106, -1, -1));
        jPanel3.add(coclave4, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 142, 107, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Confirmar clave");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Nombre");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        nombre4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre4KeyTyped(evt);
            }
        });
        jPanel3.add(nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 110, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("MESERO 4");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        guardar4.setBackground(new java.awt.Color(255, 255, 255));
        guardar4.setText("Guardar");
        guardar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar4ActionPerformed(evt);
            }
        });
        jPanel3.add(guardar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Mesas:(16,17,18,19,20)");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 333, 319, 233));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, -1, -1));

        javax.swing.GroupLayout registroLayout = new javax.swing.GroupLayout(registro.getContentPane());
        registro.getContentPane().setLayout(registroLayout);
        registroLayout.setHorizontalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        registroLayout.setVerticalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(637, 445));
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("REGISTRO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 320, 130, 38);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("GERENTE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Digite la clave:");
        jLabel10.setToolTipText("");

        clavegerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clavegerenteActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Iniciar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clavegerente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jButton5)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel9)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(3, 3, 3)
                .addComponent(clavegerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(350, 120, 260, 152);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("MESEROS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Inicio de sesión:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Digite clave");

        jLabel25.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtclave, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txtnombre))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(21, 21, 21))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 120, 270, 208);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROSPERY'S RESTAURANT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 510, 67);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel29);
        jLabel29.setBounds(0, 2, 640, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void mostrarError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        registro.dispose();
        this.setVisible(true);
        for (int i = 0; i < r.size(); i++) {
            System.out.println(r.get(i));
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    static public String nombre;
    static public String solonum = "";
    static public String numeromesero;

    private void guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar1ActionPerformed
        // mesero1
        String n1 = nombre1.getText();
        String c1 = clave1.getText();
        String cc1 = coclave1.getText();

        ImageIcon guardado = new ImageIcon("src\\imagenes\\aprobado.png");
        if (!"".equals(n1) && !"".equals(c1) && !"".equals(cc1)) {

            if (c1.equals(cc1)) {

                EscribirArchivo(n1, c1, "1");

                guardar1.setEnabled(false);

                jPanel2.setBackground(Color.GREEN);

                nombre1.setText("");
                clave1.setText("");
                coclave1.setText("");

                JOptionPane.showMessageDialog(null, " guardado ", "", JOptionPane.INFORMATION_MESSAGE, guardado);
            } else {
                JOptionPane.showMessageDialog(null, " Las Contraseñas no coinciden" + JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, " Debe llenar todos los campos" + JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_guardar1ActionPerformed

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed

    }//GEN-LAST:event_nombre1ActionPerformed

    private void registroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registroKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_registroKeyTyped

    private void nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se pueden escribir numeros", "ERROR", ERROR_MESSAGE);
            nombre1.setCursor(null);
        }
    }//GEN-LAST:event_nombre1KeyTyped

    private void guardar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar4ActionPerformed
        // mesero4

        String n4 = nombre4.getText();
        String c4 = clave4.getText();
        String cc4 = coclave4.getText();
        ImageIcon guardado = new ImageIcon("src\\imagenes\\aprobado.png");
        if (!"".equals(n4) && !"".equals(c4) && !"".equals(cc4)) {

            if (c4.equals(cc4)) {
                EscribirArchivo(n4, c4, "4");

                guardar4.setEnabled(false);
                jPanel3.setBackground(Color.GREEN);

                nombre4.setText("");
                clave4.setText("");
                coclave4.setText("");

                JOptionPane.showMessageDialog(null, " guardado ", "", JOptionPane.INFORMATION_MESSAGE, guardado);

            } else {
                JOptionPane.showMessageDialog(null, " Las Contraseñas no coinciden" + JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, " Debe llenar todos los campos" + JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_guardar4ActionPerformed

    private void nombre4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre4KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se pueden escribir numeros", "ERROR", ERROR_MESSAGE);
            nombre1.setCursor(null);
        }
    }//GEN-LAST:event_nombre4KeyTyped

    private void guardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar3ActionPerformed
        // mesero3
        String n3 = nombre3.getText();
        String c3 = clave3.getText();
        String cc3 = coclave3.getText();
        ImageIcon guardado = new ImageIcon("src\\imagenes\\aprobado.png");
        if (!"".equals(n3) && !"".equals(c3) && !"".equals(cc3)) {

            if (c3.equals(cc3)) {

                EscribirArchivo(n3, c3, "3");

                jPanel6.setBackground(Color.GREEN);

                guardar3.setEnabled(false);
                nombre3.setText("");
                clave3.setText("");
                coclave3.setText("");

                JOptionPane.showMessageDialog(null, " guardado ", "", JOptionPane.INFORMATION_MESSAGE, guardado);

            } else {
                JOptionPane.showMessageDialog(null, " Las Contraseñas no coinciden" + JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, " Debe llenar todos los campos" + JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_guardar3ActionPerformed

    void EscribirArchivo(String nombre, String clave, String mesero) {
        try (FileWriter bw = new FileWriter(archivo2, true)) {
            Object N = nombre;
            Object C = clave;
            Object M = mesero;

            bw.write(N + "," + C + "," + M + "\r" + "\n");

        } catch (NullPointerException ex) {
            mostrarError("Datos faltantes", "Los datos en la tabla no están completos");
        } catch (NumberFormatException ex) {
            mostrarError("Formato equivocado", "Los números en la tabla no tienen el formato correcto");
        } catch (Exception ex) {
            mostrarError("Error", "Algo inesperado ocurrió");
            ex.printStackTrace();
        }
    }

    private void nombre3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre3KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se pueden escribir numeros", "ERROR", ERROR_MESSAGE);
            nombre1.setCursor(null);
        }
    }//GEN-LAST:event_nombre3KeyTyped

    private void nombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre3ActionPerformed

    }//GEN-LAST:event_nombre3ActionPerformed

    private void guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar2ActionPerformed
        // mesero2
        String n2 = nombre2.getText();
        String c2 = clave2.getText();
        String cc2 = coclave2.getText();
        ImageIcon guardado = new ImageIcon("src\\imagenes\\aprobado.png");
        if (!"".equals(n2) && !"".equals(c2) && !"".equals(cc2)) {

            if (c2.equals(cc2)) {
                EscribirArchivo(n2, c2, "2");
                guardar2.setEnabled(false);

                jPanel5.setBackground(Color.GREEN);

                nombre2.setText("");
                clave2.setText("");
                coclave2.setText("");

                JOptionPane.showMessageDialog(null, " guardado ", "", JOptionPane.INFORMATION_MESSAGE, guardado);

            } else {
                JOptionPane.showMessageDialog(null, " Las Contraseñas no coinciden" + JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, " Debe llenar todos los campos" + JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardar2ActionPerformed

    private void nombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre2KeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se pueden escribir numeros", "ERROR", ERROR_MESSAGE);
            nombre1.setCursor(null);
        }
    }//GEN-LAST:event_nombre2KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        registro.setVisible(true);
        this.dispose();
        registro.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clavegerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clavegerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clavegerenteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String soloc = "";
        String solon = "";
        String arch = "";
        String solonum = "";
        Mesas x = new Mesas();

        boolean boo = false, boo2 = false;
        String N = txtnombre.getText();
        String C = txtclave.getText();

        if (!"".equals(N) && !"".equals(C)) {

            try (Scanner lector = new Scanner(archivo2)) {

                while (lector.hasNextLine()) {

                    arch = lector.nextLine();

                    int cont = 0;
                    StringTokenizer tokens = new StringTokenizer(arch, ",");

                    while (tokens.hasMoreTokens()) {

                        if (cont == 0) {
                            solon = tokens.nextToken();
                            cont = 1;
                        }
                        if (cont == 1) {
                            soloc = tokens.nextToken();
                            cont = 2;
                        }
                        if (cont == 2) {
                            solonum = tokens.nextToken();
                        }
                        System.out.println(solon + "---" + soloc + "---" + solonum);
                    }

                    if (solon.equals(N)) {

                        boo = true;
                        if (soloc.equals(C)) {
                            boo2 = true;
                            x.setVisible(true);
                            x.setLocationRelativeTo(null);
                            x.labelcamarero.setText(solon);
                            x.labelnumero.setText(solonum);
                            numeromesero = solonum;

                            this.dispose();

                        }

                    }

                }

                if (boo == false) {
                    JOptionPane.showMessageDialog(null, "usuario no existe", "", JOptionPane.ERROR_MESSAGE);
                } else if (boo2 == false) {
                    JOptionPane.showMessageDialog(null, "contraseña incorrecta", "", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception ex) {

            }

        } else {
            JOptionPane.showMessageDialog(null, "debe llenar todos los campos", "", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String C = clavegerente.getText();

        Gerente k = new Gerente();

        File gerente = new File("src\\archivos\\gerente.txt");

        if (!"".equals(C)) {

            String arch;

            try (Scanner lector = new Scanner(gerente)) {

                while (lector.hasNextLine()) {

                    arch = lector.nextLine();
                    System.out.println(arch);
                    if (arch.equals(C)) {

                        System.out.println("entrooooo");
                        this.dispose();
                        k.setVisible(true);
                        k.setLocationRelativeTo(null);

                    } else {
                        JOptionPane.showMessageDialog(null, "Clave Incorrecta", "", JOptionPane.ERROR_MESSAGE);
                    }

                }

            } catch (Exception ex) {

            }

        } else {
            JOptionPane.showMessageDialog(null, "debe llenar todos los campos", "", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField clave1;
    private javax.swing.JPasswordField clave2;
    private javax.swing.JPasswordField clave3;
    private javax.swing.JPasswordField clave4;
    private javax.swing.JPasswordField clavegerente;
    private javax.swing.JPasswordField coclave1;
    private javax.swing.JPasswordField coclave2;
    private javax.swing.JPasswordField coclave3;
    private javax.swing.JPasswordField coclave4;
    private javax.swing.JButton guardar1;
    private javax.swing.JButton guardar2;
    private javax.swing.JButton guardar3;
    private javax.swing.JButton guardar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JTextField nombre3;
    private javax.swing.JTextField nombre4;
    private javax.swing.JFrame registro;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
