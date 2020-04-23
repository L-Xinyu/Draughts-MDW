package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.StartController;

class StartView extends SubView {

    StartView(){
        super();
    }

    void interact(StartController startController) {
        assert startController != null;
        InformView.TITTLE.writeln();
        new GameView().write(startController);
        startController.start();
    }

}
