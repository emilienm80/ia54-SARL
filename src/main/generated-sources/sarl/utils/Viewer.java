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
  
  /**
   * public def cleanExit() {
   * if (this.ispace !== null)
   * System.exit(0)
   * }
   * 
   * /
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
  @Pure
  public void exitApplication(final ActionEvent ievent) {
    System.exit(0);
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
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Objects.hashCode(this.id);
    return result;
  }
  
  @SyntheticMember
  public Viewer() {
    super();
  }
}
