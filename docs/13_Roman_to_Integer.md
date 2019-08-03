## 13. Roman to Integer
**题意：** 给定一个罗马数字串，要求转化为整数，范围为[1, 3999].       
**题解：** 熟悉罗马数字关系，做整数映射，然后遍历罗马数字串进行转化即可。          
**题地址：** <https://leetcode.com/problems/roman-to-integer/description/>        
**Code: **        
```java
/*java code*/
public int romanToInt(String s) {

    // roman to int map
    Map<String, Integer> romanMap = new HashMap<>();
    romanMap.put("M", 1000);
    romanMap.put("D", 500);
    romanMap.put("C", 100);
    romanMap.put("L", 50);
    romanMap.put("X", 10);
    romanMap.put("V", 5);
    romanMap.put("I", 1);

    // conversion numbers
    char []str = s.toCharArray();
    int len = str.length;
    int [] nums = new int[len];
    for(int i = 0; i < len; i++) {
        nums[i] = romanMap.get(String.valueOf(str[i]));
    }

    // get int by roman rule
    int sum = nums[len - 1];
    for(int i = 0; i < len - 1; i++) {
        if (nums[i] >= nums[i+1]) {
            sum += nums[i];
        } else {
            sum -= nums[i];
        }
    }

    return sum;
}
```
```python
# pyhon3 code
def romanToInt(self, s):

    # roman dict
    romanDict = {"M":1000, "D":500, "C":100, "L":50, "X":10, "V":5, "I":1}

    # conversion numbers
    num = romanDict[s[-1]]
    for r in range(0, len(s) - 1):
        if romanDict[s[r]] >= romanDict[s[r + 1]]:
            num += romanDict[s[r]]
        else:
            num -= romanDict[s[r]]

    return num
```

**Difficulty：** `Easy`        
**Tag：** `Math` `String`      
