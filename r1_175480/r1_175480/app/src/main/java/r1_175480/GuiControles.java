/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package r1_175480;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import ws3dproxy.CommandExecException;
import ws3dproxy.model.Creature;
import ws3dproxy.model.Leaflet;
import ws3dproxy.model.Thing;
import ws3dproxy.model.World;

/**
 *
 * @author patrickctrf
 */
public class GuiControles extends javax.swing.JFrame {

    public World w;
    public Creature c;
    private JTextField textField;   // texField que funciona delistener do teclado

    private double coordX;      //coordenada X selecionada na interface
    private double coordY;      //coordenada Y selecionada na interface
    private int itemjListCores; //item selecionado na lista de cores
    private int itemjListTipoDeComida;  //item selecionado na lista de comidas.

    /**
     * Creates new form gui_controles
     */
    public GuiControles(World w, Creature c, JTextField textField) {
        this.coordX = 0;
        this.coordY = 0;
        this.itemjListTipoDeComida = 0;
        this.itemjListCores = 0;
        this.w = w;
        this.c = c;
        this.textField = textField;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jButtonComeOuGuarda = new javax.swing.JButton();
        jButtonEntregarLeaflet = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCriarComida.setText("Criar Comida");
        jButtonCriarComida.setFocusable(false);
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
        jListTipoDeComida.setFocusable(false);
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
        jListCores.setFocusable(false);
        jListCores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListCoresValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListCores);

        jButtonCriarJoia.setText("Criar Joia");
        jButtonCriarJoia.setFocusable(false);
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
        jTextArea1.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Coordenada Y");
        jTextArea2.setFocusable(false);
        jScrollPane4.setViewportView(jTextArea2);

        jButtonComeOuGuarda.setText("Comer ou Guardar");
        jButtonComeOuGuarda.setFocusable(false);
        jButtonComeOuGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComeOuGuardaActionPerformed(evt);
            }
        });

        jButtonEntregarLeaflet.setText("Entrega Leaflet");
        jButtonEntregarLeaflet.setFocusable(false);
        jButtonEntregarLeaflet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntregarLeafletActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Red", null, null, null},
                {"Green", null, null, null},
                {"Blue", null, null, null},
                {"Yellow", null, null, null},
                {"Magenta", null, null, null},
                {"White", null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "LF 1", "LF 2", "LF 3"
            }
        ));
        jScrollPane5.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButtonCriarComida)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCriarJoia)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonComeOuGuarda)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonEntregarLeaflet)
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCriarJoia)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCriarComida)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButtonComeOuGuarda)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonEntregarLeaflet)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jTextY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
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
        this.textField.requestFocus();
    }//GEN-LAST:event_jTextXActionPerformed

    //Chamada de evento para nova coordenada Y setada.
    private void jTextYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextYActionPerformed
        // TODO add your handling code here:
        this.coordY = Double.parseDouble(this.jTextY.getText());
        this.textField.requestFocus();
    }//GEN-LAST:event_jTextYActionPerformed

    protected void updateLeafletTable() {
        List<Leaflet> leaflets = c.getLeaflets();
        String[] cores = {"Red", "Green", "Blue", "Yellow", "Magenta", "White"};
        
        // i comeca em 1 pq pulamos a coluna de titulos.
        int i = 1, j = 0;
        for (Leaflet leaflet : leaflets) {
            j=0;
            for (String cor : cores) {
                jTable1.setValueAt(
                        leaflet.getItems().getOrDefault(cor, new Integer[]{0, 0})[0], j, i);
                j++;
            }
            i++;
        }
    }

    private void jButtonEntregarLeafletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntregarLeafletActionPerformed
        c.updateState();
        updateLeafletTable();
        try {
            // TODO add your handling code here:
            Leaflet leafletExtraido = c.getLeaflets().get(0);
            c.deliverLeaflet("" + leafletExtraido.getID());
        } catch (CommandExecException ex) {
            System.out.println("Nao foi possivel entregar LeafLet");
        }
        updateLeafletTable();
    }//GEN-LAST:event_jButtonEntregarLeafletActionPerformed

    private void jButtonComeOuGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComeOuGuardaActionPerformed
        // TODO add your handling code here:
        c.updateState();
        updateLeafletTable();
        List<Thing> thingsInVisionList = c.getThingsInVision();
        String thingsNames = c.getThingsNames();

        if (!thingsInVisionList.isEmpty()) {
            try {
                this.c.eatIt(thingsInVisionList.get(0).getName());
                System.out.println("Objeto foi comido.");
            } catch (CommandExecException ex) {
                System.out.println("Não foj possivel comer o objeto.");
            }

            try {
                this.c.putInSack(thingsInVisionList.get(0).getName());
                System.out.println("Objeto guardado na sacola.");
            } catch (CommandExecException ex) {
                System.out.println("Nao foi possivel colocar na sacola.");
            }
        }
        updateLeafletTable();
    }//GEN-LAST:event_jButtonComeOuGuardaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonComeOuGuarda;
    private javax.swing.JButton jButtonCriarComida;
    private javax.swing.JButton jButtonCriarJoia;
    private javax.swing.JButton jButtonEntregarLeaflet;
    private javax.swing.JList<String> jListCores;
    private javax.swing.JList<String> jListTipoDeComida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
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
