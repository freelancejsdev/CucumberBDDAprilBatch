import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/features/"}, //mentioning the path of feature files

        //glue = {"steps"}, //package name of step definition file


        plugin = {"pretty","html:target/report.html"},
        monochrome=true
        //dryRun = true
       // strict = true

       // tags = "@regression"
       // tags = "@regression or @ui"
        //tags = "@regression and @ui and @sanity"
)



public class TestRunner
{

}
