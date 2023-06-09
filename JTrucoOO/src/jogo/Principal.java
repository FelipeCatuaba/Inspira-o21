/*
 * Principal.java
 *
 * Created on 19/05/2011, 09:44:35
 * License: GPLv3
 */
package jogo;

import java.util.ArrayList;

/**
 *
 * @author Emerson Ribeiro de Mello
 */
public class Principal extends javax.swing.JFrame {

   private ArrayList<Carta> baralho;
   private int posicialInicialX;// coordenada X onde deve aparecer a 1a. carta
   private int posicialInicialY;// coordenada Y onde deve aparecer a 1a. carta

   /** Creates new form Principal */
   public Principal() {
      this.posicialInicialX = 5;
      this.posicialInicialY = 5;
      this.baralho = new ArrayList<Carta>();
      this.criaBaralho();

      initComponents();
      this.setLocationRelativeTo(null);
   }

   /**
    * Cria as cartas e adiciona no baralho
    * Adaptado de:
    * Fred Swartz - February 19, 2007 - Placed in public domain.
    */
   private void criaBaralho() {
      
      String naipe = "oecp";
      String frente = "123456789qjk";
      int pos = 0;
      int px = this.posicialInicialX;
      int py = this.posicialInicialY;

      for (int n = 0; n < naipe.length(); n++) {
         for (int f = 0; f < frente.length(); f++) {
            String caminho = "" + frente.charAt(f) + naipe.charAt(n) + ".png";
            // true para carta com o verso aparecendo
            // false para aparecer a frente da carta
            Carta ca = new Carta(caminho, false);
            ca.mover(px, py);
            px += 10;
            py += 4;
            this.baralho.add(ca);
         }
      }
   }

   public int getPosicialInicialX() {
      return posicialInicialX;
   }

   public int getPosicialInicialY() {
      return posicialInicialY;
   }

   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPMesa = new Mesa(this, this.baralho);
      jPLateral = new javax.swing.JPanel();
      jBEmbaralhar = new javax.swing.JButton();
      jBVirarCartas = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jMenuBar1 = new javax.swing.JMenuBar();
      jMenu1 = new javax.swing.JMenu();
      jMenuItem3 = new javax.swing.JMenuItem();
      jMenuItem4 = new javax.swing.JMenuItem();
      jMenu2 = new javax.swing.JMenu();
      jMenuItem1 = new javax.swing.JMenuItem();
      jMenuItem2 = new javax.swing.JMenuItem();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("JTrucoOO - Jogo de Cartas 2011.1 IFSC - Telecomunicações");
      setBackground(new java.awt.Color(1, 1, 1));
      setResizable(false);

      jPMesa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      javax.swing.GroupLayout jPMesaLayout = new javax.swing.GroupLayout(jPMesa);
      jPMesa.setLayout(jPMesaLayout);
      jPMesaLayout.setHorizontalGroup(
         jPMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 548, Short.MAX_VALUE)
      );
      jPMesaLayout.setVerticalGroup(
         jPMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 428, Short.MAX_VALUE)
      );

      jPLateral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      jBEmbaralhar.setText("Embaralhar");
      jBEmbaralhar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBEmbaralharActionPerformed(evt);
         }
      });

      jBVirarCartas.setText("Virar cartas");
      jBVirarCartas.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBVirarCartasActionPerformed(evt);
         }
      });

      jLabel1.setText("Clique 2 vezes sobre a carta");

      jLabel2.setText("Clique e arraste uma carta");

      javax.swing.GroupLayout jPLateralLayout = new javax.swing.GroupLayout(jPLateral);
      jPLateral.setLayout(jPLateralLayout);
      jPLateralLayout.setHorizontalGroup(
         jPLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPLateralLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jBEmbaralhar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
               .addComponent(jBVirarCartas, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
               .addComponent(jLabel1)
               .addComponent(jLabel2))
            .addContainerGap())
      );
      jPLateralLayout.setVerticalGroup(
         jPLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLateralLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
            .addComponent(jBVirarCartas)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jBEmbaralhar)
            .addContainerGap())
      );

      jMenu1.setText("Jogo");

      jMenuItem3.setText("Novo");
      jMenu1.add(jMenuItem3);

      jMenuItem4.setText("Sair");
      jMenu1.add(jMenuItem4);

      jMenuBar1.add(jMenu1);

      jMenu2.setText("Ajuda");

      jMenuItem1.setText("Manual");
      jMenu2.add(jMenuItem1);

      jMenuItem2.setText("Sobre");
      jMenu2.add(jMenuItem2);

      jMenuBar1.add(jMenu2);

      setJMenuBar(jMenuBar1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jPMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPMesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jBEmbaralharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmbaralharActionPerformed
      ((Mesa) this.jPMesa).embaralhar();
   }//GEN-LAST:event_jBEmbaralharActionPerformed

   private void jBVirarCartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVirarCartasActionPerformed
      ((Mesa) this.jPMesa).virarCartas();
   }//GEN-LAST:event_jBVirarCartasActionPerformed

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {

         @Override
         public void run() {
            new Principal().setVisible(true);
         }
      });
   }
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jBEmbaralhar;
   private javax.swing.JButton jBVirarCartas;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JMenu jMenu1;
   private javax.swing.JMenu jMenu2;
   private javax.swing.JMenuBar jMenuBar1;
   private javax.swing.JMenuItem jMenuItem1;
   private javax.swing.JMenuItem jMenuItem2;
   private javax.swing.JMenuItem jMenuItem3;
   private javax.swing.JMenuItem jMenuItem4;
   private javax.swing.JPanel jPLateral;
   private javax.swing.JPanel jPMesa;
   // End of variables declaration//GEN-END:variables
}
