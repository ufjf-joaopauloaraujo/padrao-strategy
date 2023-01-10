package org.araujo;

public class ComandoVirarDireita implements Comando {

    public float executar(float inicial, float inc) {
        return (inicial - inc) % 360;
    }
}
