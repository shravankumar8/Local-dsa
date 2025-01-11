public class happyNumber {
    // https://leetcode.com/problems/happy-number/description/

public boolean isHappy(int num){
    int slow=num;
    int fast=num;
    do{
        slow=Square(num);
        fast=Square(Square(num));

    }while(slow!= fast);
    

    if(slow==1){
        return true;
    }
    return false;       
}


    public int  Square(int num){
        int ans=0;

        while (num>0) {
            int last=num%10;
            ans+=last*last;
            num/=10;
            
        }
        return ans;

    } 
}
