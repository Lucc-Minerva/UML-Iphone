package iphone.NavegadorInternet;

public abstract class NavegadorInternetAbstract implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }
}
