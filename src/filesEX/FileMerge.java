package filesEX;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FileMerge {

	public static void main(String[] args) throws IOException {
		String line, content = "";
        FileReader fr = new FileReader("D:/demo11981.txt");
        BufferedReader br = new BufferedReader(fr);
        FileReader fr1 = new FileReader("D:/demo11982.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        
         for(line=br.readLine(); line!=null; line=br.readLine())
                content = content + line + "\n";
             br.close();
             
              for(line=br1.readLine(); line!=null; line=br1.readLine())
                content = content + line + "\n";
            br1.close();
            FileWriter fw=new FileWriter("D:/two.txt");
          fw.write(content);
            System.out.println("Merged successfully");
            fw.close();
            fr1.close();
            br1.close();
            br.close();


	}

}
