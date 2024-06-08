package apps;
public class Telegram extends ServicoMensagemInstantanea{
  public void enviarMensagem() {
    validarConectadosInternet();
    System.out.println("Enviando mensagem pelo Telegram");
  }
  public void receberMensagem() {
    validarConectadosInternet();
    System.out.println("Recebendo mensagem pelo Telegram");
  }
}
