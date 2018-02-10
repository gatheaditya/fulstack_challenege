package controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class gameModel {
	
	@Id
	private int game_id;
	private String title;
	private String url;
	private String platform;
	private double score;
	private String genre;
	private boolean editors_choice;
	private int release_year;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public boolean isEditors_choice() {
		return editors_choice;
	}
	public void setEditors_choice(boolean editors_choice) {
		this.editors_choice = editors_choice;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	public int getGame_id() {
		return game_id;
	}
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	
	

}
