module com.example.darthpoliboisgraphischeoberflache {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.darthpoliboisgraphischeoberflache to javafx.fxml;
    exports com.example.darthpoliboisgraphischeoberflache;
}