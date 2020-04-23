package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.utils.Console;

public enum InformView {
    TITTLE("Draughts"),
    LOOSER("Derrota!!! No puedes mover tus fichas!!!"),
    RESUME("¿Queréis jugar otra"),
    ERROR( "Error!!! Formato incorrecto");

    private String message;
    private static Console console = new Console();

    private InformView(String message){
        this.message = message;
    }

    public void write() {
        InformView.console.write(this.message);
    }

    public void writeln() {
        InformView.console.writeln(this.message);
    }
}
