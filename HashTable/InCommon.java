import java.util.HashMap;

public class InCommon {
    
    public static boolean itemInCommon(int[] arr1, int[] arr2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        
        for (int i : arr1) {
            myHashMap.put(i, true);
        }

        for (int j : arr2) {
            if(myHashMap.get(j) != null){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        System.out.println(itemInCommon(arr1, arr2));
    }
}
