import java.util.*;
class Array{
public static void main(String args[])
{
int arr[]={2,1,5,5,4,1,2,1,3,5,4,4,5,4,5,4,5,3,1,1,3,2,4,5};
int count=0;
//int min,max;
for(int i=0;i<arr.length;i++)
{
  for(int j=i+1;j<arr.length;j++)
  {
    if(arr[i]==arr[j])
	{
	  count++;
	  arr[j]=0;
	}
  }
 System.out.println(arr[i]);
 System.out.print(" "+count);
 count=0;
}
}
}