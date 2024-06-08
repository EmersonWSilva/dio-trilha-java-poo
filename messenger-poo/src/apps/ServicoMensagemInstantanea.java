package apps;
public abstract class ServicoMensagemInstantanea {
  public abstract void enviarMensagem();
  public abstract void receberMensagem();

  //public abstract void salvarHistoricoMensagem();

  protected void validarConectadosInternet() {
    System.out.println("Validando se está conectado");
  }
}
