package application;

public class App {

	public static void main(String[] args) {
		// ==, !=, !, 
		// && is and
		// || is or
		// & and | are bitwise operators
		
		boolean isRaining = true;
		boolean haveUmbrella = true;
		
		boolean takeUmbrella = false;
		
		/* replace this with:
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			} 
		} 
		*/
		
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		
		//can also do
		takeUmbrella = isRaining && haveUmbrella ? true : false;

		System.out.println(takeUmbrella);
	}

}
