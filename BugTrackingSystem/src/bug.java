
public class bug {
	private String id;
	private String name;
	private PRIORITYBUG priority;
	private String location;
	private TYPEBUG type;

	public bug(String id, String name, PRIORITYBUG priority, String location, TYPEBUG type) {
		super();
		this.id = id;
		this.name = name;
		this.priority = priority;
		this.location = location;
		this.type = type;
	}

	enum PRIORITYBUG{
		SEVERE, MILD, LOW
	}
	public enum TYPEBUG{
		RUNTIME , COMPILETIME
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PRIORITYBUG getPriority() {
		return priority;
	}
	public void setPriority(PRIORITYBUG priority) {
		this.priority = priority;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public TYPEBUG getType() {
		return type;
	}
	public void setType(TYPEBUG type) {
		this.type = type;
	}
		
}
