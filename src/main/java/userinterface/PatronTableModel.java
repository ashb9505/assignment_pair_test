//package userinterface;
//
//import java.util.Vector;
//
//import javafx.beans.property.SimpleStringProperty;
//
//public class PatronTableModel {
//    private final SimpleStringProperty patronId;
//    private final SimpleStringProperty name;
//    private final SimpleStringProperty address;
//    private final SimpleStringProperty city;
//    private final SimpleStringProperty zip;
//    private final SimpleStringProperty email;
//    private final SimpleStringProperty dateOfBirth;
//    private final SimpleStringProperty status;
//
//    public PatronTableModel(Vector<String> patronData) { //constructor
//        patronId = new SimpleStringProperty(patronData.elementAt(0));
//        name = new SimpleStringProperty(patronData.elementAt(1));
//        address = new SimpleStringProperty(patronData.elementAt(2));
//        city = new SimpleStringProperty(patronData.elementAt(3));
//        zip = new SimpleStringProperty(patronData.elementAt(4));
//        email = new SimpleStringProperty(patronData.elementAt(5);
//        dateOfBirth = new SimpleStringProperty(patronData.elementAt(6));
//        status = new SimpleStringProperty(patronData.elementAt(7);
//    }
//
//    //setters and getters
//    public String getPatronId() {
//        return patronId.get();
//    }
//
//    public void setPatronId(String patronIdInput) {patronId.set(patronIdInput);}
//
//    public String getName() { return name.get();}
//
//    public void setName(String nameInput) {name.set(nameInput);}
//
//    //work in progress
//
//}