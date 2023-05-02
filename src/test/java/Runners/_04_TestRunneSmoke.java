package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // tüm yazılan testler içerisinde smoke test olanları çalıştır demek
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin= {"html:target/site/cucumber-pretty.html"}


)
public class _04_TestRunneSmoke extends AbstractTestNGCucumberTests {
    //featureFileslerde senaryoların uzerine @SmokeTest yazıyoruz cucumberOptions un içer

}
