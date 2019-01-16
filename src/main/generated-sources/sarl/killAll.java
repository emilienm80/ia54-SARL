import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

@SarlSpecification("0.8")
@SarlElementType(15)
@SuppressWarnings("all")
public class killAll extends Event {
  @SyntheticMember
  public killAll() {
    super();
  }
  
  @SyntheticMember
  public killAll(final Address source) {
    super(source);
  }
}
