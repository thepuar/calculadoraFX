/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author frapecha
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button bt_C;
    @FXML
    private Button bt_7;
    @FXML
    private Button bt_4;
    @FXML
    private Button bt_1;
    @FXML
    private Button bt_0;
    @FXML
    private Button bt_8;
    @FXML
    private Button bt_div;
    @FXML
    private Button bt_mult;
    @FXML
    private Button bt_5;
    @FXML
    private Button bt_2;
    @FXML
    private Button bt_9;
    @FXML
    private Button bt_6;
    @FXML
    private Button bt_3;
    @FXML
    private Button bt_dot;
    @FXML
    private Button bt_minus;
    @FXML
    private Button bt_add;
    @FXML
    private Button bt_equals;
    @FXML
    private TextField text_field;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pulsandoC(ActionEvent event) {
        this.text_field.setText("0");
    }

    @FXML
    private void pulsando7(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"7");
    }

    @FXML
    private void pulsando4(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"4");
    }

    @FXML
    private void pulsando1(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"1");
    }

    @FXML
    private void pulsando0(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"0");
    }

    @FXML
    private void pulsando8(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"8");
    }

    @FXML
    private void pulsandoDiv(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"/");
    }

    @FXML
    private void pulsandoMult(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"*");
    }

    @FXML
    private void pulsando5(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"5");
    }

    @FXML
    private void pulsando2(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"2");
    }

    @FXML
    private void pulsando9(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"9");
    }

    @FXML
    private void pulsando6(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"6");
    }

    @FXML
    private void pulsando3(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"3");
    }

    @FXML
    private void pulsandoDot(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+".");
    }

    @FXML
    private void pulsandoMinus(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"-");
    }

    @FXML
    private void pulsandoAdd(ActionEvent event) {
          this.text_field.setText(this.text_field.getText()+"+");
    }

    @FXML
    private void pulsandoEquals(ActionEvent event) {
        String []valores = this.text_field.getText().split("+");
   
        double valor1 = Double.parseDouble(valores[0]);
        double valor2 = Double.parseDouble(valores[1]);
    }
    
    
}
