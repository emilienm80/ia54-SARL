import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

@SarlSpecification("0.8")
@SarlElementType(15)
@SuppressWarnings("all")
public class WantToGoIn extends Event {
  @SyntheticMember
  public WantToGoIn() {
    super();
  }
  
  @SyntheticMember
  public WantToGoIn(final Address source) {
    super(source);
  }
}
