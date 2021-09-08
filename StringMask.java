//06th sep

public class StringMask{
    public static void main(String args[]){
        String str = "SABBIR POONAWALA";
        str = str.trim();
        char arr[] = new char[str.length()];
        int count = 0;
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(temp == ' '){
                count = 0;
                arr[i] = temp;
            }
            else if(count < 2){
                arr[i] = temp;
                count++;
            }
            else{
                arr[i] = 'X';
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
}