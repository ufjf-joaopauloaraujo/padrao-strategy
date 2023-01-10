package org.araujo;

public class Barco {

    private float velocidade;
    private float orientacao;

    public Barco() {
        this.velocidade = 0.0f;
        this.orientacao = 0.0f;
    }

    public Barco(float velocidade, float orientacao) {
        this.velocidade = velocidade;
        this.orientacao = orientacao;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public float getOrientacao() {
        return orientacao;
    }

    public void acelerarParaFrente(float inc) {
        Controle controle = new Controle(velocidade, inc);
        this.velocidade = controle.executar(new ComandoAcelerarParaFrente());
    }

    public void acelerarParaTras(float inc) {
        Controle controle = new Controle(velocidade, inc);
        this.velocidade = controle.executar(new ComandoAcelerarParaTras());
    }

    public void virarEsquerda(float inc) {
        Controle controle = new Controle(orientacao, inc);
        this.orientacao = controle.executar(new ComandoVirarEsquerda());
    }

    public void virarDireita(float inc) {
        Controle controle = new Controle(orientacao, inc);
        this.orientacao = controle.executar(new ComandoVirarDireita());
    }

}
