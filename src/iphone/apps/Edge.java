package iphone.apps;

import iphone.features.NavegadorInternet;

public class Edge implements NavegadorInternet {

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Edge");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no Edge");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo página " + pagina + " no Edge");
            }
}
