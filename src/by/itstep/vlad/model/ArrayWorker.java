package by.itstep.vlad.model;

public class ArrayWorker {
    public static boolean checkValue(int[] array, int value) {

        int count = 0;
        for (int item : array) {
            count++;
            if (item == value) {
                System.out.println("count = " + count);
                return true;

            }
        }
        System.out.println("count = " + count);
        return false;

    }

    public static int findFirstIndexValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {

                return i;
            }

        }
        return -1;

    }

    public static int findLastIndexValue(int[] array, int value) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {

                return i;
            }

        }
        return -1;

    }

    public static int countValue(int[] array, int value) {
        int count = 0;

        for (int element : array) {
            if (element == value) {
                count++;
            }
        }

        return count;
    }

    public static boolean binarySearch(int[] array, int[] value) {

        int count = 0;

        int left = 0;

        int right = array.length - 1;

        while (left <= right) {
            count++; //debug
            int middle = (left + right) / 2;

            if (value == array[middle]) {
                System.out.println("count = " + count);//debug
                return true;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;


            }

        }
        System.out.println("count = " + count);//debug
        return false;
    }

}

//        boolean result = false;
//
//        for (int item : array) {
//            if (item == value) {
//                result = true;
//                break;
//            }
//        }
//
//        return result;
//
//    }
//}


//1) check  --> true/false
//2) first_index/last_index  --> index / -1
//3) count n/0


