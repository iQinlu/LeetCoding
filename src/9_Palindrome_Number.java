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

