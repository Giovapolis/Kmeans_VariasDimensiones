package programa3;

import java.util.ArrayList;

public class kmeans_algoritm {

    private ArrayList<centroide> centroides;
    private ArrayList<individuo> individuos;
    private int razgos;

    public kmeans_algoritm(ArrayList<centroide> centroides, ArrayList<individuo> idividuos, int razgos) {
        this.centroides = centroides;
        this.individuos = idividuos;
        this.razgos = razgos;
    }
    
    public void clasificar(int tipo){
        double dMin = -1;
        int indice = -1;
        for (int i = 0; i < individuos.size(); i++) {
            for (int j = 0; j < centroides.size(); j++) {
                Double d = individuos.get(i).distancia(centroides.get(j).getRazgos(), tipo);
                if (j==0) {
                    dMin = d;
                    indice = j;
                }
                if (d < dMin) {
                    dMin = d;
                    indice = j;
                }
            }
            //Agrega al centroide el individuo
            ArrayList<individuo> aux = centroides.get(indice).getCercanos();
            aux.add(individuos.get(i));
            centroides.get(indice).setCercanos(aux);
            //Agrega clase al individuo
            individuos.get(i).setClase(indice);
        }
    }
    
    public void recalculaCentroide(){
        for (int i = 0; i < centroides.size(); i++) {
            //Rehacer los i centroides
            ArrayList<Double> sigRazgos = new ArrayList<>();
            for (int j = 0; j < razgos; j++) {
                Double razgo = 0.0;
                for (int k = 0; k < centroides.get(i).getCercanos().size(); k++) {
                    razgo += centroides.get(i).getCercanos().get(k).getCoordenadas().get(j);
                }
                razgo = razgo/centroides.get(i).getCercanos().size();
                sigRazgos.add(razgo);
            }
            centroides.get(i).setRazgos(sigRazgos);
        }
    }

    public ArrayList<centroide> getCentroides() {
        return centroides;
    }

    public void setCentroides(ArrayList<centroide> centroides) {
        this.centroides = centroides;
    }

    public ArrayList<individuo> getIndividuos() {
        return individuos;
    }

    public void setIndividuos(ArrayList<individuo> individuos) {
        this.individuos = individuos;
    }

    public int getRazgos() {
        return razgos;
    }

    public void setRazgos(int razgos) {
        this.razgos = razgos;
    }

}
