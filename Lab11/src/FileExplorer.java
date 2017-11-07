import java.io.File;
import java.util.ArrayList;
import java.util.List;



public class FileExplorer
{
	List<File> fileList = new ArrayList<File>();
	File speedDirectory = new File("SPEED");
	File[] speedDirectoryList = speedDirectory.listFiles();
	File apolloDirectory = new File("APOLLO");
	File[] apolloDirectoryList = apolloDirectory.listFiles();
	int fileTotal = 0;
	
	public void checkApolloTotal()
	{
		for (int i = 0; i < apolloDirectoryList.length; i++)
		{
			fileTotal++;
		}
		char outOf = apolloDirectoryList[0].getName().charAt(19);
		int val = outOf - '0';
		if(fileTotal != val)
			System.out.println("All files not accounted for!");
	}
	
	public void findSpeedFiles()
	{
		for(int i = 1; i < 11; i++)
		{
			File tempFile = new File("SPEED/SPEED_20171102_"+i+"of10.txt.txt");
			if(tempFile.exists())
			{
				fileList.add(tempFile);
			}
		}
	}
	
	public void deleteNonSpeedFiles()
	{
		for (int i = 0; i < speedDirectoryList.length; i++)
		{
			if (!fileList.contains(speedDirectoryList[i]))
			{
				speedDirectoryList[i].delete();
			}
		}
	}
	
	public void printSpeedList()
	{
		System.out.println(fileList.size());
		for (int i = 0; i < fileList.size(); i++)
		{
			System.out.println(fileList.get(i));
		}
	}
}