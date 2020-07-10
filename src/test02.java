import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class test02{
    public static void main(String[] args) {
        System.out.println(2.);
    }
    public static long quickmod(long a,long b,long m)
    {
        long ans = 1;
        a%=m;
        while(b>0)
        {
            if(b%2!=0)
            {
                ans = (ans*a)%m;
                b--;
            }
            b/=2;
            a = a*a%m;
        }
        return ans;
    }

}