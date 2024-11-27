public class Bicicleta {

    // Variáveis específicas da classe Bicicleta
    private String modelo;
    private String marca;
    private String cor;
    private String material;
    private int quantidadeDeMarchas;
    private boolean amortecedor;

    // Construtor que inicializa as variáveis da Bicicleta
    public Bicicleta(String modelo, String marca, String cor, String material, int quantidadeDeMarchas, boolean amortecedor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.quantidadeDeMarchas = quantidadeDeMarchas;
        this.amortecedor = amortecedor;
    }

    // Getters e Setters para as variáveis específicas da Bicicleta
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantidadeDeMarchas() {
        return quantidadeDeMarchas;
    }

    public void setQuantidadeDeMarchas(int quantidadeDeMarchas) {
        this.quantidadeDeMarchas = quantidadeDeMarchas;
    }

    public boolean isAmortecedor() {
        return amortecedor;
    }

    public void setAmortecedor(boolean amortecedor) {
        this.amortecedor = amortecedor;
    }

    // Método para gerar o comando de inserção no banco de dados para Bicicleta
    public String gerarComandoInsert() {
        return String.format("INSERT INTO Bicicleta (modelo, marca, cor, material, quantidadeDeMarchas, amortecedor) VALUES ('%s', '%s', '%s', '%s', %d, %b);",
            modelo, marca, cor, material, quantidadeDeMarchas, amortecedor);
    }
}
