package ca.college.lasalle;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public static List<Product> initialProducts() {
        LocalDate expiryDate = LocalDate.now().plusYears(1);
        List<Product> productList = new ArrayList<>();
        //Gas
        productList.add(new Gas("Gas", new BigDecimal(1.64), 1000));
        //Chocolate Bars
        productList.add(new ChocolateBar("Kitty Kay", new BigDecimal(2.64), 100, expiryDate));
        productList.add(new ChocolateBar("Aero",new BigDecimal(3.64) ,100,expiryDate));
        //Sandwich
        productList.add(new Sandwich("Sandwich", new BigDecimal(5.64), 200, expiryDate, SandwichSize.MEDIUM, SandwichMainIgredient.CHICKEN));
        productList.add(new Sandwich("Sandwich", new BigDecimal(7.64), 300, expiryDate, SandwichSize.LARGE, SandwichMainIgredient.MEAT));
        //Coffe
        productList.add(new Coffee("Tim Hortons", new BigDecimal(1.64), 10, expiryDate));
        productList.add(new Coffee("Iced coffee", new BigDecimal(3.64), 300, expiryDate));

        return productList;
    }

}
