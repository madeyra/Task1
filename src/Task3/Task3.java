package Task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Task3<i> {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[10];
        for (int i=0; i<10; i++){
            a[i]= Integer.parseInt(reader.readLine());
        }
        bubbleSort(a);

        for (int i =0; i<10; i++){
            System.out.println(a[i]);
        }
    }


    public static void bubbleSort(int[] arr)
    {
        for (int i= arr.length-1;i>0;i--)
        {
            for (int j=0;j<i; j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;

                }
            }
        }
    }
}
