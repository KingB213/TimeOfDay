package timeofday;

public class TimeOfDay {
	
	/**
	 * 
	 */
	
	private int hours;
	private int minutes;
	int getHours() {return hours;}
	int getMinutes() {return minutes;}
	
	/**
	 * 
	 * 
	 */
	
	void setHours(int hours) {this.hours = hours;}
	
	/**
	 * 
	 *
	 */
	
	void setMinutes(int minutes) {this.minutes = minutes;}
	
	public TimeOfDay(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;}
	}