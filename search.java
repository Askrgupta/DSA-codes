import java.util.*;
public class search {
    public static void main(String[] args){

        int n = 5;
        int number []= new int[n];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            number[i] = sc.nextInt();
        }
        sc.close();

        int key = 1;
        int index =linearSearch(number, key);

        if (index == -1) {
            System.out.println(key + " " + "is not found in the array ");
        }
        else
        {
            System.out.println(key+" " + "is at index" + " " +index);
        }
    }


    public static int linearSearch(int number[],int key){
        for (int i=0; i<number.length; i++){
            if(number[i] == key)
            return i;
        }
        return -1;
    }
}
