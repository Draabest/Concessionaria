public class Motocicleta extends Automotivo {

    // Variáveis específicas da classe Motocicleta
    private int cilindradas;
    private double torque;

    // Construtor que inicializa as variáveis da Motocicleta, além das variáveis herdadas da classe Automotivo
    public Motocicleta(String modelo, int anoDeFabricacao, String montadora, String cor, double kilometragem,
                       int cilindradas, double torque) {
        super(modelo, anoDeFabricacao, montadora, cor, kilometragem);  // Chama o construtor da classe pai (Automotivo)
        this.cilindradas = cilindradas;
        this.torque = torque;
    }

    // Getters e Setters para as variáveis específicas da Motocicleta
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

    // Implementação do método gerarComandoInsert, que foi declarado na classe Automotivo
    @Override
    public String gerarComandoInsert() {
        // Retorna o comando de inserção para o banco de dados, formatando os dados da Motocicleta
        return String.format("INSERT INTO Motocicleta (modelo, anoDeFabricacao, montadora, cor, kilometragem, cilindradas, torque) VALUES ('%s', %d, '%s', '%s', %f, %d, %f);",
                getModelo(), getAnoDeFabricacao(), getMontadora(), getCor(), getKilometragem(), cilindradas, torque);
    }
}
