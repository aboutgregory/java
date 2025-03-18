public class Principal {

    //Método principal, por onde o programa começa
    public static void main(String[] args) {

        //Criar um obeto a partir da classe Piloto
        Piloto botoleto = new Piloto();
        botoleto.nome = "Gabriel Bortoleto";
        botoleto.equipe = "Ferrari";
        botoleto.peso = 80;
        botoleto.vitorias = 25;
        botoleto.record = 25.55;

        //Criar um outro objeto do Piloto
        Piloto nathalia = new Piloto();
        nathalia.nome = "Henrique Nathalia";
        nathalia.equipe = "Mercedes";
        nathalia.peso = 75;
        nathalia.vitorias = 48;
        nathalia.record = 48.15;

        Piloto james = new Piloto();
        james.nome = "Bryce James";
        james.equipe = "Red Bull";
        james.peso = 92;
        james.vitorias = 38;
        james.record = 38.23;

        //Exibir os valores
        System.out.println(nathalia.nome + "|" + nathalia.record + "|" + nathalia.equipe);

        System.out.println(james.nome + "|" + james.record + "|" + james.equipe);

    }
}