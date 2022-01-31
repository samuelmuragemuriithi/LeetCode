package com.awesam;

import java.util.Arrays;
import java.util.HashMap;

public class easy {

       static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> HM = new HashMap();

            for(int i = 0; i < nums.length; ++i) {
                int complement = target - nums[i];
                if (HM.containsKey(complement)) {
                    return new int[]{(Integer)HM.get(complement), i};
                }

                HM.put(nums[i], i);
            }

            throw new IllegalArgumentException("No match");
        }

        static int[] twoSum2(int[] arr, int target) {
            HashMap<Integer, Integer> hashMap = new HashMap();

            for(int i = 0; i < arr.length; ++i) {
                int complement = target - arr[i];
                if (hashMap.containsKey(complement)) {
                    return new int[]{(Integer)hashMap.get(complement), i};
                }

                hashMap.put(arr[i], i);
            }

            throw new IllegalArgumentException("No such element");
        }

        static int maxSubarray(int [] nums){
           int maxSum =nums[0];
           int sum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (sum<0)sum=nums[i];
                else sum+=nums[i];
                maxSum=Math.max(sum,maxSum);
            }
            return maxSum;
        }
        public static void main(String[] args) {
            int[] nums = new int[]{2, 7, -11, 15};
            int target = 9;
            System.out.println(Arrays.toString(twoSum(nums, target)));
            System.out.println(Arrays.toString(twoSum2(nums, target)));
            System.out.println(maxSubarray(nums));

        }
    }


