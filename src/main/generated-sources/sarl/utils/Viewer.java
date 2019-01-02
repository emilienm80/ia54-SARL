package utils;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;
import io.sarl.lang.core.EventListener;
import io.sarl.util.OpenEventSpace;
import java.util.Objects;
import java.util.UUID;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Emilien
 */
@SarlSpecification("0.8")
@SarlElementType(10)
@SuppressWarnings("all")
public class Viewer implements EventListener {
  private final UUID id = UUID.randomUUID();
  
  private OpenEventSpace ispace;
  
  private boolean launched = false;
  
  private boolean areaCreated = false;
  
  @FXML
  private Canvas draw_zone;
  
  @FXML
  private Label gravity_display;
  
  @FXML
  private Label rocket_quantity_display;
  
  @FXML
  private Label fire_quantity_display;
  
  @FXML
  private ScrollBar gravity_input;
  
  @FXML
  private ScrollBar rocket_quantity_input;
  
  @FXML
  private ScrollBar fire_quantity_input;
  
  @FXML
  private Button setup_button;
  
  @FXML
  private Button launch_button;
  
  @FXML
  private Button stop_button;
  
  /**
   * Emit a kill signal wen the app is exited
   */
  public void cleanExit() {
    if ((this.ispace != null)) {
      killAll _killAll = new killAll();
      this.ispace.emit(this.id, _killAll, null);
    }
  }
  
  /**
   * Method invoked by the sarl agent to register the object on a space
   */
  public Address setGUISpace(final OpenEventSpace ispace) {
    Address _xblockexpression = null;
    {
      this.ispace = ispace;
      _xblockexpression = this.ispace.register(this);
    }
    return _xblockexpression;
  }
  
  /**
   * Catch exit event
   */
  @FXML
  public void exitApplication(final ActionEvent ievent) {
    killAll _killAll = new killAll();
    this.ispace.emit(this.id, _killAll, null);
    Platform.exit();
  }
  
  /**
   * Launch fireworks
   */
  @FXML
  @Pure
  protected void actionLaunch() {
  }
  
  /**
   * Get ID of the object on the space
   */
  @Override
  @Pure
  public UUID getID() {
    return this.id;
  }
  
  /**
   * Needed for implementing EventListener
   */
  @Override
  public void receiveEvent(final Event ievent) {
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Viewer other = (Viewer) obj;
    if (!Objects.equals(this.id, other.id)) {
      return false;
    }
    if (other.launched != this.launched)
      return false;
    if (other.areaCreated != this.areaCreated)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Objects.hashCode(this.id);
    result = prime * result + (this.launched ? 1231 : 1237);
    result = prime * result + (this.areaCreated ? 1231 : 1237);
    return result;
  }
  
  @SyntheticMember
  public Viewer() {
    super();
  }
}
