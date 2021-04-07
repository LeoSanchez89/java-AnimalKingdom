package animalKingdomApp;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) {
        
        List<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();
        // Mammals
        animalList.add(new Mammal("Panda", 1869));
        animalList.add(new Mammal("Zebra", 1778));
        animalList.add(new Mammal("Koala", 1816));
        animalList.add(new Mammal("Sloth", 1804));
        animalList.add(new Mammal("Armadillo", 1758));
        animalList.add(new Mammal("Raccoon", 1758));
        animalList.add(new Mammal("Bigfoot", 2021));
        // Birds
        animalList.add(new Bird("Pigeon", 1837));
        animalList.add(new Bird("Peacock", 1821));
        animalList.add(new Bird("Toucan", 1758));
        animalList.add(new Bird("Parrot", 1824));
        animalList.add(new Bird("Swan", 1758));
        // Fish
        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1817));
        animalList.add(new Fish("Perch", 1758));

        // Sort by Year
        animalList.sort((a1, a2) -> a1.getYear() < a2.getYear() ? 1 : -1);
        System.out.println("\nAnimals sorted by year discovered:\n");
        System.out.println(animalList);
        
        // Sort Alphabetically
        animalList.forEach((AbstractAnimal a) -> {
            System.out.println(a.getName());
            
        });
        
        // animalList.sort(Comparator.naturalOrder());
        // printFilteredAnimals(animalList, (a) -> a.getClassification() == "Mammal");

        // public void printFilteredAnimals(List<AbstractAnimal> animalList, AnimalTester animalTester){
        //     for (AbstractAnimal a : animalList) {
        //         if (FishTester.test(a)){
        //             System.out.println(a);
        //         }
        //     }
        // }

        // animalList.forEach((AbstractAnimal animal) -> {
        //     System.out.println(animal.move());
        //     System.out.println(animal.breathe());
        //     System.out.println(animal.reproduce());

        // });
    }


}
