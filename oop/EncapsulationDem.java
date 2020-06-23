package oop;

/*
Here we use Access Contol to encapsulate the state of the object
Class --> Public --> We can use it in any package
Constructor --> Public --> Create an object inside any other class
Fields --> Private --> not accessible from object through dot notation Instead use getter/setter
 */
public class EncapsulationDem {
    private String type;
    private String model;

    public EncapsulationDem(String type, String model) {
        this.type = type;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
