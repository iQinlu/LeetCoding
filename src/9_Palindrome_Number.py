# pyhon3 code
def isPalindrome(self, x):
    if x < 0 or (str(x)[-1] == '0' and x != 0) :
	return False
    x = str(x)
    y = x[::-1]
    return y == x
