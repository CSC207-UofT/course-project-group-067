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
    public PlainDish getPlainDish() {
        return this.contains.getPlainDish();
    }

    @Override
    public String toString() {
        return ("Kosher " + contains.toString());
    }
}