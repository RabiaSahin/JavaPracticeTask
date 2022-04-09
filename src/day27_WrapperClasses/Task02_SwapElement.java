package day27_WrapperClasses;

public class Task02_SwapElement {
    public static void main(String[] args) {

    }
    public static int[] swap(int[] array, int index, int element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        int[] result = new int[array.length];

        for (int i = 0, j = 0; i < array.length; i++, j++) {

        }
        return result;
    }
}
/*2. Swap Task:
	2.1 Create a method named swap that passes three parameters:
	 integer array, integer i, integer j.
	 the method swaps the element at index i with the element at index j,
	 and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array*/