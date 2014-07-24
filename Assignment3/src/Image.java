public class Image 
{
	private String imagePath;
	private String imageCaption;
	private int X;
	private int Y;

	public Image(String path, String caption) 
	{
		imagePath = path;
		imageCaption = caption;
	}

	public void setImage(String path) 
	{
		imagePath = path;
	}

	public String getImagePath() 
	{
		return imagePath;
	}

	public void setCaption(String caption) 
	{
		imageCaption = caption;
	}

	public String getImageCaption()
	{
		return imageCaption;
	}

	public String toString() 
	{
		return imageCaption;
	}

	public int getY() 
	{
		return Y;
	}

	public void setY(int y) 
	{
		Y = y;
	}

	public int getX() 
	{
		return X;
	}

	public void setX(int x) 
	{
		X = x;
	}
	
}