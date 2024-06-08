public class MSNMessenger extends ServicoMensagemInstantanea{
  public void enviarMensagem() {
    validarConectadosInternet();
    System.out.println("Enviando mensagem pelo MSN Messenger");
  }
  public void receberMensagem() {
    validarConectadosInternet();
    System.out.println("Recebendo mensagem pelo MSN Messenger");
  }
}
