public class MajorityElement {
    public static void main(String[] args) {
        int[] num={3,2,3};
        System.out.println(majorityElement(num));
    }
    static int majorityElement(int[] nums) {

        int count = 0;
        int majority = 0;


        for (int i = 0; i < nums.length; i++) {


            if (count == 0 && majority != nums[i]) {
                majority = nums[i];
                count = 1;
            } else if (majority == nums[i]) {

                count++;
            } else {

                count--;
            }
        }


        return majority;
    }
}