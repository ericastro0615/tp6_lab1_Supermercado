package tp6_superdetodo_lab1.vistas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tp6_superdetodo_lab1.entidades.Producto;

public class BusquedaPorRubroView_1 extends javax.swing.JInternalFrame {

    //modelo para la tabla de productos
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public BusquedaPorRubroView_1() {
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        cbRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        btVerTodos = new javax.swing.JButton();
        jLabel1_listadoNombreProd = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setClosable(true);
        setResizable(true);

        cbRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Elija una opción", "COMESTIBLE", "LIMPIEZA", "PERFUMERIA" }));
        cbRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRubroActionPerformed(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtProductos);

        btVerTodos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btVerTodos.setForeground(new java.awt.Color(0, 0, 0));
        btVerTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tp6_superdetodo_lab1/vistas/imagenes/ver-lista.png"))); // NOI18N
        btVerTodos.setText("Ver todos ");
        btVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerTodosActionPerformed(evt);
            }
        });

        jLabel1_listadoNombreProd.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1_listadoNombreProd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erica\\Downloads\\lista-de-verificacion.png")); // NOI18N
        jLabel1_listadoNombreProd.setText("   Listado por rubro");

        jLabel3.setText("Elija una opción del producto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1_listadoNombreProd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btVerTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_listadoNombreProd)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVerTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRubroActionPerformed
        borrarFilas();
        //Parseo la categoria 
        String cat = (String) cbRubro.getSelectedItem();
       
        if (cat.equals("-Elija una opcion")) {
            JOptionPane.showMessageDialog(this, "Ingrese una opción");
        }
        for (Producto aux : Supermercado.listaDeProductos) {
            
            String elemMayus = (String) aux.getCategoria().toString().trim().toUpperCase();

            if (elemMayus.equals(cat)) {
                 
                modelo.addRow(new Object[]{
                    aux.getDescripcion(),
                    aux.getCodigo(),
                    aux.getPrecio(),
                    aux.getStock(),
                    aux.getCategoria()
                });
            }
        }


    }//GEN-LAST:event_cbRubroActionPerformed

    private void btVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerTodosActionPerformed
        borrarFilas();
        for (Producto aux : Supermercado.listaDeProductos) {
            //crer fila en cada iteracion con los datos del producto actual
            modelo.addRow(new Object[]{
                aux.getDescripcion(),
                aux.getCodigo(),
                aux.getPrecio(),
                aux.getStock(),
                aux.getCategoria()
            });
        }
    }//GEN-LAST:event_btVerTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVerTodos;
    private javax.swing.JComboBox<String> cbRubro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1_listadoNombreProd;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Codigo");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtProductos.setModel(modelo);
    }
    //metodo para mostrar solo lo que se este buscando, 
    //este metodo te va ejecutar antes de imprimir la tabla ,para no mostrar datos de mas
    
    private void borrarFilas() {
        //le resto 1 para contar desde 0 la cantidad de filas en la tabla
        int f = jtProductos.getRowCount() - 1;
        //f tiene un valor por eso el atajo en el for
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

}
