package _2D;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import programa3.centroide;
import programa3.individuo;

public class ejes extends JPanel {

    public ArrayList<individuo> puntos = new ArrayList<individuo>();
    public ArrayList<centroide> centroides = new ArrayList<centroide>();
    public ArrayList<Color> colores = new ArrayList<Color>();

    public int atractoresColocados = 0;

    @Override
    public void paintComponent(Graphics g) {
        dibujaLineas(g);
        dibujarPuntos(g);
        dibujarAtractores(g);
    }

    public void paintI(Graphics g) {
        g.create();
    }

    public void dibujaLineas(Graphics g) {
        //Ejes
        g.setColor(Color.BLUE);
        g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());

        int numdiv = 11;//Cuantas diviciones queremos
        int cadacuanto = 50;//Cada cuantos pixeles

        //Cuadricula
        g.setColor(Color.GRAY);
        for (int i = 0; i < numdiv; i++) {
            g.drawLine((i * cadacuanto), 0, (i * cadacuanto), (this.getHeight()));
            g.drawLine(0, (i * cadacuanto), this.getWidth(), (i * cadacuanto));
        }

        //Números
//        g.setColor(Color.BLACK);
//        Font fuente = new Font("Monospaced", Font.BOLD, 9);
//        g.setFont(fuente);
//        for (int i = 0; i < numdiv; i++) {
//            g.drawString(Integer.toString( ((i-5)*cadacuanto)/10 ) , (i * cadacuanto), (this.getWidth() / 2) - 3);
//            g.drawString(Integer.toString( ((i-5)*cadacuanto)/10 ) , (this.getHeight() / 2) - 3, (i * cadacuanto));
//        }
    }

    public void dibujarPuntos(Graphics g) {
        g.clearRect(0, 0, 501, 501);
        dibujaLineas(g);
        for (int i = 0; i < puntos.size(); i++) {
            g.setColor(colores.get(puntos.get(i).getClase()));
            g.fillRect(2*(puntos.get(i).getCoordenadas().get(0).intValue())+250,2*(puntos.get(i).getCoordenadas().get(1).intValue())+250, 7, 7);
        }
    }

    public void dibujarAtractores(Graphics g) {
        for (int i = 0; i < centroides.size(); i++) {
            g.setColor(colores.get(i));
            g.fillOval(2*(centroides.get(i).getRazgos().get(0).intValue())+250, 2*(centroides.get(i).getRazgos().get(1).intValue())+250, 15, 15);
        }
    }

}
