package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea{
  public void enviarMensagem() {
    validarConectadosInternet();
    System.out.println("Enviando mensagem pelo Facebook Messenger");
  }
  public void receberMensagem() {
    validarConectadosInternet();
    System.out.println("Recebendo mensagem pelo Facebook Messenger");
  }
}
