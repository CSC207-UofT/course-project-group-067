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
    public PlainDish getPlainDish() {
        return this.contains.getPlainDish();
    }

    @Override
    public String toString() {
        return ("GlutenFree " + contains.toString());
    }
}