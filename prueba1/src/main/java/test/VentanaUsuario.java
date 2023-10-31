package test;
import javax.swing.UIManager;
import java.awt.Color;
import datos.Conexion;
import datos.UsuarioDaoJDBC;
import dominio.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;


public class VentanaUsuario extends javax.swing.JFrame {

    private VentanaSeries ventanaSeries;
    private VentanaActores ventanaActores;

    /**
     * Creates new form VentanaUsuario
     */
    public VentanaUsuario() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(173, 216, 230));
    }


    public void borrar(){
        jId.setText("");
        jNom.setText("");
        jCorreo.setText("");
        jContra.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jNom = new javax.swing.JTextField();
        jCorreo = new javax.swing.JTextField();
        jContra = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        act = new javax.swing.JButton();
        elim = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();
        jAprob = new javax.swing.JLabel();
        jTrans = new javax.swing.JLabel();
        bSeries = new javax.swing.JButton();
        bActores = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jDent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Universidad Mariano Galvez de Guatemala");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Proyecto Final");

        jLabel3.setText("Nombre");

        jLabel4.setText("Correo");

        jLabel5.setText("Contraseña");

        insert.setText("Insertar");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        act.setText("Actualizar");
        act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actActionPerformed(evt);
            }
        });

        elim.setText("Eliminar");
        elim.setBackground(new java.awt.Color(255, 0, 0)); // Color rojo para Eliminar
        elim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimActionPerformed(evt);
            }
        });

        jLabel6.setText("Id");

        jAprob.setForeground(new java.awt.Color(255, 0, 0));

        bSeries.setBackground(new java.awt.Color(255, 204, 204));
        bSeries.setForeground(new java.awt.Color(0, 0, 0));
        bSeries.setText("Series");
        bSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSeriesActionPerformed(evt);
            }
        });

        bActores.setBackground(new java.awt.Color(204, 255, 204));
        bActores.setForeground(new java.awt.Color(0, 0, 0));
        bActores.setText("Actores");
        bActores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActoresActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Mas opciones para Navegar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGap(52, 52, 52)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(insert)
                                                                                .addGap(48, 48, 48)
                                                                                .addComponent(act)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(elim))
                                                                        .addComponent(jAprob, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGap(242, 242, 242)
                                                                .addComponent(jLabel2)))
                                                .addGap(7, 7, 7)
                                                .addComponent(jDent, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(83, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(27, 27, 27)
                                                .addComponent(jContra, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel6))
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                                        .addComponent(jNom, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jId, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(47, 47, 47))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bActores)
                                                        .addComponent(bSeries))
                                                .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bSeries))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(bActores)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(insert)
                                        .addComponent(act)
                                        .addComponent(elim))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jAprob, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                                .addComponent(jTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jDent, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();

            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
                jAprob.setText("Se ha conectado a la BD");
                System.out.println("SE HA CONECTADO");
            }

            UsuarioDaoJDBC usuarioJdbc = new UsuarioDaoJDBC(conexion);

            UsuarioDTO nuevoUsuario = new UsuarioDTO();
            nuevoUsuario.setNombre(""+jNom.getText());
            nuevoUsuario.setCorreo(""+jCorreo.getText());
            nuevoUsuario.setContrasenia(""+jContra.getText());

            usuarioJdbc.insert(nuevoUsuario);

            conexion.commit();
            jTrans.setText("Se ha hecho la transaccion");
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        borrar();
    }

    private void actActionPerformed(java.awt.event.ActionEvent evt) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();

            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
                jAprob.setText("Se ha conectado a la BD");
                System.out.println("SE HA CONECTADO");
            }

            UsuarioDaoJDBC usuarioJdbc = new UsuarioDaoJDBC(conexion);

            UsuarioDTO cambioUsuario = new UsuarioDTO();
            cambioUsuario.setId(Integer.parseInt(jId.getText()));
            cambioUsuario.setNombre(""+jNom.getText());
            cambioUsuario.setCorreo(""+jCorreo.getText());
            cambioUsuario.setContrasenia(""+jContra.getText());
            usuarioJdbc.update(cambioUsuario);

            conexion.commit();
            jTrans.setText("Se ha hecho la transaccion");
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        borrar();
    }

    private void elimActionPerformed(java.awt.event.ActionEvent evt) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();

            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
                jAprob.setText("Se ha conectado a la BD");
                System.out.println("SE HA CONECTADO");
            }

            UsuarioDaoJDBC usuarioJdbc = new UsuarioDaoJDBC(conexion);

            UsuarioDTO elimUsuario = new UsuarioDTO();
            elimUsuario.setId(Integer.parseInt(jId.getText()));

            usuarioJdbc.delete(elimUsuario);

            conexion.commit();
            jTrans.setText("Se ha hecho la transaccion");
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        borrar();
    }

    private void bSeriesActionPerformed(java.awt.event.ActionEvent evt) {
        if(ventanaSeries != null){
            ventanaSeries.setVisible(true);
        }else{
            ventanaSeries = new VentanaSeries();
            ventanaSeries.setVisible(true);
        }
    }

    private void bActoresActionPerformed(java.awt.event.ActionEvent evt) {
        if(ventanaActores != null){
            ventanaActores.setVisible(true);
        }else{
            ventanaActores = new VentanaActores();
            ventanaActores.setVisible(true);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton act;
    private javax.swing.JButton bActores;
    private javax.swing.JButton bSeries;
    private javax.swing.JButton elim;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jAprob;
    private javax.swing.JTextField jContra;
    private javax.swing.JTextField jCorreo;
    private javax.swing.JLabel jDent;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jNom;
    private javax.swing.JLabel jTrans;
    // End of variables declaration//GEN-END:variables
}