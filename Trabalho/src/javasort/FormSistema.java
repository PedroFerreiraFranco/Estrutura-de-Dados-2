package javasort;
import java.awt.Rectangle;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {
    ArrayList<Dados> lista = new ArrayList<>();
   // Definir os comparadores

  Comparator<Dados> comparaMaisNovo = (Dados d1, Dados d2) -> d2.getYear()- d1.getYear();
  
  Comparator<Dados> comparaMaisRodado = (Dados d1, Dados d2) -> d2.getKm_driven()-d1.getKm_driven();
  
  Comparator<Dados> comparaMaisBarato = (Dados d1, Dados d2) -> d1.getSelling_price()- d2.getSelling_price();
  
  Comparator<Dados> comparaMaisCaro = (Dados d1, Dados d2) -> d2.getSelling_price()- d1.getSelling_price();
  
  Comparator<Dados> comparaNome = (Dados d1, Dados d2) -> d1.getName().compareTo(toString())-d2.getName().compareTo(toString());

  
    public FormSistema() {
        initComponents();
        carregaArquivo();
        mostra();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBinario = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        rbLinear = new javax.swing.JRadioButton();
        rbBinario = new javax.swing.JRadioButton();
        cbOrdena = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1114, 300));

        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 255, 255));
        lblProx.setText("Sistema de Informações Sobre Motos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/motorbike (1).png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(524, 300));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(115, 115, 115)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 109, Short.MAX_VALUE)
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        btnBinario.setBackground(new java.awt.Color(255, 255, 255));
        btnBinario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/check-list (1).png"))); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Ano", "Preço", "KM Rodados", "Combustível "
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/task.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbLinear);
        rbLinear.setText("Linear");

        buttonGroup1.add(rbBinario);
        rbBinario.setText("Binário");

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mais Novo", "Mais Rodado", "Mais Barato", "Mais Caro", "Ordenar por Nome" }));

        javax.swing.GroupLayout btnBinarioLayout = new javax.swing.GroupLayout(btnBinario);
        btnBinario.setLayout(btnBinarioLayout);
        btnBinarioLayout.setHorizontalGroup(
            btnBinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBinarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(btnBinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnBinarioLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(btnBinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(btnBinarioLayout.createSequentialGroup()
                                .addComponent(rbLinear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbBinario))
                            .addComponent(btnBusca))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(btnBinarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(btnBinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        btnBinarioLayout.setVerticalGroup(
            btnBinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBinarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnBinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnBinarioLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(btnBinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbLinear)
                            .addComponent(rbBinario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBusca))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
                    .addComponent(btnBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo(){
     String csvFile = "dados.csv";
        String line = "";
        String[] leitura = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                
                Dados motos = new Dados();
                
                leitura = line.split(",");
                
                motos.setName(leitura[0]);
                
                motos.setYear(Integer.parseInt(leitura[1]));
                
                motos.setSelling_price(Integer.parseInt(leitura[2]));
                
                motos.setKm_driven(Integer.parseInt(leitura[3]));
                                
                motos.setFuel(leitura[4]);

                /*System.out.println(leitura[0]+"\n");
                System.out.println(leitura[1]+"\n");
                System.out.println(leitura[2]+"\n");
                System.out.println(leitura[3]+"\n");
                System.out.println(leitura[4]+"\n");*/

                lista.add(motos); 
            }// fim percurso no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //https://1bestcsharp.blogspot.com/2016/03/java-populate-jtable-from-arraylist.html
    void mostra(){
        //limpando a tabela
        tabelaDados.setModel(new DefaultTableModel(null,new String[]{"Modelo","Ano","Preço","KM Rodados","Combustível"}));
       
        DefaultTableModel model = 
                (DefaultTableModel)tabelaDados.getModel();
        Object rowData[] = new Object[9];// qtd colunas
        for(Dados d: lista)
        {
            rowData[0] = d.getName();
            rowData[1] = d.getYear();
            rowData[2] = d.getSelling_price();
            rowData[3] = d.getKm_driven();
            rowData[4] = d.getFuel();
            model.addRow(rowData);
        }// fim preenche modelo
    }// fim mostra
   
    
   
    
    
    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
       // switch case para escolher por qual comparador ordenar
       switch(cbOrdena.getSelectedIndex()){
          
           case 0: 
               lista.sort(comparaMaisNovo);
           break;
           
           case 1: 
               lista.sort(comparaMaisRodado);
           break;
           
           case 2: 
               lista.sort(comparaMaisBarato);
           break;

            case 3: 
               lista.sort(comparaMaisCaro);
           break;
           
           case 4: 
               lista.sort(comparaNome);
           break;

       }
       mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        
        Dados dadoBusca = new Dados();
        
        dadoBusca.setName(txtBusca.getText());
        int comp = 0;
        int r = - 1;
        
        if(rbLinear.isSelected()) {
            for (int i = 0; i < lista.size(); i++) {            
                comp++;
                Dados moto = lista.get(i);
                if (moto.getName().equals(dadoBusca.getName())) {
                    r = i; 
                    break; 
                }
            }
        }else if(rbBinario.isSelected()) {
            int left = 0;
            int right = lista.size() - 1;

            while (left <= right) {
                int middle = (left + right) / 2;
                Dados moto = lista.get(middle);
                comp++;

                int comparison = moto.getName().compareTo(dadoBusca.getName());

                if (comparison == 0) {
                    r = middle;
                    break;
                } else if (comparison < 0) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        int rowIndex = r;
        if (rowIndex != -1) {
            tabelaDados.setRowSelectionInterval(rowIndex, rowIndex);
            Rectangle cellRect = tabelaDados.getCellRect(rowIndex, 0, true); 
            tabelaDados.scrollRectToVisible(cellRect); 
        }
        if(r==-1){
            JOptionPane.showMessageDialog(null,"Não encontrado: "+ r);
        }else{
            JOptionPane.showMessageDialog(null, "Encontrado, index: " + r);
            JOptionPane.showMessageDialog(null, "Número de comparações: " + comp);                 
            }
    }//GEN-LAST:event_btnBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBinario;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JRadioButton rbBinario;
    private javax.swing.JRadioButton rbLinear;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
