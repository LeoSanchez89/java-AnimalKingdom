package animalKingdomApp;

abstract class AbstractAnimal {
    protected static int maxId = 0;
    protected int id;
    protected String classification;
    protected String name;
    protected int yearNamed;

    public AbstractAnimal(String classification, String name, int yearNamed) {
        id = maxId;
        maxId++;

        this.classification = classification;
        this.name = name;
        this.yearNamed = yearNamed;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClass(String classification) {
        this.classification = classification;
    }

    public int getYear() {
        return yearNamed;
    }

    public void setYear(int year) {
        this.yearNamed = year;
    }

    public void eat() {
        System.out.println("Nom nom nom...");
    }

    abstract String move();

    abstract String breathe();

    abstract String reproduce();

    @Override
    public String toString() {
        return "{id=" + id + ", " +
        "name=" +  name + ", " +
        "yearNamed=" + yearNamed + "}\n";
    }


}   
