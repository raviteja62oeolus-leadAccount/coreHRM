package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Hrms.base.BasePage;
import com.Hrms.pages.LoginPage;
import com.Hrms.pages.PIMPage;
import com.Hrms.utils.CommonUtils;
import com.Hrms.utils.TestNGUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestPIMPage extends BasePage{
		WebDriver driver;

	
	//----------------Page class objects Implementations---------
	
	LoginPage loginPage = new LoginPage();
	
	PIMPage pimPage = new PIMPage();
	
	
	@Given("log in to the application")
	public void log_in_to_the_application() {
		 loginPage.login();
	}

	@Given("wait for five seconds to allow the page to load")
	public void wait_for_five_seconds_to_allow_the_page_to_load() {
		CommonUtils.hardWait(5);
	}

	@Then("verify Welcome selenium")
	public void verify_welcome_selenium() {
		TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()), "Welcome selenium");
	}

	@When("move the mouse to the PIM")
	public void move_the_mouse_to_the_pim() throws Exception {
		CommonUtils.moveToElement(PIMPage.getPim());
	}

	@When("click on the Add Employee button")
	public void click_on_the_add_employee_button() throws Exception {
		CommonUtils.clickElement(PIMPage.getAddEmp());
	}

	@When("switch to the iframe")
	public void switch_to_the_iframe() throws Exception {
		CommonUtils.switchToFrame(PIMPage.getFrame());
	}

	@When("enter the first name {string} into the first name field")
	public void enter_the_first_name_into_the_first_name_field(String firstname) throws Exception {
		CommonUtils.enterValue(PIMPage.getFirstName(), firstname, true);
	}

	@When("enter the last name {string} into the last name field")
	public void enter_the_last_name_into_the_last_name_field(String lastname) throws Exception {
		CommonUtils.enterValue(PIMPage.getLastName(), lastname, true);
	}

	@When("click the Save button to add the new employee")
	public void click_the_save_button_to_add_the_new_employee() throws Exception {
		CommonUtils.clickElement(PIMPage.getSave());
	}

	@When("click the Back button to return to the previous page")
	public void click_the_back_button_to_return_to_the_previous_page() throws Exception {
		CommonUtils.clickElement(PIMPage.getBackButton());
	}

	@Then("verify that the employee name displayed matches Sai P")
	public void verify_that_the_employee_name_displayed_matches() throws Exception {
		TestNGUtility.assertTrue(CommonUtils.getElementText(PIMPage.getEmpName()),"Kosmik Sai");
	}
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	
	@Test(description="Verify that the search functionality returns the correct employee",groups= {"Smoke"},priority=1)
	public void searchEmployee() throws Exception {
		
	}
	
	@Test(description="Verify that employee details can be edited successfully",dependsOnMethods= {"searchEmployee"},groups= {"Smoke"},priority=2)
	public void editEmployeeDetails() throws Exception {
	    Assert.assertEquals("Akki", "Akki");
	
	}
	
	@Test(description="Verify that an employee can be deleted successfully",priority=3)
	public void deleteEmployee() throws Exception {
	 
	
	}
	
	@Test(description="Verify that the employee list is displayed correctly with accurate information",priority=4)
	public void viewEmployeeList() throws Exception {
		Assert.assertEquals("akki", "akki");
	
	}
	
	@Test(description="Verify that photos can be added to employee profiles",priority=5)
	public void addEmployeePhotos() throws Exception {
	
	
	}
	
	@Test(description="Verify that employee details are correctly displayed",priority=6)
	public void viewEmployeeDetails() throws Exception {
		
	
	}
	
	@Test(description="Verify that the employment status of an employee can be updated",priority=7)
	public void editEmploymentStatus() throws Exception {
	
	
	}
	
	@Test(description="Verify that the employee list can be filtered based on various criteria",priority=8)
	public void filterEmployeeList() throws Exception {
	
	
	}

	*/
}
