module com.example.calculatordemo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatordemo3 to javafx.fxml;
    exports com.example.calculatordemo3;
}