import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import java.io.*;
import java.util.Date;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProjectController {

    double price = 0;;

    @FXML
    private Button btnReciept;

    @FXML
    private Button btnTotal;

    @FXML
    private ComboBox<String> cbhealth;

    @FXML
    private ComboBox<String> cbPre;

    @FXML
    private ComboBox<String> cbProtein;

    @FXML
    private Label lbID;

    @FXML
    private Label lbID1;

    @FXML
    private Label lbID2;

    @FXML
    private Label lbName;

    @FXML
    private Label lbName1;

    @FXML
    private Label lbName2;

    @FXML
    private Label lbPrice;

    @FXML
    private Label lbPrice1;

    @FXML
    private Label lbPrice2;

    @FXML
    private Label lblTotal;

    @FXML
    private Button exitb;

    ObservableList<String> proteinList = FXCollections.observableArrayList("Whey Protein",
            "Iso-Whey Protein", "Casin", "Protein Bar");

    ObservableList<String> healthList = FXCollections.observableArrayList("Vitamins",
            "Calcium", "Potassium", "Testosterone Booster");

    ObservableList<String> preList = FXCollections.observableArrayList("Bcaa", "Eaa",
            "Cla", "Creatine", "L-ariginine", "Caffeine");

    @FXML
    void calculateTotal(ActionEvent event) {
        Double TotalVal = getTotal();
        lblTotal.setText("$ " + String.valueOf(TotalVal));

    }

    public Double getTotal() {
        return getWhey() + getHealth() + getPre();
    }

    public Double getHealth() {
        Double total;
        Double VitaminPrice = cbhealth.getValue() == "Vitamins" ? 42.99 : 0;
        Double CalciumPrice = cbhealth.getValue() == "Calcium" ? 35.50 : 0;
        Double PotassiumPrice = cbhealth.getValue() == "Potassium" ? 39.99 : 0;
        Double TBoosterPrice = cbhealth.getValue() == "Testosterone Booster" ? 56.99 : 0;
        total = VitaminPrice + CalciumPrice + PotassiumPrice + TBoosterPrice;
        return total;
    }

    public Double getWhey() {
        Double total;
        Double WheyPrice = cbProtein.getValue() == "Whey Protein" ? 55.99 : 0;
        Double IsoPrice = cbProtein.getValue() == "Iso-Whey Protein" ? 57.50 : 0;
        Double CasinPrice = cbProtein.getValue() == "Casin" ? 70.99 : 0;
        Double ProteinBar = cbProtein.getValue() == "Protein Bar" ? 12.99 : 0;
        total = WheyPrice + IsoPrice + CasinPrice + ProteinBar;
        return total;
    }

    public Double getPre() {
        Double total;
        Double BcaaPrice = cbPre.getValue() == "Bcaa" ? 45.99 : 0;
        Double EaaPrice = cbPre.getValue() == "Eaa" ? 65.50 : 0;
        Double ClaPrice = cbPre.getValue() == "Cla" ? 82.99 : 0;
        Double CreatinePrice = cbPre.getValue() == "Creatine" ? 75.99 : 0;
        Double arigininePrice = cbPre.getValue() == "L-ariginine" ? 45.99 : 0;
        Double CaffeinePrice = cbPre.getValue() == "Caffeine" ? 12.99 : 0;
        total = BcaaPrice + EaaPrice + ClaPrice + CreatinePrice + arigininePrice + CaffeinePrice;
        return total;
    }

    Date date = new Date();

    @FXML
    void exitwindow(ActionEvent event) {
        System.out.println("EXIT SUCCESSFUL!");
        System.exit(0);

    }

    @FXML
    void printReciept(ActionEvent event) throws FileNotFoundException {
        try {
            System.out.println("SUCCESS! Your file is Printed !");
            PrintWriter outStream = new PrintWriter("receiptt.txt");
            outStream.println("********WELCOME TO FITNESS BUFFS******** \n");
            outStream.println(date.toString());
            outStream.println("Item Name: \t\t\tAmount \n");
            if (cbProtein.getValue() == "Whey Protein") {
                outStream.print("Whey Protein\t\t");
                outStream.println("\t" + "$ " + "55.99");

            }

            if (cbProtein.getValue() == "Iso-Whey Protein") {
                outStream.print("Iso-Whey Protein\t");
                outStream.println("\t" + "$ " + "57.50");
            }

            if (cbProtein.getValue() == "Casin") {
                outStream.print("Casin\t\t");
                outStream.println("\t" + "$ " + "70.99");
            }

            if (cbProtein.getValue() == "Protein Bar") {
                outStream.print("Protein Bar\t\t\t");
                outStream.println("\t" + "$ " + "12.99");
            }

            if (cbhealth.getValue() == "Vitamins") {
                outStream.print("Vitamins\t\t");
                outStream.println("\t" + "$ " + "42.99");
            }

            if (cbhealth.getValue() == "Calcium") {
                outStream.print("Calcium\t\t");
                outStream.println("\t" + "$ " + "35.50");
            }

            if (cbhealth.getValue() == "Potassium") {
                outStream.print("Potassium\t\t");
                outStream.println("\t" + "$ " + "39.99");
            }

            if (cbhealth.getValue() == "Testosterone Booster") {
                outStream.print("Testosterone Booster\t\t");
                outStream.println("\t" + "$ " + "56.99 ");
            }

            if (cbPre.getValue() == "Bcaa") {
                outStream.print("Bcaa\t");
                outStream.println("\t\t" + "$ " + "45.99");
            }

            if (cbPre.getValue() == "Eaa") {
                outStream.print("Eaa\t\t");
                outStream.println("\t\t" + "$ " + "65.50");
            }

            if (cbPre.getValue() == "Cla") {
                outStream.print("Cla\t\t");
                outStream.println("\t\t" + "$ " + "82.99");
            }

            if (cbPre.getValue() == "Creatine") {
                outStream.print("Creatine\t\t");
                outStream.println("\t" + "$ " + "75.99");
            }

            if (cbPre.getValue() == "L-ariginine") {
                outStream.print("L-ariginine\t\t");
                outStream.println("\t" + "$ " + "45.99");
            }

            if (cbPre.getValue() == "Caffeine") {
                outStream.print("Caffeine\t\t");
                outStream.println("\t" + "$ " + "12.99");
            }

            outStream.println("\t\t\t\t---------------");
            outStream.println("Total \t\t\t" + lblTotal.getText() + "\n");
            outStream.println("*******************THANK YOU*******************");
            outStream.close();

            Stage stage2 = (Stage) btnReciept.getScene().getWindow();
            stage2.close();
            Stage stage = new Stage();
            Parent order = FXMLLoader.load(getClass().getResource("textarea.fxml"));

            Scene order1 = new Scene(order);

            order1.getStylesheets().add(getClass().getResource("layout1.css").toExternalForm());
            stage.setScene(order1);
            stage.show();

        }

        catch (Exception localException) {
            System.out.println("Error Printing to File");
        }
    }

    @FXML
    private void initialize() {

        cbProtein.setValue("Select your Protein:");
        cbProtein.setItems(proteinList);
        cbhealth.setValue("Select your Health-Products:");
        cbhealth.setItems(healthList);
        cbPre.setValue("Select your Pre Workout:");
        cbPre.setItems(preList);

    }

    @FXML
    void selctHealth(ActionEvent event) {
        if (cbhealth.getValue() == "Vitamins") {
            lbID2.setText("ID : 12d323");
            lbPrice2.setText("Price : $42.99");
            lbName2.setText("Name : " + cbhealth.getValue());
        }
        if (cbhealth.getValue() == "Calcium") {
            lbID2.setText("ID 6546gd");
            lbPrice2.setText("Price : $35.50");
            lbName2.setText("Name : " + cbhealth.getValue());
        }

        if (cbhealth.getValue() == "Potassium") {
            lbID2.setText("ID 987ger");
            lbPrice2.setText("Price : $39.99");
            lbName2.setText("Name : " + cbhealth.getValue());
        }

        if (cbhealth.getValue() == "Testosterone Booster") {
            lbID2.setText("ID 098mvt");
            lbPrice2.setText("Price : $56.99");
            lbName2.setText("Name : " + cbhealth.getValue());
        }
    }

    @FXML
    void selctPre(ActionEvent event) {
        if (cbPre.getValue() == "Bcaa") {
            lbID1.setText("ID : 653mku");
            lbPrice1.setText("Price : $45.99");
            lbName1.setText("Name : " + cbPre.getValue());
        }
        if (cbPre.getValue() == "Eaa") {
            lbID1.setText("ID 754vyn");
            lbPrice1.setText("Price : $65.50");
            lbName1.setText("Name : " + cbPre.getValue());
        }

        if (cbPre.getValue() == "Cla") {
            lbID1.setText("ID 133nvj");
            lbPrice1.setText("Price : $82.99");
            lbName1.setText("Name : " + cbPre.getValue());
        }

        if (cbPre.getValue() == "Creatine") {
            lbID1.setText("ID 798fjh");
            lbPrice1.setText("Price : $75.99");
            lbName1.setText("Name : " + cbPre.getValue());
        }

        if (cbPre.getValue() == "L-ariginine") {
            lbID1.setText("ID 546vjh");
            lbPrice1.setText("Price : $45.99");
            lbName1.setText("Name : " + cbPre.getValue());
        }

        if (cbPre.getValue() == "Caffeine") {
            lbID1.setText("ID 146csa");
            lbPrice1.setText("Price : $12.99");
            lbName1.setText("Name : " + cbPre.getValue());
        }
    }

    @FXML
    void selctProtein(ActionEvent event) {
        if (cbProtein.getValue() == "Whey Protein") {
            lbID.setText("ID : 654ger");
            lbPrice.setText("Price : $55.99");
            lbName.setText("Name : " + cbProtein.getValue());
        }
        if (cbProtein.getValue() == "Iso-Whey Protein") {
            lbID.setText("ID 756reg");
            lbPrice.setText("Price : $57.50");
            lbName.setText("Name : " + cbProtein.getValue());
        }

        if (cbProtein.getValue() == "Casin") {
            lbID.setText("ID 634klm");
            lbPrice.setText("Price : $70.99");
            lbName.setText("Name : " + cbProtein.getValue());
        }

        if (cbProtein.getValue() == "Protein Bar") {
            lbID.setText("ID 978rsv");
            lbPrice.setText("Price : $12.99");
            lbName.setText("Name : " + cbProtein.getValue());
        }
    }

}
