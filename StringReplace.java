//06th sep

public class StringReplace{
    public static void main(String args[]){
        String str = "Halo";
        char arr[] = new char[str.length()];
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(str.charAt(i) == 'a'){
                arr[i] = 'o';
            }
            else if(i == 2){
                arr[i] = Character.toUpperCase(temp);
            }
            else{
                arr[i] = temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
            
    }
}