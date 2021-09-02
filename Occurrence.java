public class Occurrence
{
	public static void main(String args[]){
		String data = "Java is Object Oriented. Java is platform independent. Java is simple.";
		String[] str = data.split(" ");
		int count = 0;
		for(String s: str){
			if(s.equals("Java")){
				count++;
			}
		}
		System.out.println("Occurrences of Java word is : "+count);
	}
}