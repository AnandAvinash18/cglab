import java.util.*;
public class Lab6Exercise1 {

		static List getValues (HashMap<Integer,String> map) {
			Collection col=map.values();
			ArrayList newList = new ArrayList<>(col);
			Collections.sort(newList);
			return  newList;
			
		}

		public static void main(String[] args) {
			HashMap<Integer,String> map=new HashMap<>();
			map.put(1001,"Sameer");
			map.put(1007, "Mukesh");
			map.put(1005, "Yakob");
			map.put(1010, "Anshu");
			List list=getValues(map);
			System.out.println(list);
			

		}

	}
