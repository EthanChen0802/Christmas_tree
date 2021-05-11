public class ChristmasTree {

	 public static void main(String[] args) {
		 
		 
		 int num = 5;
		 
		 
		 // 多重聖誕樹
		 for (int x=0; x < num; x++) {	 
		 // 列數
			 for (int i=0; i < num; i++) {
				 
				 // 列印空白
				 for (int j=0; j < num - i; j++) {
					 System.out.print(" ");
				 }
				 
				 // 列印*
				 for (int k=0; k < (2*i + 1); k++) {
					 System.out.print("*");
				 }
				 System.out.println();
			 }
			 
			 // 列印樹根
			 for (int m=0; m < num-2; m++) {
				 for (int n=0; n < num; n++) {
					 System.out.print(" "); 
				 }
				System.out.print("*");
				System.out.println();
			 }

		 }	 
			 
	 }
	  
	 
}

