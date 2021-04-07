package animalKingdomApp;

public class Mammal extends AbstractAnimal {

  public Mammal(String name, int yearNamed) {
    super("Mammal", name, yearNamed);
  }

  @Override
  public String move() {
    return "walk";
  }

  @Override
  public String breathe() {
    return "lungs";
  }

  @Override
  public String reproduce() {
    return "live birth";
  }
}
