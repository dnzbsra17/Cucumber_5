package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends Parent {
    public WebElement successMessage;

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement usurname;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input") //sitedeki olan namelerin hepsinin locatoru budur
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMesasage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyExists;

    public void deleteItem(String seachText) {
        sendKeysFunction(searchNameInput, seachText);
        clickFunction(searchButton);
        // 1. StaleElement hatası verdı : Bayatlama hatası Erken buldum tez kaybettim
        ////fuse-progress-bar/* bu locator un cocukları 0 olana kadar bekle
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunction(deleteImageButton);
        clickFunction(deleteDialogButton);
    }

    @FindBy(xpath = " //mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button/div")
    public WebElement searchButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogButton;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Integration Code']")
    public WebElement integrationCode;

    @FindBy(xpath = "(//mat-form-field//input[@data-placeholder='Priority'])[2]")
    public WebElement priority;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBar;

    @FindBy(xpath = "//mat-select//span[text()='Academic Period']")
    public WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option/span)[1]")
    public WebElement academicPeriod1;

    @FindBy(xpath = "(//span[text()='Grade Level'])[1]")
    public WebElement gradeLevel;

    @FindBy(xpath = "(//mat-option//span)[2]")
    public WebElement gradeLevel2;

    @FindBy(xpath = "//tr[contains(@class, 'mat-row')]/td[2]")
    public List<WebElement> nameList;


    public WebElement getWebElement(String strButton) {
        switch (strButton) {
            case "addButton":
                return addButton;
            case "saveButton":
                return saveButton;
            case "nameInput":
                return nameInput;
            case "codeInput":
                return codeInput;
            case "integrationCode":
                return integrationCode;
            case "priority":
                return priority;
            case "toggleBar":
                return toggleBar;
            case "academicPeriod":
                return academicPeriod;
            case "academicPeriod1":
                return academicPeriod1;
            case "gradeLevel":
                return gradeLevel;
            case "gradeLevel2":
                return gradeLevel2;
        }
        return null;
    }


}
