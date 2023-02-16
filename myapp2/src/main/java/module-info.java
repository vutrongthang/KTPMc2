module com.mycompany.myapp2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.mycompany.myapp2 to javafx.fxml;
    exports com.mycompany.myapp2;
}
