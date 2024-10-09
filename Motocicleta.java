public class Motocicleta extends Automotivo {

    //Variaveis
    private int cilindradas;
    private double torque;

    public Motocicleta(String modelo, int anoDeFabricacao, String montadora, String cor, double kilometragem,
                       int cilindradas, double torque) {
        super(modelo, anoDeFabricacao, montadora, cor, kilometragem);
        this.cilindradas = cilindradas;
        this.torque = torque;
    }
    

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }


    //Metodo sa classe abstrata para o banco de dados 
    @Override
    public String gerarComandoInsert() {
        return String.format("INSERT INTO Motocicleta (modelo, anoDeFabricacao, montadora, cor, kilometragem, cilindradas, torque) VALUES ('%s', %d, '%s', '%s', %f, %d, %f);",
            getModelo(), getAnoDeFabricacao(), getMontadora(), getCor(), getKilometragem(), cilindradas, torque);
    }

}
