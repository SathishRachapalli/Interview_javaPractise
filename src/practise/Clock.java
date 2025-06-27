package practise;

import java.util.ArrayList;
import java.util.List;

public class Clock {
	
	
	String name;
	List<String>Batteries;
	public Clock(String name, List<String> batteries) {
		super();
		this.name = name;
		Batteries = batteries;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getBatteries() {
		return Batteries;
	}
	public void setBatteries(List<String> batteries) {
		Batteries = batteries;
	}
	@Override
	public String toString() {
		return "Clock [name=" + name + ", Batteries=" + Batteries + "]";
	}
	
	

}
