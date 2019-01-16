import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

@SarlSpecification("0.8")
@SarlElementType(15)
@SuppressWarnings("all")
public class GoInTrain extends Event {
  @SyntheticMember
  public GoInTrain() {
    super();
  }
  
  @SyntheticMember
  public GoInTrain(final Address source) {
    super(source);
  }
}
