package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    // @Override
    // public void acelerar() { // duas formas de sobrescrever.
    // super.acelerar();
    // super.acelerar();
    // super.acelerar();
    // }

    public Ferrari() { // neste caso, com a falta do construtor padrão na classe pai, é necessário
        // passar os valores para construir, inclusive modificando o fator de
        // aceleração.
        super(350);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else
            return 15;
    }

    // public void acelerar(){
    // velocidadeAtual += 15;
    // }

}
