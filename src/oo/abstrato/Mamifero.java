package oo.abstrato;

public abstract class Mamifero extends Animal {
    
    public abstract String mamar();

   @Override
   public final String mover() { // usando o FINAL, este método não pode ser sobescrito nas classes que herdam MAMIFERO
       return "Saindo do lugar";
   }
}
