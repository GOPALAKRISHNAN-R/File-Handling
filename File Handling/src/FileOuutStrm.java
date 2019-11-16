import java.io.FileOutputStream;

/**
 * Simple Java program for File Handling
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class FileOuutStrm 
{
	public static void main(String[] args) 
	{
		try
		{
			
			FileOutputStream fout=new FileOutputStream("D:abc.txt");
		
			String s="Hi ..Welcome Gopal";
		
			byte b[]=s.getBytes();
		
			fout.write(b);
		
			fout.close();
		
			System.out.println("File created..");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	

	}

}
