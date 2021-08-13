package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> { // aqui deixa explicíto que o tipo C é um Number

    private final Set<Par<C, V>> itens = new LinkedHashSet<>();

    public void adicionar(C chave, V valor) {
        if (chave == null)
            return; // retorna e não faz nada caso a chave seja nula

        Par<C, V> novoPar = new Par<C, V>(chave, valor); // cria um novo par

        if (itens.contains(novoPar)) { // caso a chave já exista, ela será excluída e adicionada atualizada
                                       // posteriormente
            itens.remove(novoPar);
        }

        itens.add(novoPar); // adiciona o novo par
    }

    public V getValor(C chave) { // retorna o valor associado a chave
        if (chave == null)
            return null; // retorna null caso a chave seja nula

        Optional<Par<C, V>> parOpcional = itens.stream().filter(par -> chave.equals(par.getChave())).findFirst(); // filtra
                                                                                                                  // os
                                                                                                                  // itens
                                                                                                                  // que
                                                                                                                  // tenham
                                                                                                                  // a
                                                                                                                  // chave
                                                                                                                  // passada
                                                                                                                  // por
                                                                                                                  // parâmetro

        return parOpcional.isPresent() ? parOpcional.get().getValor() : null; // retorna o valor associado a chave
    }

}
