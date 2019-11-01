public class RunTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible eatable = (Chicken) animal;
                System.out.println(eatable.howToEat());
            }
        }
    }
}
