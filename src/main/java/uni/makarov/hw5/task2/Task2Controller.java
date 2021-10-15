package uni.makarov.hw5.task2;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Task2Controller {

    @FXML
    ChoiceBox choiceBox;

    @FXML
    private TextField txtField1;
    @FXML
    private TextField txtField2;
    @FXML
    private TextField txtField3;

    @FXML
    private Label label1;
    @FXML
    private Label label2;

    @FXML
    private void calcPerimeterAction(){
        String figure = String.valueOf(choiceBox.getSelectionModel().getSelectedItem());
        double field1 = 0;
        double field2 = 0;
        double field3 = 0;
        if (!txtField1.isDisabled()) {
            field1 = Double.parseDouble(txtField1.getText());
        }
        if (!txtField2.isDisabled()) {
            field2 = Double.parseDouble(txtField2.getText());
        }
        if (!txtField3.isDisabled()) {
            field3 = Double.parseDouble(txtField3.getText());
        }

        switch (figure) {
            case "Circle":
                    Circle circle = new Circle(field1);
                    label1.setText(String.valueOf(circle.calcPerimeter()));
                break;
            case "Rectangle":
                    Rectangle rectangle = new Rectangle(field1, field2);
                label1.setText(String.valueOf(rectangle.calcPerimeter()));
                break;
            case "Rhombus":
                    Rhombus rhombus = new Rhombus(field1, field2);
                label1.setText(String.valueOf(rhombus.calcPerimeter()));
                break;
            case "Square":
                    Square square = new Square(field1);
                label1.setText(String.valueOf(square.calcPerimeter()));
                break;
            case "Triangle":
                    Triangle triangle = new Triangle(field1, field2, field3);
                label1.setText(String.valueOf(triangle.calcPerimeter()));
                break;
        }
    }

    @FXML
    private void calcAreaAction() {
        String figure = String.valueOf(choiceBox.getSelectionModel().getSelectedItem());
        double field1 = 0;
        double field2 = 0;
        double field3 = 0;
        if (!txtField1.isDisabled()) {
            field1 = Double.parseDouble(txtField1.getText());
        }
        if (!txtField2.isDisabled()) {
            field2 = Double.parseDouble(txtField2.getText());
        }
        if (!txtField3.isDisabled()) {
            field3 = Double.parseDouble(txtField3.getText());
        }
        switch (figure) {
            case "Circle":
                Circle circle = new Circle(field1);
                label2.setText(String.valueOf(circle.calcArea()));
                break;
            case "Rectangle":
                Rectangle rectangle = new Rectangle(field1, field2);
                label2.setText(String.valueOf(rectangle.calcArea()));
                break;
            case "Rhombus":
                Rhombus rhombus = new Rhombus(field1, field2);
                label2.setText(String.valueOf(rhombus.calcArea()));
                break;
            case "Square":
                Square square = new Square(field1);
                label2.setText(String.valueOf(square.calcArea()));
                break;
            case "Triangle":
                Triangle triangle = new Triangle(field1, field2, field3);
                label2.setText(String.valueOf(triangle.calcArea()));
                break;
        }
    }

    @FXML
    private void figureChangeAction(){
        String figure = String.valueOf(choiceBox.getSelectionModel().getSelectedItem());
        switch (figure){
            case "Circle":
                txtField1.setText("Radius");
                txtField2.setDisable(true);
                txtField3.setDisable(true);
                break;
            case "Rectangle":
                txtField2.setDisable(false);
                txtField1.setText("Side 1");
                txtField2.setText("Side 2");
                txtField3.setDisable(true);
                break;
            case "Rhombus":
                txtField2.setDisable(false);
                txtField1.setText("Side");
                txtField2.setText("Angle");
                txtField3.setDisable(true);
                break;
            case "Square":
                txtField1.setText("Side");
                txtField2.setDisable(true);
                txtField3.setDisable(true);
                break;
            case "Triangle":
                txtField2.setDisable(false);
                txtField3.setDisable(false);
                txtField1.setText("Side 1");
                txtField2.setText("Side 2");
                txtField3.setText("Side 3");
                break;
        }
    }
}