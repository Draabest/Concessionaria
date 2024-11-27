public class Carro extends Automotivo {

    // Variáveis específicas da classe Carro
    private int quantidadeMaximaDePassageiros;
    private String tipoDeFreio;
    private boolean airbag;

    // Construtor que inicializa as variáveis do Carro, além das variáveis herdadas da classe Automotivo
    public Carro(String modelo, int anoDeFabricacao, String montadora, String cor, double kilometragem,
                 int quantidadeMaximaDePassageiros, String tipoDeFreio, boolean airbag) {
        super(modelo, anoDeFabricacao, montadora, cor, kilometragem);  // Chama o construtor da classe pai (Automotivo)
        this.quantidadeMaximaDePassageiros = quantidadeMaximaDePassageiros;
        this.tipoDeFreio = tipoDeFreio;
        this.airbag = airbag;
    }

    // Getters e Setters para as variáveis específicas do Carro
    public int getQuantidadeMaximaDePassageiros() {
        return quantidadeMaximaDePassageiros;
    }

    public void setQuantidadeMaximaDePassageiros(int quantidadeMaximaDePassageiros) {
        this.quantidadeMaximaDePassageiros = quantidadeMaximaDePassageiros;
    }

    public String getTipoDeFreio() {
        return tipoDeFreio;
    }

    public void setTipoDeFreio(String tipoDeFreio) {
        this.tipoDeFreio = tipoDeFreio;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    // Implementação do método gerarComandoInsert, que foi declarado na classe Automotivo
    @Override
    public String gerarComandoInsert() {
        return String.format(
            "INSERT INTO carros (modelo, anoDeFabricacao, montadora, cor, kilometragem, quantidadeMaximaDePassageiros, tipoDeFreio, airbag) VALUES ('%s', %d, '%s', '%s', %f, %d, '%s', %b);",
            getModelo(), getAnoDeFabricacao(), getMontadora(), getCor(), getKilometragem(),
            quantidadeMaximaDePassageiros, tipoDeFreio, airbag);
    }

}
