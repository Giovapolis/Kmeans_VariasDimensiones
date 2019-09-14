package programa3;

import java.util.ArrayList;

public class individuo {

    private ArrayList<Double> razgos;
    private int clase;

    public ArrayList<Double> getCoordenadas() {
        return razgos;
    }

    public void setCoordenadas(ArrayList<Double> coordenadas) {
        this.razgos = coordenadas;
    }

    @Override
    public String toString() {
        String cad = "(";
        for (int i = 0; i < razgos.size(); i++) {
            if (i == 0) {
                cad += "" + razgos.get(i);
            } else {
                cad += "," + razgos.get(i);
            }
        }
        cad += ") : " + clase;
        return cad;
    }

    public double distancia(ArrayList<Double> y, int t) {
        if (t == 0) {
            return distanciaEuclideana(y);
        } else if (t == 1) {
            return distanciaManhattan(y);
        } else if (t == 2) {
            return distanciaSimilaridadCoseno(y);
        } else {
            return distanciaChebyshov(y);
        }
    }

    private double distanciaEuclideana(ArrayList<Double> y) {
        double d = 0;
        for (int i = 0; i < razgos.size(); i++) {
            d += Math.pow(razgos.get(i) - y.get(i), 2.0);
        }
        d = Math.sqrt(d);
        return d;
    }

    private double distanciaManhattan(ArrayList<Double> y) {
        double d = 0;
        for (int i = 0; i < razgos.size(); i++) {
            d += Math.abs(razgos.get(i) - y.get(i));
        }
        d = Math.sqrt(d);
        return d;
    }

    private double distanciaSimilaridadCoseno(ArrayList<Double> y) {
        double dotProduct = 0.0;
        double magnitude1 = 0.0;
        double magnitude2 = 0.0;
        double d = 0.0;

        for (int i = 0; i < razgos.size(); i++) {
            dotProduct += razgos.get(i) * y.get(i);  //a.b
            magnitude1 += Math.pow(razgos.get(i), 2);  //(a^2)
            magnitude2 += Math.pow(y.get(i), 2); //(b^2)
        }

        d = dotProduct / Math.sqrt(magnitude1 * magnitude2);

        return d;
    }

    private double distanciaChebyshov(ArrayList<Double> y) {
        double d = 0;

        ArrayList<Integer> restas = new ArrayList<Integer>();
        for (int i = 0; i < razgos.size(); i++) {
            restas.add(Math.abs(razgos.get(i).intValue() - y.get(i).intValue()));
        }

        d = restas.stream().mapToDouble(i -> i).max().getAsDouble();
        System.out.println(restas);
        return d;
    }

    public individuo(ArrayList<Double> razgos, int clase) {
        this.razgos = razgos;
        this.clase = clase;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

}
