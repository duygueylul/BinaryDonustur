package BinaryDonustur;

public class Donustur {

	public static void main(String[] args) {
		
		
		 System.out.print("1234: ");
	     bDonustur(1234);
	     System.out.print("\n18: ");
	     bDonustur(18);
	     System.out.print("\n");
	
	}
	
	static public void bDonustur(int s){
	     int binary[] = new int[40];
	     int index = 0;
	     while(s > 0){
	       binary[index++] = s%2;
	       s= s/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	       System.out.print(binary[i]);
	     }
	  }
}
