/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tp6_superdetodo_lab1.vistas;


import javax.swing.table.DefaultTableModel;
import tp6_superdetodo_lab1.entidades.Producto;

/**
 *
 * @author Erica
 */
public class BusquedaNombre extends javax.swing.JInternalFrame {

    /**
     * Creates new form BusquedaNombre
     */
    public BusquedaNombre() {
        initComponents();
        cabeceraTablaProd () ;
    }
    
    private DefaultTableModel defaultTableModel = new DefaultTableModel();
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_listadoNombreProd = new javax.swing.JLabel();
        jLabel2_nombreProductos = new javax.swing.JLabel();
        jTextField_ingresoDeNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);

        jLabel1_listadoNombreProd.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1_listadoNombreProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tp6_superdetodo_lab1/vistas/imagenes/lista.png"))); // NOI18N
        jLabel1_listadoNombreProd.setText("Listado por nombre");

        jLabel2_nombreProductos.setText("Nombre del producto");

        jTextField_ingresoDeNombre.setText(" ");
        jTextField_ingresoDeNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_ingresoDeNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ingresoDeNombreActionPerformed(evt);
            }
        });
        jTextField_ingresoDeNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_ingresoDeNombreKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1_listadoNombreProd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2_nombreProductos)
                                .addGap(39, 39, 39)
                                .addComponent(jTextField_ingresoDeNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_listadoNombreProd)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_nombreProductos)
                    .addComponent(jTextField_ingresoDeNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ingresoDeNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ingresoDeNombreKeyReleased
        // se borran las filas antes de mostrarlas en la tabla
        borrarFilas ();
        // se recorre el tree set, cuando se busque por coincidencia
        for (Producto aux : Supermercado.listaDeProductos) {
            if ( aux.getDescripcion().toLowerCase().startsWith(jTextField_ingresoDeNombre.getText()) ) {
                defaultTableModel.addRow(new Object[] {
                    aux.getDescripcion(),
                    aux.getCodigo(),
                    aux.getPrecio(),
                    aux.getStock(),
                    aux.getCategoria()
                });
            }
        }
    }//GEN-LAST:event_jTextField_ingresoDeNombreKeyReleased

    private void jTextField_ingresoDeNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ingresoDeNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ingresoDeNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1_listadoNombreProd;
    private javax.swing.JLabel jLabel2_nombreProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_ingresoDeNombre;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTablaProd () {
        defaultTableModel.addColumn("Nombre");
        defaultTableModel.addColumn("Código");
        defaultTableModel.addColumn("Precio");
        defaultTableModel.addColumn("Stock");
        defaultTableModel.addColumn("Categoria");
        jTable1.setModel(defaultTableModel);
    }
    
    private void borrarFilas () {
        int fila = jTable1.getRowCount()-1;
        //se borra de atras hacia adelante 
        for (int f=fila; f>=0 ; f--) {
            defaultTableModel.removeRow(f);
        }
    }


}
