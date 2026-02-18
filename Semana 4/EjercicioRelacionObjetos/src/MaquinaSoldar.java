import java.util.Arrays;
import java.util.Objects;

public class MaquinaSoldar {
    private String marca;
    private String modelo;
    private double potencia;
    private String[] materialesSoldables;

    //constructor

    public MaquinaSoldar(String marca, String modelo, double potencia, String[] materialesSoldables) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.materialesSoldables = materialesSoldables;
    }

    //metodos
    public void soldar(String material){
        boolean soldadaExitosa = false;
        for (int i = 0; i != materialesSoldables.length; i++){
            if (material.equals(materialesSoldables[i])){
                System.out.println("La máquina de soldar " + marca + " " + modelo + " solda el " + material);
                soldadaExitosa = true;
            } else if(i == materialesSoldables.length - 1 && !soldadaExitosa){
                System.out.println("La máquina de soldar " + marca + " " + modelo + " no puede soldar " + material);
            }
        }
    }

    //getters


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public String[] getMaterialesSoldables() {
        return materialesSoldables;
    }

    //setters


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setMaterialesSoldables(String[] materialesSoldables) {
        this.materialesSoldables = materialesSoldables;
    }

    //equals

    public boolean equals(MaquinaSoldar maquinaSoldar) {
        return Double.compare(potencia, maquinaSoldar.potencia) == 0 && Objects.equals(marca, maquinaSoldar.marca) && Objects.equals(modelo, maquinaSoldar.modelo) && Objects.deepEquals(materialesSoldables, maquinaSoldar.materialesSoldables);
    }

    //toString

    public String toString() {
        return "MaquinaSoldar{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia=" + potencia +
                ", materialesSoldables=" + Arrays.toString(materialesSoldables) +
                '}';
    }
}
