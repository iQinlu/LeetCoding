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
