import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Randoms randomInt = new Randoms(90,100);
        Iterator<Integer> it = randomInt.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            System.out.println("Случайное число: " + i);
            if (i == 100){
                System.out.println("Выпало число 100, давайте на этом закончим.");
                break;
            }
        }

        System.out.println();
        for (int i : new Randoms(10,50)) {
            System.out.println("Случайное число: " + i);
            if (i == 50){
                System.out.println("Выпало число 50, давайте на этом закончим.");
                break;
            }
        }
    }
}
