package iphone.apps;

import iphone.features.ReprodutorMusical;

public class SoundCloud implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando musica pelo SoundCloud");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica pelo SoundCloud");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica + " no SoundCloud");
    }
}
