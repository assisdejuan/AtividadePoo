package com.example.formulariocontato;

import com.example.formulariocontato.models.Contato;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static java.lang.Integer.parseInt;

public class HelloController {

    @FXML
    private TextField nome;

    @FXML
    private TextField sobreNome;

    @FXML
    private TextField email;

    @FXML
    private TextField telefone;

    @FXML
    private TextField assunto;

    @FXML
    private TextArea mensagem;

    @FXML
    protected void handleForm() {
        Contato contato = new Contato();

        contato.setNome(nome.getText());
        contato.setSobrenome(sobreNome.getText());
        contato.setEmail(email.getText());
        contato.setTelefone(Long.parseLong(telefone.getText()));
        contato.setAssunto(assunto.getText());
        contato.setMensagem(mensagem.getText());

        showAlert(contato);
        limparCampos();
    }

    private void showAlert(Contato contato){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText("Contato salvo!");
        alert.setContentText("O Contato: \n " + contato.toString() + "\n" + "foi salvo em nossa base de dados!");
        System.out.println("Aqui");
        alert.showAndWait();

    }

    private void limparCampos(){
        nome.clear();
        sobreNome.clear();
        email.clear();
        telefone.clear();
        assunto.clear();
        mensagem.clear();
    }
}