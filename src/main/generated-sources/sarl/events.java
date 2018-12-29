import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * @author Emilien
 */
@SarlSpecification("0.8")
@SarlElementType(15)
@SuppressWarnings("all")
public class events extends Event {
  @SyntheticMember
  public events() {
    super();
  }
  
  @SyntheticMember
  public events(final Address source) {
    super(source);
  }
}
