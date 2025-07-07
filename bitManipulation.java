public class bitManipulation {
    public static void main(String args[]){
        // oddEven(3);
        //  oddEven(6);
        // System.out.println(getIthBit(10, 2));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthbit(10, 1));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearLastIthBit(15, 2));
        // System.out.println(clearBitsinRAnge(2, 4, 10));
        System.out.println(countSetBit(7));
    }


    public static void oddEven(int n)
    {
        int bitmask =1;
        if((n & bitmask )== 0){
            // even
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }


    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        
        if((n & bitmask )!= 0){
            return 1;
        }
        else {
            return 0;
        }
    }


    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask ;
    }

    public static int clearIthbit(int n,int i){
        int bitmask =~(1<<i);
        return n & bitmask;
    }

    public static int updateIthBit(int n,int i,int newBit){
    //     if(newBit == 0){
    //         return clearIthbit(n, i);
    //     }
    //     else{
    //         return setIthBit(n, i);
    //     }
        n= clearIthbit(n, i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }
    
    public static int clearLastIthBit(int n, int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }
      
    public static int clearBitsinRAnge(int i, int j,int n){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }

    public static int countSetBit(int n){
        int count =0;
        while(n>0){
            if((n & 1) !=0) // check LSB
            { 
                 count ++;
            }
             n = n>>1;
        }return count;
    }
}
