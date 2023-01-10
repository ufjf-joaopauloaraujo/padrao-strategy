package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarcoTest {

    @Test
    void deveAcelerarParaFrente() {
        Barco barco = new Barco();
        barco.acelerarParaFrente(20.0f);
        assertEquals(20.0f, barco.getVelocidade());
    }

    @Test
    void deveAcelerarParaTras() {
        Barco barco = new Barco(0.0f, 90.0f);
        barco.acelerarParaTras(10.0f);
        assertEquals(-10.0f, barco.getVelocidade());
    }

    @Test
    void deveVirarDireita() {
        Barco barco = new Barco();
        barco.virarDireita(30.0f);
        assertEquals(-30.0f, barco.getOrientacao());
    }

    @Test
    void deveVirarDireitaMaisQue360() {
        Barco barco = new Barco();
        barco.virarDireita(395.0f);
        assertEquals(-35.0f, barco.getOrientacao());
    }

    @Test
    void deveVirarEsquerda() {
        Barco barco = new Barco();
        barco.virarEsquerda(45.0f);
        assertEquals(45.0f, barco.getOrientacao());
    }

    @Test
    void deveVirarEsquerdaMaisQue360() {
        Barco barco = new Barco();
        barco.virarEsquerda(500.0f);
        assertEquals(140.0f, barco.getOrientacao());
    }

}