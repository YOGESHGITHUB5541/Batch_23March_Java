package org.ImportantProgram;

public class DuplicateStringInSentence {

	public static void main(String[] args) {
		String str = " There is a garden and it is beautiful";
		int count;
		str =str.toLowerCase();
		String [] ar =str.split(" ");

		for (int i=0; i<ar.length; i++) {
			count=1;
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i].equals(ar[j])) {
					count++;
					ar[j]="0";

				}
			}
			if(count>1 && ar[i]!="0") {
				System.out.println("Duplicat words in String is = "+ar[i]);
			}
		}

	}

}
