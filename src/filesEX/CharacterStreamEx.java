package filesEX;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamEx {

	public static void main(String[] args) throws IOException {
		//write
		FileWriter ws=new FileWriter("D:/demo11982.txt");
		ws.write("...Hello Everyone 11981,11982 and 11983 learners are good...Java Full Stack...Java provides I/O Streams to read and write data where, a Stream represents an input source or an output destination which could be a file, i/o devise, other program etc. InputStream − This is used to read (sequential) data from a source");
		ws.close();
		System.out.println("Content Written Successfully");
		
		//read 
		FileReader fr=new FileReader("D:/demo11982.txt");
		BufferedReader br=new BufferedReader(fr);
	    int rec;
	    while((rec=fr.read())!=-1)
	    {
            System.out.print((char) rec);
	    }
		br.close();

	}

	}

                           