## 9. Palindrome Number
**题意：** 判断一个整数是否是回文数，但有空间限制。        
**题解：** 根据题意有两个限制：一是负数不算回文数，二是空间复杂度只能为O(1)。     
根据空间限制则暴力是满足不了，可通过两种方式解决：      
*1. 回文数折半相等：读取该数x的一半并将x消去读到一半，然后比较左右两半是否相等。*      
*2. 回文数逆向一致：利用python列表可快速取逆，判断前后是否一致。*       
**题地址：** <https://leetcode.com/problems/palindrome-number/description/>      
**Code: **      
```java
/*java code*/
public boolean isPalindrome(int x) {

    // 边界
    if(x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }

    int right = 0;
    while (x > right) {
        right = right * 10 + x % 10;
        // left
        x /= 10;
    }

    return (x == right) || (x == right / 10);
}
```
```python
# pyhon3 code
def isPalindrome(self, x):
    if x < 0 or (str(x)[-1] == '0' and x != 0) :
        return False
    x = str(x)
    y = x[::-1]
    return y == x
```

**Difficulty：** `Easy`      
**Tag：** `Math`      

