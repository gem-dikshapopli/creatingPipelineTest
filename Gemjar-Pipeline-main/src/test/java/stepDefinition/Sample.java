package stepDefinition;

import com.gemini.generic.reporting.GemEcoUpload;
import implementation.SampleImplementation;
import io.cucumber.java.en.Given;


public class Sample extends GemEcoUpload {

    @Given("Search for the shoes")
    public void searchForTheShoes(){
        try{
            SampleImplementation.shoesSearch();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Given("Search for the books")
    public void searchForThebooks(){
        try{
            SampleImplementation.bookSearch();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
