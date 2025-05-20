
public class array{
    public static void main(String[]args){
        int num[] = {2, 4, 3, 10, 34, 53, 342};
        int key = 503;

        int index= linearSearch(num, key);

        
            if(index == 1){
                System.out.print("you found the key" + index);
            }else{
                System.out.print("not found");
            }
        
    }


    public static int linearSearch(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
}