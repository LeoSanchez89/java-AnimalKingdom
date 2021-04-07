package animalKingdomApp;

public class Bird extends AbstractAnimal {

  public Bird(String name, int yearNamed) {
    super("Bird", name, yearNamed);
  }

  @Override
  public String move() {
    return "fly";
  }

  @Override
  public String breathe() {
    return "lungs";
  }

  @Override
  public String reproduce() {
    return "eggs";
  }
}