
public class Serio {
	public static int serio(int ku, int ru, int saki){
		if(ku!=ru&ru!=saki&ku!=saki){
			return ku+ru+saki;
			}
		else{
			if(ku!=ru&ru==saki){
				return ku;
			}
			else{
				if(ku==ru&ru!=saki){
					return saki;
				}
				else{
					if(ku==saki&ru!=saki&ru!=ku){
						return ru;
					}
				else{
					 return 0;
					 }
			}
		}
		}
	}
	
}
