import java.util.Scanner;


public class core {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Messages.printWelcomeMessage();
        Messages.printAvailableFuntions();

        //Delete
        System.out.println("Put in an int");
        int n = sc.nextInt();
        System.out.println("\nYour Input was " + n);
        //
        switch(n){
            case 1:
                ThreeColorSort test = new ThreeColorSort();
                for (int e:test.sortColors()) {
                    System.out.println(e + " ");
                }

                break;

        }


        Messages.printEndMessage();

    }
}
