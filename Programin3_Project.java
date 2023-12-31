package programin3_project;

import java.awt.Insets;
import java.awt.ScrollPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Programin3_Project extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Main frame setup using a GridPane layout
        GridPane gridPane = new GridPane();
      
        gridPane.setHgap(20);
        gridPane.setVgap(20);

        // Image paths
        String[] imagePaths = {
            "images/licensed-image.jpeg", // Replace with your image paths
            "images/المنوفية.png",
            "images/الجيزة.jpg",
            "images/اسوان.jpg",
            "images/اسيوط.png",
            "images/الاسكندرية.jpg",
            "images/الاسمعالية.jpg",
            "images/الاقصر.jpg",
            "images/البحر الاحمر.jpg",
            "images/البحيرة.jpg",
            "images/الدقهلية.jpg",
            "images/السويس.jpg",
            "images/الشرقية.jpg",
            "images/الغربية.jpg",
            "images/الفيوم.jpg",
            "images/القليوبية.jpg",
            "images/المنيا.jpg",
            "images/الوادي الجديد.jpg",
            "images/بنيسويف.jpg",
            "images/بورسعيد.jpg",
            "images/جنوب سيناء.jpg",
            "images/دمياط.png",
            "images/سوهاج.jpg",
            "images/شمال سيناء.jpg",
            "images/قنا.jpg",
            "images/كفر الشيخ.jpg",
            "images/مطروح.jpg",
        };

        // Image titles
        String[] titles = {
            "القاهرة", // Replace with your titles
            "المنوفية",
            "الجيزة",
            "اسوان",
            "اسيوط",
            "الاسكندرية",
            "الاسمعالة",
            "الاقصر",
            "البحر الاحمر",
            "البحيرة",
            "الدقلية",
            "السويس",
            "الشرقية",
            "الغربية",
            "الفيوم",
            "القليوبية",
            "المنيا",
            "الوادي الجديد ",
            "بني سويف",
            "بورسعيد",
            "سيناء",
            "دمياط",
            "سهاج",
            "شمال سيناء",
            "قنا",
            "كفر الشيخ",
            "مطروح",
        };
            
//       javafx.scene.control.ScrollPane scrollPane = new javafx.scene.control.ScrollPane();
//        scrollPane.setContent(gridPane);
//        scrollPane.setFitToWidth(true); // Enable horizontal scrolling
        // Loop to add images and titles to the grid
       int col = 0;
        int row = 0;
        for (int i = 0; i < imagePaths.length; i++) {
            Image image = new Image(imagePaths[i], 400, 400, true, true);
            ImageView imageView = new ImageView(image);
            Text title = new Text(titles[i]);

            final int index = i;
            // Set image and title click actions
            imageView.setOnMouseClicked(e -> openSecondaryFrame(titles[index]));
            title.setOnMouseClicked(e -> openSecondaryFrame(titles[index]));

            gridPane.add(imageView, col, row);
            gridPane.add(title, col, row + 1);
   
            col++;
            if (col == 2) {
                col = 0;
                row += 2;
            }
        }

        // Create a ScrollPane and add the GridPane to it
      javafx.scene.control.ScrollPane scrollPane = new javafx.scene.control.ScrollPane();
        scrollPane.setContent(gridPane);
        scrollPane.setFitToWidth(true); // Enable horizontal scrolling

        // Set the main scene with the ScrollPane
        Scene scene = new Scene(scrollPane,800,800);
        primaryStage.setTitle("Main Frame");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openSecondaryFrame(String title) {
        // For demonstration purposes, showing the title in the secondary frame
        SecondaryFrame secondaryFrame = new SecondaryFrame();
        secondaryFrame.showSecondaryStage();
    }

    public static void main(String[] args) {
        launch(args);
    }
}