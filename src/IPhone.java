public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Comportamento: Reprodutor Musical - Tocar música");
    }

    @Override
    public void pausar() {
        System.out.println("Comportamento: Reprodutor Musical - Pausar música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Comportamento: Reprodutor Musical - Selecionar música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Comportamento: Aparelho Telefônico - Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Comportamento: Aparelho Telefônico - Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Comportamento: Aparelho Telefônico - Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Comportamento: Navegador na Internet - Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Comportamento: Navegador na Internet - Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Comportamento: Navegador na Internet - Atualizando página");
    }
}
