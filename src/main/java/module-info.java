module uni.makarov.hw5.task2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens uni.makarov.hw5.task2 to javafx.fxml;
    exports uni.makarov.hw5.task2;
}