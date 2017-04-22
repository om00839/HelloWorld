
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Test {
		
	
	public static void main(String[] args) throws IOException{
		
		
		String inputFile = "C:\\workspace\\yonsei_text_mining\\grd.txt";
		
		BufferedReader in = new BufferedReader(new FileReader(inputFile));

		
		int count=0;
		
		for (String line = in.readLine(); line != null; line = in.readLine()) {
			
		
			
			
			
			
			count++;
			
			
			String score = line.substring(0,14);
			
			
			String str = score.replaceAll(score, "");
			
			double num = Double.parseDouble(str);
			
			double sum = 0;
			
			sum+=num;
			
			
			
			
			System.out.println(str);
				
			
			
		}
	
		
		in.close();
		
		
			
		
	}
				
}


