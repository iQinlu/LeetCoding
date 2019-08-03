# pyhon code
def reverse(self, x):
    # sign
    s = (x > 0) - (x < 0)
    # reverse
    r = int(str(x*s)[::-1])
    return s*r * (r < 2**31)
