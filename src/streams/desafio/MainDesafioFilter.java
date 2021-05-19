package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainDesafioFilter {
    public static void main(String[] args) {

        Carro c1 = new Carro("i30", "Hyundai", "Prata", 2.0, 30000.00);
        Carro c2 = new Carro("HB20", "Hyundai", "Preto", 1.0, 22000.00);
        Carro c3 = new Carro("EcoSport", "Ford", "Prata", 1.6, 75000.00);
        Carro c4 = new Carro("Ranger", "Ford", "Prata", 2.2, 36000.00);
        Carro c5 = new Carro("Veloster", "Hyundai", "Vermelho", 2.0, 33000.00);
        Carro c6 = new Carro("Santa Fé", "Hyundai", "Verde", 2.2, 42000.00);

        List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6);
        Predicate<Carro> potencia = c -> c.potencia >= 2.0;
        Predicate<Carro> cor = c -> c.cor == "Prata";
        Function<Carro, String> mensagem = c -> "Carro: " + c.nome + "\nMarca: " + c.marca + "\nPotência: " + c.potencia
                + "\nCor: " + c.cor + "\nPreço: " + c.preco + "\n";

        carros.stream().filter(potencia).filter(cor).map(mensagem).forEach(System.out::println);

    }
}
