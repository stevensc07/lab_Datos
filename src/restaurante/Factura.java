package restaurante;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import static restaurante.Bienvenida.numeromesero;
import static restaurante.CocinaFrame.TWO_SECOND;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Stevens
 */
public class Factura extends javax.swing.JFrame {

    File pedidosrealizados = new File("src\\archivos\\realizados.txt");
      String direccion1 = "src\\archivos\\Camarero1.txt";
        File cama1 = new File(direccion1);

       String direccion2 = "src\\archivos\\Camarero2.txt";
        File cama2 = new File(direccion2);

        String direccion3 = "src\\archivos\\Camarero3.txt";
        File cama3 = new File(direccion3);

        String direccion4 = "src\\archivos\\Camarero4.txt";
        File cama4 = new File(direccion4);

    public Factura() {
        initComponents();

        labelnumerofac.setText(numeromesero);

        DefaultTableModel model = (DefaultTableModel) tablafactura.getModel();

        if (Integer.parseInt(numeromesero) == 1) {

            String arch, plato = "", precio = "", cantidad = "", mesa = "";
            int cont;
            float precio1, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;

            try (Scanner lector = new Scanner(pedidosrealizados)) {

                while (lector.hasNextLine()) {

                    cont = 0;

                    arch = lector.nextLine();

                    System.out.println(arch);

                    StringTokenizer tokens = new StringTokenizer(arch, ",");

                    while (tokens.hasMoreTokens()) {

                        if (cont == 0) {
                            plato = tokens.nextToken();
                            cont = 1;
                        }
                        if (cont == 1) {
                            precio = tokens.nextToken();
                            cont = 2;
                        }
                        if (cont == 2) {
                            cantidad = tokens.nextToken();
                            cont = 3;
                        }
                        if (cont == 3) {
                            mesa = tokens.nextToken();
                        }
                        System.out.println(plato + "---" + precio + "---" + cantidad + "---" + mesa);

                    }

                    if (Integer.parseInt(mesa) == 1) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total1 = (float) total1 + precio1 + (precio1 * (16 / 100)) + (precio1 * (10 / 100));
                    }
                    if (Integer.parseInt(mesa) == 2) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total2 = (float) total2 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 3) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total3 = (float) total3 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 4) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total4 = (float) total4 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 5) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total5 = (float) total5 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }

                }

                model.addRow(new Object[]{"1", total1});
                model.addRow(new Object[]{"2", total2});
                model.addRow(new Object[]{"3", total3});
                model.addRow(new Object[]{"4", total4});
                model.addRow(new Object[]{"5", total5});
                
                
                 try(BufferedWriter bw = new BufferedWriter(new FileWriter(cama1))){ 
               Object N = total1+total2+total3+total4+total5;
              
               System.out.println("eltotal mesero 1 es"+N);
               bw.write(N + "");

        } catch (NullPointerException ex) {
            mostrarError("Datos faltantes", "Los datos en la tabla no están completos");
        } catch (NumberFormatException ex) {
            mostrarError("Formato equivocado", "Los números en la tabla no tienen el formato correcto");
        } catch (Exception ex) {
            mostrarError("Error", "Algo inesperado ocurrió");
            ex.printStackTrace();
        }
                
                

            } catch (FileNotFoundException ex) {
                Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (Integer.parseInt(numeromesero) == 2) {

            String arch, plato = "", precio = "", cantidad = "", mesa = "";
            int cont;
            float precio1, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;

            try (Scanner lector = new Scanner(pedidosrealizados)) {

                while (lector.hasNextLine()) {

                    cont = 0;

                    arch = lector.nextLine();

                    System.out.println(arch);

                    StringTokenizer tokens = new StringTokenizer(arch, ",");

                    while (tokens.hasMoreTokens()) {

                        if (cont == 0) {
                            plato = tokens.nextToken();
                            cont = 1;
                        }
                        if (cont == 1) {
                            precio = tokens.nextToken();
                            cont = 2;
                        }
                        if (cont == 2) {
                            cantidad = tokens.nextToken();
                            cont = 3;
                        }
                        if (cont == 3) {
                            mesa = tokens.nextToken();
                        }
                        System.out.println(plato + "---" + precio + "---" + cantidad + "---" + mesa);

                    }

                    if (Integer.parseInt(mesa) == 6) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total1 = (float) total1 + precio1 + (precio1 * (16 / 100)) + (precio1 * (10 / 100));
                    }
                    if (Integer.parseInt(mesa) == 7) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total2 = (float) total2 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 8) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total3 = (float) total3 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 9) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total4 = (float) total4 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 10) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total5 = (float) total5 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }

                }

                model.addRow(new Object[]{"6", total1});
                model.addRow(new Object[]{"7", total2});
                model.addRow(new Object[]{"8", total3});
                model.addRow(new Object[]{"9", total4});
                model.addRow(new Object[]{"10", total5});
                
                 try(BufferedWriter bw = new BufferedWriter(new FileWriter(cama2))){ 
               Object N = total1+total2+total3+total4+total5;
              
               System.out.println("eltotal mesero 2 es"+N);
               bw.write(N + "");

                } catch (NullPointerException ex) {
                mostrarError("Datos faltantes", "Los datos en la tabla no están completos");
                } catch (NumberFormatException ex) {
                mostrarError("Formato equivocado", "Los números en la tabla no tienen el formato correcto");
                } catch (Exception ex) {
                mostrarError("Error", "Algo inesperado ocurrió");
                 ex.printStackTrace();
                }
                    
                } catch (FileNotFoundException ex) {
            Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
        
            }    
                

            

        }

        if (Integer.parseInt(numeromesero) == 3) {

            String arch, plato = "", precio = "", cantidad = "", mesa = "";
            int cont;
            float precio1, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;

            try (Scanner lector = new Scanner(pedidosrealizados)) {

                while (lector.hasNextLine()) {

                    cont = 0;

                    arch = lector.nextLine();

                    System.out.println(arch);

                    StringTokenizer tokens = new StringTokenizer(arch, ",");

                    while (tokens.hasMoreTokens()) {

                        if (cont == 0) {
                            plato = tokens.nextToken();
                            cont = 1;
                        }
                        if (cont == 1) {
                            precio = tokens.nextToken();
                            cont = 2;
                        }
                        if (cont == 2) {
                            cantidad = tokens.nextToken();
                            cont = 3;
                        }
                        if (cont == 3) {
                            mesa = tokens.nextToken();
                        }
                        System.out.println(plato + "---" + precio + "---" + cantidad + "---" + mesa);

                    }

                    if (Integer.parseInt(mesa) == 11) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total1 = (float) total1 + precio1 + (precio1 * (16 / 100)) + (precio1 * (10 / 100));
                    }
                    if (Integer.parseInt(mesa) == 12) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total2 = (float) total2 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 13) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total3 = (float) total3 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 14) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total4 = (float) total4 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 15) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total5 = (float) total5 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }

                }

                model.addRow(new Object[]{"11", total1});
                model.addRow(new Object[]{"12", total2});
                model.addRow(new Object[]{"13", total3});
                model.addRow(new Object[]{"14", total4});
                model.addRow(new Object[]{"15", total5});
                
                 try(BufferedWriter bw = new BufferedWriter(new FileWriter(cama3))){ 
               Object N = total1+total2+total3+total4+total5;
              
               System.out.println("eltotal mesero 3 es"+N);
               bw.write (N+"");

                } catch (NullPointerException ex) {
                 mostrarError("Datos faltantes", "Los datos en la tabla no están completos");
                 }catch (NumberFormatException ex) {
                 mostrarError("Formato equivocado", "Los números en la tabla no tienen el formato correcto");
                } catch (Exception ex) {
                 mostrarError("Error", "Algo inesperado ocurrió");
                ex.printStackTrace();
                 }
                
                
                
                
                
                

            } catch (FileNotFoundException ex) {
                Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (Integer.parseInt(numeromesero) == 4) {

            String arch, plato = "", precio = "", cantidad = "", mesa = "";
            int cont;
            float precio1, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;

            try (Scanner lector = new Scanner(pedidosrealizados)) {

                while (lector.hasNextLine()) {

                    cont = 0;

                    arch = lector.nextLine();

                    System.out.println(arch);

                    StringTokenizer tokens = new StringTokenizer(arch, ",");

                    while (tokens.hasMoreTokens()) {

                        if (cont == 0) {
                            plato = tokens.nextToken();
                            cont = 1;
                        }
                        if (cont == 1) {
                            precio = tokens.nextToken();
                            cont = 2;
                        }
                        if (cont == 2) {
                            cantidad = tokens.nextToken();
                            cont = 3;
                        }
                        if (cont == 3) {
                            mesa = tokens.nextToken();
                        }
                        System.out.println(plato + "---" + precio + "---" + cantidad + "---" + mesa);

                    }

                    if (Integer.parseInt(mesa) == 16) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total1 = (float) total1 + precio1 + (precio1 * (16 / 100)) + (precio1 * (10 / 100));
                    }
                    if (Integer.parseInt(mesa) == 17) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total2 = (float) total2 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 18) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total3 = (float) total3 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 19) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total4 = (float) total4 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }
                    if (Integer.parseInt(mesa) == 20) {
                        precio1 = (float) Integer.parseInt(precio) * Integer.parseInt(cantidad);
                        total5 = (float) total5 + precio1 + (precio1 * 16 / 100) + (precio1 * 10 / 100);
                    }

                }

                model.addRow(new Object[]{"16", total1});
                model.addRow(new Object[]{"17", total2});
                model.addRow(new Object[]{"18", total3});
                model.addRow(new Object[]{"19", total4});
                model.addRow(new Object[]{"20", total5});

                 try(BufferedWriter bw = new BufferedWriter(new FileWriter(cama4))){ 
               Object N = total1+total2+total3+total4+total5;
              
               System.out.println("eltotal mesero 4 es"+N);
               bw.write(N +"");

                } catch (NullPointerException ex) {
                 mostrarError("Datos faltantes", "Los datos en la tabla no están completos");
                } catch (NumberFormatException ex) {
                 mostrarError("Formato equivocado", "Los números en la tabla no tienen el formato correcto");
                } catch (Exception ex) {
               mostrarError("Error", "Algo inesperado ocurrió");
               ex.printStackTrace();
                }
                
                
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    void funcion() {
        String arch, plato = "", precio = "", cantidad = "", mesa = "";
        int cont;

        try (Scanner lector = new Scanner(pedidosrealizados)) {

            while (lector.hasNextLine()) {

                cont = 0;

                arch = lector.nextLine();

                System.out.println(arch);

                StringTokenizer tokens = new StringTokenizer(arch, ",");

                while (tokens.hasMoreTokens()) {

                    if (cont == 0) {
                        plato = tokens.nextToken();
                        cont = 1;
                    }
                    if (cont == 1) {
                        precio = tokens.nextToken();
                        cont = 2;
                    }
                    if (cont == 2) {
                        cantidad = tokens.nextToken();
                        cont = 3;
                    }
                    if (cont == 3) {
                        mesa = tokens.nextToken();
                    }
                    System.out.println(plato + "---" + precio + "---" + cantidad + "---" + mesa);

                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalles = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelmesa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        propina = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablafactura = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelnumerofac = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        detalles.setMinimumSize(new java.awt.Dimension(311, 330));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Mesa:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel1.add(labelmesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 30, 20));

        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio(Unitario)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabladetalle);
        if (tabladetalle.getColumnModel().getColumnCount() > 0) {
            tabladetalle.getColumnModel().getColumn(0).setResizable(false);
            tabladetalle.getColumnModel().getColumn(1).setResizable(false);
            tabladetalle.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 260, 120));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Propina (10%):");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPanel1.add(propina, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 90, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("TOTAL:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 50, 20));

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REGRESAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        javax.swing.GroupLayout detallesLayout = new javax.swing.GroupLayout(detalles.getContentPane());
        detalles.getContentPane().setLayout(detallesLayout);
        detallesLayout.setHorizontalGroup(
            detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );
        detallesLayout.setVerticalGroup(
            detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("FACTURACION");
        jLabel4.setToolTipText("");

        tablafactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesa", "Cuenta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablafactura);
        if (tablafactura.getColumnModel().getColumnCount() > 0) {
            tablafactura.getColumnModel().getColumn(0).setResizable(false);
            tablafactura.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton1.setText("DETALLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Camarero No:");

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelnumerofac, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelnumerofac, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void mostrarError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabladetalle.getModel();
        model.setRowCount(0);
        int f = tablafactura.getSelectedRow();

        if (f == -1) {
            JOptionPane.showMessageDialog(null, "DEBES SELLECIONAR PRIMERO UNA MESA", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String M = (String) tablafactura.getValueAt(f, 0);
            labelmesa.setText(M);
            detalles.setVisible(true);
            detalles.setLocationRelativeTo(null);

            String arch, plato = "", precio = "", cantidad = "", mesa = "";
            int cont, suma = 0;
            float prop;

            try (Scanner lector = new Scanner(pedidosrealizados)) {

                while (lector.hasNextLine()) {

                    cont = 0;

                    arch = lector.nextLine();

                    System.out.println(arch);

                    StringTokenizer tokens = new StringTokenizer(arch, ",");

                    while (tokens.hasMoreTokens()) {

                        if (cont == 0) {
                            plato = tokens.nextToken();
                            cont = 1;
                        }
                        if (cont == 1) {
                            precio = tokens.nextToken();
                            cont = 2;
                        }
                        if (cont == 2) {
                            cantidad = tokens.nextToken();
                            cont = 3;
                        }
                        if (cont == 3) {
                            mesa = tokens.nextToken();
                        }

                        System.out.println(plato + "---" + precio + "---" + cantidad + "---" + mesa);

                    }
                    if (mesa.equals(M)) {

                        model.addRow(new Object[]{plato, cantidad, precio});

                        suma = suma + Integer.parseInt(precio) * Integer.parseInt(cantidad);
                    }

                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("la suma dio" + suma);
            prop = (float) (suma * 0.1);
            System.out.println("propina" + prop);
            float tot = suma + prop + (suma * 16 / 100);
            propina.setText(prop + "");
            total.setText(tot + "");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        detalles.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame detalles;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelmesa;
    public javax.swing.JLabel labelnumerofac;
    private javax.swing.JLabel propina;
    private javax.swing.JTable tabladetalle;
    public javax.swing.JTable tablafactura;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
