package usandomiscontroles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import micontrol.MiControl;

public class UsandoMisControles extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane bpane = new BorderPane();

        MiControl micontrol = new MiControl();
        Label txt = new Label();

        micontrol.setMaxHeight(100);
        micontrol.setMaxWidth(200);

        micontrol.setOnAction(e -> {
            txt.setText("Pulsando mi control");
        });
        bpane.setBottom(txt);
        bpane.setCenter(micontrol);

        Scene scene = new Scene(bpane, 400, 400);
        primaryStage.setTitle("Usando mis Controles");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
