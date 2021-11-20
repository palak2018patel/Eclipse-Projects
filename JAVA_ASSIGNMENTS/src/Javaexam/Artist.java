package Javaexam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Artist {			

			String name;
			int ht;
			int wt;
			Artist(String name,int ht,int wt){
				this.name=name;
				this.ht=ht;
				this.wt=wt;
			}
			public String toString() {
				return this.name+" "+this.wt+""+this.ht;
			}
		}
			class Sortbywt implements Comparator<Artist>{
				public int compare(Artist a,Artist b ) {
					return (a.wt-b.wt);
				}			

	public static void main(String[] args) {
		Artist a1=new Artist("A1",65,100);
		Artist a2=new Artist("A2",70,150);
		Artist a3=new Artist("A3",56,90);
		Artist a4=new Artist("A4",75,190);
		Artist a5=new Artist("A5",60,95);
		Artist a6=new Artist("A6",68,110);
		ArrayList<Artist>arr=new ArrayList<Artist>();
		arr.add(a1);
		arr.add(a2);
		arr.add(a3);
		arr.add(a4);
		arr.add(a5);
		arr.add(a6);
		Collections.sort(arr,new Sortbywt());
		System.out.println("Circus tower of artists with their height and weight "); 

	}

}
