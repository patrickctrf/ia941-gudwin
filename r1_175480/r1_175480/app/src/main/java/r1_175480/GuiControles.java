/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package r1_175480;

import java.util.logging.Level;
import java.util.logging.Logger;
import ws3dproxy.CommandExecException;
import ws3dproxy.model.World;

/**
 *
 * @author patrickctrf
 */
public class GuiControles extends javax.swing.JFrame {

    public World w;

    private double coordX;      //coordenada X selecionada na interface
    private double coordY;      //coordenada Y selecionada na interface
    private int itemjListCores; //item selecionado na lista de cores
    private int itemjListTipoDeComida;  //item selecionado na lista de comidas.

    /**
     * Creates new form gui_controles
     */
    public GuiControles(World w) {
        this.coordX = 0;
        this.coordY = 0;
        this.itemjListTipoDeComida = 0;
        this.itemjListCores = 0;
        this.w = w;
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

        jButtonCriarComida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTipoDeComida = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCores = new javax.swing.JList<>();
        jButtonCriarJoia = new javax.swing.JButton();
        jTextX = new javax.swing.JTextField();
        jTextY = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCriarComida.setText("Criar Comida");
        jButtonCriarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarComidaActionPerformed(evt);
            }
        });

        jListTipoDeComida.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Perecivel", "Nao-Perecivel" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListTipoDeComida.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListTipoDeComidaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListTipoDeComida);

        jListCores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Red", "Green", "Blue", "Yellow", "Magenta", "White" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListCores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListCoresValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListCores);

        jButtonCriarJoia.setText("Criar Joia");
        jButtonCriarJoia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarJoiaActionPerformed(evt);
            }
        });

        jTextX.setText("0.0");
        jTextX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextXActionPerformed(evt);
            }
        });

        jTextY.setText("0.0");
        jTextY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextYActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(" Coordenada X");
        jScrollPane3.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Coordenada Y");
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonCriarComida)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCriarJoia)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCriarJoia)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCriarComida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jTextY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jTextX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Metodo chamado quando o usuario clica no botao "Criar Comida"
    private void jButtonCriarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarComidaActionPerformed
        try {
            // TODO add your handling code here:
            World.createFood(this.itemjListTipoDeComida, this.coordX, this.coordY);
        } catch (CommandExecException ex) {
            System.out.println("Excecao na criacao da comida");
        }
    }//GEN-LAST:event_jButtonCriarComidaActionPerformed

    // Metodo chamado quando um novo item eh selecionado na lista de comida.
    private void jListTipoDeComidaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListTipoDeComidaValueChanged
        // TODO add your handling code here:
        this.itemjListTipoDeComida = this.jListTipoDeComida.getSelectedIndex();
    }//GEN-LAST:event_jListTipoDeComidaValueChanged

    // Metodo para criacao de Joia quando o botao eh pressionado.
    private void jButtonCriarJoiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarJoiaActionPerformed
        try {
            // TODO add your handling code here:
            World.createJewel(this.itemjListCores, this.coordX, this.coordY);
        } catch (CommandExecException ex) {
            System.out.println("Excecao na criacao da Joia");
        }
    }//GEN-LAST:event_jButtonCriarJoiaActionPerformed

    //Metodo que recebe o evento de no item selecionado na lista de cores
    private void jListCoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListCoresValueChanged
        // TODO add your handling code here:
        this.itemjListCores = this.jListCores.getSelectedIndex();
    }//GEN-LAST:event_jListCoresValueChanged
    
    //Chamada de evento para nova coordenada X setada.
    private void jTextXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextXActionPerformed
        // TODO add your handling code here:
        this.coordX = Double.parseDouble(this.jTextX.getText());
    }//GEN-LAST:event_jTextXActionPerformed

    //Chamada de evento para nova coordenada Y setada.
    private void jTextYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextYActionPerformed
        // TODO add your handling code here:
        this.coordY = Double.parseDouble(this.jTextY.getText());
    }//GEN-LAST:event_jTextYActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCriarComida;
    private javax.swing.JButton jButtonCriarJoia;
    private javax.swing.JList<String> jListCores;
    private javax.swing.JList<String> jListTipoDeComida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextX;
    private javax.swing.JTextField jTextY;
    // End of variables declaration//GEN-END:variables

    public int getItemjListCores() {
        return itemjListCores;
    }

    public int getItemjListTipoDeComida() {
        return itemjListTipoDeComida;
    }
}
