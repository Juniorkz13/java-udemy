package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Carlos extends Ana {

  void testeAcessos(){

    // System.out.println(segredo); // -> private
    // System.out.println(facoDentroDeCasa); // -> default
    System.out.println(formaDeFalar); // -> protected, transmitido por herança
    System.out.println(todosSabem); // -> public
  }
    
    
}
