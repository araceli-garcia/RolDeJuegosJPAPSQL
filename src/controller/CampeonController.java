package controller;

import java.math.BigDecimal;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.Campeon;
import service.CampeonService;
import service.CampeonServiceImpl;

public class CampeonController extends javax.swing.JFrame {
    private CampeonService campeonService = new CampeonServiceImpl();
    String nombre;
    String sexo;
    int edad;
    int tipo;
    BigDecimal precio;
    
    public CampeonController() {
        initComponents();
        vacio();
        PanelAgregar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        PanelAgregar = new javax.swing.JPanel();
        jLblNombre = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLblEdad = new javax.swing.JLabel();
        jLblSexo = new javax.swing.JLabel();
        jLblTipo = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldEdad = new javax.swing.JTextField();
        TextFieldSexo = new javax.swing.JTextField();
        TextFieldNivel = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        TextFieldPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Regresar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Ver Campeones");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 11, -1, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 52, 107, -1));

        jButton3.setText("Editar");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 93, 107, -1));

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

        jLblTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblTipo.setText("Tipo:");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Precio:");

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblNombre)
                            .addComponent(jLblEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(TextFieldSexo)
                            .addComponent(TextFieldEdad)
                            .addComponent(TextFieldNombre)
                            .addComponent(TextFieldNivel))))
                .addContainerGap(68, Short.MAX_VALUE))
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
                    .addComponent(jLblTipo)
                    .addComponent(TextFieldNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNuevo))
                .addGap(50, 50, 50))
        );

        getContentPane().add(PanelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 290));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Edad", "Precio", "Sexo", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 377, 275));

        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setDefaultCloseOperation(0);
        obtenerCampeones();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setDefaultCloseOperation(0);      
        obtenerCampeones();

    }//GEN-LAST:event_jButton1MouseClicked

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminarCampeon();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PanelAgregar.setVisible(true);
        this.setEnabled(true);
        OpcionMostrarNoMostrar(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
        tipo = Integer.parseInt(TextFieldNivel.getText());
        CampeonController cc = new CampeonController();
        Campeon j1 = new Campeon(nombre, edad, sexo, tipo,precio ,new Date());
        campeonService.crearRegistro(j1);

        vacio();
        OpcionMostrarNoMostrar(true);
        btnNuevo.setEnabled(true);
        PanelAgregar.setVisible(false);
        //cc.obtenerCampeon();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        vacio();
        PanelAgregar.setVisible(false);
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

  
    public static void main(String args[]) {
       
       
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CampeonController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JTextField TextFieldEdad;
    private javax.swing.JTextField TextFieldNivel;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldPrecio;
    private javax.swing.JTextField TextFieldSexo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblEdad;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JLabel jLblTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
   
    public void actualizarCampeon(){
        Campeon c = campeonService.obtenerRegistro(new Long(2));
        c.setNombre("yo merengues");        
        campeonService.actualizarRegistro(c);
    }
    
    public void eliminarCampeon(){
        int fila = this.jTable1.getSelectedRow();
        Long id = Long.parseLong(this.jTable1.getModel().getValueAt(fila,0).toString());
        System.out.println(id);
        Campeon c = campeonService.obtenerRegistro(id);
        campeonService.eliminarRegistro(c);
        obtenerCampeones();
    }

    public void obtenerCampeon(){

    }
    
    public void obtenerCampeones(){
         
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
        for(Campeon j:campeonService.obtenerRegistros()){
            model.addRow(new Object[]{ j.getId(),j.getNombre(),j.getEdad(),j.getPrecio(),j.getSexo(),j.getTipo()});
    }
    }
    
    public void OpcionMostrarNoMostrar(boolean opcion){
        TextFieldNombre.setEnabled(opcion);
        TextFieldEdad.setEnabled(opcion);
        TextFieldSexo.setEnabled(opcion);
        TextFieldNivel.setEnabled(opcion);
        TextFieldPrecio.setEnabled(opcion);
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
        TextFieldPrecio.setText("");
    }
}
