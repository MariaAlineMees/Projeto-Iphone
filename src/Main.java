public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando Reprodutor Musical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("11999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador
        meuIphone.exibirPagina("https://dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
