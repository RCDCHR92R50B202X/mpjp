package s076;

public class Pet {
	private static final String DEFAULT_COLOUR = "pink";
	private static final String DEFAULT_NAME = "My pet";
	
	private String name;
	private String colour;

	
	public Pet() {
		this(DEFAULT_NAME);

	} 
	public Pet(String name) {
		this(name, DEFAULT_COLOUR);

	}

	public static String getDefaultName() {
		return DEFAULT_NAME;
	}
	public Pet(String name, String colour) {
		this.name = name;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour() {
		this.colour = colour;
	}

	public static String getDefaultColour() {
		return DEFAULT_COLOUR;
	}

	public void setName(String name) {
		this.name = name;
	}
}