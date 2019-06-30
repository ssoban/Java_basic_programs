
public class playwithstring {
	
	public static void main(String args[]){
		String message = ""; 
		String sfin= "";
		String s="i am goog person yes soban";
		String s4=s.toUpperCase();
		String[] s1=s.split(" ");
		String sobna="soban";
		sobna= Character.toUpperCase(sobna.charAt(0)) +sobna.substring(1);
		System.out.println(sobna);
		int l=s1.length;
		for(int i=0;i<s1.length;i++){
		//System.out.println(s1[i]);
		
		
		   
		message = Character.toUpperCase(s1[i].charAt(0)) +s1[i].substring(1);
		System.out.print(message +" ");
		
		
			
			
		}
		String rev= "";
		String reverse=s1[l-1];
		//System.out.println(reverse);
		
		for(int k =reverse.length()-1;k>=0;k--){
			
			rev= rev+reverse.charAt(k);
			
		}		
				
				String finlstrng=message + " " +rev;
				System.out.println(finlstrng);
				
				
				String q="i am very bad yes ";
				String q2="soban hate this ";
				String[] q3=q.split(" ");
				String[] q4=q2.split(" ");
				int t=0;
				int r=0;
				System.out.println();
				 String finalString="";
				 while (t < q3.length && r < q4.length) { 
					 
					//  finalString.(q3[t++]);
					  finalString.concat(q4[r++]);
			        } 
			  System.out.print(finalString.toString());
		

		
		}
		
	

}
