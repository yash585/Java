class demo
{
    public static void main(String arg[])
    {
        int arr[]={0},temp;
        for(int i=0;i<5;i++)
        {
            arr[i]=Integer.parseInt(arg[i]);
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<5;i++)
            System.out.print(arr[i]+" ");

    }
}