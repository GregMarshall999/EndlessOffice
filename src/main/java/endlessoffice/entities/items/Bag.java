package endlessoffice.entities.items;

public class Bag extends Item {
    //region Attributes
    private int ownerId;            // id of the bag's owner (possibly different from currentHolder)
    //endregion

    //region Constructors
    public Bag() {
        super();
    }

    public Bag(int id) {
        super(id);
    }

    public Bag(int id, String name) {
        super(id, name);
    }

    public Bag(int id, String name, String description) {
        super(id, name, description);
    }
    //endregion

    //region Getters and Setters
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    //endregion
}
