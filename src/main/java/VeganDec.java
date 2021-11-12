public class VeganDec extends AttributeDecorator {

    Dish contains;
    public VeganDec(Dish d) {
        this.contains = d;
    }

    @Override
    public boolean hasAttribute(AttributeDecorator attribute) {
        if (attribute instanceof VeganDec) {
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
}
