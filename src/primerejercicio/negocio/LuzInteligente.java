package primerejercicio.negocio;

public class LuzInteligente {
    private String idLuz;
    private int nivelBrillo;
    private boolean encendido;

    public LuzInteligente(String idLuz) {
        this.idLuz = idLuz;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public void ajustarbrillo(int nuevoNivel) {
        if (encendido == true) {
            this.nivelBrillo = nuevoNivel;
        }
    }
    public void mostrarEstado(){
        if (encendido==true){
            System.out.println("La luz esta encendida");
            System.out.println("El nivel de brillo es"+nivelBrillo);
        }else{
            System.out.println("La luz esta apagada");
        }
    }



}
