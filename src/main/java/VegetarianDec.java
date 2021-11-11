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
    public Dish getPlainDish() {
        return this.contains.getPlainDish();
    }
}
