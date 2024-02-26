public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "Doll", 5, 20);
        Toy toy2 = new Toy(2, "Car", 10, 30);
        Toy toy3 = new Toy(3, "Teddy Bear", 8, 50);

        toyStore.addToy(toy1);
        toyStore.addToy(toy2);
        toyStore.addToy(toy3);

        toyStore.updateToyWeight(1, 10);
        toyStore.updateToyWeight(2, 20);
        toyStore.updateToyWeight(3, 70);

        Toy prizeToy = toyStore.selectPrizeToy();
        if (prizeToy != null) {
            toyStore.savePrizeToyToFile(prizeToy);
        }
    }
}