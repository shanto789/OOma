package smarttech.hou.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smarttech.hou.generic.CommonUtilhou;
import smarttech.hou.generic.WaitHelperHou;
import smarttech.hou.basepage.ParentClass;

public class MasterPageFactoryhou extends ParentClass {

	
	public MasterPageFactoryhou() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Sign In")
	@CacheLookup
	private WebElement clickSigninAtHomePage;

	public WebElement getClickHomePageSignin() {
		return clickSigninAtHomePage;
	}
	

	@FindBy(xpath = "//*[@id= 'email']")
	@CacheLookup
	private WebElement enterEmail;

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	@FindBy(xpath = "//*[@id= 'pass']")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	
	
	@FindBy(id = "send2")
	@CacheLookup
	private WebElement clickOnLoginBTN;

	public WebElement getClickOnLoginBTN() {
		return clickOnLoginBTN;
	}
	
	@FindBy(xpath = "(//*[text()='Welcome, tariqul huda!'])[1]")
	@CacheLookup
	private WebElement verifyUserInfo;

	public WebElement getVerifyUserInfo() {
		return verifyUserInfo;
	}
	
	@FindBy(linkText = "Men")
	@CacheLookup
	private WebElement selectMen;

	public WebElement getSelectMen() {
		return selectMen;
	}

	@FindBy(linkText = "Tops")
	@CacheLookup
	private WebElement selectTops;

	public WebElement getSelectTops() {
		return selectTops;
	}
	
	@FindBy(linkText = "Jackets")
	@CacheLookup
	private WebElement clickJacket;

	public WebElement getClickJacket() {
		return clickJacket;
	}
	
	@FindBy(xpath = "(//*[text()='Jackets'])[4]")
	@CacheLookup
   private WebElement verifyJacket;
	
	public WebElement getVerifyJacket() {
	return verifyJacket;
}
	@FindBy(xpath = "(//*[@class = 'product-item-link'])[2]")
	@CacheLookup
	private WebElement getMontana;
	
	public WebElement getGetMontana() {
		return getMontana;
	}
	@FindBy(xpath = "//*[@option-id='168']")
	@CacheLookup
	private WebElement getSize;
	
	public WebElement getGetSize() {
		return getSize;
	}

	@FindBy(xpath = "//*[@option-label ='Red']")
	@CacheLookup
	private WebElement getRed;
	
	public WebElement getGetRed() {
		return getRed;
	}
	
	@FindBy(xpath = "//*[text() ='Add to Cart']")
	@CacheLookup
	private WebElement getAddCart;

	public WebElement getGetAddCart() {
		return getAddCart;
	}
	
	@FindBy(linkText ="shopping cart")
	@CacheLookup
	private WebElement getShoppingCart;


	public WebElement getGetShoppingCart() {
		return getShoppingCart;
	}
	
	@FindBy (xpath ="(//*[contains(text(),'Proceed to Checkout')])[2]")
	@CacheLookup
	private WebElement getCheckout;

	public WebElement getGetCheckout() {
		return getCheckout;
	}

	public void getLogin() throws InterruptedException {
		
		
		log.info("ooomaaaa>>>> User can click on sign In BTN>>>> goo");
		WaitHelperHou.waitForElement(getClickHomePageSignin());
		CommonUtilhou.actionClick(clickSigninAtHomePage);
		
		log.info("ooomaaaa>>>> User can enter the userName>>>> goo");
		WaitHelperHou.waitForElement(getEnterEmail());
		getEnterEmail().sendKeys(prop.getProperty("UserName"));
		
		log.info("ooomaaaa>>>>User can enter the Password>>>> goo");
		WaitHelperHou.waitForElement(getEnterPassword());
		getEnterPassword().sendKeys(prop.getProperty("Password"));
	
		log.info("ooomaaaa>>>> User can click on log In BTN>>>> goo");
		WaitHelperHou.waitForElement(getClickOnLoginBTN());
		CommonUtilhou.actionClick(getClickOnLoginBTN());
		 Thread.sleep(5000);
	}
	
}

	
	
	
	
	
	

