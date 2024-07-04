package iphone.apps;

import iphone.features.NavegadorInternet;

public class Opera implements NavegadorInternet {
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Opera");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no Opera");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo página " + pagina + " no Opera");
    }
}
