
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ZipfsLaw{
		
	
		public static void main(String[] args)throws IOException {
			
			String inputFile = "C:\\Users\\sjine\\Desktop\\장재호\\텍정처\\텍정처 보고서\\Articles\\Assignment.txt";
			
			
			HashMap<String, Integer> count = new HashMap<String, Integer>();
			
			
			BufferedReader br = new BufferedReader(new FileReader(inputFile));
			
			for (String line = br.readLine(); line != null; line = br.readLine()) {
				for (String word : line.toLowerCase().replaceAll("\\p{Punct}", " ").replaceAll("�"," ").replaceAll("“"," ").replaceAll("”"," ").split("\\s+")) {
					if (word.trim().isEmpty()) continue;
					if (count.containsKey(word)) {
						count.put(word, count.get(word) + 1);
					} else {
						count.put(word, 1);
					}
					}
				}
			
			br.close();
			
			for (String word : HashMapSortA.sortByValue(count, -1)) {
				System.out.println(String.format("%s\t%s", word, count.get(word)));
				
			}
			}
	}

