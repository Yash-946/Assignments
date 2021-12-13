public class Anonymous_Array {
    int arr[];
    Anonymous_Array()
    {
        arr = new int [5];
    }
    public void initializearray(int tarr[]){
        arr=tarr;
        for(var res:arr){
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        int arr[]={10,50,100,150};
        Anonymous_Array obj = new Anonymous_Array();
        obj.initializearray(arr);
        obj.initializearray(new int[]{1,2,3,4,5});
    }
}
