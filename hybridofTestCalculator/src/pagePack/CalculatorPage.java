package pagePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
	
	@FindBy(xpath = "//span[.='1']") private WebElement n_1;
	@FindBy(xpath = "//span[.='2']") private WebElement n_2;
	@FindBy(xpath = "//span[.='3']") private WebElement n_3;
	@FindBy(xpath = "//span[.='4']") private WebElement n_4;
	@FindBy(xpath = "//span[.='5']") private WebElement n_5;
	@FindBy(xpath = "//span[.='6']") private WebElement n_6;
	@FindBy(xpath = "//span[.='7']") private WebElement n_7;
	@FindBy(xpath = "//span[.='8']") private WebElement n_8;
	@FindBy(xpath = "//span[.='9']") private WebElement n_9;
	@FindBy(xpath = "//span[.='0']") private WebElement n_0;
	
	@FindBy(xpath = "//span[.='+']") private WebElement add;
	@FindBy(xpath = "//span[.='–']") private WebElement sub;
	@FindBy(xpath = "//span[.='×']") private WebElement mul;
	@FindBy(xpath = "//span[.='/']") private WebElement div;
	@FindBy(xpath = "//span[.='=']") private WebElement Equal;	
	
	@FindBy(xpath = "//div[@id='sciOutPut']") private WebElement outPut;
	
	
	
	public WebElement getOutPut() {
		return outPut;
	}




	public WebElement getEqual() {
		return Equal;
	}




	public CalculatorPage(WebDriver driver) {
      
		PageFactory.initElements(driver,this);
	}




	public WebElement getN_1() {
		return n_1;
	}




	public WebElement getN_2() {
		return n_2;
	}




	public WebElement getN_3() {
		return n_3;
	}




	public WebElement getN_4() {
		return n_4;
	}




	public WebElement getN_5() {
		return n_5;
	}




	public WebElement getN_6() {
		return n_6;
	}




	public WebElement getN_7() {
		return n_7;
	}




	public WebElement getN_8() {
		return n_8;
	}




	public WebElement getN_9() {
		return n_9;
	}




	public WebElement getN_0() {
		return n_0;
	}




	public WebElement getAdd() {
		return add;
	}




	public WebElement getSub() {
		return sub;
	}




	public WebElement getMul() {
		return mul;
	}




	public WebElement getDiv() {
		return div;
	}




	public void multiplication() throws InterruptedException
	{
		n_4.click();
		n_2.click();
		n_3.click();
		Thread.sleep(1000);
		mul.click();
		Thread.sleep(1000);
		n_5.click();
		n_2.click();
		n_5.click();
		Thread.sleep(1000);
		Equal.click();
		
		
	}
	
    public void division() throws InterruptedException
    {
    	n_4.click();
    	n_0.click();
    	n_0.click();
    	n_0.click();
    	Thread.sleep(1000);
    	div.click();
    	Thread.sleep(1000);
    	n_2.click();
    	n_0.click();
    	n_0.click();
    	Thread.sleep(1000);
    	Equal.click();
    	
    	
    }
    public void addition() throws InterruptedException 
    {
    sub.click();
    n_2.click();
    n_3.click();
    n_4.click();
    n_2.click();
    n_3.click();
    n_4.click();
    Thread.sleep(1000);
    add.click();
    n_3.click();
    n_4.click();
    n_5.click();
    n_3.click();
    n_4.click();
    n_5.click();
    Thread.sleep(1000);
	Equal.click();
  }
    
    public void subtraction() throws InterruptedException
    {
    	n_2.click();
        n_3.click();
        n_4.click();
        n_8.click();
        n_2.click();
        n_3.click();
        Thread.sleep(1000);
        sub.click();
        sub.click();
        n_2.click();
        n_3.click();
        n_0.click();
        n_9.click();
        n_4.click();
        n_8.click();
        n_2.click();
        n_3.click();
        Thread.sleep(1000);
    	Equal.click();
        
}
    
    
    
    
    


}
