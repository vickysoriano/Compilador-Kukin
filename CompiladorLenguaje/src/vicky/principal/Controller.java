package vicky.principal;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import javafx.scene.input.MouseEvent;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import vicky.parser.LenguajesLexer;
import vicky.parser.LenguajesParser;

import java.io.*;

public class Controller {
    @FXML
    public TextArea area_de_texto; // Aquí van las operaciones
    public TextArea area_file;
    @FXML
    private TextArea salida_consola; // Aquí aparecen los resultados
    private PrintStream flujo; // PrintStream para mostrar los datos (resultados) del flujo de salida de la consola

    public Controller(){

    }

    public void initialize() {  // Método initialize() que permite realizar pos-procesamientos
        Consola datos = new Consola(salida_consola);
        flujo = new PrintStream(datos);
    }

    public void generarResultado(ActionEvent event) {
        System.setOut(flujo); // Reasigna la salida
        salida_consola.clear();
        //System.setErr(flujo); // Reasigna la salida de errores

        String texto = area_de_texto.getText();

        CharStream input = CharStreams.fromString(texto); // Archivo que entra a la parte léxica
        LenguajesLexer lexico = new LenguajesLexer(input); // Generación de léxico
        CommonTokenStream tokens = new CommonTokenStream(lexico); // Construcción de tokens (léxico genera tokens)
        LenguajesParser sintactico = new LenguajesParser(tokens); // Creación de parser (parte de analizador sintáctico)
        ParseTree arbol = sintactico.inicio(); // Creación de árbol para recorrer con las visitas

        MyVisitor visita = new MyVisitor(); // Uso de clase MyVisitor
        visita.visit(arbol); // Visita al árbol
    }

    public void cerrarVentana(ActionEvent event) {
        System.exit(0);
    }

    public void limpiaTodo(ActionEvent event) {
        salida_consola.clear();
        area_de_texto.clear();
    }

    public void abrirArchivo(MouseEvent mouseEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("C:\\Users\\vicky\\Documents"));
        fileChooser.setTitle("Escoger archivo ♥");
        File file = fileChooser.showOpenDialog(null);
        area_de_texto.clear();
        area_file.setText("Se cargó el archivo: "+file.getName());
        salida_consola.setWrapText(true);
        try {
            BufferedReader in;
            in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                area_de_texto.appendText(line + "\n");
                line = in.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void limpiaSalida(ActionEvent event) {
        salida_consola.clear();
    }

    public void limpiaEntrada(ActionEvent event) {
        area_de_texto.clear();
    }

    public void guardarArchivo(MouseEvent mouseEvent) {
        FileChooser filechooser2 = new FileChooser();
        filechooser2.setInitialDirectory(new File("C:\\Users\\vicky\\Documents"));
        filechooser2.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("*.txt", "*.txt"));
        filechooser2.setTitle("Guardar archivo ♥");
        File save = filechooser2.showSaveDialog(null);
        try {
            FileWriter filewriter = new FileWriter(save);
            filewriter.write(area_de_texto.getText());
            filewriter.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void hacerNegritas(ActionEvent event) {
        area_de_texto.setFont(javafx.scene.text.Font.font("Century Gothic", FontWeight.BOLD, 14));
    }

    public void hacerItalica(ActionEvent event) {
        area_de_texto.setFont(javafx.scene.text.Font.font("Century Gothic", FontPosture.ITALIC, 14));
    }

    public void hacerRegular(ActionEvent event) {
        area_de_texto.setFont(javafx.scene.text.Font.font("Century Gothic", FontWeight.NORMAL, 14));
    }

    public void traducir(ActionEvent event) {
        String texto = area_de_texto.getText();
        texto = texto.replaceAll("\\bprintf\\b","corre");
        texto = texto.replaceAll("\\bint\\b","bigote");
        texto = texto.replaceAll("\\bfloat\\b","bigote");
        texto = texto.replaceAll("\\bvoid\\b","Kukin");
        texto = texto.replaceAll("(#include <[a-z]*.h>)","libreria asies");
        area_de_texto.setText(texto);
    }

    public void traducirDos(ActionEvent event) {
        String texto = area_de_texto.getText();
        texto = texto.replaceAll("\\bcorre\\b","printf");
        texto = texto.replaceAll("\\bbigote\\b","float");
        texto = texto.replaceAll("\\bKukin\\b","void");
        texto = texto.replaceAll("\\blibreria asies\\b","#include <stdio.h>");
        area_de_texto.setText(texto);
    }

    public class Consola extends OutputStream { //Extiende la clase abstracta OutputStream para esribir informacion

        private TextArea salida_consola;

        public Consola(TextArea salida_consola) { //Constructor
            this.salida_consola = salida_consola;
        }

        public void adjuntarTexto(String caracteres) { //setter que recibe cadena de caracteres del método write
            Platform.runLater(() -> //Ejecuta hilo que...
                    salida_consola.appendText(caracteres)); // ... Adjunta secuencia de carácteres
        }

        public void write(int b) { // Método que escribe secuencia de carácteres tipo char y lo vuelve a String
            adjuntarTexto(String.valueOf((char) b));
        }
    }
}