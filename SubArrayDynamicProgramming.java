public class SubArrayDynamicProgramming {
        static int SubArraySum(int[] a, int size) {

            // Check edge case
            int max_sum = 0;
            for (int i = 0; i < size; i++) {
                int sum = 0;
                for (int j = i; j < size; j++) {
                    sum += a[j];
                    max_sum = Math.max(sum, max_sum);
                }

            }
            return max_sum;
        }
        public static void main(String[] args) {
            int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
            int n = a.length;
            int max_sum = SubArraySum(a, n);
            System.out.println("Maximum contiguous sum is "
                    + max_sum);
        }

    }

