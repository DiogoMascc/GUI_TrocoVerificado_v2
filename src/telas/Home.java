package telas;

import static java.lang.Math.abs;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }    
    
    String nome;
    double valor, ValorTotal = 0, ValorPago, troco;   
    int i_troco, qnt; 
    int n100, n50, n20, n10, n5, nM100;  
    int r100, r50, r20, r10, r5, rM100;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPContainer = new javax.swing.JPanel();
        jPanelBarraEsquerda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTNomeProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTValorProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTQuantidadeProduto = new javax.swing.JTextField();
        jBAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLValorTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTValorPago = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLNotas100 = new javax.swing.JLabel();
        jLNotas50 = new javax.swing.JLabel();
        jLNotas20 = new javax.swing.JLabel();
        jLNotas10 = new javax.swing.JLabel();
        jLNotas5 = new javax.swing.JLabel();
        jLMoedas1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLValorDeTroco = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jBCalcularTroco = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 480));
        setResizable(false);

        jPContainer.setBackground(new java.awt.Color(255, 255, 255));
        jPContainer.setMinimumSize(new java.awt.Dimension(760, 460));
        jPContainer.setPreferredSize(new java.awt.Dimension(780, 480));

        jPanelBarraEsquerda.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scr/IFBA.png"))); // NOI18N

        javax.swing.GroupLayout jPanelBarraEsquerdaLayout = new javax.swing.GroupLayout(jPanelBarraEsquerda);
        jPanelBarraEsquerda.setLayout(jPanelBarraEsquerdaLayout);
        jPanelBarraEsquerdaLayout.setHorizontalGroup(
            jPanelBarraEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraEsquerdaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelBarraEsquerdaLayout.setVerticalGroup(
            jPanelBarraEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraEsquerdaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scr/icons8-money-50.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Troco Verificado");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nome do Produto:");

        jTNomeProduto.setBorder(null);

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Valor: R$");

        jTValorProduto.setBorder(null);

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Quantidade:");

        jTQuantidadeProduto.setBorder(null);

        jBAdicionar.setBackground(new java.awt.Color(204, 255, 204));
        jBAdicionar.setForeground(new java.awt.Color(51, 51, 51));
        jBAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scr/icons8-add-shopping-cart-20.png"))); // NOI18N
        jBAdicionar.setText("Adicionar produto");
        jBAdicionar.setBorder(null);
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do produto", "Preço", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTProdutos);

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Valor Total:");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLValorTotal.setBackground(new java.awt.Color(204, 204, 204));
        jLValorTotal.setForeground(new java.awt.Color(51, 51, 51));
        jLValorTotal.setText("R$ 0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Valor pago:");

        jTValorPago.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Notas de 100:");

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Notas de 50:");

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Notas de 20:");

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Notas de 10:");

        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Notas de 5:");

        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Moedas de 1 real:");

        jLNotas100.setForeground(new java.awt.Color(102, 102, 102));
        jLNotas100.setText("0");

        jLNotas50.setForeground(new java.awt.Color(102, 102, 102));
        jLNotas50.setText("0");

        jLNotas20.setForeground(new java.awt.Color(102, 102, 102));
        jLNotas20.setText("0");

        jLNotas10.setForeground(new java.awt.Color(102, 102, 102));
        jLNotas10.setText("0");

        jLNotas5.setForeground(new java.awt.Color(102, 102, 102));
        jLNotas5.setText("0");

        jLMoedas1.setForeground(new java.awt.Color(102, 102, 102));
        jLMoedas1.setText("0");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Troco:");

        jLValorDeTroco.setForeground(new java.awt.Color(102, 102, 102));
        jLValorDeTroco.setText("R$ 0.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLNotas50))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLNotas20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLNotas100, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLMoedas1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLNotas5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLNotas10))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLValorDeTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel13, jLabel14, jLabel15});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLMoedas1, jLNotas10, jLNotas100, jLNotas20, jLNotas5, jLNotas50});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLValorDeTroco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLNotas100)
                    .addComponent(jLNotas10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLNotas50)
                    .addComponent(jLNotas5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLNotas20)
                    .addComponent(jLMoedas1))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jBLimpar.setBackground(new java.awt.Color(204, 255, 204));
        jBLimpar.setForeground(new java.awt.Color(51, 51, 51));
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scr/icons8-new-20.png"))); // NOI18N
        jBLimpar.setText("Nova Compra");
        jBLimpar.setBorder(null);
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBCalcularTroco.setBackground(new java.awt.Color(204, 255, 204));
        jBCalcularTroco.setForeground(new java.awt.Color(51, 51, 51));
        jBCalcularTroco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scr/icons8-cash-counter-20.png"))); // NOI18N
        jBCalcularTroco.setText("Calcular Troco");
        jBCalcularTroco.setBorder(null);
        jBCalcularTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularTrocoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jBCalcularTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jTValorPago))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(jTNomeProduto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addComponent(jTQuantidadeProduto))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCalcularTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPContainerLayout = new javax.swing.GroupLayout(jPContainer);
        jPContainer.setLayout(jPContainerLayout);
        jPContainerLayout.setHorizontalGroup(
            jPContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContainerLayout.createSequentialGroup()
                .addComponent(jPanelBarraEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPContainerLayout.setVerticalGroup(
            jPContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBarraEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPContainer, 460, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        if(jTNomeProduto.getText().equals("") || jTValorProduto.getText().equals("") || jTQuantidadeProduto.getText().equals("")){;
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        }else{
            nome = jTNomeProduto.getText();
            valor = Double.valueOf(jTValorProduto.getText().replaceAll(",", "."));
            qnt = Integer.valueOf(jTQuantidadeProduto.getText().replaceAll(",", "."));
            
            DefaultTableModel tblAdicionar = (DefaultTableModel)jTProdutos.getModel();           
            
            Object[] NovoProduto = new Object[]{nome, valor, qnt};
            
            tblAdicionar.addRow(NovoProduto);
            
            ValorTotal = ValorTotal + (valor * qnt);
//            jLValorTotal.setText("R$ " + ValorTotal);
            jLValorTotal.setText(String.format("R$ %.2f", ValorTotal));
            
            JOptionPane.showMessageDialog(this, "Produto adicionado com sucesso!");
            
            jTNomeProduto.setText("");
            jTValorProduto.setText("");
            jTQuantidadeProduto.setText("");
        }
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        DefaultTableModel tblRemove = (DefaultTableModel)jTProdutos.getModel();

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja limpar todos os campos e iniciar uma nova operação agora?", "Confirmar ação.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Campos foram limpos.");
            
            jTNomeProduto.setText("");
            jTValorProduto.setText("");
            jTQuantidadeProduto.setText("");
            jLValorTotal.setText("R$ 0.0");
            jTValorPago.setText("");
            jLNotas100.setText("0");
            jLNotas50.setText("0");
            jLNotas20.setText("0");
            jLNotas10.setText("0");
            jLNotas5.setText("0");
            jLMoedas1.setText("0");
            jLValorDeTroco.setText("R$ 0.0");
            ValorTotal = 0;
            
            while (jTProdutos.getModel().getRowCount() > 0){
                tblRemove.removeRow(0);              
            }
            
        }else if(resposta == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Continue a operação.");
        }
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCalcularTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularTrocoActionPerformed
         
        int resposta = JOptionPane.showConfirmDialog(this, "Já adicionou tudo que queria?", "Confirmar ação.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resposta == JOptionPane.YES_OPTION){
            if(jTValorPago.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Digite o valor pago!");
            }else{
                ValorPago = Double.valueOf(jTValorPago.getText().replaceAll(",", "."));           
                troco = ValorPago - ValorTotal;
                if(troco < 0){  
                    JOptionPane.showMessageDialog(null, "Compra não pode ser feita. Falta: R$ " + abs(troco));
                }else if(troco > 0){
                    JOptionPane.showMessageDialog(null, "Compra pode ser feita. Troco: R$ " + troco);                   
                    i_troco = (int) Math.round(troco);

                    n100 = i_troco / 100;
                    r100 = i_troco % 100;
                    n50 = r100 / 50;
                    r50 = r100 % 50;
                    n20 = r50 / 20;
                    r20 = r50 % 20;
                    n10 = r20 / 10;
                    r10 = r20 % 10;
                    n5 = r10 / 5;
                    r5 = r10 % 5;
                    nM100 = r5 / 1;
                    rM100 = r5 % 1;
                    // jLValorDeTroco.setText("R$ " + troco);
                    jLValorDeTroco.setText(String.format("R$ %.2f", troco));
                    jLNotas100.setText("" + n100);
                    jLNotas50.setText("" + n50);
                    jLNotas20.setText("" + n20);
                    jLNotas10.setText("" + n10);
                    jLNotas5.setText("" + n5);   
                    jLMoedas1.setText("" + nM100);
                }
            }        
        }else if(resposta == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Continue a operação.");          
        }
    }//GEN-LAST:event_jBCalcularTrocoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBCalcularTroco;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JLabel jLMoedas1;
    private javax.swing.JLabel jLNotas10;
    private javax.swing.JLabel jLNotas100;
    private javax.swing.JLabel jLNotas20;
    private javax.swing.JLabel jLNotas5;
    private javax.swing.JLabel jLNotas50;
    private javax.swing.JLabel jLValorDeTroco;
    private javax.swing.JLabel jLValorTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPContainer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBarraEsquerda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTNomeProduto;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTextField jTQuantidadeProduto;
    private javax.swing.JTextField jTValorPago;
    private javax.swing.JTextField jTValorProduto;
    // End of variables declaration//GEN-END:variables
}
