package iphone.ReprodutorMusical;

public class ReprodutorMusicalAbstract implements ReprodutorMusical{
    
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar");
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println("Selecionar música");
    }
}
