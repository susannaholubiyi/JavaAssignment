public class OddPositionElement{


	public int[] oddElement(int[] list){
	
	int[] newArray = new int[list.length / 2];
	
	int count = 0;
	
		for(int index = 0; index < list.length; index += 2){
	
		newArray[count] = list[index];	
		count++;
		
		
		}
	
	
	return newArray;
	}



}
