import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Toy> toys1 = new ArrayList<>(List.of(
                new Toy(1, "Lego", 10),
                new Toy(2, "Teddy bear", 5),
                new Toy(3, "Doll", 15)));
        
        ToyStore toyStore = new ToyStore();
        toyStore.put(toys1);
       
        System.out.println(toyStore.getToy());

    }

}