import java.util.concurrent.ThreadLocalRandom;

public class ThreeColorSort {


    private int[] A = new int[10000];

    public ThreeColorSort(){
        for(int i = 0; i< A.length-1;i++){
            A[i] = ThreadLocalRandom.current().nextInt(0, 2 + 1);
        }
    }

    public int[] sortColors(){
        int redCounter = 0;
        int g = A.length-1;
        while(A[g]==2){
            g--;
        }
        int greenCounter = g;


        for (int i = 0; i<greenCounter;i++){
            if(A[i]==0){
                A[i] = A[redCounter];
                A[redCounter] = 0;
                redCounter++;

            }else if(A[i]==2){
                A[i] = A[greenCounter];
                A[greenCounter] = 2;
                greenCounter--;
                if(A[i]== 0){
                    A[i] = A[redCounter];
                    A[redCounter] = 0;
                    redCounter++;
                }
                while(A[greenCounter] == 2){
                    greenCounter--;
                }
            }
        }
        return A;
    }

}
