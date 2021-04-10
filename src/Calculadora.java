/**
 *
 * @author RAFAEL
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        resultado = new javax.swing.JLabel();
        botaoIgual = new javax.swing.JButton();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        simbol = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CalculoSom = new javax.swing.JButton();
        calculoSub = new javax.swing.JButton();
        calculoMul = new javax.swing.JButton();
        calculoDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultado.setText("0");

        botaoIgual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoIgual.setText("=");
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickBotao(evt);
            }
        });

        n1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        n2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Calculadora");

        CalculoSom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CalculoSom.setText("+");
        CalculoSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSom(evt);
            }
        });

        calculoSub.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calculoSub.setText("-");
        calculoSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSub(evt);
            }
        });

        calculoMul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calculoMul.setText("*");
        calculoMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickMul(evt);
            }
        });

        calculoDiv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        calculoDiv.setText("/");
        calculoDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickDiv(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(simbol, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(CalculoSom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoIgual))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(calculoMul, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoIgual)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalculoSom)
                    .addComponent(calculoMul)
                    .addComponent(calculoDiv)
                    .addComponent(calculoSub))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickBotao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickBotao
    float num1 = Float.parseFloat(n1.getText());    //num1 recebe o valor que está no texto de n1
    float num2 = Float.parseFloat(n2.getText());    //num2 recebe o valor que está no texto de n2
    String sim = simbol.getText();      //sim recebe o sinal q estará no texto de simbol
        switch (sim) {
            case "+":   //Se sim for igual a +
                float soma = (num1+num2);   //Efetua a soma
                resultado.setText(Float.toString(soma));
                break;
            case "-":   //Se sim for igual a -
                float sub = (num1-num2);    //Efetua a subtração
                resultado.setText(Float.toString(sub));
                break;
            case "*":   //Se sim for igual a *
                float mult = (num1*num2);   //Efetua a multiplicação
                resultado.setText(Float.toString(mult));
                break;
            case "/":   //Se sim for igual a /
                float div = (num1/num2);    //Efetua a divisão
                resultado.setText(Float.toString(div));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_clickBotao

    private void clickSom(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSom
        simbol.setText("+");
    }//GEN-LAST:event_clickSom

    private void clickSub(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSub
        simbol.setText("-");
    }//GEN-LAST:event_clickSub

    private void clickMul(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickMul
       simbol.setText("*");
    }//GEN-LAST:event_clickMul

    private void clickDiv(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickDiv
        simbol.setText("/");
    }//GEN-LAST:event_clickDiv

    public static void main(String args[]) {
    
    
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculoSom;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton calculoDiv;
    private javax.swing.JButton calculoMul;
    private javax.swing.JButton calculoSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField simbol;
    // End of variables declaration//GEN-END:variables
}
