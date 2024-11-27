public abstract class Automotivo {

    // Variáveis comuns a todos os veículos
    private String modelo;
    private int anoDeFabricacao;
    private String montadora;
    private String cor;
    private double kilometragem;

    // Construtor que inicializa as variáveis
    public Automotivo(String modelo, int anoDeFabricacao, String montadora, String cor, double kilometragem) {
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.montadora = montadora;
        this.cor = cor;
        this.kilometragem = kilometragem;
    }

    // Métodos getters e setters para as variáveis
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    /* Método abstrato para gerar o comando de inserção no banco de dados
     Cada classe que herdar de Automotivo deve implementar este método*/
    public abstract String gerarComandoInsert();
}
