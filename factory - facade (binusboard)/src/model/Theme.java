package model;

public class Theme {
	
	private String name;
	private String background;
	private String border;
	private String icon;
	private String music;
	
	
	
	public Theme(String name, String background, String border, String icon, String music) {
		this.name = name;
		this.background = background;
		this.border = border;
		this.icon = icon;
		this.music = music;
	}

	public String getName() {
		return name;
	}

	public String getBackground() {
		return background;
	}

	public String getBorder() {
		return border;
	}

	public String getIcon() {
		return icon;
	}

	public String getMusic() {
		return music;
	}


}
