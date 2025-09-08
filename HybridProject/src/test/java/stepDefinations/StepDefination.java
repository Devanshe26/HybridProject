package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefination {
 WebDriver driver;


@Given("open the firefox browser")
public void open_the_firefox_browser() {
 driver = new FirefoxDriver();	
}


@Given("navigate to app url")
public void navigate_to_app_url() {
  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php"); 
}

@When("enter  username data into the username field")
public void enter_data_into_the_username_field(DataTable dataTable) {
	//System.out.println("Username entered: " + usename);

	  // Convert the DataTable into a list of lists (we're getting the first username)
   List<List<String>> data = dataTable.asLists();
    String username = data.get(0).get(0); // Get the first username from the table
    System.out.println("Username entered: " + username); // Print the username to the console
    driver.findElement(By.name("txtUserName")).sendKeys(username); // Type the username into the username field
    
}

@When("enter  password data into password field")
public void enter_data_into_password_field(DataTable dataTable) {
	  // Convert the DataTable into a list of lists (we're getting the first password)
    List<List<String>> data = dataTable.asLists();
    String password = data.get(0).get(0); // Get the first password from the table
    System.out.println("password: " + password); // Print the password to the console
    driver.findElement(By.name("txtPassword")).sendKeys(password); // Type the password into the password field
  
}

@When("click on login button")
public void click_on_login_button() {
  driver.findElement(By.name("Submit")).click();  
}

@Then("verify login success")
public void verify_login_success() {
    
	   if(driver.getCurrentUrl().equals("http://127.0.0.1/orangehrm-2.5.0.2/login.php")) { 
           System.out.println("Login successful."); // Print success message if login is successful
       } else {
           System.out.println("Login failed."); // Print failure message if login is unsuccessful
       }
}
}
