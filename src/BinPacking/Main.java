package BinPacking;

import java.util.LinkedList;
import java.util.Random;
import javax.swing.JTable;

/**
 * @author Quiroz Aguilar Juan Carlos
 * @version 1.0.0
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();

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
        btnIniciar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        NumItems = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        PobIni = new javax.swing.JComboBox<>();
        Pc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Pm = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Metodo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Paquetes = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ConfFinal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Bin- Packing Algoritmo Genetico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 12, -1, -1));

        jLabel2.setText("Numero de paquetes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 63, -1, -1));

        btnIniciar.setBackground(new java.awt.Color(51, 153, 0));
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 334, 265, 36));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 243, 36));

        NumItems.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50", "100", "500", "1000", "5000" }));
        jPanel1.add(NumItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 84, 149, -1));

        jLabel3.setText("Poblacion inical");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 63, -1, -1));

        PobIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25", "50", "300", "500", "1000" }));
        jPanel1.add(PobIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 84, 110, -1));

        Pc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.4", "0.5", "0.7" }));
        jPanel1.add(Pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 130, -1));

        jLabel4.setText("Probabilidad Mutacion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        Pm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.1", "0.2", "0.3" }));
        jPanel1.add(Pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 84, 160, -1));

        jLabel5.setText("Probabilidad Cruza");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        Metodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Torneo ", "Amplitud" }));
        jPanel1.add(Metodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 84, 149, -1));

        jLabel6.setText("Metodo Seleccion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 63, -1, -1));

        jLabel7.setText("Paquetes ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 171, -1, -1));

        Paquetes.setEditable(false);
        Paquetes.setColumns(20);
        Paquetes.setRows(5);
        jScrollPane1.setViewportView(Paquetes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 192, 249, 130));

        jLabel8.setText("Configuracion Final");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        ConfFinal.setEditable(false);
        ConfFinal.setColumns(20);
        ConfFinal.setRows(5);
        jScrollPane2.setViewportView(ConfFinal);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 383, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        ConfFinal.setText("");
        Paquetes.setText("");
        int numpaquetes;
        int pobini;
        float pm;
        float pc;
        int opt;
        int mejoras = 0;
        String temp;
        LinkedList<Item> items;
        LinkedList<Cromosoma> generacion, padres;
        Cromosoma mejorCromo;
        Controller c = new Controller();
        opt = Metodo.getSelectedIndex();
        numpaquetes = Integer.parseInt(NumItems.getSelectedItem().toString());
        pobini = Integer.parseInt(PobIni.getSelectedItem().toString());
        pm = Float.parseFloat(Pc.getSelectedItem().toString());
        pc = Float.parseFloat(Pm.getSelectedItem().toString());

        float pm1;
        int indexcromomut, indexgenmut;
        Cromosoma croamomut, cromomut;
        Random r = new Random();
        items = c.Inicializar(numpaquetes);
        for (int i = 0; i < items.size(); i++) {
            temp = Paquetes.getText();
            Paquetes.append((items.get(i).Id + 1) + "---> " + items.get(i).Peso + "\n");
        }
        generacion = c.PoblacionInicial(pobini, items);
        generacion = c.OrdenaFitness(generacion);
        mejorCromo = generacion.getFirst();

        while (mejoras < 5 || mejorCromo.fitnes >= 0.9) {
            padres = c.Seleccion(generacion, opt, pc);
            generacion = c.Cruzamiento(padres);
            generacion = c.OrdenaFitness(generacion);
            pm1 = r.nextFloat();
            if (generacion.isEmpty()) {
                break;
            }
            if (r.nextFloat() < pc) {
                indexgenmut = r.nextInt(generacion.size());
                croamomut = generacion.get(indexgenmut);
                cromomut = c.Mutacion(croamomut);
                generacion.remove(croamomut);
                generacion.add(cromomut);
                generacion = c.OrdenaFitness(generacion);

            }
            if (generacion.get(0).fitnes < mejorCromo.fitnes) {
                mejoras++;
            } else {
                mejorCromo = generacion.get(0);
                mejoras = 0;
            }
        }

        for (int i = 0; i < mejorCromo.ConfiguracionCajas.size(); i++) {
            ConfFinal.append("Caja :" + (i + 1) + "\n");
            for (int j = 0; j < mejorCromo.ConfiguracionCajas.get(i).Objetos.size(); j++) {
                ConfFinal.append("\tPaquete: " + (mejorCromo.ConfiguracionCajas.get(i).Objetos.get(j).Id + 1) + "\n");
            }
        }

    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ConfFinal;
    private javax.swing.JComboBox<String> Metodo;
    private javax.swing.JComboBox<String> NumItems;
    private javax.swing.JTextArea Paquetes;
    private javax.swing.JComboBox<String> Pc;
    private javax.swing.JComboBox<String> Pm;
    private javax.swing.JComboBox<String> PobIni;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
