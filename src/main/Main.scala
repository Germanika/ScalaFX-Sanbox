import java.io.IOException
import javafx.{fxml => jfxf}
import javafx.{scene => jfxs}
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene

object Main extends JFXApp {

  val resource = getClass.getResource("hello.fxml")
  if (resource == null) {
    throw new IOException("Cannot load resource: hello.fxml")
  }

  val root: jfxs.Parent = jfxf.FXMLLoader.load(resource)

  stage = new PrimaryStage() {
    title = "ScalaFX Sandbox"
    scene = new Scene(root)
  }
}

