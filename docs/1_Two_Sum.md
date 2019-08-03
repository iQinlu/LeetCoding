## 1. Two Sum
**题意：** 给一个数组和一个目标值，返回数组中两个数之和为目标值的下标。    
**题解：** 目前最高效的解法是利用Map的特性，O(n)的时间求解。    
**题地址：** <https://leetcode.com/problems/two-sum/description/>    
**Code: **    
```java
/*java code*/
public int[] twoSum(int[] nums, int target) {
   Map<Integer, Integer> map = new HashMap<>();
   for (int i = 0; i < nums.length; i++) {
       int complement = target - nums[i];
       if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
```
```python
# pyhon code
def twoSum(self, nums, target):
    map = {}
    for i, n in enumerate(nums):
        m = target - n
        if m in map:
            return [map[m], i]
        else:
            map[n] = i
```

**Difficulty：** `Easy`     
**Tag：** `Array`   `Hash Table`     


