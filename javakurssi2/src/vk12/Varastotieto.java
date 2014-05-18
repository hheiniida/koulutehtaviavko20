package vk12;

public class Varastotieto {
	String hylly;
	int lokerikko;
	
	public Varastotieto(){
		
	}
	public Varastotieto(String hylly, int lokerikko){
		this.hylly=hylly;
		this.lokerikko=lokerikko;
		
	}
	public String getHylly(){
		return hylly;
	}
	public int getLokerikko(){
		return lokerikko;
	}
	public void setHylly(String hylly){
		this.hylly=hylly;
	}
	public void setLokerikko(int lokerikko){
		this.lokerikko=lokerikko;
	}
	public String toString(){
		return "";
	}
}
