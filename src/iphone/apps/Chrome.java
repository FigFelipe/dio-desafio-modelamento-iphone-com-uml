package iphone.apps;

import iphone.features.NavegadorInternet;

public class Chrome implements NavegadorInternet {
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Chrome");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no Chrome");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo página " + pagina + " no Chrome");
    }
}
