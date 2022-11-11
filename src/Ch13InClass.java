import java.nio.file.attribute.*;
import java.nio.file.*;
import java.io.IOException;

public class Ch13InClass {

	public static void main(String[] args)
	
	{
		String first;
		Path textFile = Paths.get(first: "C:\\users\\drsmi\\IdeaProjects\\Java Course\\Ch13\\src\\Lyric.docx");
		
		try
		{
			BasicFileAttributes attrText = 
					Files.readAttributes(textFile, BasicFileAttributes.class);
			Path wordFile;
			BasicFileAttributes attrWord =
					Files.readAttributes(wordFile, BasicFileAttributes.class);
			
			long textSize = attrText.size();
			long wordSize = attrWord.size();
			double ratio = textSize * 100/wordSize;
			
			System.out.println(textFile.toString() + "is" + textSize + "bytes long");
			System.out.println(wordFile.toString() + "is" + wordSize + "bytes long");
			System.out.println("The text is " + ratio + "% of the size is the word file");
			
			
			
			
			
			
		}

		catch(IOException e)
		{
			System.out.println("IO EXCEPTION");
		}
	}

}
