public class NutFreeDec extends AttributeDecorator {

    Dish contains;
    public NutFreeDec (Dish d) {
        this.contains = d;
    }

    @Override
    public boolean hasAttribute(AttributeDecorator attribute) {
        if (attribute instanceof NutFreeDec) {
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
