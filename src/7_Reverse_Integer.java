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
