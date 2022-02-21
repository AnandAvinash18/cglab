import java.util.*;
public class Lab1Exercise4 {
	
	       public HashMap<String,String> getStudent(HashMap<String,Integer> student)
	       {
	              HashMap<String,String> medal = new HashMap<>();
	              Set<String> set = student.keySet();
	              for(String s:set)
	              {
	                     Integer marks = student.get(s);
	                     if(marks>=90)
	                     {
	                           medal.put(s,"Gold");
	                     }
	                     else if(marks >=80)
	                     {
	                           medal.put(s,"Silver");
	                     }
	                     else if(marks>=70)
	                     {
	                           medal.put(s,"Bronze");
	                     }
	              }
	              return medal;
	       }
	       public static void main(String[] ar)
	       {
	              HashMap<String,Integer> student = new HashMap<>();
	              Lab1Exercise4 p = new Lab1Exercise4();
	              
	              student.put("RollNo4",67);
	              student.put("RollNo12",45);
	              student.put("RollNo11",98);
	              student.put("RollNo2",49);
	              student.put("RollNo34",91);
	              System.out.println(p.getStudent(student));
	       }
	}


