package org.example;

import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;

public class MyStepDef {
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();
    CheckOutAsGuestPage checkOutAsGuestPage = new CheckOutAsGuestPage();
    BillingPage billingPage = new BillingPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    ConfirmationOrderPage confirmationOrderPage = new ConfirmationOrderPage();
    OrderCompeletedPage orderCompeletedPage = new OrderCompeletedPage();
    NewsPage newsPage = new NewsPage();
    ProductPage productPage = new ProductPage();
    LoadProp loadProp = new LoadProp();
    RegistrationPage registrationPage = new RegistrationPage();
    LoginPage loginPage = new LoginPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    LeicaTMirrorlessDigitalCameraPage leicaTMirrorlessDigitalCameraPage = new LeicaTMirrorlessDigitalCameraPage();
    ReferToFriendPage referToFriendPage = new ReferToFriendPage();
    ProductEmailFriend productEmailFriend = new ProductEmailFriend();


    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
    }

    @When("I select a product")
    public void i_select_a_product() {
        homePage.selectProductAndClickOnShoppingCart();
    }

    @When("I add to cart")
    public void i_add_to_cart() {
    }

    @When("I select Shopping cart")
    public void i_select_shopping_cart() {
    }

    @When("I accept Gift Wrapping and Terms and condition and click on CHECKOUT")
    public void i_accept_gift_wrapping_and_terms_and_condition_and_click_on_checkout() {
        cartPage.CheckOut();
    }

    @When("I select Checkout as guest")
    public void i_select_checkout_as_guest() {
        checkOutAsGuestPage.CheckOutAsGuest();
    }

    @When("I enter Billing details")
    public void i_enter_billing_details() {
        billingPage.billingDetails();
    }

    @When("I select shipping method")
    public void i_select_shipping_method() {
        shippingMethodPage.selectShippingOption();
    }

    @When("I select payment method")
    public void i_select_payment_method() {
        paymentMethodPage.selectPaymentMethod();
    }

    @When("I entre payment details")
    public void i_entre_payment_details() {
        paymentInfoPage.selectPaymentMethod();
    }

    @When("I confirm the order")
    public void i_confirm_the_order() {
        confirmationOrderPage.ClickOnContinuePage();
    }

    @Then("I get Your order has been successfully processed!message")
    public void i_get_your_order_has_been_successfully_processed_message() {
        orderCompeletedPage.ConfirmOrder();
    }

    @When("I select Euro from currency drop menu bar")
    public void iSelectEuroFromCurrencyDropMenuBar() {
        homePage.selectEuroFromCurrencyDropBox();
    }

    @Then("All products on home page should have € symbol to price")
    public void allProductsOnHomePageShouldHave€SymbolToPrice() {
        homePage.verifyAllProductHaveEuroSign();
    }

    @When("I select DETAILS from news section of nopCommerce new release")
    public void iSelectDETAILSFromNewsSectionOfNopCommerceNewRelease() {
        homePage.clcikOnDetailsNewsButton();
    }

    @When("I type Title")
    public void iTypeTitle() {
    }

    @And("I type comment")
    public void iTypeComment() {
    }

    @And("Click on NEW COMMENT button")
    public void clickOnNEWCOMMENTButton() {
    }

    @Then("News comment is successfully added. message should display as title")
    public void newsCommentIsSuccessfullyAddedMessageShouldDisplayAsTitle() {
        newsPage.checkLastCommentIsAtTheBottomOfTheListOrNot();
    }

    @And("My comment should be at the bottom of the list")
    public void myCommentShouldBeAtTheBottomOfTheList() {
        newsPage.verifyTitleOfPage();
    }

    @When("I type product name in search bar")
    public void iTypeProductNameInSearchBar() {
        homePage.entreProductNameInSearchBox(loadProp.getProperty("productName"));
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        homePage.clickOnSearchButton();
    }

    @Then("All products on home page should have product name on display")
    public void allProductsOnHomePageShouldHaveProductNameOnDisplay() {
        productPage.verifyProductNameHaveSearchNameContent();
    }

    @And("Product name should be at the end of URL")
    public void productNameShouldBeAtTheEndOfURL() {
        productPage.verifyProductURL();
    }

    @Given("I am a registered user")
    public void iAmARegisteredUser() {
        homePage.clickOnRegister();
        registrationPage.entreTheRegistrationDetails();
        //loginPage.entreLoginDetails();
    }

    @When("I select Electronics")
    public void iSelectElectronics() {
        electronicsPage.clickOnCameraAndPhoto();
    }

    @When("Select Camera & photo")
    public void selectCameraPhoto() {
    }

    @When("Select Leica T Mirrorless Digital Camera")
    public void selectLeicaTMirrorlessDigitalCamera() {
        cameraAndPhotoPage.ClickOnLeicaTMirrorlessDigitalCamera();
    }

    @When("Select email a friend")
    public void selectEmailAFriend() {
        leicaTMirrorlessDigitalCameraPage.clickOnEmailaFriend();
    }

    @When("Enter Friend's email address")
    public void enterFriendSEmailAddress() {
        referToFriendPage.referToFriend();
    }

    @And("Entre my email address")
    public void entreMyEmailAddress() {
    }

    @And("Entre personal message")
    public void entrePersonalMessage() {
    }

    @And("click on Send email button")
    public void clickOnSendEmailButton() {
    }

    @Then("success message should display")
    public void successMessageShouldDisplay() {
        productEmailFriend.emailFriend();
    }
}
