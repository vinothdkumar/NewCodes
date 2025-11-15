import java.util.ArrayList;

public class javastream 
{

	public static void main(String[] args) 
	{
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Arun");
		names.add("Lalit");
		names.add("Alex");
		names.add("val");
		names.add("King");
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		
		//long c = names.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(count);

	}

}
