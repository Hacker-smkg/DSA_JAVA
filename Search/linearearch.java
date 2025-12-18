package Search;

public class linearearch {
    public static void main(String[] args) {

        // linear search = iterate through  collection one element at a time 
        

        int[] array = {1, 2, 3, 4, 5};

        int index = linearSearch(array, 1); 

        if(index != -1){
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found at index: ");
        }
    }

    private static int linearSearch(int[] array, int value) {
        // throw new UnsupportedOperationException("Unimplemented method 'linearsearch'");

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == value){
                return i ;
            }
        }

        return -1;
    }
}
