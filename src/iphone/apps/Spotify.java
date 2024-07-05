package iphone.apps;

import iphone.features.ReprodutorMusical;

public class Spotify implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando musica pelo Spotfy");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica pelo Spotfy");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica + " no Spotfy");
    }
}
