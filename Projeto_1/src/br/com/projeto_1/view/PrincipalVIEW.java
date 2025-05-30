package br.com.projeto_1.view;
import javax.swing.JOptionPane;

public class PrincipalVIEW extends javax.swing.JFrame {


    public PrincipalVIEW() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // Para sair do programa
    private void sair(){
        Object[] options = {"Sair", "Cancelar" };
        if(JOptionPane.showOptionDialog(null, "Deseja Sair desse Sistema", "Informação",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0){
        System.exit(0);    
        }
    }
    
    //Para mostrar os clientes na principal (Abrir a classe ClienteVIEW)
    private void abreClienteVIEW(){
        ClienteVIEW clienteVIEW = new ClienteVIEW();
        this.desktopPane.add(clienteVIEW);
        clienteVIEW.setVisible(true); 
        clienteVIEW.setPosicao(); //ajustar posição
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        ItemMenuCliente = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(226, 226, 255));
        desktopPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menuCadastro.setBackground(new java.awt.Color(204, 204, 255));
        menuCadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuCadastro.setMnemonic('f');
        menuCadastro.setText("Cadrastro");

        ItemMenuCliente.setBackground(new java.awt.Color(201, 206, 252));
        ItemMenuCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ItemMenuCliente.setMnemonic('o');
        ItemMenuCliente.setText("Cliente");
        ItemMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(ItemMenuCliente);

        menuBar.add(menuCadastro);

        menuSair.setBackground(new java.awt.Color(204, 204, 255));
        menuSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuSair.setMnemonic('e');
        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ItemMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuClienteActionPerformed
        abreClienteVIEW();
    }//GEN-LAST:event_ItemMenuClienteActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed

    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        sair();
    }//GEN-LAST:event_menuSairMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemMenuCliente;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables

}
