package generics;

public class CaixaNumero<N extends Number> extends Caixa<N> { // os objetos que serão criados a partir desta classe só
                                                              // poderão ser números, uma restrição a mais no tipo
                                                              // genérico

}
