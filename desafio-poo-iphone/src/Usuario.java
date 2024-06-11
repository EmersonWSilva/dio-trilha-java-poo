import equipamentos.Iphone;

public class Usuario {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    // Reprodutor Musical
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica("Brasil de quem - MC SID");

    // Aparelho Telefonico
    iphone.ligar("25968441253");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    // Navegador de Internet
    iphone.exibirPagina("www.uol.com.br");
    iphone.adicionarNovaAba();
    iphone. atualizarPagina();
  }
}
