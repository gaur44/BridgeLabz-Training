class Product implements Cloneable {

    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
