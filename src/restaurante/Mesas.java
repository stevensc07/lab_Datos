/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static restaurante.Bienvenida.nombre;
import static restaurante.Bienvenida.solonum;

/**
 *
 * @author yuye0
 */
public class Mesas extends javax.swing.JFrame {

    ArrayList<String> pedid;
    ArrayList<String> Plato = new ArrayList();

    ArrayList<String> Bebida = new ArrayList();

    ArrayList<String> Postre = new ArrayList();

    int seg;
    int min;
    int hora;
    String plato, bebida, postre, cantplato2, cantbebida2, cantpostre2, mesa, cant, pa, be, po, fecha;
    double Precioplato, Preciobebida, Preciopostre;
    CocinaFrame cocina = new CocinaFrame();

    public Mesas() {
        initComponents();
        labelcamarero.setText(nombre);
        labelnumero.setText(solonum);

    }

    String direccion = "src\\archivos\\pedido.txt";
    File archivo = new File(direccion);

    String direccion1 = "src\\archivos\\pedidoCamarero1.txt";
    File pedido1 = new File(direccion1);

    String direccion2 = "src\\archivos\\pedidoCamarero2.txt";
    File pedido2 = new File(direccion2);

    String direccion3 = "src\\archivos\\pedidoCamarero3.txt";
    File pedido3 = new File(direccion3);

    String direccion4 = "src\\archivos\\pedidoCamarero4.txt";
    File pedido4 = new File(direccion4);

    double buscarPrecio(String $) {
        String p = null;
        double precio;
        for (int i = 0; i < $.length(); i++) {
            if ($.charAt(i) == ',') {
                p = $.substring(i + 1, $.length());

            }
        }
        precio = Double.parseDouble(p);
        return precio;
    }

    void mostrarError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this,
                mensaje,
                titulo,
                JOptionPane.ERROR_MESSAGE);
    }

    String separar(String pa) {
        String palabra = pa;
        String p = null;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == ' ') {
                p = palabra.substring(0, i - 1);

            }
        }
        return p;

    }

    void escribirArchivo(String plato, String bebida, String postre) {
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(archivo))) {
            Object p = plato;
            Object b = bebida;
            Object po = postre;

            bw.write(p + "," + b + "," + po);
            bw.newLine();

        } catch (NullPointerException ex) {
            mostrarError("Datos faltantes", "Los datos en la tabla no están completos");
        } catch (NumberFormatException ex) {
            mostrarError("Formato equivocado", "Los números en la tabla no tienen el formato correcto");
        } catch (Exception ex) {
            mostrarError("Error", "Algo inesperado ocurrió");
            ex.printStackTrace();
        }
    }

    void escribirPedido(String plato, String bebida, String postre, int numC) {
        System.out.println(numC);
        switch (numC) {
            case 1:
                try (FileWriter bw = new FileWriter(pedido1, true)) {
                    Object p = plato;
                    Object b = bebida;
                    Object pos = postre;

                    bw.write(p + "," + b + "," + po + "\r" + "\n");

                } catch (NullPointerException ex) {
                    mostrarError("Datos faltantes", "Los datos en la tabla no están completos");
                } catch (NumberFormatException ex) {
                    mostrarError("Formato equivocado", "Los números en la tabla no tienen el formato correcto");
                } catch (Exception ex) {
                    mostrarError("Error", "Algo inesperado ocurrió");
                    ex.printStackTrace();
                }
                break;
            case 2:
                try (FileWriter bw = new FileWriter(pedido2, true)) {
                    Object p = plato;
                    Object b = bebida;
                    Object pos = postre;

                    bw.write(p + "," + b + "," + po + "\r" + "\n");

                } catch (NullPointerException ex) {
                    mostrarError("Datos faltantes", "Los datos en la tabla no están completos");
                } catch (NumberFormatException ex) {
                    mostrarError("Formato equivocado", "Los números en la tabla no tienen el formato correcto");
                } catch (Exception ex) {
                    mostrarError("Error", "Algo inesperado ocurrió");
                    ex.printStackTrace();
                }
                break;
            case 3:
                try (FileWriter bw = new FileWriter(pedido3, true)) {
                    Object p = plato;
                    Object b = bebida;
                    Object pos = postre;

                    bw.write(p + "," + b + "," + po + "\r" + "\n");

                } catch (NullPointerException ex) {
                    mostrarError("Datos faltantes", "Los datos en la tabla no están completos");
                } catch (NumberFormatException ex) {
                    mostrarError("Formato equivocado", "Los números en la tabla no tienen el formato correcto");
                } catch (Exception ex) {
                    mostrarError("Error", "Algo inesperado ocurrió");
                    ex.printStackTrace();
                }
                break;
            case 4:
                try (FileWriter bw = new FileWriter(pedido4, true)) {
                    Object p = plato;
                    Object b = bebida;
                    Object pos = postre;

                    bw.write(p + "," + b + "," + po + "\r" + "\n");

                } catch (NullPointerException ex) {
                    mostrarError("Datos faltantes", "Los datos en la tabla no están completos");
                } catch (NumberFormatException ex) {
                    mostrarError("Formato equivocado", "Los números en la tabla no tienen el formato correcto");
                } catch (Exception ex) {
                    mostrarError("Error", "Algo inesperado ocurrió");
                    ex.printStackTrace();
                }
                break;
            default:
                break;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuplato = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        menubebida = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        menupostre = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        nombreM = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboplato = new javax.swing.JComboBox<>();
        combobebida = new javax.swing.JComboBox<>();
        combopostre = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pedido = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jejeje = new javax.swing.JButton();
        cantplato = new javax.swing.JComboBox<>();
        cantbebida = new javax.swing.JComboBox<>();
        cantpostre = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numMesa = new javax.swing.JTextField();
        labelcamarero = new javax.swing.JLabel();
        labelnumero = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txta = new javax.swing.JTextField();

        menu.setMinimumSize(new java.awt.Dimension(608, 560));

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Platos");

        menuplato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Perro caliente (sencillo)", "$3000"},
                {"Salchipapa (sencilla)", "$7000"},
                {"Pizza (personal)", "$7000"},
                {"Hamburguesa", "$7500"},
                {"Perro suizo ", "$8500"},
                {"Choripapa ", "$11000"},
                {"Pizza (mediana)", "$12500"},
                {"Pizza (familiar)", "$22500"}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuplato);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(196, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Bebidas");

        menubebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Gaseosa personal", "$2500"},
                {"Agua", "$3000"},
                {"Cerveza", "$ 3000"},
                {"Té", "$3000"},
                {"Gaseosa Litro", "$4000"},
                {"Mlateada", "$5000"},
                {"Limonada Cerezada", "$6000"}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(menubebida);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Postres");

        menupostre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cupcake", "$4000"},
                {"Tres leche", "$5000"},
                {"Helado", "$5000"},
                {"Brownies", "$5000"},
                {"Napoleon", "$5000"},
                {"Pastel de chocolate(porcion)", "$6000"},
                {"Wafles", "$8000"},
                {"Cookie pie", "$13000"}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(menupostre);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 311, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 480, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MENU");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 23, -1, -1));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu.getContentPane());
        menu.getContentPane().setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(525, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreM.setBackground(new java.awt.Color(255, 255, 255));
        nombreM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Pedido:");
        nombreM.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 45, -1, -1));

        comboplato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "perro (sencillo)                                ,3000", "perro suizo                                      ,8500", "Salchipapa (sencilla)                       ,7000", "choripapa                                       ,1100", "Hamburguesa                                ,7500", "Pizza (personal)                            ,7000", "Pizza (mediana)                            ,12500", "Pizza (familiar)                              ,22500" }));
        nombreM.add(comboplato, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 73, 120, -1));

        combobebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "agua                                            ,3000", "Gaseosa personal                       ,2500", "Gaseosa litro                              ,4000", "cerveza                                      ,3000", "té                                               ,3000", "malteada                                   ,5000 ", "Limonada cerezada                    ,6000" }));
        nombreM.add(combobebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 97, 120, -1));

        combopostre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cupcake                                      ,4000", "tres leche                                   ,5000", "napoleon                                    ,5000", "helado                                        ,5000", "brownie                                      ,5000", "pastel (porcion)                         ,6000", "wafles                                        ,8000", "Cookie pie                                  ,13000" }));
        nombreM.add(combopostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 123, 120, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        nombreM.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 149, -1, -1));

        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Platos:");
        nombreM.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 77, -1, -1));

        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Bebidas");
        nombreM.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 100, -1, -1));

        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Postres");
        nombreM.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 126, -1, -1));

        pedido.setBackground(new java.awt.Color(153, 0, 0));
        pedido.setForeground(new java.awt.Color(255, 255, 255));
        pedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "producto", "cantidad", "precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(pedido);

        nombreM.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 474, 158));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MENU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        nombreM.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 11, 78, -1));

        jejeje.setBackground(new java.awt.Color(255, 255, 255));
        jejeje.setText("ENVIAR");
        jejeje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jejejeActionPerformed(evt);
            }
        });
        nombreM.add(jejeje, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 391, -1, -1));

        cantplato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));
        nombreM.add(cantplato, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 73, -1, -1));

        cantbebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", " " }));
        nombreM.add(cantbebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 97, -1, -1));

        cantpostre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));
        nombreM.add(cantpostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 123, -1, -1));

        jLabel10.setText("Mesero No:");
        nombreM.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 11, -1, -1));

        jLabel1.setText("N° Mesa:");
        nombreM.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 15, -1, -1));

        numMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numMesaActionPerformed(evt);
            }
        });
        numMesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numMesaKeyTyped(evt);
            }
        });
        nombreM.add(numMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 12, 111, -1));
        nombreM.add(labelcamarero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 76, 14));
        nombreM.add(labelnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 32, 14));

        cancelar.setText("CANCELAR PEIDO");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        nombreM.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        nombreM.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        txta.setCaretColor(new java.awt.Color(255, 0, 0));
        nombreM.add(txta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 360, 40));

        getContentPane().add(nombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        menu.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        menu.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        cantplato2 = this.cantplato.getSelectedItem().toString();
        cantbebida2 = this.cantbebida.getSelectedItem().toString();
        cantpostre2 = this.cantpostre.getSelectedItem().toString();
        if (Integer.parseInt(cantplato2) != 0 || Integer.parseInt(cantbebida2) != 0 || Integer.parseInt(cantpostre2) != 0) {
            plato = this.comboplato.getSelectedItem().toString();
            bebida = this.combobebida.getSelectedItem().toString();
            postre = this.combopostre.getSelectedItem().toString();
            pa = separar(plato);
            be = separar(bebida);
            po = separar(postre);
            escribirArchivo(pa, be, po);

            Precioplato = buscarPrecio(this.comboplato.getSelectedItem().toString());
            Preciobebida = buscarPrecio(this.combobebida.getSelectedItem().toString());
            Preciopostre = buscarPrecio(this.combopostre.getSelectedItem().toString());

            DefaultTableModel model = (DefaultTableModel) pedido.getModel();
            if (Integer.parseInt(cantplato2) != 0) {
                model.addRow(new String[]{plato, cantplato2, Precioplato + ""});
                Plato.add(plato);
            }
            if (Integer.parseInt(cantbebida2) != 0) {
                model.addRow(new String[]{bebida, cantbebida2, Preciobebida + ""});
                Bebida.add(bebida);
            }
            if (Integer.parseInt(cantpostre2) != 0) {
                model.addRow(new String[]{postre, cantpostre2, Preciopostre + ""});
                Postre.add(postre);
            }

            this.cantplato.setSelectedIndex(0);
            this.cantbebida.setSelectedIndex(0);
            this.cantpostre.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS, DEBE ORDENAR POR LO MENOS 1 PRODUCTO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    void agregarPedido(int se, int mi, int h) {

        cocina.fecha = /*String.valueOf(day) + "/" + String.valueOf(mes + 1) + "/" + String.valueOf(año)
            + "  " */ String.valueOf(h) + ":" + String.valueOf(mi) + ":" + String.valueOf(se);
        for (int i = 0; i < Plato.size(); i++) {
            this.cocina.nM = this.mesa;
            cocina.plato.add(Plato.get(i));
            cocina.prePa = this.Precioplato;
            cocina.cantPto = this.cantplato2;
            Plato.remove(i);

        }
        for (int i = 0; i < Bebida.size(); i++) {
            this.cocina.nM = this.mesa;
            cocina.bebida.add(Bebida.get(i));
            cocina.preBe = this.Preciobebida;
            cocina.cantBebi = this.cantbebida2;
            cocina.agregar();
            Bebida.remove(i);

        }
        for (int i = 0; i < Postre.size(); i++) {
            this.cocina.nM = this.mesa;
            cocina.postre.add(Postre.get(i));
            cocina.prePo = this.Preciopostre;
            cocina.cantPos = this.cantpostre2;
            cocina.agregar();
            Postre.remove(i);

        }
        // cocina.modelMesa = (DefaultTableModel) pedido.getModel();
        // this.dispose();
        cocina.setVisible(true);
    }
    private void numMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numMesaActionPerformed

    }//GEN-LAST:event_numMesaActionPerformed

    private void jejejeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jejejeActionPerformed
        Calendar c = new GregorianCalendar();
        mesa = numMesa.getText();

        if (mesa.isEmpty() || mesa == null) {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS, PRIMERO DEBES ESCRIBIR LA MESA");

        } else {

            int NMesa = Integer.parseInt(mesa);
            int NM = Integer.parseInt(this.labelnumero.getText());
            int seg3 = c.get(Calendar.SECOND);
            int min3 = c.get(Calendar.MINUTE);
            int hora3 = c.get(Calendar.HOUR);
            switch (NM) {
                case 1:
                    if (NMesa >= 1 && NMesa <= 5) {
                        escribirPedido(pa, be, po, NM);
                        agregarPedido(seg3, min3, hora3);

                    } else {
                        JOptionPane.showMessageDialog(null, "LO SENTIMOS, EL MESERO NUMERO 1 SOLO TIENE LAS MESAS DE 1-5");
                    }

                    break;
                case 2:
                    if (NMesa >= 6 && NMesa <= 10) {

                        agregarPedido(seg3, min3, hora3);
                        agregarPedido(seg3, min3, hora3);

                    } else {

                        JOptionPane.showMessageDialog(null, "LO SENTIMOS, EL MESERO NUMERO 2 SOLO TIENE LAS MESAS DE 6-10");
                    }
                    break;
                case 3:

                    if (NMesa >= 11 && NMesa <= 15) {

                        agregarPedido(seg3, min3, hora3);
                        agregarPedido(seg3, min3, hora3);

                    } else {
                        JOptionPane.showMessageDialog(null, "LO SENTIMOS, EL MESERO NUMERO 3 SOLO TIENE LAS MESAS DE 11-15");
                    }

                    break;
                case 4:
                    if (NMesa >= 16 && NMesa <= 20) {

                        agregarPedido(seg3, min3, hora3);
                        agregarPedido(seg3, min3, hora3);

                    } else {
                        JOptionPane.showMessageDialog(null, "LO SENTIMOS, EL MESERO NUMERO 4 SOLO TIENE LAS MESAS DE 16-20");

                    }

                    break;

            }
            seg = c.get(Calendar.SECOND);
            min = c.get(Calendar.MINUTE);
            hora = c.get(Calendar.HOUR);

        }

    }//GEN-LAST:event_jejejeActionPerformed

    void agregarPedido() {
        for (int i = 0; i < Plato.size(); i++) {
            this.cocina.nM = this.mesa;
            cocina.plato.add(Plato.get(i));
            cocina.prePa = this.Precioplato;
            cocina.cantPto = this.cantplato2;
            Plato.remove(i);
        }
        for (int i = 0; i < Bebida.size(); i++) {
            this.cocina.nM = this.mesa;
            cocina.bebida.add(Bebida.get(i));
            cocina.preBe = this.Preciobebida;
            cocina.cantBebi = this.cantbebida2;
            cocina.agregar();
            Bebida.remove(i);
        }
        for (int i = 0; i < Postre.size(); i++) {
            this.cocina.nM = this.mesa;
            cocina.postre.add(Postre.get(i));
            cocina.prePo = this.Preciopostre;
            cocina.cantPos = this.cantpostre2;
            cocina.agregar();
            Postre.remove(i);

        }
        cocina.setVisible(true);

    }

    private void numMesaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numMesaKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN ESCRIBIR LETRAS", "ERROR", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }

    }//GEN-LAST:event_numMesaKeyTyped

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Calendar c2 = new GregorianCalendar();
        int seg2 = c2.get(Calendar.SECOND);
        int min2 = c2.get(Calendar.MINUTE);
        int hora2 = c2.get(Calendar.HOUR);
        int res;
        if (min == 60) {
            res = 0;
        } else {
            res = min2 - min;
        }
        System.out.println(min + 5);
        if (res <= 5) {
            int f = this.pedido.getSelectedRow();
            if (f == -1) {
                JOptionPane.showMessageDialog(null, "DEBES SELLECIONAR PRIMERO EL PLATOS A CANCELAR", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Object s = this.cocina.model.getValueAt(f, 1);
                if (s.toString().equals("en espera")) {
                    String platoR, cantPto, nM;
                    platoR = cocina.tablaPedidos.getValueAt(f, 0).toString();
                    cantPto = cocina.tablaPedidos.getValueAt(f, 2).toString();
                    nM = cocina.tablaPedidos.getValueAt(f, 3).toString();
                    cocina.tablaPedidos.setValueAt(platoR, f, 0);
                    cocina.tablaPedidos.setValueAt("cancelado", f, 1);
                    cocina.tablaPedidos.setValueAt(cantPto, f, 2);
                    cocina.tablaPedidos.setValueAt(nM, f, 3);
                    JOptionPane.showMessageDialog(null, "EL PEDIDO HA SIDO CANCELADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE PUEDE CANCELAR EL PEDIDO, YA SE ENCUENTRA REALIZADO");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE CANCELAR EL PEDIDO DESPÚES DE CINCO MINUTOS" + "\n" + "ORDENASTE A LAS: " + String.valueOf(hora) + ":" + String.valueOf(min) + ":" + String.valueOf(seg) + "\n" + "SON LAS: " + String.valueOf(hora2) + ":" + String.valueOf(min2) + ":" + String.valueOf(seg2), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Bienvenida b = new Bienvenida();
        b.setVisible(true);
        b.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Mesas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> cantbebida;
    private javax.swing.JComboBox<String> cantplato;
    private javax.swing.JComboBox<String> cantpostre;
    private javax.swing.JComboBox<String> combobebida;
    private javax.swing.JComboBox<String> comboplato;
    private javax.swing.JComboBox<String> combopostre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jejeje;
    public javax.swing.JLabel labelcamarero;
    public javax.swing.JLabel labelnumero;
    private javax.swing.JFrame menu;
    private javax.swing.JTable menubebida;
    private javax.swing.JTable menuplato;
    private javax.swing.JTable menupostre;
    private javax.swing.JPanel nombreM;
    public javax.swing.JTextField numMesa;
    public javax.swing.JTable pedido;
    public javax.swing.JTextField txta;
    // End of variables declaration//GEN-END:variables
}
