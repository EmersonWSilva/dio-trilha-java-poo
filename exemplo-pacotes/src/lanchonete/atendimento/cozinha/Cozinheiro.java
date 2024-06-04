package lanchonete.atendimento.cozinha;

public class Cozinheiro {

  public void adicionarLancheNoBalcao() {
    System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
  }

  public void adicionarSucoNoBalcao() {
    System.out.println("ADICIONANDO SUCO NO BALCAO");
  }

  public void adicionarComboNoBalcao() {
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
  }

  private void prepararLanche() {
    System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
  }

  private void prepararVitamina() {
    System.out.println("PREPARANDO SUCO");
  }

  private void prepararCombo() {
    prepararLanche();
    prepararVitamina();
  }

  private void selecionarIngredientesLanche() {
    System.out.println("SELECIONANDO O PAO, SALADA, OVO E CARNE");
  }

  private void selecionarIngredientesVitamina() {
    System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
  }

  private void lavarIngredientes(){
    System.out.println("LAVANDO INGREDIENTES");
  }

  private void baterVitaminaLiquidificador() {
    System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
  }

  private void fritarIngredientesLanche() {
    System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGER");
  }

  private void pedirParaTrocarGas(Almoxarife almoxarife) {
    almoxarife.trocarGas();
  }

  private void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }
}
