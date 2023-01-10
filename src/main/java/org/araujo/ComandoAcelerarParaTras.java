package org.araujo;

public class ComandoAcelerarParaTras implements Comando {

    public float executar(float inicial, float inc) {
        return inicial - inc;
    }
}
