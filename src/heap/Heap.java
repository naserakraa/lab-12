
package heap;

import java.util.Scanner;

public class Heap {
    public static int isSorted(int sayi[]){
        int k=0;
        for(int i = 0; i<sayi.length;i++){
            for(int j = 0; j<sayi.length-1;j++){
                if(sayi[j]>sayi[j+1])
                    k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String[] numbers;
        numbers = number.split(",");
        int[] sayi = new int[numbers.length];
        int k=0;

        for (String str : numbers) {
            sayi[k] = Integer.parseInt(str);
            k++;
        }
        int d = sayi.length;
        Minheap minHeap = new Minheap(d);
        for(int x : sayi)
            minHeap.insert(x);
        
        
        if (isSorted(sayi)==0){
            System.out.print("min heap");
        } else {
            System.out.print("min heap degil");
        }
       
      
        

        
        
   
    }
    
    
    
}
