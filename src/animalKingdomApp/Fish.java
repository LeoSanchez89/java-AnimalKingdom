package animalKingdomApp;

public class Fish extends AbstractAnimal {

  public Fish(String name, int yearNamed) {
    super("Fish", name, yearNamed);
  }

  @Override
  public String move() {
    return "swim";
  }

  @Override
  public String breathe() {
    return "gills";
  }

  @Override
  public String reproduce() {
    return "eggs";
  }
}
