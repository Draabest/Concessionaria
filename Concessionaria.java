import java.util.Scanner;

public class Concessionaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de veículo que deseja inserir:");
        System.out.println("1. Automóvel");
        System.out.println("2. Motocicleta");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha deixada por nextInt()

        switch (escolha) {
            case 1:
                System.out.println("Digite os dados do automóvel:");
                System.out.print("Modelo: ");
                String modeloAutomovel = scanner.nextLine();
                System.out.print("Ano de Fabricação: ");
                int anoDeFabricacaoAutomovel = scanner.nextInt();
                scanner.nextLine();  // Consome a nova linha deixada por nextInt()
                System.out.print("Montadora: ");
                String montadoraAutomovel = scanner.nextLine();
                System.out.print("Cor: ");
                String corAutomovel = scanner.nextLine();
                System.out.print("Kilometragem: ");
                double kilometragemAutomovel = scanner.nextDouble();
                System.out.print("Quantidade Máxima de Passageiros: ");
                int quantidadeMaximaDePassageiros = scanner.nextInt();
                scanner.nextLine();  // Consome a nova linha deixada por nextInt()
                System.out.print("Tipo de Freio: ");
                String tipoDeFreio = scanner.nextLine();
                System.out.print("Airbag (true/false): ");
                boolean airbag = scanner.nextBoolean();

                Carro carro = new Carro(modeloAutomovel, anoDeFabricacaoAutomovel, montadoraAutomovel, corAutomovel, kilometragemAutomovel, quantidadeMaximaDePassageiros, tipoDeFreio, airbag);
                System.out.println(carro.gerarComandoInsert());
                break;

            case 2:
                System.out.println("Digite os dados da motocicleta:");
                System.out.print("Modelo: ");
                String modeloMotocicleta = scanner.nextLine();
                System.out.print("Ano de Fabricação: ");
                int anoDeFabricacaoMotocicleta = scanner.nextInt();
                scanner.nextLine();  // Consome a nova linha deixada por nextInt()
                System.out.print("Montadora: ");
                String montadoraMotocicleta = scanner.nextLine();
                System.out.print("Cor: ");
                String corMotocicleta = scanner.nextLine();
                System.out.print("Kilometragem: ");
                double kilometragemMotocicleta = scanner.nextDouble();
                System.out.print("Cilindradas: ");
                int cilindradas = scanner.nextInt();
                System.out.print("Torque: ");
                double torque = scanner.nextDouble();

                Motocicleta motocicleta = new Motocicleta(modeloMotocicleta, anoDeFabricacaoMotocicleta, montadoraMotocicleta, corMotocicleta, kilometragemMotocicleta, cilindradas, torque);
                System.out.println(motocicleta.gerarComandoInsert());
                break;
            
                case 3:
                System.out.println("Digite os dados da bicicleta:");
                System.out.print("Modelo: ");
                String modeloBicicleta = scanner.nextLine();
                System.out.print("Marca: ");
                String marcaBicicleta = scanner.nextLine();
                System.out.print("Cor: ");
                String corBicicleta = scanner.nextLine();
                System.out.print("Material: ");
                String materialBicicleta = scanner.nextLine();
                System.out.print("Quantidade de Marchas: ");
                int quantidadeDeMarchas = scanner.nextInt();
                System.out.print("Amortecedor (true/false): ");
                boolean amortecedor = scanner.nextBoolean();

                Bicicleta bicicleta = new Bicicleta(modeloBicicleta, marcaBicicleta, corBicicleta, materialBicicleta, quantidadeDeMarchas, amortecedor);
                System.out.println(bicicleta.gerarComandoInsert());
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}