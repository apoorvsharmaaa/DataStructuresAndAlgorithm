package GeeksForGeeks.Arrays;

import java.util.HashSet;

public class MajorityElement {
    public static void main(String[] args) {
        int size = 4;
        int A[] = {1, 2, 3, 3};
        System.out.println(majorityElement(A, size));
    }

    public static int majorityElement(int a[], int size) {
        int res=0,count=1;

        for(int i=1;i<size;i++)
        {
            if(a[res]==a[i])
            {
                count++;
            }
            else{
                count--;
            }

            if(count==0)
            {
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<size;i++)
        {
            if(a[res]==a[i])
            {
                count++;
            }
        }
        if(count<=size/2)
        {
            return -1;
        }
        return a[res];
    }
}
