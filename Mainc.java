import java.util.Scanner;

public class Mainc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int option;
        Animal myAnimal = new Animal();
        Trait myTrait = new Trait();
        do {
            System.out.println("Animals trait");
            System.out.println("1. Harimau dan singa");
            System.out.println("2. Kuda");
            System.out.println("3. Gajah");
            System.out.println("4. Burung Jalak dan burung Kakatua");
            System.out.println("5. Exit");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println(myAnimal.animal1+"\n"+myTrait.trait1+"\n");
                    break;
                case 2:
                    System.out.println(myAnimal.animal2+"\n"+myTrait.trait2+"\n");
                    break;
                case 3:
                    System.out.println(myAnimal.animal3+"\n"+myTrait.trait3+"\n");
                    break;
                case 4:
                    System.out.println(myAnimal.animal4+"\n"+myTrait.trait4+"\n");
                    break;
                default:
                    break;
            }
        } while (option != 5);
     
    }
   
    
}
