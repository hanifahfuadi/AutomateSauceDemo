package step_definitions;

import com.hani.pageObject.CheckOutPage;
import com.hani.pageObject.InventoryPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;

import static step_definitions.Hooks.webDriver;


public class purchaseSteps {
    private WebDriver webDriver;

    public purchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User add one product to cart \"(.*)\"")
    public void selectOneProduct(String addOneProduct) {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.addOneProduct();
    }
    @Then("User remove first \"(.*)\"")
    public void removeOne (String RemoveOne) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(8000);
        inventoryPage. backpackRemove();
    }

    @Then("User sort product list by \"(.*)\"")
    public void selectProductCart(String sortProduct) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(3000);
        inventoryPage.sortProduct(sortProduct);
    }

    @Then("User first add \"(.*)\"")
    public void SelectOne(String addFirst) {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.addFirst();
    }
    @Then("User second add \"(.*)\"")
    public void SelectTwo(String addSecond) {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.addSecond();
    }
    @Then("User click \"(.*)\"")
    public void ClickCart(String addCart) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(8000);
        inventoryPage.clickCart();
    }
    @Then("User remove \"(.*)\"")
    public void removeFirst(String removeOne) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(8000);
        inventoryPage.remove1();
    }
    @Then("User \"(.*)\"")
    public void goShopping(String shoppingOne) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
    Thread.sleep(8000);
        inventoryPage.shoppingContinue();
}
@Then("User check Out \"(.*)\"")
    public void Checkout(String outCheck) {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage. goOut();
    }
    @When("User input \"(.*)\" as FirstName, \"(.*)\" as LastName, and \"(.*)\" as Zip")
    public void inputCredential (String FirstName, String LastName, String Zip) {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.setFirstname(FirstName);
        checkOutPage.setLastname(LastName);
        checkOutPage.setZipcode(Zip);
        checkOutPage.buttonCountinue();
    }
    @Then("User will see \"(.*)\" as result item total")
    public void CheckTax (String taxCheck) {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.CheckTOTAL();
    }
    @And("\"(.*)\" as result total")
    public void ResultTotal (String resultTotal) {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.CheckTax();
    }
    @And("\"(.*)\" as total end")
    public void ResultTotalEnd (String resultTotalend) {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.AllTotal();
    }
    @Then("User already satisfied and to go \"(.*)\" for ending SauceLab Demo")
    public void Finish (String finish){
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.Finish();
    }
    @Then("User will see \"(.*)\" in the end of page")
    public void EndSauceDemo (String endSAUCE){
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.End();
    }
}
