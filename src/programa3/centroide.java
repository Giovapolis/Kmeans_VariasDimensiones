package programa3;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class centroide {

    private ArrayList<Double> razgos;
    private ArrayList<individuo> cercanos;

    public centroide(ArrayList<Double> coordenadas, ArrayList<individuo> cercanos) {
        this.razgos = coordenadas;
        this.cercanos = cercanos;
    }

    public ArrayList<individuo> getCercanos() {
        return cercanos;
    }

    public void setCercanos(ArrayList<individuo> cercanos) {
        this.cercanos = cercanos;
    }

    public ArrayList<Double> getRazgos() {
        return razgos;
    }

    public void setRazgos(ArrayList<Double> coordenadas) {
        this.razgos = coordenadas;
    }

    @Override
    public String toString() {
        DecimalFormat formato1 = new DecimalFormat("#.00");
        String cad = "(";
        for (int i = 0; i < razgos.size(); i++) {
            if (i == 0) {
                cad += "" + formato1.format(razgos.get(i));
            } else {
                cad += "," + formato1.format(razgos.get(i));
            }

        }
        cad += ") Tiene: " + cercanos.size() + "\n";
        return cad;
    }

}
