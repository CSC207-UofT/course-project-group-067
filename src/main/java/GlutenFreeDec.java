public class GlutenFreeDec extends AttributeDecorator {

    Dish contains;
    public GlutenFreeDec(Dish d) {
        this.contains = d;
    }

    @Override
    public boolean hasAttribute(AttributeDecorator attribute) {
        if (attribute instanceof VegetarianDec) {
            return true;
        }
        else {
            return this.contains.hasAttribute(attribute);
        }

    }

    @Override
    public Dish getPlainDish() {
        return this.contains.getPlainDish();
    }
}