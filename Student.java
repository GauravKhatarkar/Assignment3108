//6th sep

import java.util.Scanner;

public class Student{
    int rollNo;
    String studentFirstName;
    String studentLastName;
    int studentAge;
    
    public String toString(){
            return rollNo+" "+studentFirstName+" "+studentLastName+" "+studentAge;
    }
    
    public int hashCode(){
        return this.rollNo;
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Student){
            Student student = (Student) obj;
            if((this.rollNo == student.rollNo) && ((this.studentFirstName).equals(student.studentFirstName)) && ((this.studentLastName).equals(student.studentLastName)) && (this.studentAge == student.studentAge)){
                    return true;
            }
            return false;
        }
        return false;
    }
}