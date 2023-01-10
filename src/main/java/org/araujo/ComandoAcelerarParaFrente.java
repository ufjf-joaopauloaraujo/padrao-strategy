package org.araujo;

public class ComandoAcelerarParaFrente implements Comando {

    public float executar(float inicial, float inc) {
        return inicial + inc;
    }
}
