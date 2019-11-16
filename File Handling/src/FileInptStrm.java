import java.io.FileInputStream;

/**
 * Simple Java program for File handling
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class FileInptStrm
{

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin=new FileInputStream("D:abc.txt");
			int i;
			while((i=fin.read())!=-1)
			{
				System.out.println((char)i);
			}
			fin.close();
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
