import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	private String createdBy;
	
	// default constructor
	public GeometricObject() {
		dateCreated = new Date();
	}

	//non-default constructor
	public GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	//toString() method to be created later
	@Override
	public String toString() {
		return "The shape was created " + getDateCreated();
	}
	
	
	
	
	
	
	
	
	
}