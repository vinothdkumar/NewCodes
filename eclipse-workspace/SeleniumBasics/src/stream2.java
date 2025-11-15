import java.util.stream.Stream;

public class stream2 {

	public static void main(String[] args) {
		
		
		Stream.of("Kausik","Siva","Ruben","Karthi","Sanjay").filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}

}
