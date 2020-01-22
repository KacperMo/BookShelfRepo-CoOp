package pl.pirakaco.pp5.ebooks.rebate;
import pl.pirakaco.pp5.ebooks.rebate.QuantitiDiscount;

public class DiscountFromFactory {
    private static PolicyOfDiscounting quantityDiscount() {
        return new QuantitiDiscount(5, 0.20);
    }

    private static PolicyOfDiscounting isAnybodyPrietest() {
        return new QuantitiDiscount(1, 1);
    }
    private static PolicyOfDiscounting firstDayOfSpringDiscount() {
        return new QuantitiDiscount(4, 0.25);
    }
}
