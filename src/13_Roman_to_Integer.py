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
