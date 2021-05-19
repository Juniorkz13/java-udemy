package oo.encapsulamento.casaA;

public class Joao {

    Ana esposa = new Ana();

    void testeAcessos(){
        // System.out.println(esposa.segredo); // Atributo inacessível - Private
        System.out.println(esposa.facoDentroDeCasa); // - Default
        System.out.println(esposa.formaDeFalar); // - Protected
        System.out.println(esposa.todosSabem); // - Public
    }
    
}
