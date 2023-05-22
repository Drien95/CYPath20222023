package developpement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{
	
	@Override
    public void start(Stage primaryStage) {	
		AnchorPane root = new AnchorPane();	
		root.setId("root");
		
		Board board = new Board();
		root.getChildren().add(board);
		Player adrien = new Player("Adrien", 20, Color.CHARTREUSE);
		board.addPlayerTile(81, adrien);
		
		board.movePlayerTile(20, adrien, true);
		Player baat = new Player("Baat", 20, Color.CHARTREUSE);
		//board.addPlayerTile(11, baat);
		/*
		board.show("BarrierHPane29");
		board.show("BarrierHPane38");
		board.show("BarrierVPane32");
		board.show("BarrierVPane33");
		board.updateAdjacencyList((AnchorPane) board.getChildrenUnmodifiable().get(0));
		
		AnchorPane collectionBoard = (AnchorPane) board.getChildrenUnmodifiable().get(0);
		
		System.out.println(collectionBoard.getChildren());
		System.out.println(board.getAdjacencyList());
		
		AnchorPane anchorPane1 = (AnchorPane) collectionBoard.getChildren().get(0);
		System.out.println(anchorPane1);
		System.out.println(anchorPane1.isVisible());
		board.show("BarrierHPane29");
		
		System.out.println("TilePane1 is adjacent to: " + adjHashMap.get("TilePane1"));
		LinkedList<String> resultDfs = board.dfs("TilePane1");
		System.out.println("There is a path between: " + resultDfs);
		System.out.println("Number of tiles in this path = " + resultDfs.size());
		board.areConnected(board.getAdjacencyList(), "TilePane1", "TilePane81", true);
		*/
		
		Scene scene = new Scene(root, 900, 750);
		
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}