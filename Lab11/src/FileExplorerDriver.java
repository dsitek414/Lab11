

public class FileExplorerDriver
{
	public static void main(String[] args)
	{
		FileExplorer fileMage = new FileExplorer();
		
		fileMage.findSpeedFiles();
		fileMage.deleteNonSpeedFiles();
		fileMage.checkApolloTotal();
	}
}