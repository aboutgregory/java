import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Criar o objeto responsável por ler os dados digitados no teclado
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a marca do tênis procurado:");
        String marca = leitor.next();

        System.out.println("Agora, digite sua cor favorita:");
        String cor = leitor.next() + leitor.nextLine();

        System.out.println("Digite o modelo que está procurando:");
        String modelo = leitor.nextLine();

        System.out.println("Digite o seu tamanho");
        int tamanho = leitor.nextInt();

        System.out.println("O modelo está disponível?");
        boolean disponivel = leitor.nextBoolean();

        System.out.println("O valor do produto:");
        double valor = leitor.nextDouble();

        System.out.println("Digite quantidade do produto:");
        int quantidade = leitor.nextInt();

        double preco = quantidade * valor;
        System.out.println("O preco do produto:" + preco);

        //Criar um objeto tênis com os valores digitados pelo usuário
        Tenis jamesHarden = new Tenis();

        //Exibir os valores que estão dentro do objeto
        jamesHarden.modelo = modelo;
        jamesHarden.cor = cor;
        jamesHarden.marca = marca;
        jamesHarden.tamanho = tamanho;
        jamesHarden.disponível = disponivel;
        jamesHarden.preco = preco;
        jamesHarden.quantidade = quantidade;

    }
}
