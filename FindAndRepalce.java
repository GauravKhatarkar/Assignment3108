//assignment_07Sep;

public class FindAndRepalce{
    public static void main(String args[]) {
        StringBuilder str =new StringBuilder("Java is Object Oriented. Java is Programming Language");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'J'){
                if(str.substring(i,i+4).equals("Java")){
                    str.replace(i,i+4,"C++");
                }
            }
        }
        System.out.println(str);
        
    }
}