package stepdefnition;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.loginpageobject;

public class loginstepdefnition extends loginpageobject {
   
	 @Given("^user is in login page$")
	    public void user_is_in_login_page() {
		 launchchrome();
		 firstloginButton();
	       
	    }

	    @When("^user enter mail id(.+)$")
	    public void user_enter_mail_id(String emailid)  {
	    	enterEmail(emailid);
	       
	    }

	    @Then("^user should be loggedin successfully$")
	    public void user_should_be_loggedin_successfully()  {
	    	clickonSubmit();
	    	
	    }

	    @And("^user enters password(.+)$")
	    public void user_enters_password(String password)  {
	    	enterPassword(password);
	    }

	    @And("^click on check box$")
	    public void click_on_check_box()  {
	    	checkbox();
	    }


}
	

	
		
		

		