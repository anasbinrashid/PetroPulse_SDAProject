package customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class AlreadyMemberController 
{
	public Stage stage;
    public Scene scene;
    public Parent root;
	
    Customer c = new Customer();

    
    @FXML
    private Label userNameLabel;
    
    @FXML
    private Label loyaltyLabel;
    
    @FXML
    private Label nameLabel;
    
    @FXML
    private Label emailLabel;
    
    @FXML
    private Label phoneLabel;
    
    @FXML
    private Label stationLabel;
    
    public void setval(Customer c)
    {
    	this.c.customerid = c.customerid;
    	this.c.duepayment = c.duepayment;
    	this.c.email = c.email;
    	this.c.loyaltypoints = c.loyaltypoints;
    	this.c.membershipstatus = c.membershipstatus;
    	this.c.name = c.name;
    	this.c.password = c.password;
    	this.c.phonenumber = c.phonenumber;
    	this.c.stationid = c.stationid;
    	
        userNameLabel.setText(this.c.name);
    	emailLabel.setText(this.c.email);
        phoneLabel.setText(this.c.phonenumber);
    	stationLabel.setText(String.valueOf(this.c.stationid));
        nameLabel.setText(this.c.name);
    	loyaltyLabel.setText(String.valueOf(this.c.loyaltypoints) );

    }

    
    public void goback(ActionEvent event) throws IOException 
    {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeCustomer.fxml"));	
		root = loader.load();	    		
        HomeCustomerController hw = loader.getController();
        hw.setval(this.c);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
}
