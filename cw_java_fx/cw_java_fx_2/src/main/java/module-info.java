module com.example.cw_jan_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cw_jan_fx to javafx.fxml;
    exports com.example.cw_jan_fx;
}