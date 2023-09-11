package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Thread.sleep;

public class InputFormSubmitPage
{
   static WebDriver driver;
   public InputFormSubmitPage(WebDriver driver)
   {
       this.driver=driver;

   }
   private By namefield= By.xpath("//input[@id='name']");
   private By emailfield= By.xpath("//input[@id='inputEmail4']");
   private By Passwordfield=By.xpath("//input[@id='inputPassword4']");
   private By Companyfield=By.xpath("//input[@id='company']");
   private By websitefield=By.xpath("//input[@id='websitename']");
   private By Cityfield=By.xpath("//input[@id='inputCity']");
   private By Addressfield1=By.xpath("//input[@id='inputAddress1']");
   private By Addressfield2=By.xpath("//input[@id='inputAddress2']");
   private By Statefield=By.xpath("//input[@id='inputState']");
   private By ZipCodefield=By.xpath("//input[@id='inputZip']");
   private By DropdownCountry=By.xpath("//select[@name='country']");
   private By submitButton=By.xpath("//button[@type='submit']");


   public void enterName(String name)
   {
      driver.findElement(namefield).sendKeys(name);

   }
   public void enterEmail(String email)
   {
       driver.findElement(emailfield).sendKeys(email);
   }
    public void enterPassword(String password)
    {
        driver.findElement(Passwordfield).sendKeys(password);
    }
    public void enterCompany(String company)
    {
        driver.findElement(Companyfield).sendKeys(company);
    }
    public void enterWebsite(String website)
    {
        driver.findElement(websitefield).sendKeys(website);
    }
    public void entercity(String city)
    {
        driver.findElement(Cityfield).sendKeys(city);
    }
    public void enterAddress1(String address1)
    {
        driver.findElement(Addressfield1).sendKeys(address1);
    }
    public void enterAddress2(String address2)
    {
        driver.findElement(Addressfield2).sendKeys(address2);
    }
    public void enterState(String state)
    {
        driver.findElement(Statefield).sendKeys(state);
    }
    public void enterZipCode(String code)
    {
        driver.findElement(ZipCodefield).sendKeys(code);
    }
    public Select finddropdown()
    {
        return new Select(driver.findElement(DropdownCountry));
    }
    public void SelectfromDropdownCountry(String countryname)
    {

     finddropdown().selectByVisibleText(countryname);
    }

    public List<String> getselectedOption()
    {
        List<WebElement>selectedOptions=finddropdown().getAllSelectedOptions();
        return selectedOptions.stream().map(e->e.getText()).collect(Collectors.toList());
    }






}
