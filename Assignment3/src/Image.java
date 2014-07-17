public class Image 
{
	private String imagePath;
	private String imageCaption;

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

}