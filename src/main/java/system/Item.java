package system;

public abstract class Item {
    private Integer id;
    private boolean available;

    public Item(Integer id, boolean available) {
        this.id = id;
        this.available = available;
    }

    public Integer getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }

    private void setAvailable(boolean available){
        this.available = available;
    }

    protected void checkoutItem() {
        setAvailable(false);
    }

    protected void returnItem() {
        setAvailable(true);
    }
}
