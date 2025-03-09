package a;

public class Project {
	
	@Override
	public boolean equals(Object obj) {
		Project p = (Project) obj;
		if(p.id != id) return false;
		if(p.type != type) return false;
		return true;
	}
	
	public int id;
	
	public enum Type{
		THEORETICAL,
		PRACTICAL
	}
	Type type;
	public void setType(Type t)
	{
		this.type = t;
	}
	public Type getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Project [type=" + type + "]";
	}
}
