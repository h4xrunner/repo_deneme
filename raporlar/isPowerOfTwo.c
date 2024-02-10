bool isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;//bitwise AND-->if the number was power of two, we have to use one '1' in binarycode
}
