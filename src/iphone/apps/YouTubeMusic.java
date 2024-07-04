package iphone.apps;

import iphone.features.ReprodutorMusical;

public class YouTubeMusic implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando musica pelo YouTube Music");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica pelo YouTube Music");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica + " no YouTube Music");
    }
}
