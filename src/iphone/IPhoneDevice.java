package iphone;

import iphone.apps.*;
import iphone.features.AparelhoTelefonico;
import iphone.features.NavegadorInternet;
import iphone.features.ReprodutorMusical;

public class IPhoneDevice {
    public static void main(String[] args) {

        ReprodutorMusical soundCloud = new SoundCloud();
        ReprodutorMusical spotify = new Spotify();
        ReprodutorMusical youtubeMusic = new YouTubeMusic();

        soundCloud.tocar();
        soundCloud.pausar();
        soundCloud.selecionarMusica("Lamb of God - Black Label");

        spotify.tocar();
        spotify.pausar();
        spotify.selecionarMusica("Lamb of God - Hourglass");

        youtubeMusic.tocar();
        youtubeMusic.pausar();
        youtubeMusic.selecionarMusica("Soufly - Frontlines");


        NavegadorInternet opera = new Opera();
        NavegadorInternet chrome = new Chrome();
        NavegadorInternet edge = new Edge();

        opera.adicionarNovaAba();
        opera.atualizarPagina();
        opera.exibirPagina("google.com");

        chrome.adicionarNovaAba();
        chrome.atualizarPagina();
        chrome.exibirPagina("google.com");

        edge.adicionarNovaAba();
        edge.atualizarPagina();
        edge.exibirPagina("google.com");


        AparelhoTelefonico eSim1 = new ESim1();
        AparelhoTelefonico eSim2 = new ESim2();

        eSim1.atender();
        eSim1.iniciarCorreioVoz();
        eSim1.ligar(12345);

        eSim2.atender();
        eSim2.iniciarCorreioVoz();
        eSim2.ligar(54321);
    }
}
