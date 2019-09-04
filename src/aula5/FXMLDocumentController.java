/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author IFNMG
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void imprimir(ActionEvent event) {
        System.out.println("Está Imprimindo");
    }

    @FXML
    private void novaJanela(ActionEvent event) throws IOException {
        //código para abrir uma nova janela
        //Ler o FXML que representa a nova janela
        //Adicionar o throws
        Parent root = FXMLLoader.load(getClass()
                .getResource("NovaJanela.fxml"));
        
        //Jogar a tela na cena
        //Importar a classe Scene
        Scene scene = new Scene(root);
        
        //Criando a janela (STAGE)
        //Importar Stage
        Stage stage = new Stage(StageStyle.UTILITY);
        
        //Titulo na janela
        stage.setTitle("Titulo da nova janela!");
        
        //Adicionando a cena na janela
        stage.setScene(scene);
        
        //Configurando o MODALITY
        ///Diz respeito ao comportamento das janelas anteriores
        //quando esta for mostrada
        //Para bloquear interação com as janelas anteriores
        stage.initModality(Modality.APPLICATION_MODAL);
        
        //Mostrando a nova janela
        stage.show();
    }
    
}
