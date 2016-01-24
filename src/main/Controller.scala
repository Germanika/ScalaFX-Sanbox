
import javafx.{ fxml => jfxFxml
              , event => jfxEvent
              }

import scalafx.application.Platform


class Controller {

  @jfxFxml.FXML
  private def handleButtonPress(event: jfxEvent.ActionEvent): Unit = {
    println("Helloooo")
  }

  @jfxFxml.FXML
  private def handleHelp(event: jfxEvent.ActionEvent): Unit = {
    Platform.exit()
  }

}
