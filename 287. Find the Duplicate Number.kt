class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var set = mutableSetOf(-1);
        nums.forEach{
            if(set.contains(it))
                return it;
            set.add(it);
        }
        return -1;
    }
}
