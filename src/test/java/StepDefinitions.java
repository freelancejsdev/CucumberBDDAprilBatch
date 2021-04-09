import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("I navigate to url {string}")
    public void i_navigate_to_url(String url)
    {
        BasePage.homePage.navigateToUrl(url);
    }



    @Then("I should be navigate to home page")
    public void i_should_be_navigate_to_home_page()
    {
         String homePageTitle = BasePage.homePage.getPageTitle();
         System.out.println(homePageTitle);
    }

    @When("I click on login link from the navbar")
    public void i_click_on_login_link_from_the_navbar()
    {
         BasePage.homePage.clickLoginLink();
    }

    @Then("I should be navigated to login page")
    public void i_should_be_navigated_to_login_page()
    {
        BasePage.homePage.pageRefresh();
        String loginPageTitle = BasePage.homePage.getPageTitle();
        System.out.println(loginPageTitle);
    }

    @When("I enter email as {string}")
    public void i_enter_email_as(String email)
    {
        BasePage.loginPage.enterEmail(email);
    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String password)
    {
       BasePage.loginPage.enterPassword(password);
    }

    @When("I click on login button")
    public void i_click_on_login_button()
    {
       BasePage.loginPage.clickLogin();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
        System.out.println(BasePage.homePage.verifyLogin());
    }


    @When("I click on register link from the navbar")
    public void i_click_on_register_link_from_the_navbar()
    {
        BasePage.homePage.clickRegisterLink();
    }
    @Then("I should be navigated to register page")
    public void i_should_be_navigated_to_register_page()
    {
        BasePage.homePage.pageRefresh();
        String registerPageTitle = BasePage.homePage.getPageTitle();
        System.out.println(registerPageTitle);
    }
    @When("I select gender as male")
    public void i_select_gender_as_male()
    {
       BasePage.registerPage.clickMaleRadioBtn();
    }
    @When("I enter firstName lastName email password confirmPassword")
    public void i_enter_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable) {
         BasePage.registerPage.enterFirstName(dataTable.cell(1,0));
         BasePage.registerPage.enterLastName(dataTable.cell(1,1));
         BasePage.registerPage.enterEmail(dataTable.cell(1,2));
         BasePage.registerPage.enterPassword(dataTable.cell(1,3));
         BasePage.registerPage.enterConfPassword(dataTable.cell(1,4));
    }
    @When("I click on register button")
    public void i_click_on_register_button()
    {
         BasePage.registerPage.clickRegisterBtn();
    }
    @Then("I should be able to register successfully")
    public void i_should_be_able_to_register_successfully()
    {
        System.out.println(BasePage.registerPage.verifyRegisterMessage());
    }


    @Then("I should see error messages")
    public void iShouldSeeErrorMessages()
    {
        System.out.println("verifying error messages");
    }


    @When("I enter  product name in the search text box")
    public void i_enter_product_name_in_the_search_text_box()
    {

    }
    @When("I click on search button")
    public void i_click_on_search_button()
    {

    }
    @Then("I should see corresponding product details")
    public void i_should_see_corresponding_product_details()
    {

    }
}
