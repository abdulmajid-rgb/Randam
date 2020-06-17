import java.util.Random;

public class Randam {
    public static void main (String[] args) {
        Random number = new Random();
        int randomNumber = number.nextInt(10) +1 ;
        System.out.println(randomNumber);

    }
}

