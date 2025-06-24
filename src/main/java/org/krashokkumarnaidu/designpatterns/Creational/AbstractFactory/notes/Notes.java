package org.krashokkumarnaidu.designpatterns.Creational.AbstractFactory.notes;

//In Factory Pattern:
interface Button {  // <-- This is the PRODUCT TYPE
    public void render();
}

class AndroidButton implements Button {public void render(){} } // <-- This is a CONCRETE PRODUCT
class IOSButton implements Button {public void render(){} }     // <-- This is a CONCRETE PRODUCT

class ButtonFactory {
    public static Button createButton(String platform) {
        // This method PRODUCES/CREATES the product (Button objects)
        return new AndroidButton(); // <-- PRODUCT being manufactured
    }
}


//In Abstract Factory Pattern:
// These are all PRODUCT TYPES
interface UIButton { }    // <-- PRODUCT TYPE 1
interface UITextField { } // <-- PRODUCT TYPE 2
interface UICheckbox { }  // <-- PRODUCT TYPE 3

// These are CONCRETE PRODUCTS
class DarkButton implements UIButton { }     // <-- CONCRETE PRODUCT
class DarkTextField implements UITextField { } // <-- CONCRETE PRODUCT
class DarkCheckbox implements UICheckbox { }   // <-- CONCRETE PRODUCT

interface UIThemeFactory {
    UIButton createButton();       // Creates PRODUCT 1
    UITextField createTextField(); // Creates PRODUCT 2
    UICheckbox createCheckbox();   // Creates PRODUCT 3
}
