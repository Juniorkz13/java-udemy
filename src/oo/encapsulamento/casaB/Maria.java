package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Maria {

    void testeAcessos(){
        Ana sogra = new Ana();

        // System.out.println(sogra.segredo); // private
        // System.out.println(sogra.facoDentroDeCasa); // default
        // System.out.println(sogra.formaDeFalar); // protected
        System.out.println(sogra.todosSabem); // public
    }
    
}
