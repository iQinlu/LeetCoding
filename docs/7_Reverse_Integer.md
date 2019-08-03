## 7. Reverse Integer
**题意：** 给你一个32位有符号整数，返回反转后的整数。     
**题解：** 根据给出的示例以及备注信息，可以得到以下几点信息：     
  *1. 如果是正数则直接反转，负数则只反转数字，符号不处理；*     
  *2. 如果反转后首位为0则过滤掉；*      
  *3. 如果反转后数溢出了（整型最大最小值），则直接返回0.*      
那么，结合上述的三点分析也可以得出我们的解题思路，如下：      
  *1. 首先排除正负数‘-’的干扰；*      
  *2. 将剩下的整数进行反转（利用整数除和取余的特性，或利用字符串逆向取数特性），处理首位
为0时的情况；*        
  *3. 要对反转结果溢出情况的处理，这一点应该是本题最难和关键的点，需要了解整数溢出的特点
。*      
**题地址：** <https://leetcode.com/problems/reverse-integer/description/>       
**Code: **     
```java
/*java code*/
public int reverse(int x) {

        int sign = x > 0 ? 1 : -1;
        x = Math.abs(x);
        int r = 0;

        while (x > 0) {

                // 预先判断下一步是否会溢出
                if (Integer.MAX_VALUE / 10 < r || Integer.MAX_VALUE - x % 10 < r * 10) {
                        return 0;
                }

                // reverse
                r = r * 10 + x % 10;
                x /= 10;
        }

        return sign * r;
}
```
*注：关于是否溢出的判断有多种方式，目前看到最普遍有两种，你能想到更多的么？*       
  *1. 边界值预判：本题采用的方式，每次循环判断下一步操作是否会溢出边界值；*        
  *2. 不可逆判断：每次反转后，再反转回去看是否和反转前一致，不一致则说明溢出返回0，否则>继续。*         

```python
# pyhon code
def reverse(self, x):
    # sign
    s = (x > 0) - (x < 0)
    # reverse
    r = int(str(x*s)[::-1])
    return s*r * (r < 2**31)
```

**Difficulty：** `Easy`      
**Tag：** `Math`     
