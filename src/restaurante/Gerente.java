/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;  
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yuye0
 */
public class Gerente extends javax.swing.JFrame {

    /**
     * Creates new form Gerente
     */
    public Gerente() {
        initComponents();
        String direccion1 = "src\\archivos\\Camarero1.txt";
        File cama1 = new File(direccion1);

       String direccion2 = "src\\archivos\\Camarero2.txt";
        File cama2 = new File(direccion2);

        String direccion3 = "src\\archivos\\Camarero3.txt";
        File cama3 = new File(direccion3);

        String direccion4 = "src\\archivos\\Camarero4.txt";
        File cama4 = new File(direccion4);
        File pedidosrealizados= new File("src\\archivos\\realizados.txt");
        
         String arch, plato="",precio="",cantidad="",mesa="";
          int cont;
          int con1=0, con2=0,con3=0,con4=0,con5=0, con6=0, con7=0, con8=0;
          float totaldia=0,tot1 = 0,tot2=0,tot3=0,tot4=0;
        
         try (Scanner lector = new Scanner(pedidosrealizados)) {

                while (lector.hasNextLine()) {

                    cont=0;
                    
                    arch = lector.nextLine();
                    
                    StringTokenizer tokens=new StringTokenizer(arch, ",");
         
                    while(tokens.hasMoreTokens()){
  
                         if (cont==0) {
                            plato=tokens.nextToken();
                            cont=1;
                             System.out.println(plato+"aqui termina");
                        }
                        if (cont==1) {
                            precio=tokens.nextToken();
                            cont=2;
                        }
                        if (cont==2) {
                            cantidad=tokens.nextToken();
                            cont=3;
                        }
                        if (cont==3) {
                            mesa=tokens.nextToken();
                        }
                        
                       
                    }
                    
                   totaldia=totaldia+ (Integer.parseInt(precio)*Integer.parseInt(cantidad));
                    if ("perro (sencillo)                                ".equals(plato)) {
                        con1=con1+1;
                    }
                    if ("perro suizo                                      ".equals(plato)) {
                        con2=con2+1;
                    }
                    if ("Salchipapa (sencilla)                       ".equals(plato)) {
                        con3=con3+1;
                    }
                    if ("choripapa                                       ".equals(plato)) {
                        con4=con4+1;
                    }
                   if ("Hamburguesa                                ".equals(plato)) {
                        con5=con5+1;
                    }
                   if ("Pizza (personal)                            ".equals(plato)) {
                        con6=con6+1;
                    }
                   if ("Pizza (mediana)                            ".equals(plato)) {
                        con7=con7+1;
                    }
                   if ("Pizza (familiar)                              ".equals(plato)) {
                        con8=con8+1;
                    }
                   
                    }

                } catch (FileNotFoundException ex) {
            Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         int mayor=0;
         
         if (con1>mayor) {
             mayor=con1;
            
        }
         if (con2>mayor) {
             mayor=con2;
            
        }
         if (con3>mayor) {
             mayor=con3;
            
        }
         if (con4>mayor) {
             mayor=con4;
            
        }
         if (con5>mayor) {
             mayor=con5;
            
        }
         if (con6>mayor) {
             mayor=con6;
            
         }
         if (con7>mayor) {
             mayor=con7;
            
        }if (con8>mayor) {
             mayor=con8;
            
        }
        if (mayor==con1) {
            platomas.setText("perro (sencillo)");
        }
        if (mayor==con2) {
            platomas.setText("perro suizo");
        }
        if (mayor==con3) {
            platomas.setText("Salchipapa (sencilla)");
        }
        if (mayor==con4) {
            platomas.setText("choripapa");
        }
        if (mayor==con5) {
            platomas.setText("Hamburguesa");
        }
        if (mayor==con6) {
            platomas.setText("Pizza (personal)");
        }
        if (mayor==con7) {
            platomas.setText("Pizza (mediana)");
        }
        if (mayor==con8) {
            platomas.setText("Pizza (familiar)");
        }
        
        
         System.out.println("el valor final del total es "+ totaldia);
         
         labeltotal.setText(totaldia+"");
        
          try (Scanner lector = new Scanner(cama1)) {

                while (lector.hasNextLine()) {

                    arch = lector.nextLine();
                    
                    tot1=Float.parseFloat(arch);
                    
                    }

                } catch (FileNotFoundException ex) {
            Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         try (Scanner lector = new Scanner(cama2)) {

                while (lector.hasNextLine()) {

                    arch = lector.nextLine();
                      tot2=Float.parseFloat(arch);
                    
                    }

                } catch (FileNotFoundException ex) {
            Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         try (Scanner lector = new Scanner(cama3)) {

                while (lector.hasNextLine()) {

                    arch = lector.nextLine();
                    
                      tot3=Float.parseFloat(arch);
                    
                    }

                } catch (FileNotFoundException ex) {
            Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         try (Scanner lector = new Scanner(cama4)) {

                while (lector.hasNextLine()) {

                    arch = lector.nextLine();
                    
                      tot4=Float.parseFloat(arch);
                    
                    }

                } catch (FileNotFoundException ex) {
            Logger.getLogger(CocinaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        float mayormesero = 0, mesero = 0;
         
        if (tot1>mayormesero) {
          mayormesero=tot1;
          mesero=1;
        }
        if (tot2>mayormesero) {
          mayormesero=tot2; 
          mesero=2;
        }
        if (tot3>mayormesero) {
          mayormesero=tot3;  
          mesero=3;
        }
        if (tot4>mayormesero) {
          mayormesero=tot4;  
          mesero=4;
        }
        
        System.out.println("el mayor mesero es"+mayormesero);
        if (mesero==1) {
            meseromas.setText("el mesero numero 1");
        }
         if (mesero==2) {
            meseromas.setText("el mesero numero 2");
        }
          if (mesero==3) {
            meseromas.setText("el mesero numero 3");
        }
           if (mesero==4) {
            meseromas.setText("el mesero numero 4");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labeltotal = new javax.swing.JLabel();
        platomas = new javax.swing.JLabel();
        meseromas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Total ventas:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Plato más Vendido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Mesero que más vendió");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Estadíticas Diarias");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meseromas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(platomas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labeltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labeltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(platomas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(meseromas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Bienvenida x = new Bienvenida();
        x.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel labeltotal;
    private javax.swing.JLabel meseromas;
    private javax.swing.JLabel platomas;
    // End of variables declaration//GEN-END:variables
}
