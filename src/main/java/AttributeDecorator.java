abstract class AttributeDecorator implements Dish{
    public abstract boolean hasAttribute(AttributeDecorator attribute);

    public abstract Dish getPlainDish();

}
