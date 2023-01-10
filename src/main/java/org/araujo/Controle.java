package org.araujo;

public class Controle {

    private float inicial;
    private float inc;

    public Controle(float inicial, float inc) {
        this.inicial = inicial;
        this.inc = inc;
    }

    public float executar(Comando operacao) {
        return operacao.executar(inicial, inc);
    }
}
