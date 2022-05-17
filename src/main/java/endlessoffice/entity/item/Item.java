package endlessoffice.entity.item;

import endlessoffice.entity.InteractiveObject;
import endlessoffice.entity.employee.Employee;

/**
 * TODO: describe Item
 */
public class Item extends InteractiveObject {
    private int id;                     // Item id in db
    private String name;                // Item name
    private String description;         // Item description
    private int length;                 // Item length
    private int width;                  // Item width
    private Employee currentHolder;     // Item current holder
    private boolean isPocket;           // Item condition to be stored in pocket
    private boolean isTransportable;    // Item condition to be transportable by an Employee
    //region Constructors

    public Item() {
        super();
    }

    public Item(int id) {
        this();
        this.id = id;
    }

    public Item(int id, String name) {
        this(id);
        this.name = name;
    }
    //endregion

    //region Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Employee getCurrentHolder() {
        return currentHolder;
    }

    public boolean isPocket() {
        return isPocket;
    }

    public boolean isTransportable() {
        return isTransportable;
    }
    //endregion

    //region Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setCurrentHolder(Employee currentHolder) {
        this.currentHolder = currentHolder;
    }

    public void setPocket(boolean pocket) {
        isPocket = pocket;
    }

    public void setTransportable(boolean transportable) {
        isTransportable = transportable;
    }
    //endregion
}
