import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] list={3,3,13,12,5,6,3,5,9,14,6,14,0,14};
        ArrayList<Integer> repetitive = new ArrayList<Integer>();
        System.out.println(Arrays.toString(list));
        for (int i = 0; i <list.length ; i++) {
            for (int j = 0; j <list.length ; j++) {
                if((i!=j) && (list[i]==list[j])){
                    if(list[i]%2==0){
                        if(!isThere(repetitive,list[i]))
                        repetitive.add(list[i]);
                    }
                    break;
                }
            }
        }
        System.out.println("Tekrar eden çift sayılar :" +repetitive);
    }

    public static boolean isThere(ArrayList <Integer> list,int value){

        for(int i:list){
            if(i==value){
                return true;
            }
        }
        return false;
    }
}
