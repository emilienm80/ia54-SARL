package utils;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Emilien
 */
@SarlSpecification("0.8")
@SarlElementType(10)
@SuppressWarnings("all")
public class MapsGraphic extends Application {
  private Group framePanel;
  
  private Scene frameScene;
  
  @Override
  public void start(final Stage applicationFrame) throws Exception {
    Group _group = new Group();
    this.framePanel = _group;
    applicationFrame.setTitle("La Gare");
    Scene _scene = new Scene(this.framePanel, Color.WHITESMOKE);
    this.frameScene = _scene;
    applicationFrame.setMaximized(false);
    applicationFrame.setResizable(false);
    applicationFrame.setScene(this.frameScene);
    applicationFrame.show();
  }
  
  @Pure
  public static void main(final String[] args) {
    Application.launch(args);
  }
  
  @Override
  public void stop() throws Exception {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field is is undefined for the type MapsGraphic");
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
  
  @SyntheticMember
  public MapsGraphic() {
    super();
  }
}
