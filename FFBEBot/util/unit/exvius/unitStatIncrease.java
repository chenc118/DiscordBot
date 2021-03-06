package util.unit.exvius;

import org.jsoup.nodes.Element;

import util.Lib;

public class unitStatIncrease{
	public statSet[] stats;
	public unitStatIncrease(Element statTable){
		stats=new statSet[statTable.children().size()];
		for(int i=1;i<statTable.children().size();i++){
			stats[i-1]=new statSet(statTable.child(i));
		}
	}
	public class statSet{
		public String rarity;
		public String HP;
		public String MP;
		public String ATK;
		public String DEF;
		public String MAG;
		public String SPR;
		public statSet(Element row){
			rarity=""+Lib.extractNumber(row.child(0).text());
			HP=row.child(1).text();
			MP=row.child(2).text();
			ATK=row.child(3).text();
			DEF=row.child(4).text();
			MAG=row.child(5).text();
			SPR=row.child(6).text();
		}
	}
}