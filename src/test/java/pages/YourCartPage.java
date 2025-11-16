package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElement;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class YourCartPage extends Form {
    private final IElement vText = getElementFactory().getLabel(By.cssSelector(".inventory_details_name.large_size"), "Get Text");
    private final IButton menuBtn = getElementFactory().getButton(By.id("react-burger-menu-btn"), "Menu Button");
    private final IButton logOut = getElementFactory().getButton(By.id("logout_sidebar_link"), "Logout Button");

    public YourCartPage(){
        super(By.className("cart_item_label"), "Your Cart");
    }

    public boolean isYourCartPageDisplayed(){
        return state().waitForDisplayed();
    }

    public String getTextCart(){
            return getElementFactory().getLabel(By.cssSelector(".inventory_item_name"), "Cart Item Name").getText();
    }

    public void clickMenuBtn(){
        menuBtn.click();
    }

    public void clickLogOutBtn(){
        logOut.click();
    }


}
