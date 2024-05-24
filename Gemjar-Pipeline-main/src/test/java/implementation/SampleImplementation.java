package implementation;
import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.gemini.generic.ui.utils.DriverAction.*;

public class SampleImplementation {
    public static void shoesSearch(){
        try{
            if(isExist(By.xpath("//textarea[@class='gLFyf']"))) {
                click(By.xpath("//textarea[@class='gLFyf']"));
                typeText(By.xpath("//textarea[@class='gLFyf']"), "Shoes" + Keys.ENTER);
                GemTestReporter.addTestStep("enter text in the input field","added text in input field", STATUS.PASS);
                System.out.println("Shoes");
            }
            else {
                GemTestReporter.addTestStep("text is not entered in the input field","text is not entered input field", STATUS.FAIL);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void bookSearch(){
        try{
            if(isExist(By.xpath("//textarea[@class='gLFyf']"))) {
                click(By.xpath("//textarea[@class='gLFyf']"));
                typeText(By.xpath("//textarea[@class='gLFyf']"), "Books" + Keys.ENTER);
                GemTestReporter.addTestStep("enter text in the input field","added text in input field", STATUS.PASS);
                System.out.println("Books");
            }
            else {
                GemTestReporter.addTestStep("text is not entered in the input field","text is not entered input field", STATUS.FAIL);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
