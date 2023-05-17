
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.io.*;
import javax.print.*;
import javax.print.attribute.*;
import javafx.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ReceiptController {

    @FXML
    private TextArea bill;

    @FXML
    private Button buttonReceiptFile;

     @FXML
    private Button buttonback;

    @FXML
    private Button buttonExit;


    @FXML
    void buttonExitListener(ActionEvent event) {
		System.exit(0);

    }

    @FXML
    void buttonReceiptFileListener(ActionEvent event)throws FileNotFoundException  {



		        //creating File instance to reference text file in Java
		        File text = new File("receiptt.txt");

		        //Creating Scanner instance to read File in Java
		        Scanner scnr = new Scanner(text);

		        //Reading each line of the file using Scanner class
		        while(scnr.hasNextLine()){
		            String line = scnr.nextLine();
		            bill.appendText( line + "\n" );

				}

		    }


    @FXML
   void buttonBackListener(ActionEvent event)throws FileNotFoundException {
	   try{
	   Stage stage3 = (Stage) buttonback.getScene().getWindow();
	   		                stage3.close();
	   		                Stage stage4 = new Stage();
	   		                Parent order = FXMLLoader.load(getClass().getResource("Project FXML.fxml"));

	   		                  Scene order1=new Scene(order);

	   		                  order1.getStylesheets().add(getClass().getResource("layout.css").toExternalForm());
	   		                  stage4.setScene(order1);
		                  stage4.show();
					  }

					  catch(Exception e){
						  System.out.println("failure Exception Caught");
					  }

    }


}
