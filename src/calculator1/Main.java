
package calculator1;
import java.awt.Paint;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator1 extends Application implements EventHandler<ActionEvent>{
    TextField textshow=new TextField();
    Button shiftButton=new Button("shift");
       Button minusButton=new Button("(-)");
       Button logButton=new Button("log");//logButton squareButton rootButton squarenButton cosButton sinButton tanButton piButton openPractButton
       Button squareButton=new Button("x^2"); //closePractButton button7 dellButton accButton multiButton divButton addButton subButton pointButton
       Button rootButton=new Button("?");// modulsButton equalButton
       Button squarenButton=new Button("x^n");
       Button cosButton=new Button("cos");
          Button sinButton=new Button("sin");
          Button tanButton=new Button("tan");
          Button piButton=new Button("pi");
          Button openPractButton=new Button("(");
          Button closePractButton=new Button(")");          
          Button button7=new Button("7");
       Button button8=new Button("8");
       Button button9=new Button("9");
       Button dellButton=new Button("DEL");
       Button accButton=new Button("acc");
       Button button4=new Button("4");
       Button button5=new Button("5");
       Button button6=new Button("6");
       Button multiButton=new Button("*");
        Button divButton=new Button("/");       
       Button button1=new Button("1");
       Button button2=new Button("2");
       Button button3=new Button("3");
       Button addButton=new Button("+");
        Button subButton=new Button("-");        
         Button button0=new Button("0");
       Button pointButton=new Button(".");       
       Button modulsButton=new Button("%");
       Button equalButton=new Button("=");
       String equation= "";
       String showText="";
        static String[] arr;
    @Override
    public void start(Stage primaryStage) {    
        textshow.setPrefSize(320, 50);
         textshow.setStyle("-fx-text-fill:BLACK;-fx-font-size:20pt;");
       shiftButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       shiftButton.setPrefSize(50, 25);
       minusButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       minusButton.setPrefSize(50, 25);
       
       logButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       logButton.setPrefSize(50, 25);
       squareButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       squareButton.setPrefSize(50, 25);       
       rootButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       rootButton.setPrefSize(50, 25);      
       squarenButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       squarenButton.setPrefSize(50, 25);
       HBox row1=new HBox();
       row1.getChildren().addAll(shiftButton,minusButton,logButton,rootButton,squareButton,squarenButton);
       row1.setSpacing(3.3333);      
        cosButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       cosButton.setPrefSize(50, 25);
        sinButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       sinButton.setPrefSize(50, 25);
        tanButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       tanButton.setPrefSize(50, 25);
        piButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       piButton.setPrefSize(50, 25);
        openPractButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       openPractButton.setPrefSize(50, 25);
        closePractButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 12pt;");
       closePractButton.setPrefSize(50, 25);     
       HBox row2=new HBox();
       row2.setSpacing(3.3333);
       row2.getChildren().addAll(cosButton,sinButton,tanButton,piButton,openPractButton,closePractButton);      
        button7.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       button7.setPrefSize(60, 30);
        button8.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       button8.setPrefSize(60, 30);
        button9.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       button9.setPrefSize(60, 30);
        dellButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 16pt;");
       dellButton.setPrefSize(60, 30);
        accButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 16pt;");
       accButton.setPrefSize(60, 30);       
       HBox row3=new HBox();
       row3.setSpacing(4);
       row3.getChildren().addAll(button7,button8,button9,dellButton,accButton);       
        button4.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
        button4.setPrefSize(60, 30);
        button5.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       button5.setPrefSize(60, 30);
        button6.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       button6.setPrefSize(60, 30);
        multiButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       multiButton.setPrefSize(60, 30);
        divButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       divButton.setPrefSize(60, 30);
        HBox row4=new HBox();
       row4.setSpacing(4);
       row4.getChildren().addAll(button4,button5,button6,multiButton,divButton);
        button1.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
        button1.setPrefSize(60, 30);
        button2.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       button2.setPrefSize(60, 30);
        button3.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       button3.setPrefSize(60, 30);
        addButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       addButton.setPrefSize(60, 30);
        subButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       subButton.setPrefSize(60, 30);
        HBox row5=new HBox();
       row5.setSpacing(4);
       row5.getChildren().addAll(button1,button2,button3,addButton,subButton);       
        button0.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
        button0.setPrefSize(60, 30);
        pointButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       pointButton.setPrefSize(60, 30);
        modulsButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       modulsButton.setPrefSize(60, 30);       
        equalButton.setStyle("-fx-background-color: BLACK;-fx-text-fill: white;-fx-font-size: 18pt;");
       equalButton.setPrefSize(124, 30);
        HBox row6=new HBox();
       row6.setSpacing(4);
       row6.getChildren().addAll(button0,pointButton,modulsButton,equalButton);
       
       VBox coulm=new VBox();
       coulm.setSpacing(5);
       coulm.getChildren().addAll(textshow,row1,row2,row3,row4,row5,row6);
      //logButton squareButton rootButton squarenButton cosButton sinButton tanButton piButton openPractButton
      //closePractButton button7 dellButton accButton multiButton divButton addButton subButton pointButton
      // modulsButton equalButton
      shiftButton.setOnAction(this);
       logButton.setOnAction(this); squareButton.setOnAction(this); rootButton.setOnAction(this); 
       squarenButton.setOnAction(this); cosButton.setOnAction(this); sinButton.setOnAction(this);minusButton.setOnAction(this);
       tanButton.setOnAction(this); piButton.setOnAction(this); openPractButton.setOnAction(this);
        closePractButton.setOnAction(this); dellButton.setOnAction(this); accButton.setOnAction(this);
         multiButton.setOnAction(this); divButton.setOnAction(this); addButton.setOnAction(this);
          subButton.setOnAction(this); pointButton.setOnAction(this); modulsButton.setOnAction(this); equalButton.setOnAction(this);
          button0.setOnAction(this); button1.setOnAction(this);button2.setOnAction(this);button3.setOnAction(this);button4.setOnAction(this);button5.setOnAction(this);
          button6.setOnAction(this);button7.setOnAction(this);button8.setOnAction(this);button9.setOnAction(this);
          
          
        
        StackPane root = new StackPane();
        root.getChildren().add(coulm);
             root.setStyle("-fx-background-color: GRAY;");
        Scene scene = new Scene(root, 320, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
       
    public static void main(String[] args) {
        launch(args);
    }
    

    
}