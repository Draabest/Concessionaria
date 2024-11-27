import java.sql.*;
import java.util.Scanner;

public class Concessionaria {

    // Conexao com o banco de dados (ajustado conforme o seu ambiente)
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_concessionaria";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de veículo que deseja inserir:");
        System.out.println("1. Carro");
        System.out.println("2. Motocicleta");
        System.out.println("3. Bicicleta");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha deixada por nextInt()

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            switch (escolha) {
                case 1: // Carro
                    // Entradas do usuário para o Carro
                    System.out.print("Digite o modelo do carro: ");
                    String modeloCarro = scanner.nextLine();

                    System.out.print("Digite o ano de fabricação: ");
                    int anoDeFabricacaoCarro = scanner.nextInt();
                    scanner.nextLine();  // Consome a nova linha

                    System.out.print("Digite a montadora do carro: ");
                    String montadoraCarro = scanner.nextLine();

                    System.out.print("Digite a cor do carro: ");
                    String corCarro = scanner.nextLine();

                    System.out.print("Digite a kilometragem do carro: ");
                    double kilometragemCarro = scanner.nextDouble();
                    scanner.nextLine();  // Consome a nova linha

                    System.out.print("Digite a quantidade máxima de passageiros: ");
                    int quantidadeMaximaDePassageiros = scanner.nextInt();
                    scanner.nextLine();  // Consome a nova linha

                    System.out.print("Digite o tipo de freio do carro: ");
                    String tipoDeFreioCarro = scanner.nextLine();

                    System.out.print("O carro tem airbag? (true/false): ");
                    boolean airbagCarro = scanner.nextBoolean();

                    // Cria o objeto Carro
                    Carro carro = new Carro(modeloCarro, anoDeFabricacaoCarro, montadoraCarro, corCarro, kilometragemCarro,
                            quantidadeMaximaDePassageiros, tipoDeFreioCarro, airbagCarro);

                    // Executa o comando de insert no banco
                    try (Statement statement = connection.createStatement()) {
                        String comandoInsertCarro = carro.gerarComandoInsert();
                        statement.executeUpdate(comandoInsertCarro);
                        System.out.println("Carro inserido com sucesso!");
                    }
                    break;

                case 2: // Motocicleta
                    // Entradas do usuário para a Motocicleta
                    System.out.print("Digite o modelo da motocicleta: ");
                    String modeloMoto = scanner.nextLine();

                    System.out.print("Digite o ano de fabricação: ");
                    int anoDeFabricacaoMoto = scanner.nextInt();
                    scanner.nextLine();  // Consome a nova linha

                    System.out.print("Digite a montadora da motocicleta: ");
                    String montadoraMoto = scanner.nextLine();

                    System.out.print("Digite a cor da motocicleta: ");
                    String corMoto = scanner.nextLine();

                    System.out.print("Digite a kilometragem da motocicleta: ");
                    double kilometragemMoto = scanner.nextDouble();
                    scanner.nextLine();  // Consome a nova linha

                    System.out.print("Digite a quantidade de cilindradas: ");
                    int cilindradasMoto = scanner.nextInt();

                    System.out.print("Digite o torque da motocicleta: ");
                    double torqueMoto = scanner.nextDouble();
                    scanner.nextLine();  // Consome a nova linha

                    // Cria o objeto Motocicleta
                    Motocicleta motocicleta = new Motocicleta(modeloMoto, anoDeFabricacaoMoto, montadoraMoto, corMoto,
                            kilometragemMoto, cilindradasMoto, torqueMoto);

                    // Executa o comando de insert no banco
                    try (Statement statement = connection.createStatement()) {
                        String comandoInsertMoto = motocicleta.gerarComandoInsert();
                        statement.executeUpdate(comandoInsertMoto);
                        System.out.println("Motocicleta inserida com sucesso!");
                    }
                    break;

                case 3: // Bicicleta
                    // Entradas do usuário para a Bicicleta
                    System.out.print("Digite o modelo da bicicleta: ");
                    String modeloBicicleta = scanner.nextLine();

                    System.out.print("Digite a marca da bicicleta: ");
                    String marcaBicicleta = scanner.nextLine();

                    System.out.print("Digite a cor da bicicleta: ");
                    String corBicicleta = scanner.nextLine();

                    System.out.print("Digite o material da bicicleta: ");
                    String materialBicicleta = scanner.nextLine();

                    System.out.print("Digite a quantidade de marchas: ");
                    int quantidadeDeMarchasBicicleta = scanner.nextInt();
                    scanner.nextLine();  // Consome a nova linha

                    System.out.print("A bicicleta tem amortecedor? (true/false): ");
                    boolean amortecedorBicicleta = scanner.nextBoolean();

                    // Cria o objeto Bicicleta
                    Bicicleta bicicleta = new Bicicleta(modeloBicicleta, marcaBicicleta, corBicicleta, materialBicicleta,
                            quantidadeDeMarchasBicicleta, amortecedorBicicleta);

                    // Executa o comando de insert no banco
                    try (Statement statement = connection.createStatement()) {
                        String comandoInsertBicicleta = bicicleta.gerarComandoInsert();
                        statement.executeUpdate(comandoInsertBicicleta);
                        System.out.println("Bicicleta inserida com sucesso!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        } finally {
            scanner.close(); // Fecha o scanner
        }
    }
}
