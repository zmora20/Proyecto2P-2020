module com.pooespol.proy2p {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pooespol.proy2p to javafx.fxml;
    exports com.pooespol.proy2p;
}