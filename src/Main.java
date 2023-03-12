import static javax.management.Query.and;

public class Main {
    public static void main(String[] args) {
        int[] arrayToSearch = {5, 7, 10, 15, 25, 48, 78, 89, 80, 90, 145, 178, 250};
        int SearchElement = 7;
        System.out.println("Index of the Element = " + binarySearch(arrayToSearch, SearchElement));
    }
    static int binarySearch(int[] array, int searchElement) {
        int index = array.length / 2;
        int count = 0;
        while (array[index] != searchElement) {
            if ((count > array.length / 2) || (array[array.length-1]<searchElement)) {
                index = -1;
                break;
            }
            if (array[index] > searchElement) {
                index = (index - 1) / 2;
                count++;
            }
            if (array[index] < searchElement) {
                index = (index + 1 + array.length) / 2;
                count++;
            }
        }
        return index;
    }
}