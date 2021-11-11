public class KosherDec extends AttributeDecorator {

    Dish contains;
    public KosherDec(Dish d) {
        this.contains = d;
    }

    @Override
    public boolean hasAttribute(AttributeDecorator attribute) {
        if (attribute instanceof KosherDec) {
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