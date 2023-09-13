public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // Simulando ações do Reprodutor Musical
        iphone.selecionarMusica("Música 1");
        iphone.tocar();
        iphone.pausar();

        // Simulando ações do Aparelho Telefônico
        iphone.ligar("123-456-789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Simulando ações do Navegador na Internet
        iphone.exibirPagina("https://www.youtube.com/watch?v=9ou608QQRq8");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
