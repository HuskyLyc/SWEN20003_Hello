public class arrFind{
    public static void main(String[] args)
    {
        int [] Arr={10,12,24,-30,10};
        int beginIndex=arrFind.Index(Arr,12);
        System.out.println(beginIndex);
        int lastindex=arrFind.lastIndex(Arr, 10);
        System.out.println(lastindex);
    }
    public static int Index(int[] Arr,int key)
    {
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i]==key)
            {
//                System.out.print(key+"第一次出现的下标为：");
                return i;
            }
        }
        return 0;
    }
    public static int lastIndex(int[] Arr,int key)
    {
        for(int i=Arr.length-1;i>=0;i--)
        {
//            System.out.print(key+"最后一次出现的下标为：");
            if(Arr[i] == key) return i;

        }
        return 0;
    }
}