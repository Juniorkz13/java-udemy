package oo.heranca.desafio;

public interface Luxo {

    void ligarAr();

    void desligarAr();

    default int nivelDoAr() { // utilizando o método PADRÃO (DEFAULT), desobriga a criação do método nas
                              // classes que implementam a INTERFACE, porém pode sim ser criado na outra
                              // classe e modificado de acordo com a necessidade do codigo
        return 1;
    }
}
