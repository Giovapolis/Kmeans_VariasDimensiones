package ventanas;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import programa3.*;
import _2D.*;
import java.awt.Color;

public class kmeans extends javax.swing.JFrame {

    ArrayList<centroide> centros = new ArrayList<centroide>();
    ArrayList<individuo> individuos = new ArrayList<individuo>();
    public ArrayList<Color> colores = new ArrayList<Color>();
    
    Ventana ver = new Ventana();

    int razgos = 0;

    public kmeans() {
        initComponents();
        colores.add(Color.red);
        colores.add(Color.gray);
        colores.add(Color.BLUE);
        colores.add(Color.black);
        colores.add(Color.orange);
        btn_clasificar.setEnabled(false);
        btn_carga.setEnabled(false);
        btn_centroide.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        caracteristicas = new javax.swing.JTextField();
        btn_clasificar = new javax.swing.JButton();
        btn_carga = new javax.swing.JButton();
        limpia = new javax.swing.JButton();
        btn_centroide = new javax.swing.JButton();
        tipoD = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        centroidesList = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        individuosList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("K Means");
        setMinimumSize(new java.awt.Dimension(800, 460));
        setPreferredSize(new java.awt.Dimension(800, 460));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Caracteristicas"));

        jLabel1.setText("# Caracteristicas");

        caracteristicas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caracteristicas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                caracteristicasFocusLost(evt);
            }
        });

        btn_clasificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_clasificar.setText("CLASIFICAR");
        btn_clasificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clasificarActionPerformed(evt);
            }
        });

        btn_carga.setText("CARGAR DATOS");
        btn_carga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargaActionPerformed(evt);
            }
        });

        limpia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        limpia.setText("LIMPIAR");
        limpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiaActionPerformed(evt);
            }
        });

        btn_centroide.setText("COLOCAR CENTROIDE");
        btn_centroide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_centroide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_centroideActionPerformed(evt);
            }
        });

        tipoD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Euclideana", "Manhatann", "Similaridad", "Chebyshov" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_centroide)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_carga)
                                    .addComponent(btn_clasificar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(limpia, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tipoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(caracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_centroide, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_clasificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limpia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tipoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Centroides"));

        jScrollPane1.setViewportView(centroidesList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Puntos"));

        jScrollPane4.setViewportView(individuosList);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clasificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clasificarActionPerformed
        kmeans_algoritm km = new kmeans_algoritm(centros, individuos, razgos);
        limpiaCercanos();
        km.clasificar(tipoD.getSelectedIndex());
        centros = km.getCentroides();
        km.recalculaCentroide();
        listarCentroides();
        listarIndividuos();
        if( Integer.parseInt(caracteristicas.getText()) == 2 ){
            ver.plano.puntos = individuos;
            ver.plano.colores = colores;
            ver.plano.centroides = centros;
            ver.plano.dibujarPuntos(ver.plano.getGraphics());
            ver.plano.dibujarAtractores(ver.plano.getGraphics());
            ver.setVisible(true);
        }else{
            ver.setVisible(false);
        }
    }//GEN-LAST:event_btn_clasificarActionPerformed

    public void limpiaCercanos() {
        for (int i = 0; i < centros.size(); i++) {
            centros.get(i).getCercanos().clear();
        }
    }

    private void btn_cargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargaActionPerformed
        centros.clear();
        individuos.clear();
        String cvs = ""
                + "C:\\Users\\giovo\\Documents\\Universidad\\9noSemestre\\SistemasExpertos\\Programas\\Programa3\\src\\dataset\\"
                + "abalone.csv";
        File archivo = new File(cvs);
        try {
            Scanner inputStrem = new Scanner(archivo);
            String data = inputStrem.next();
            while (inputStrem.hasNext()) {
                ArrayList<Double> razgosAUX = new ArrayList<Double>();
                data = inputStrem.next();
                String[] dato = data.split(",");
                for (int i = 0; i < razgos; i++) {
                    razgosAUX.add(Double.parseDouble(dato[i]));
                }
                individuos.add(new individuo(razgosAUX, -1));
            }
            inputStrem.close();
            listarIndividuos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cargaActionPerformed

    private void caracteristicasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caracteristicasFocusLost
        if (caracteristicas.getText().equals("") || caracteristicas.getText().equals("0")) {
            btn_clasificar.setEnabled(false);
            btn_carga.setEnabled(false);
            btn_centroide.setEnabled(false);
        } else {
            razgos = Integer.parseInt(caracteristicas.getText());
            btn_clasificar.setEnabled(true);
            btn_carga.setEnabled(true);
            btn_centroide.setEnabled(true);
        }
    }//GEN-LAST:event_caracteristicasFocusLost

    private void limpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiaActionPerformed
        centros.clear();
        individuos.clear();
        listarCentroides();
        listarIndividuos();
    }//GEN-LAST:event_limpiaActionPerformed

    private void btn_centroideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_centroideActionPerformed
        ArrayList<Double> razgosAUX = new ArrayList<>();
        for (int i = 0; i < razgos; i++) {
            razgosAUX.add(Double.parseDouble(JOptionPane.showInputDialog(this, "Razgo " + i)));
        }
        centros.add(new centroide(razgosAUX, new ArrayList<individuo>()));
        listarCentroides();
    }//GEN-LAST:event_btn_centroideActionPerformed

    private void listarCentroides() {
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < centros.size(); i++) {
            modelo.addElement(centros.get(i) + "\n");
        }
        centroidesList.setModel(modelo);
    }

    private void listarIndividuos() {
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < individuos.size(); i++) {
            modelo.addElement(individuos.get(i) + "\n");
        }
        individuosList.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_carga;
    private javax.swing.JButton btn_centroide;
    private javax.swing.JButton btn_clasificar;
    private javax.swing.JTextField caracteristicas;
    private javax.swing.JList<String> centroidesList;
    private javax.swing.JList<String> individuosList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton limpia;
    private javax.swing.JComboBox<String> tipoD;
    // End of variables declaration//GEN-END:variables
}
