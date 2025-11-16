package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElement;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class HomePage extends Form {
    private final IElement getProduct = getElementFactory().getLabel(By.xpath("//div[@data-test='inventory-item-name' and normalize-space(.)='Sauce Labs Backpack']\n"), "Get Text product");
    private final IButton addToCart = getElementFactory().getButton(By.id("add-to-cart-sauce-labs-backpack"), "Add to cart Button");
    private final IButton shoppingChart = getElementFactory().getButton(By.className("shopping_cart_link"), "Shopping Chart");
    public HomePage(){
        super(By.id("header_container"), "Home Page Swag Labs");
    }

    public boolean isHomePageDisplayed(){
        return state().waitForDisplayed();
    }

    public String getText(){
       return getProduct.getText();
    }

    public void clickAddToCartBtn(){
        addToCart.click();
    }

    public void clickShoppingChart(){
        shoppingChart.click();
    }


}
