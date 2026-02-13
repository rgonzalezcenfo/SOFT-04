public class MaquinaSoldar {
    private String marca;
    private String modelo;
    private String potencia;
    private String[] materialesSoldables;

    //constructor

    public MaquinaSoldar(String marca, String modelo, String potencia, String[] materialesSoldables) {
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
}
