/**
 * 
 */
package bytecodeparser.analysis.stack;

/**
 * @author sumit
 *
 */
public class ValueFromField extends StackElement {

	public final String name;
	public final Object value;
	public ValueFromField(String name, Object value) {
		this.name = name;
		this.value = value;
	}
	@Override
	public StackElement copy() {
		return new ValueFromField(name, value);
	}
	
	@Override
	public String toString() {
		//return "ValueFromField '" + (name != null ? localVariable.name : "NONAME") + "'";
		
		StringBuilder sb = new StringBuilder();
		sb.append("ValueFromField '");
		if (name != null) {
			sb.append(name);
		} else {
			sb.append("NONAME");
		}
		sb.append(" = ");
		if (value != null) {
			sb.append(value);
		} else {
			sb.append("NOVALUE");
		}
		sb.append(" '");
		return sb.toString();
	}
	
}
