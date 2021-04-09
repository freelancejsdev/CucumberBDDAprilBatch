package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
    WebDriver driver;


  // locators

    @FindBy(linkText = "Register")
    public WebElement registerLink;


    @FindBy(linkText = "Log in")
    public WebElement loginLink;



    @FindBy(id = "small-searchterms")
    public WebElement searchTextbox;

    @FindBy(className = "search-box-button")
    public WebElement searchButton;

    @FindBy(className = "ico-logout")
    public WebElement logoutButton;





  public HomePage(WebDriver driver)
  {
       this.driver = driver;
       PageFactory.initElements(driver,this);
  }





    // actions  -  methods

    public void clickRegisterLink()
    {
        registerLink.click();
    }


    public void clickLoginLink()
    {
        loginLink.click();
    }


    public void enterSearchText(String item)
    {
        searchTextbox.sendKeys(item);
    }

    public void clickSearchButton()
    {
        searchButton.click();
    }




    public void pageRefresh()
    {
        driver.navigate().refresh();
    }


    public String getPageTitle()
    {
      return driver.getTitle();
    }

    public void navigateToUrl(String url)
    {
        driver.navigate().to(url);
    }


    public String verifyLogin()
    {
       // WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(Ex)

      String text = logoutButton.getText();

       return text;
    }



}
