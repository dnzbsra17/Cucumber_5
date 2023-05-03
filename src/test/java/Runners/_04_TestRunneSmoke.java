package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // tüm yazılan testler içerisinde smoke test olanları çalıştır demek
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin= {"json:target/cucumber/cucumber.json"}


)
public class _04_TestRunneSmoke extends AbstractTestNGCucumberTests {
    //featureFileslerde senaryoların uzerine @SmokeTest yazıyoruz cucumberOptions un içer

}
