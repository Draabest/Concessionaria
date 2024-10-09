public class Carro extends Automotivo {


    //Variaveis
    private int quantidadeMaximaDePassageiros;
    private String tipoDeFreio;
    private boolean airbag;


    //Contrutor
    public Carro(String modelo, int anoDeFabricacao, String montadora, String cor, double kilometragem,
                     int quantidadeMaximaDePassageiros, String tipoDeFreio, boolean airbag) {
        super(modelo, anoDeFabricacao, montadora, cor, kilometragem);
        this.quantidadeMaximaDePassageiros = quantidadeMaximaDePassageiros;
        this.tipoDeFreio = tipoDeFreio;
        this.airbag = airbag;
    }


    //Getters e Setters 
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


    //Metodo sa classe abstrata para o banco de dados
    @Override
    public String gerarComandoInsert() {
        return String.format("INSERT INTO Automovel (modelo, anoDeFabricacao, montadora, cor, kilometragem, quantidadeMaximaDePassageiros, tipoDeFreio, airbag) VALUES ('%s', %d, '%s', '%s', %f, %d, '%s', %b);",
            getModelo(), getAnoDeFabricacao(), getMontadora(), getCor(), getKilometragem(), quantidadeMaximaDePassageiros, tipoDeFreio, airbag);
    }

}
