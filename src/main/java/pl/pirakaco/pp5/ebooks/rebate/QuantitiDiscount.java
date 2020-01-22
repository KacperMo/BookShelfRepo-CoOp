package pl.pirakaco.pp5.ebooks.rebate;

import pl.pirakaco.pp5.ebooks.rebate.Discount;
import pl.pirakaco.pp5.ebooks.rebate.PolicyOfDiscounting;

public class QuantitiDiscount {
    private Integer itemCount;
    private Double discountValue;

    public QuantityDiscount(Integer itemCount, Double discountValue) {
        this.itemCount = itemCount;
        this.discountValue = discountValue;
    }

    @Override
    public Discount calculateDiscount(*** item) {
        if (item.getQuantity() >= itemCount) {
            return new Discount("Item count", (item.getTotalCost() * discountValue));
        }

        return Discount.noDiscount();
    }
}
