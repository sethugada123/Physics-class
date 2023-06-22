
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Energy energy = new Energy();
        energy.accessingGravity();

        Scanner input = new Scanner(System.in);
        try{
            float mass = input.nextFloat();
            float height = input.nextFloat();
            float gravity = input.nextFloat();

            System.out.println(energy.Potentialenergy(mass, height, gravity));
        }catch (InputMismatchException ime){
            System.out.println("Enter a valid number");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}