module ca.georgiancollege.comp1011m2022ice9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.google.gson;
    requires java.net.http;

    opens ca.georgiancollege.comp1011m2022ice9 to javafx.fxml, com.google.gson;
    exports ca.georgiancollege.comp1011m2022ice9;
}