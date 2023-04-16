package access_modifiers.package2;

//import access_modifiers.package1.BMW;
import access_modifiers.Table;
import access_modifiers.package1.Honda;

public class Test {
    public static void main(String[] args) {

    // We are able to create public class objects anywhere in our project.
     // BMW b1 = new BMW(); // Is not accessible from another package
        Honda h1 = new Honda();

    // Class modifiers >> Public: access anywhere in  the project
    // Default class: Access only in the same package.

    Table.DinnerTable.dinnerTableMethod(); // This is Dinner table method

    }
}
