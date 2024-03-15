//88. Merge Sorted Array
public class Main {
    public static void merge(int[] nums1, int m, int[] nums2) {
        for(int ai : nums2){
            insertToArray(nums1, m, ai);
            m++;
        }
    }

    private static void insertToArray(int[] nums1, int m, int ai) {
        boolean isFindK = false;
        for (int i = 0; i < m; i++) {
            if (nums1[i] > ai){
                isFindK = true;

                for (int j = m-1; j >= i; j--) {
                    nums1[j+1] = nums1[j];
                }
                nums1[i]=ai;
                break;
            }
        }

        if(isFindK == false){
            nums1[m] = ai;
        }
    }


    public static void main(String[] args) {
        int []nums1 = {1,2,3,0,0,0};
        int m = 3;
        int []nums2 = {2,5,6};
        int n =3;
        merge(nums1,3,nums2);
        System.out.println("Done");
    }
}

