public class Autodromo {

  // Polimorfismo, manter os metodos dentro da propria classe e importar somento o necessario
  // Herança extends ClassePAI
  // Abstração, abstract  class e abstract metodos ( o comportamento vai ser baseado no polimorfismo de sua propria classe)
  // Encapsulamento

  public static void main(String[] args) {
    Carro jeep = new Carro();
    jeep.setChassi("112548");
    jeep.ligar();

    Moto z400 = new Moto();
    z400.setChassi("111522");
  }
}
