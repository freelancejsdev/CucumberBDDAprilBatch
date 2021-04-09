package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage
{

    WebDriver driver;

    @FindBy(id="gender-male")
    public WebElement maleRadioBtn;

    @FindBy(id="gender-female")
    public WebElement femaleRadioBtn;


    @FindBy(id="FirstName")
    public WebElement firstNameTextbox;


    @FindBy(id="LastName")
    public WebElement lastNameTextbox;


    @FindBy(id="Email")
    public WebElement emailTextbox;

    @FindBy(id="Password")
    public WebElement passwordTextbox;

    @FindBy(id="ConfirmPassword")
    public WebElement confPasswordTextbox;

    @FindBy(id="register-button")
    public WebElement registerBtn;

    @FindBy(name = "DateOfBirthDay")
     public WebElement dayDropdown;


    @FindBy(className = "result")
    public WebElement registerConfMsg;





    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void clickMaleRadioBtn()
    {
        maleRadioBtn.click();
    }

    public void clickFemaleRadioBtn()
    {
        femaleRadioBtn.click();
    }

    public void enterFirstName(String fn)
    {
        firstNameTextbox.sendKeys(fn);
    }



    public void enterLastName(String ln)
    {
       lastNameTextbox.sendKeys(ln);
    }


    public void enterEmail(String e)
    {
      emailTextbox.sendKeys(e);
    }

    public void enterPassword(String p)
    {
        passwordTextbox.sendKeys(p);
    }

    public void enterConfPassword(String cp)
    {
        confPasswordTextbox.sendKeys(cp);
    }


    public void clickRegisterBtn()
    {
        registerBtn.click();
    }


    public void selectDay(String day)
    {
        Select s = new Select(dayDropdown);
        s.selectByVisibleText(day);

    }


    public String verifyRegisterMessage()
    {
       return registerConfMsg.getText();
    }








}
