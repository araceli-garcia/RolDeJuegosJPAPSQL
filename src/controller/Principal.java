package controller;


import service.BatallaServiceImpl;


public class Principal extends javax.swing.JFrame {
        
    
    public Principal() {
        initComponents();        
            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_jugador = new javax.swing.JMenu();
        menu_campeones = new javax.swing.JMenu();
        menu_batallas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Jugador", "Batallas", "Campeón"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("Inicio");
        jMenuBar1.add(jMenu1);

        menu_jugador.setText("Jugadores");
        menu_jugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_jugadorMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_jugador);

        menu_campeones.setText("Campeones");
        menu_campeones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_campeonesMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_campeones);

        menu_batallas.setText("Batallas");
        menu_batallas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_batallasMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_batallas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_jugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_jugadorMouseClicked
        JugadorController jcontroller = new JugadorController();
        jcontroller.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_menu_jugadorMouseClicked

    private void menu_campeonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_campeonesMouseClicked
        CampeonController ccontroller = new CampeonController();
        ccontroller.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_menu_campeonesMouseClicked

    private void menu_batallasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_batallasMouseClicked
        BatallaController bcontroller = new BatallaController();
        bcontroller.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_menu_batallasMouseClicked

  
    public static void main(String args[]) {
        
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menu_batallas;
    private javax.swing.JMenu menu_campeones;
    private javax.swing.JMenu menu_jugador;
    // End of variables declaration//GEN-END:variables
}
