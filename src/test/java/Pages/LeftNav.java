package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    //sol taraftaki menuler burada
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement paremeters;
    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationality;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    public WebElement feeButton;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExam;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement examSetup;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    public WebElement EntranceExams;

    @FindBy(xpath = "(//span[text()='States'])[1]")
    public WebElement states;



    public WebElement getWebElement(String strButton){


        switch (strButton){
            case "setup":return setup;
            case "paremeters":return paremeters;
            case "countries":return countries;
            case "citizenShip":return citizenShip;
            case "nationality":return nationality;
            case "fees":return feeButton;
            case "exam":return entranceExam;
            case "examSetup":return examSetup;
            case "EntranceExams":return EntranceExams;
            case "states":return states;
        }


        return null;
    }

}
