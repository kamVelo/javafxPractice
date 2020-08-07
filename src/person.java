import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class person {
    private StringProperty firstName = new SimpleStringProperty(this,"firstName", "");

    //returns the value of the object
    public String getFirstName() {
        return firstName.get();
    }

    //returns the stringProperty object
    public StringProperty firstNameProperty() {
        return firstName;
    }

    //sets the value of the object
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }



}
