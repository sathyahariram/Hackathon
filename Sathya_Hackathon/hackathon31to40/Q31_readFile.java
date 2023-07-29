package hackathon31to40;
//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
import java.io.BufferedReader;
import java.io.FileReader;

public class Q31_readFile {

	public static void main(String[] args) throws Exception {
		
		String spath="C:\\Users\\rajra\\Desktop\\techark\\Q31_textfile.txt";
		
		FileReader ofilereader=new FileReader(spath);
				
		BufferedReader obuffer=new BufferedReader(ofilereader);
		System.out.println(obuffer.readLine());
		

	}

}
