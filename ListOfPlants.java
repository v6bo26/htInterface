package project;
import project.App.Plant;
public class ListOfPlants {
    public class Vegetable extends Plant{

        public Vegetable() {
            super(0, null, null, null, null);
        }
    }
    
    public class Fruit extends Plant{
        public Fruit(int Weigth, String Color, String Maturity, String Condition, String Cleaning) {
            super(Weigth, Color, Maturity, Condition, Cleaning);
        }
        
        public class Apple{
            Apple gala = new Apple(230, "5fhcbvnj", "nskjdnvc");
        }
   }
}
