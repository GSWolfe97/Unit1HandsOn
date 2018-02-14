package handsonexam1;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HandsOnExam1 extends Application{
   @Override
    public void start(Stage primaryStage) {
	Image imageX = new Image("file:hangman.png");
        GridPane pane = new GridPane();
	Scene scene = new Scene(pane);
        pane.add(new ImageView(imageX), 1, 1);
	primaryStage.setTitle("Hands On Exam 1");
	primaryStage.setScene(scene);
	primaryStage.show();
    }
    public static void main(String[] args) {
	launch(args);
    }
}