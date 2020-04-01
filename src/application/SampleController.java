package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SampleController implements Initializable {
	@FXML
    public ImageView imageView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	     Image image = new Image(getClass().getResourceAsStream("/img/User Agreement.png"));
		 imageView.setImage(image);
	     imageView.setCache(true);
	}
}
