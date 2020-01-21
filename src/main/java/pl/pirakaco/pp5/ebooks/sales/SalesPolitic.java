package pl.pirakaco.pp5.ebooks.sales;
import java.util.Optional;

public class SalesPolitic {

    public int isHunderetDiscount(){
        if(Basket.totalCosts()>100){ return 20}
        return 0;
    }

    public int isPcsDiscount(){
        int discountLevel;
        if(Basket.productsCount()>4) { discountLevel = 20; }
        return (discountLevel);
    }

    public void isFreeShipping(){
        if(Basket.totalCosts()>1000){   Basket.shippingCost()==0;    }
    }
}
