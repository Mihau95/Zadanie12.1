import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Numbers {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("RandomNumbers.txt");
        Scanner scanner = new Scanner(file);
        TreeSet<Integer> numbers = new TreeSet<>();

        int sum = 0;
        int x=0;
        double average = 0;
        int biggerNumbers = 0;
        while (scanner.hasNextInt()){
            if(x<0){
                System.out.println("NIe można użyć liczby niższej niż 0");
            }else if (x>1000){
                System.out.println("Nie można użyć liczby większej niż 1000");
            } else {
                int element = scanner.nextInt();
                numbers.add(element);
                x++;
            }
            sum = sum + Integer.valueOf(scanner.nextInt());
            average = sum/50;
            biggerNumbers = (!file.equals(average));
        }

        System.out.println("Najniższa wartość: " + numbers.first());
        System.out.println("Najwyższa wartość: " + numbers.last());
        System.out.println("Suma: " + sum);
        System.out.println("Srednia: " + average);
    }
}
