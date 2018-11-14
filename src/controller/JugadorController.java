package controller;

import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.Jugador;
import service.JugadorService;
import service.JugadorServiceImpl;

public class JugadorController extends javax.swing.JFrame {
    private JugadorService jugadorService = new JugadorServiceImpl();
    String nombre;
    String sexo;
    int edad;
    int nivel;
    public JugadorController() {
        initComponents();
        vacio();
        PanelAgregar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_ver = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        PanelAgregar = new javax.swing.JPanel();
        jLblNombre = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLblEdad = new javax.swing.JLabel();
        jLblSexo = new javax.swing.JLabel();
        jLblNivel = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldEdad = new javax.swing.JTextField();
        TextFieldSexo = new javax.swing.JTextField();
        TextFieldNivel = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Regresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_ver.setText("Ver Jugadores");
        bt_ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_verMouseClicked(evt);
            }
        });
        bt_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_verActionPerformed(evt);
            }
        });
        getContentPane().add(bt_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 11, -1, -1));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 52, 101, -1));

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 93, 101, -1));

        jLblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblNombre.setText("Nombre:");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLblEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblEdad.setText("Edad:");

        jLblSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblSexo.setText("Sexo:");

        jLblNivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblNivel.setText("Nivel:");

        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblNombre)
                            .addComponent(jLblEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblNivel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextFieldSexo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldEdad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addGap(7, 7, 7)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNombre)
                    .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblEdad)
                    .addComponent(TextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSexo)
                    .addComponent(TextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNivel)
                    .addComponent(TextFieldNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNuevo))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(PanelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 250));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Edad", "Nivel", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 387, 161));

        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_verActionPerformed
        
    }//GEN-LAST:event_bt_verActionPerformed

    private void bt_verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_verMouseClicked
        setDefaultCloseOperation(0);
        obtenerJugadores();

    }//GEN-LAST:event_bt_verMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        setDefaultCloseOperation(0);
        eliminarJugador();
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
       
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
      //Principal principal = new Principal();
      //principal.setVisible(true);
      this.setVisible(false);
      
      
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        OpcionMostrarNoMostrar(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void TextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        nombre = TextFieldNombre.getText();
        sexo = TextFieldSexo.getText();
        edad = Integer.parseInt(TextFieldEdad.getText());
        nivel = Integer.parseInt(TextFieldNivel.getText());
        System.out.println("nombre:"+ nombre);
        System.out.println("edad: "+edad);
        System.out.println("nivel: "+nivel);
        System.out.println("sexo:" +sexo);

        JugadorController jc = new JugadorController();
        Jugador j1 = new Jugador(nombre, edad, sexo, nivel, new Date());
        jugadorService.crearRegistro(j1);

        vacio();
        OpcionMostrarNoMostrar(true);
        btnNuevo.setEnabled(true);
        PanelAgregar.setVisible(false);
        //jc.obtenerJugador();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        vacio();
        PanelAgregar.setVisible(false);
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         PanelAgregar.setVisible(true);
         this.setEnabled(true);
         OpcionMostrarNoMostrar(false);
    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JugadorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JugadorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JugadorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JugadorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JugadorController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JTextField TextFieldEdad;
    private javax.swing.JTextField TextFieldNivel;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldSexo;
    private javax.swing.JButton bt_ver;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLblEdad;
    private javax.swing.JLabel jLblNivel;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
   
   
    
    
    public void actualizarJugador(){

    }
    
    public void eliminarJugador(){
        
        int fila = this.jTable1.getSelectedRow();
        Long id = Long.parseLong(this.jTable1.getModel().getValueAt(fila,0).toString());
        System.out.println(id);
        Jugador j = jugadorService.obtenerRegistro(id);
        jugadorService.eliminarRegistro(j);
        obtenerJugadores();
    }

    public void obtenerJugador(){
            
    }    
    public void obtenerJugadores(){
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
        for(Jugador j:jugadorService.obtenerRegistros()){
            model.addRow(new Object[]{ j.getId(),j.getNombre(),j.getEdad(),j.getNivel(),j.getSexo()});
        }
    }

    public void OpcionMostrarNoMostrar(boolean opcion){
        TextFieldNombre.setEnabled(opcion);
        TextFieldEdad.setEnabled(opcion);
        TextFieldSexo.setEnabled(opcion);
        TextFieldNivel.setEnabled(opcion);
        btnGuardar.setEnabled(opcion);
        if(opcion == true){
            btnNuevo.setEnabled(false);
        }
    }
    
    public void vacio(){
        TextFieldNombre.setText("");
        TextFieldEdad.setText("");
        TextFieldNivel.setText("");
        TextFieldSexo.setText("");
    }
}
