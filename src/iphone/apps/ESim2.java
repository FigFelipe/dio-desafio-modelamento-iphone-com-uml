package iphone.apps;

import iphone.features.AparelhoTelefonico;

public class ESim2 implements AparelhoTelefonico {
    @Override
    public void atender() {
        System.out.println("Atendendo ligação pelo eSim2");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando serviço de correio de voz pelo eSim2");
    }

    @Override
    public void ligar(int numero) {
        System.out.println("Realizando ligação pelo eSim2 para o numero " + numero);

    }
}
