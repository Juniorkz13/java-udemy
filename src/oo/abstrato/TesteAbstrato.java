package oo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {

        // Animal cachorro = new Cachorro();
        // System.out.println(cachorro.mamar()); // não funciona pois o CACHORRO foi
        // criado no nível ANIMAL

        Mamifero cachorro = new Cachorro();
        System.out.println(cachorro.mover());
        System.out.println(cachorro.mamar()); // Agora funciona pois o CACHORRO foi criado no nível MAMIFERO
        System.out.println(cachorro.respirar()); // por conta de MAMIFERO extends > ANIMAL, CACHORRO extends > MAMIFERO,
                                                 // o objeto cachorro consegue puxar o metodo de ANIMAL
    }
}
