// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.
package HW4;

import java.util.LinkedList;
import java.util.Random;


public class work2 {

    public static void main(String[] args) {

        LinkedList<Integer> linkList = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            linkList.add(random.nextInt(0, 10));
        }

        System.out.println("linkList old = " + linkList);

        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size() - temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }

        System.out.println("linkList reverse = " + linkList);

    }
}