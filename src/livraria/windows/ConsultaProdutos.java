/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria.windows;

/**
 *
 * @author hendr
 */
public class Produtos extends javax.swing.JFrame {

    /**
     * Creates new form Produtos
     */
    public Produtos() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        clientes = new javax.swing.JMenu();
        cad_clientes = new javax.swing.JMenuItem();
        consulta_clientes = new javax.swing.JMenuItem();
        produtos = new javax.swing.JMenu();
        cad_produtos = new javax.swing.JMenuItem();
        consulta_produtos = new javax.swing.JMenuItem();
        fornecedores = new javax.swing.JMenu();
        cad_fornecedores = new javax.swing.JMenuItem();
        consulta_fornecedores = new javax.swing.JMenuItem();
        relatorio_entrada = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        relatorio_saidas = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenu();

        setPreferredSize(new java.awt.Dimension(555, 586));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(541, 590));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Consulta de produtos");

        jTextField1.setText("Procurar");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Categoria", "Descrição", "Quantidade", "Preço"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Editar");

        jButton1.setText("Buscar");

        jButton4.setText("Salvar alterações");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(256, 256, 256)
                .addComponent(jButton4)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(false);

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/livro.png"))); // NOI18N
        home.setText("Home");
        jMenuBar1.add(home);

        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/cliente.png"))); // NOI18N
        clientes.setText("Clientes");

        cad_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/cad_cliente.png"))); // NOI18N
        cad_clientes.setText("Cadastro");
        cad_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cad_clientesMouseClicked(evt);
            }
        });
        cad_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_clientesActionPerformed(evt);
            }
        });
        clientes.add(cad_clientes);

        consulta_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/consulta_clientes.png"))); // NOI18N
        consulta_clientes.setText("Consulta");
        clientes.add(consulta_clientes);

        jMenuBar1.add(clientes);

        produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/produtos.png"))); // NOI18N
        produtos.setText("Produtos");

        cad_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/consulta_produtos.png"))); // NOI18N
        cad_produtos.setText("Cadastros");
        cad_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_produtosActionPerformed(evt);
            }
        });
        produtos.add(cad_produtos);

        consulta_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/cad_produtos.png"))); // NOI18N
        consulta_produtos.setText("Consulta");
        consulta_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_produtosActionPerformed(evt);
            }
        });
        produtos.add(consulta_produtos);

        jMenuBar1.add(produtos);

        fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/fornecedor.png"))); // NOI18N
        fornecedores.setText("Fornecedores");
        fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedoresActionPerformed(evt);
            }
        });

        cad_fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/cad_fornecedor.png"))); // NOI18N
        cad_fornecedores.setText("Cadastro");
        cad_fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_fornecedoresActionPerformed(evt);
            }
        });
        fornecedores.add(cad_fornecedores);

        consulta_fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/consulta_fornecedor.png"))); // NOI18N
        consulta_fornecedores.setText("Consulta");
        fornecedores.add(consulta_fornecedores);

        jMenuBar1.add(fornecedores);

        relatorio_entrada.setBackground(new java.awt.Color(255, 255, 255));
        relatorio_entrada.setBorder(null);
        relatorio_entrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/relatorio.png"))); // NOI18N
        relatorio_entrada.setText("Relatórios");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/relatorio_entrada.png"))); // NOI18N
        jMenuItem9.setText("Entradas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        relatorio_entrada.add(jMenuItem9);

        relatorio_saidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livraria/img/relatorio_saida.png"))); // NOI18N
        relatorio_saidas.setText("Saídas");
        relatorio_entrada.add(relatorio_saidas);

        jMenuBar1.add(relatorio_entrada);

        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cad_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cad_clientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cad_clientesMouseClicked

    private void cad_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_clientesActionPerformed
        // TODO add your handling code here:
        new Clientes().show();
        Clientes.isDefaultLookAndFeelDecorated();
    }//GEN-LAST:event_cad_clientesActionPerformed

    private void cad_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_produtosActionPerformed
        // TODO add your handling code here:
        new Produtos().show();
    }//GEN-LAST:event_cad_produtosActionPerformed

    private void consulta_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_produtosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consulta_produtosActionPerformed

    private void cad_fornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_fornecedoresActionPerformed
        // TODO add your handling code here:
        new Fornecedores().show();
    }//GEN-LAST:event_cad_fornecedoresActionPerformed

    private void fornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedoresActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        new Relatorios().show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_sairMouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cad_clientes;
    private javax.swing.JMenuItem cad_fornecedores;
    private javax.swing.JMenuItem cad_produtos;
    private javax.swing.JMenu clientes;
    private javax.swing.JMenuItem consulta_clientes;
    private javax.swing.JMenuItem consulta_fornecedores;
    private javax.swing.JMenuItem consulta_produtos;
    private javax.swing.JMenu fornecedores;
    private javax.swing.JMenu home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu produtos;
    private javax.swing.JMenu relatorio_entrada;
    private javax.swing.JMenuItem relatorio_saidas;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables
}