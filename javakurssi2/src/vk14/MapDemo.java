package vk14;

import java.util.*;




public class MapDemo {

	public static void main(String[] args) {
		
		Map<String,String> opiskelijat= new HashMap<String,String>();
		
		opiskelijat.put("424242","Carola");
		
		opiskelijat.put("717171","Natalija");
		
		opiskelijat.put("818181", "Pauliina");
		
		Set<String> opiskelijanumerot =opiskelijat.keySet();
		
		
		Iterator<String> iterator = opiskelijanumerot.iterator();
		
		while(iterator.hasNext()){
			String opiskelijanumero=iterator.next();
			String opiskelijanNimi =opiskelijat.get(opiskelijanumero);
			System.out.println(opiskelijanNimi);
		}
	}

}
