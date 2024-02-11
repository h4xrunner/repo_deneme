int mySqrt(int x) {
long num=0;
int square=0;
if(x==0){
    return 0;
}
while(x>=num){
    
    if(square ==x|| num*num>x){
        return num-1;
    }else{
        square=num*num;
        num++;
    }
    
}
    return num-1;
}
