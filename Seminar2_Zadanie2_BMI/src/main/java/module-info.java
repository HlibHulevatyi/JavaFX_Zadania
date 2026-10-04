module com.example.seminar2_zadanie2_bmi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seminar2_zadanie2_bmi to javafx.fxml;
    exports com.example.seminar2_zadanie2_bmi;
}