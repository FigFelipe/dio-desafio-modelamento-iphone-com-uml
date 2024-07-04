package iphone.apps;

import iphone.features.AparelhoTelefonico;

public class ESim1 implements AparelhoTelefonico {
    @Override
    public void atender() {
        System.out.println("Atendendo ligação pelo eSim1");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando serviço de correio de voz pelo eSim1");
    }

    @Override
    public void ligar(int numero) {
        System.out.println("Realizando ligação pelo eSim1 para o numero " + numero);
    }
}
