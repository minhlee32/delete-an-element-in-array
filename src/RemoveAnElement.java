import java.util.Scanner;

public class RemoveAnElement {
    public static void main(String[] args) {
        int[] a;
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        size = scanner.nextInt();
        a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter element " + (i + 1) +" : ");
            a[i] = scanner.nextInt();
        }

        System.out.print("The list is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        int x;
        int index_del;
        System.out.println("Enter X: ");
        x = scanner.nextInt();
        boolean isExist = false;
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]){
                System.out.println("Position of x: " + (i+1) + " in the list");
                index_del = i;
                isExist = true;

                int [] a1;
                a1 = new int[a.length];
                for (int j = 0; j < a1.length -1; j++) {
                    if (j < index_del) {
                        a1[j] = a[j];
                    } else a1[j] = a[j + 1];
                }
                System.out.print("New list: ");
                for (int j = 0; j < a1.length; j++) {
                    System.out.print(a1[j] + "\t");
                }
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found " + x + " in the list.");
    }
}
