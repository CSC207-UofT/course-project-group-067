public class VegetarianDec extends AttributeDecorator {

    Dish contains;
    public VegetarianDec(Dish d) {
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
        return ("Vegetarian " + contains.toString());
    }
}
