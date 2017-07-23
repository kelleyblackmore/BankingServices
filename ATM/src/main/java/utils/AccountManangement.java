package utils;

public class AccountManangement {

	
	
	public int sumValues(int[] array){
	
		
		int	total = 0 ;
		for(int counter = 0; counter < array.length; counter++){
			total+=array[counter];
		}
		
		return total;
	}
}
