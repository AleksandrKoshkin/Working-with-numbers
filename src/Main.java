import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList =Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> list=new ArrayList<>();
        for (int i=0; i<intList.size();i++){
            if(intList.get(i)>0){
                list.add(intList.get(i));
            }
        }
        list.removeIf(x->x%2!=0);
        intList=list;
        intList.sort(Comparator.naturalOrder());
        for (int i=0; i<intList.size();i++) {
            System.out.println(intList.get(i));
        }
    }
}