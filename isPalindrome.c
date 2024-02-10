bool isPalindrome(int x) {
    if (x < 0) {
        return false;
    }
    int reversed = 0;
    int original = x;

    while (x > reversed) {
        int digit = x % 10;
        reversed = reversed * 10 + digit;
        x /= 10;
    }
    if(original%10==0){
        if(original==0){
        return true;
    }else{
        return false;
    }
}
    else{
        return x == reversed || x == reversed / 10;
    }
}
