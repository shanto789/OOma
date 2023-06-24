package smarttech.hou.stepdefinations;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import smarttech.hou.basepage.ParentClass;
import smarttech.hou.elementspage.MasterPageFactoryhou;
import smarttech.hou.generic.CommonUtilhou;
import smarttech.hou.generic.WaitHelperHou;

public class FuntionalStepDef extends ParentClass {

	MasterPageFactoryhou pf;

	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {
		pf = new MasterPageFactoryhou();
		log.info("ooomaaaa>>>> User able to verify user info on the screen>>>> goo");
		WaitHelperHou.waitForElement(pf.getVerifyUserInfo());
		CommonUtilhou.getAssertions(pf.getVerifyUserInfo().getText(), prop.getProperty("expectedText"));
	}

	@When("User should be able to select jacket from men module")
	public void user_should_be_able_to_select_jacket_from_men_module() {
		// CommonUtilhou.highLighterMethod(pf.getSelectMen());

		log.info("ooomaaaa>>>>  User able to hover over top men module >>>> goo");
		WaitHelperHou.waitForElement(pf.getSelectMen());
		CommonUtilhou.hoverOver(pf.getSelectMen());

		// CommonUtilhou.highLighterMethod(pf.getSelectTops());
		log.info("ooomaaaa>>>>  User able to hover over tops inside the men module >>>> goo");
		WaitHelperHou.waitForElement(pf.getSelectTops());
		CommonUtilhou.hoverOver(pf.getSelectTops());

		// CommonUtilhou.highLighterMethod(pf.getClickJacket());
		log.info("ooomaaaa>>>>  User able to click on jacket>>>> goo");
		WaitHelperHou.waitForElement(pf.getClickJacket());
		CommonUtilhou.actionClick(pf.getClickJacket());
	}

	@When("Verify the jacket name on the {string} list")
	public void verify_the_jacket_name_on_the_list(String Jackets) {
		pf = new MasterPageFactoryhou();
		WaitHelperHou.waitForElement(pf.getVerifyJacket());
		CommonUtilhou.getAssertions(pf.getVerifyJacket().getText(), prop.getProperty("cloth"));
	}

	@When("User should be able to select the {string} and {string} and {string} then click on the add to cart")
	public void user_should_be_able_to_select_the_and_and_then_click_on_the_add_to_cart(String string, String string2,
			String string3) {

		WaitHelperHou.waitForElement(pf.getGetMontana());
		CommonUtilhou.actionClick(pf.getGetMontana());

		WaitHelperHou.waitForElement(pf.getGetSize());
		CommonUtilhou.actionClick(pf.getGetSize());

		WaitHelperHou.waitForElement(pf.getGetRed());
		CommonUtilhou.actionClick(pf.getGetRed());

		WaitHelperHou.waitForElement(pf.getGetAddCart());
		CommonUtilhou.actionClick(pf.getGetAddCart());

	}

	@When("User should be able to click on the cart")
	public void user_should_be_able_to_click_on_the_cart() {
		WaitHelperHou.waitForElement(pf.getGetShoppingCart());
		CommonUtilhou.actionClick(pf.getGetShoppingCart());

	}

	@When("User should be able to click on the checkout")
	public void user_should_be_able_to_click_on_the_checkout() {
		WaitHelperHou.waitForElement(pf.getGetCheckout());
		CommonUtilhou.actionClick(pf.getGetCheckout());

	}

	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("shanto"); 
		
		
	}

	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {

	}

	@Then("User should be able to verify the order number and get text on the screen {string}")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen(String string) {

	}

}
