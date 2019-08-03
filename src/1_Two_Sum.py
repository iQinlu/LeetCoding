# pyhon code
def twoSum(self, nums, target):
    map = {}
    for i, n in enumerate(nums):
	m = target - n
	if m in map:
            return [map[m], i]
	else:
	    map[n] = i
