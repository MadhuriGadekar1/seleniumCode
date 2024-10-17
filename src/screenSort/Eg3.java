package screenSort;




import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Eg3 {

	public static void main(String[] args) throws IOException {


        String timeStamp = new SimpleDateFormat ("yyyyMMddHHmmss").format(new Date());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File Des=new File("C:\\screenShot\\test_"+timeStamp+".png");
        FileHandler.copy(src, Des);
	}





}
