module com.mycompany.trabalhomaquinacoxinha {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.trabalhomaquinacoxinha to javafx.fxml;
    exports com.mycompany.trabalhomaquinacoxinha;
}
