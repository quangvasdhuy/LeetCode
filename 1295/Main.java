/*
    1295. Find Numbers with Even Number of Digits
*/
public class Main {
    public static int evenNumberOfDigits(int []arrs){
        int count = 0;
        for(int arr: arrs){
            if(countNumber(arr) % 2 ==0){
                count++;
            }
        }
        return count;
    }

    private static int countNumber(int num) {
        int count = 0;
        int kq = num;
        while (kq != 0){
            kq = num / 10;
            num = kq;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr = {12,345,2,6,7896};
        System.out.println(evenNumberOfDigits(arr));
    }
}
