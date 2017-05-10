package restaurante;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import static restaurante.Bienvenida.numeromesero;

public class CocinaFrame extends javax.swing.JFrame {

    ArrayList<String> plato = new ArrayList();
    ArrayList<String> bebida = new ArrayList();
    ArrayList<String> postre = new ArrayList();
    String postreR, bebidaR, platoR, nM, cantPto, cantBebi, cantPos;
    String fecha;
    double prePa, preBe, prePo;
    private Timer tiempo;
    int cont, f;
    DefaultTableModel model;
    DefaultTableModel model2;
    public final static int TWO_SECOND = 5;

    String direccion2 = "src\\archivos\\ingredientes.txt";
    File ingredients = new File(direccion2);

    String direccion = "src\\archivos\\realizados.txt";
    File pedidosrealizados = new File(direccion);

    public CocinaFrame() {
        initComponents();
        tablaI();
        labelnumerococina.setText(numeromesero);
        setLocationRelativeTo(null);
        barra.setVisible(false);
    }

    class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cont = cont + 1;
            barra.setValue(cont);
            if (cont == 200) {
                tiempo.stop();
                JOptionPane.showMessageDialog(null, "PLATO TERMINADO", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                platoR = tablaPedidos.getValueAt(f, 0).toString();
                cantPto = tablaPedidos.getValueAt(f, 2).toString();
                nM = tablaPedidos.getValueAt(f, 3).toString();
                tablaPedidos.setValueAt(platoR, f, 0);
                tablaPedidos.setValueAt("realizado", f, 1);
                tablaPedidos.setValueAt(cantPto, f, 2);
                tablaPedidos.setValueAt(nM, f, 3);
                // model.addRow(new String[]{platoR, "realizado", cantPto, nM});
                back.setEnabled(true);
                prepa.setEnabled(false);
            }
        }

    }

    public void esconder() {
        this.setVisible(false);
    }

    public void activar() {
        tiempo.start();
    }

    public void agregar() {

        model = (DefaultTableModel) this.tablaPedidos.getModel();
        for (int i = 0; i < plato.size(); i++) {
            model.addRow(new String[]{plato.get(i), "en espera", cantPto, nM, fecha});
            this.plato.remove(i);
        }
        for (int i = 0; i < bebida.size(); i++) {
            model.addRow(new String[]{bebida.get(i), "en espera", cantBebi, nM, fecha});
            this.bebida.remove(i);
        }
        for (int i = 0; i < postre.size(); i++) {
            model.addRow(new String[]{postre.get(i), "en espera", cantPos, nM, fecha});
            this.postre.remove(i);
        }

    }

    void mostrarError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }
    //DefaultTableModel modelMesa;

    public void pasar(int f) {
        //  Mesas m = new Mesas();
        model2 = (DefaultTableModel) this.tablaRealizado.getModel();
        platoR = tablaPedidos.getValueAt(f, 0).toString();
        cantPto = tablaPedidos.getValueAt(f, 2).toString();
        nM = tablaPedidos.getValueAt(f, 3).toString();
        model2.addRow(new String[]{platoR, "realizado", cantPto, nM});
        // m.pedido.setModel(modelMesa);
        // m.setVisible(true);
        // m.setLocationRelativeTo(null);
        // m.txta.setText("EL PLATO ESTÁ LISTO, PUEDES PASAR A RECOGERLO");

        try (FileWriter bw = new FileWriter(pedidosrealizados, true)) {
            Object N = platoR;
            Object C = cantPto;
            Object M = nM;

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

    void busca(String n, int c, int co) {
        int i = co;
        if (this.ingredientes.getValueAt(i, 0) == n) {
            String p = (String) ingredientes.getValueAt(i, 0);
            String ca = (String) ingredientes.getValueAt(i, 1);
            int kha = Integer.parseInt(ca);
            kha = kha - c;
            ca = String.valueOf(kha);
            ingredientes.setValueAt(p, i, 0);
            ingredientes.setValueAt(ca, i, 2);

        } else {
            busca(n, c, co + 1);

        }
    }

    void tablaI() {
        System.out.println("kha++++");
        String arch, no = null, ca = null;
        DefaultTableModel modeli = (DefaultTableModel) ingredientes.getModel();
        try (Scanner lector = new Scanner(ingredients)) {

            while (lector.hasNextLine()) {
                arch = lector.nextLine();
                System.out.println(arch);
                int con = 0;
                StringTokenizer tokens = new StringTokenizer(arch, ",");
                while (tokens.hasMoreTokens()) {

                    if (con == 0) {
                        no = tokens.nextToken();
                        con = 1;
                    }
                    if (con == 1) {
                        con = 2;
                    }

                    if (con == 2) {
                        ca = tokens.nextToken();
                    }

                }
                modeli.addRow(new String[]{no, ca});
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        preparar = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        barra = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRealizado = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        enviar = new javax.swing.JButton();
        prepa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vol = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        labelnumerococina = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ingredientes = new javax.swing.JTable();

        preparar.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        preparar.setBounds(new java.awt.Rectangle(0, 0, 521, 521));
        preparar.getContentPane().setLayout(new java.awt.BorderLayout(521, 521));

        barra.setMaximum(200);

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        jLabel6.setText("Preparando la comida, por favor aguarde. Gracias!");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/tumblr_n7uuu0ji2x1ty0h5zo1_500.gif"))); // NOI18N

        back.setText("VOLVER");
        back.setEnabled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back)
                .addContainerGap())
        );

        preparar.getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaRealizado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATOS SOLICITADOS", "ESTADO", "CANTIDAD", "MESA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRealizado);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("PLATOS REALIZADOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("PLATOS PEDIDOS");

        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLATOS SOLICITADOS", "ESTADO", "CANTIDAD", "MESA", "HORA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaPedidos);

        enviar.setText("ENVIAR PEDIDO");
        enviar.setEnabled(false);
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        prepa.setText("PREPARAR  PLATOS");
        prepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prepaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(prepa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enviar)
                .addGap(53, 53, 53))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviar)
                    .addComponent(prepa))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("COCINA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gorro.jpg"))); // NOI18N

        vol.setText("VOLVER");
        vol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volActionPerformed(evt);
            }
        });

        jButton1.setText("FACTURACION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Camarero No:");

        ingredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCTO", "CANTIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ingredientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelnumerococina, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vol))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(vol))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelnumerococina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        JOptionPane.showMessageDialog(null, "EL CAMARERO FUE NOTIFICADO ");

        f = tablaPedidos.getSelectedRow();
        if (f == -1) {
            JOptionPane.showMessageDialog(null, "DEBES SELLECIONAR PRIMERO LOS PLATOS", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else if (tablaPedidos.getValueAt(f, 1).equals("en espera")) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN ENVIAR PLATOS EN ESPERA", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {

            pasar(f);

            enviar.setEnabled(false);
            prepa.setEnabled(true);

        }

    }//GEN-LAST:event_enviarActionPerformed

    private String separar(String n) {
        int con = 0;
        StringTokenizer tokens = new StringTokenizer(n, ",");
        while (tokens.hasMoreTokens()) {

            if (con == 0) {
                n = tokens.nextToken();
                con = 1;
            }
            if (con == 1) {
                tokens.nextToken();
            }
        }
        return n;
    }
    private void prepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prepaActionPerformed
        try {

            f = tablaPedidos.getSelectedRow();

            if (f == -1) {
                JOptionPane.showMessageDialog(null, "DEBES SELLECIONAR PRIMERO LOS PLATOS", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            } else if (tablaPedidos.getValueAt(f, 1).equals("en espera")) {
                String n = (String) tablaPedidos.getValueAt(f, 0);
                String canP = (String) tablaPedidos.getValueAt(f, 2);
                n = separar(n);
                System.out.println(n + "   " + canP);

                boolean sw = false;
                System.out.println(sw);
                int i = 0;
                System.out.println(i);
                while (sw == false) {
                    if (ingredientes.getValueAt(i, 0).equals(n)) {
                        System.out.println(i);
                        String get = (String) ingredientes.getValueAt(i, 1);
                        System.out.println("get =" + get);
                        int can = Integer.parseInt(get);
                        int ca = Integer.parseInt(canP);
                        System.out.println(can + "  .. " + ca);
                        if (can >= ca) {
                            preparar.setLocationRelativeTo(null);
                            preparar.setVisible(true);
                            barra.setVisible(true);
                            cont = -1;
                            barra.setValue(0);
                            barra.setStringPainted(true);
                            tiempo = new Timer(TWO_SECOND, new TimerListener());
                            activar();
                            enviar.setEnabled(true);
                            can = (can - ca);
                            if (can == 0) {
                                JOptionPane.showMessageDialog(null, "PLATO AGOTADO NO SE PUEDE PREPARAR MÁS", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                                System.out.println(can + " res");
                                ingredientes.setValueAt(can, i, 1);
                            } else {
                                System.out.println(can + " res");
                                ingredientes.setValueAt(can, i, 1);
                            }

                            sw = true;
                        } else if (can == 0) {
                            JOptionPane.showMessageDialog(null, "PLATO AGOTADO NO SE PUEDE PREPARAR MÁS", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                            sw = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "CANTIDAD DE INGREDIENTES ISUFICIENTE" + "\n" + "LA CANTIDAD DISPONIBLE ES: " + can, "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                            sw = true;
                        }

                    } else {
                        i = i + 1;
                    }

                }
                if (sw == true) {
                    System.out.println("lol");
                }

            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDEN PREPARAR PLATOS REALIZADOS O CANCELADOS", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_prepaActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(true);
        preparar.setVisible(false);

    }//GEN-LAST:event_backActionPerformed

    private void volActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_volActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Factura x = new Factura();
        x.setVisible(true);
        x.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CocinaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton enviar;
    private javax.swing.JTable ingredientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel labelnumerococina;
    private javax.swing.JButton prepa;
    private javax.swing.JFrame preparar;
    public javax.swing.JTable tablaPedidos;
    private javax.swing.JTable tablaRealizado;
    private javax.swing.JButton vol;
    // End of variables declaration//GEN-END:variables
}
