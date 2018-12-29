import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.8")
@SarlElementType(15)
@SuppressWarnings("all")
public class toEnvironment extends Event {
  public final int id;
  
  public final int idpeople;
  
  public toEnvironment(final int id, final int idpeople) {
    this.id = id;
    this.idpeople = idpeople;
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
    toEnvironment other = (toEnvironment) obj;
    if (other.id != this.id)
      return false;
    if (other.idpeople != this.idpeople)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.id;
    result = prime * result + this.idpeople;
    return result;
  }
  
  /**
   * Returns a String representation of the toEnvironment event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("id", this.id);
    builder.add("idpeople", this.idpeople);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 862912966L;
}
