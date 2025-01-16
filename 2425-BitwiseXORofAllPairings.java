/*
          You are given two 0-indexed arrays, nums1 and nums2, consisting of non-negative integers. There exists another array, nums3, which contains the bitwise XOR of all pairings of integers between nums1 and nums2 (every integer in nums1 is paired with every integer in nums2 exactly once).
          Return the bitwise XOR of all integers in nums3.
          Example 1:
          Input: nums1 = [2,1,3], nums2 = [10,2,5,0]
          Output: 13
          Explanation:
          A possible nums3 array is [8,0,7,2,11,3,4,1,9,1,6,3].
          The bitwise XOR of all these numbers is 13, so we return 13.
Solution: 
      - Find XOR of all elements in 2 arrays
      - If length of 2 arrays is odd then find the XOR of that array
*/
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        int xor2 = 0;
        for(int n:nums1){
            xor1^=n;
        }
        for(int n:nums2){
            xor2^=n;
        }
        int bit =0;
        if(nums2.length%2==1){
            bit^=xor1;
        }
        if(nums1.length%2==1){
            bit^=xor2;
        }
        return bit; 
    }
}
