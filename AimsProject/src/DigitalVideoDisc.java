package src;

public class DigitalVideoDisc {
    private String title;
	private String category;
	private String directory;
	private int length;
	private float cost;

	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.length = length;
		this.cost = cost;
	}

    public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = "Unknown";
		this.length = -1;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirectory() {
		return directory;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
    public boolean equals(DigitalVideoDisc another_disc){
        if (!title.equals(another_disc.getTitle())) return false;
        if (!category.equals(another_disc.getCategory())) return false;
        if (!directory.equals(another_disc.getDirectory())) return false;
        if (length != another_disc.getLength()) return false;
        if (cost != another_disc.getCost()) return false;
        return true;

    }

	public void setTitle(String title2) {
		this.title = title2;
	}

}