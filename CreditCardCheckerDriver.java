public class CreditCardCheckerDriver
{
    public static void main(String[] args)
    {
        int[] nums =
                {
                        18363952,
                        36135929,
                        39436409,
                        62565301,
                        35351949,
                        11384279,
                        14265459,
                        45382439,
                        21393666,
                        35363449
                };

        boolean[] valid = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++)
            valid[i] = CreditCardChecker.check(nums[i]);

        for (int i = 0; i < nums.length; i++)
        {
            String str = " - ";
            if(valid[i])
                str += "Valid";
            else
                str += "Invalid";

            System.out.println(nums[i] + str);
        }
    }
}
