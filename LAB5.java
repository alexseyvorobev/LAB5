import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
public class LAB5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 0;
        try {
            System.out.println("Введите количество элементов в нужном вам списке");
            N = in.nextInt();
            if (N >= 1) {
                ArrayList<Integer> list = new ArrayList<>();
                System.out.println("Введите элементы списка");
                for (int i = 0; i < N; i++) {
                    list.add(i, in.nextInt());
                }
                LinkedList<Integer> Final = new LinkedList<>();
                Final.addAll(list);
                int X = 0;
                System.out.println("Введите значение. Все элементы заданного Вами списка, равные этому значению, будут удалены");
                X = in.nextInt();
                in.close();
                for (int j = 0; j < N; j++) {
                    if (Final.get(j) == X) {
                        Final.remove(j);
                        N--;
                        j--;
                    }
                }
                int size = Final.size();
                if (size >= 1) {
                    System.out.println("Исходный список");
                    System.out.println(list);
                    System.out.println("Список после удаления элементов с заданным Вами значением");
                    System.out.println(Final);
                } else {
                    System.out.println("Исходный список");
                    System.out.println(list);
                    System.out.println("Все элементы были удалены из заданного Вами списка");
                }
            } else {
                System.out.println("Продолжение программы не может быть выполнено корректно.");
            }
        } catch (InputMismatchException e){
            System.out.println("Продолжение программы не может быть выполнено корректно.");
        }
    }
}