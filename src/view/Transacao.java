
package view;

import control.Controller;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Bitcoin;
import model.Ethereum;
import model.Investidor;
import model.Real;
import model.Ripple;

/**
 *
 * @author marjo
 */
public class Transacao extends javax.swing.JFrame {
    Investidor investidor;
    int a;
    Real real;
    Bitcoin btc;
    Ethereum eth;
    Ripple xrp;

    public Real getReal() {
        return real;
    }

    public void setReal(Real real) {
        this.real = real;
    }

    public Bitcoin getBtc() {
        return btc;
    }

    public void setBtc(Bitcoin btc) {
        this.btc = btc;
    }

    public Ethereum getEth() {
        return eth;
    }

    public void setEth(Ethereum eth) {
        this.eth = eth;
    }

    public Ripple getXrp() {
        return xrp;
    }

    public void setXrp(Ripple xrp) {
        this.xrp = xrp;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public JLabel getLBLcotacaoBtc() {
        return LBLcotacaoBtc;
    }

    public void setLBLcotacaoBtc(JLabel LBLcotacaoBtc) {
        this.LBLcotacaoBtc = LBLcotacaoBtc;
    }

    public JLabel getLBLcotacaoEth() {
        return LBLcotacaoEth;
    }

    public void setLBLcotacaoEth(JLabel LBLcotacaoEth) {
        this.LBLcotacaoEth = LBLcotacaoEth;
    }

    public JLabel getLBLcotacaoXrp() {
        return LBLcotacaoXrp;
    }

    /**
     * Creates new form MovimentarFrame
     */
    public void setLBLcotacaoXrp(JLabel LBLcotacaoXrp) {
        this.LBLcotacaoXrp = LBLcotacaoXrp;
    }

    public Transacao(Investidor investidor, int i, Real real, Ethereum eth, Bitcoin btc, Ripple xrp) {
        initComponents();
        int a = i;
        setA(i);
        setInvestidor(investidor);
        setXrp(xrp);
        setReal(real);
        setBtc(btc);
        setEth(eth);
        
        LBLcotacaoXrp.setText(String.valueOf((float) xrp.getCotacao()));
        LBLcotacaoBtc.setText(String.valueOf((float) btc.getCotacao()));
        LBLcotacaoEth.setText(String.valueOf((float) eth.getCotacao()));
        
        controller = new Controller(this, investidor);
        if ( i == 1){
            LBLtipo.setText("Comprar");
            
        } else if ( i == 2){
            LBLtipo.setText("Vender");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTGcrypto = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LBLtipo = new javax.swing.JLabel();
        Border = new javax.swing.JPanel();
        RBbitcoin = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        LBLcotacaoBtc = new javax.swing.JLabel();
        LBLcotacaoEth = new javax.swing.JLabel();
        LBLcotacaoXrp = new javax.swing.JLabel();
        RBethereum = new javax.swing.JRadioButton();
        RBripple = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTvalor = new javax.swing.JTextField();
        BTtransacao = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crypto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 0, 12))); // NOI18N

        LBLtipo.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        LBLtipo.setText("tipo");

        Border.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BTGcrypto.add(RBbitcoin);
        RBbitcoin.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        RBbitcoin.setText("Bitcoin ");
        RBbitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBbitcoinActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Moeda:");

        LBLcotacaoBtc.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        LBLcotacaoBtc.setText("btc");

        LBLcotacaoEth.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        LBLcotacaoEth.setText("eth");

        LBLcotacaoXrp.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        LBLcotacaoXrp.setText("xrp");

        BTGcrypto.add(RBethereum);
        RBethereum.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        RBethereum.setText("Ethereum ");

        BTGcrypto.add(RBripple);
        RBripple.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        RBripple.setText("Ripple ");
        RBripple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBrippleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Cotação:");

        javax.swing.GroupLayout BorderLayout = new javax.swing.GroupLayout(Border);
        Border.setLayout(BorderLayout);
        BorderLayout.setHorizontalGroup(
            BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorderLayout.createSequentialGroup()
                .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBbitcoin)
                    .addComponent(RBethereum)
                    .addComponent(RBripple))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(LBLcotacaoBtc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LBLcotacaoEth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LBLcotacaoXrp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BorderLayout.setVerticalGroup(
            BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorderLayout.createSequentialGroup()
                .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBbitcoin)
                    .addComponent(LBLcotacaoBtc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBethereum)
                    .addComponent(LBLcotacaoEth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBripple)
                    .addComponent(LBLcotacaoXrp)))
        );

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel2.setText("Valor $:");

        TXTvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTvalorActionPerformed(evt);
            }
        });

        BTtransacao.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        BTtransacao.setText("OK");
        BTtransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTtransacaoActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton2.setText("RETURN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLtipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTvalor))
                            .addComponent(Border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BTtransacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(LBLtipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTtransacao)
                    .addComponent(jButton2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTtransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTtransacaoActionPerformed
        
        controller.Transacao(investidor, a, real, eth, btc, xrp);
    }//GEN-LAST:event_BTtransacaoActionPerformed

    private void TXTvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTvalorActionPerformed
        
    }//GEN-LAST:event_TXTvalorActionPerformed

    private void RBrippleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBrippleActionPerformed
        
    }//GEN-LAST:event_RBrippleActionPerformed

    private void RBbitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBbitcoinActionPerformed
        
    }//GEN-LAST:event_RBbitcoinActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    public ButtonGroup getBTGcrypto() {
        return BTGcrypto;
    }

    public void setBTGcrypto(ButtonGroup BTGcrypto) {
        this.BTGcrypto = BTGcrypto;
    }

    public JButton getBTtransacao() {
        return BTtransacao;
    }

    public void setBTtransacao(JButton BTtransacao) {
        this.BTtransacao = BTtransacao;
    }

    public JLabel getLBLtipo() {
        return LBLtipo;
    }

    public void setLBLtipo(JLabel LBLtipo) {
        this.LBLtipo = LBLtipo;
    }

    public JRadioButton getRBbitcoin() {
        return RBbitcoin;
    }

    public void setRBbitcoin(JRadioButton RBbitcoin) {
        this.RBbitcoin = RBbitcoin;
    }

    public JRadioButton getRBethereum() {
        return RBethereum;
    }

    public void setRBethereum(JRadioButton RBethereum) {
        this.RBethereum = RBethereum;
    }

    public JRadioButton getRBripple() {
        return RBripple;
    }

    public void setRBripple(JRadioButton RBripple) {
        this.RBripple = RBripple;
    }

    public JTextField getTXTvalor() {
        return TXTvalor;
    }

    public void setTXTvalor(JTextField TXTvalor) {
        this.TXTvalor = TXTvalor;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return Border;
    }



    public void setjPanel2(JPanel jPanel2) {
        this.Border = jPanel2;
    }
    
    private Controller controller;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BTGcrypto;
    private javax.swing.JButton BTtransacao;
    private javax.swing.JPanel Border;
    private javax.swing.JLabel LBLcotacaoBtc;
    private javax.swing.JLabel LBLcotacaoEth;
    private javax.swing.JLabel LBLcotacaoXrp;
    private javax.swing.JLabel LBLtipo;
    private javax.swing.JRadioButton RBbitcoin;
    private javax.swing.JRadioButton RBethereum;
    private javax.swing.JRadioButton RBripple;
    private javax.swing.JTextField TXTvalor;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
