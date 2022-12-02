import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Example1 {

	public static void main(String[] args) {
		
		Path textFile = 
				Paths.get("C:\\users\\drsmi\\IdeaProjects\\JavaCourse\\Ch13\\src\\Lyric.txt");
		Path wordFile =
				Paths.get("C:\\users\\drsmi\\IdeaProjects\\JavaCourse\\Ch13\\src\\Lyric.docx");
		
		try
		{
			BasicFileAttributes attrtext =
					Files.readAttributes(textFile, BasicFileAttributes.class);
			BasicFileAttributes attrWord =
					Files.readAttributes(wordFile, BasicFileAttributes.class);
			
			long textSize = attrtext.size();
			long wordSize = attrWord.size();
			double ratio = textSize * 100.0 / wordSize;
			System.out.println(textFile.toString() + "is" + textSize + "bytes long");
			System.out.println("The text file is " + ratio + "% of the size of the Word File");
			
		}
		catch(IOException e)
		{
			System.out.println("IO Exception");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				}

}
