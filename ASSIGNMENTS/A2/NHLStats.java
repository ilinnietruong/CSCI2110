/**CSCI2110:
 * A2:Excercise 1
 * THE NHLStats class
 *Linh Truong |B00708389
 */
public class NHLStats {
	private List<PlayerRecord> stats= new List <PlayerRecord>();
	
	//constructor
	public NHLStats() {
		stats = new List <PlayerRecord>();
	}
	
	//add player
	public void addStats(PlayerRecord p) {
		stats.add(p);
	}
	
	//display the name and team name for the player with the most Points (Goals+Assists)
	public String mostPoints() {
		String result="";
		int highestA=0, lowA=0;
		List<PlayerRecord>highA=new List <PlayerRecord>();
		PlayerRecord p = stats.first();
		PlayerRecord nextP= stats.next();
		while (p!=null ){
			lowA = p.totalPoints();
			//finding the highest
			if (lowA>=highestA ){
				highestA=lowA;
				highA.add(p);
			}
			p=stats.next();
		}
		p=highA.first();
		nextP=highA.next();
		
		//determining which player are the highest
		while(p!=null){
			if(p.totalPoints()==highestA) {
				result=""+p.getPlayer()+"\t"+p.getTeam();	
			}
			if( nextP.totalPoints() == p.totalPoints()) {  //if both teams are the same
				result=""+p.getPlayer()+"\t"+p.getTeam()+"\n"+nextP.getPlayer();				 	 
			}		
			p=highA.next();			
		}
		return result;
	}
		
	
	//Display the name, team name, and position for the player who was the most aggressive (had the most penalty minutes).
	public String mostAggressive() {
		String result="";
		int highestA=0, lowA=0;
		List<PlayerRecord>highA=new List <PlayerRecord>();
		PlayerRecord p = stats.first();
		PlayerRecord nextP= stats.next();
		while (p!=null ){
			lowA = p.getMinutes();
			if (lowA>=highestA ){
				highestA=lowA;
				highA.add(p);
			}
			p=stats.next();
		}
		p=highA.first();
		nextP=highA.next();
		while(p!=null){
			if(p.getMinutes()==highestA) {
				result=""+p.getPlayer()+"\t"+p.getTeam()+"\t"+p.getPosition();	
			}
			if( nextP.getMinutes() == p.getMinutes()) {
				result=""+p.getPlayer()+"\t"+p.getTeam()+"\t"+p.getPosition()+"\n"+nextP.getPlayer()+"\t"
						+nextP.getTeam()+"\t"+nextP.getPosition();
			}		
			p=highA.next();			
		}
		return result;
	}
		
	public String MVP() {
		String result="";
		int highestA=0, lowA=0;
		List<PlayerRecord>highA=new List <PlayerRecord>();
		PlayerRecord p = stats.first();
		PlayerRecord nextP= stats.next();
		while (p!=null ){
			lowA = p.getWins();
			if (lowA>=highestA ){
				highestA=lowA;
				highA.add(p);
			}
			p=stats.next();
		}
		p=highA.first();
		nextP=highA.next();
		while(p!=null){
			if(p.getWins()==highestA) {
				result=""+p.getPlayer()+"\t"+p.getTeam();	
			}
			if( nextP.getWins() == p.getWins()) {
				result=""+p.getPlayer()+"\t"+p.getTeam()+"\n"+nextP.getPlayer();				 	 
			}		
			p=highA.next();			
		}
		return result;
	}
		
	public String mostPromising() {
		String result="";
		int highestA=0, lowA=0;
		List<PlayerRecord>highA=new List <PlayerRecord>();
		PlayerRecord p = stats.first();
		PlayerRecord nextP= stats.next();
		while (p!=null ){
			lowA = p.getShots();
			if (lowA>=highestA ){
				highestA=lowA;
				highA.add(p);
			}
			p=stats.next();
		}
		p=highA.first();
		nextP=highA.next();
		while(p!=null){
			if(p.getShots()==highestA) {
				result=""+p.getPlayer()+"\t"+p.getTeam();	
			}
			if( nextP.getShots() == p.getShots()) {
				result=""+p.getPlayer()+"\t"+p.getTeam()+"\n"+nextP.getPlayer();				 	 
			}		
			p=highA.next();			
		}
		return result;
	}
	
	//Display the team name for the team that had the most penalty minutes (sum of all penalty
	//minutes for all players on a team).
	public String mostPenalty() {
	      int total=0;
	      String result="";
	      List <PlayerRecord> team = new List<PlayerRecord>();
	      PlayerRecord p= stats.first();
	      PlayerRecord nextP=stats.next();
	      while(p!=null) {
	    	  if(!p.getTeam().equals(nextP.getTeam())){
	    		  team.add(nextP);	  
	    	  }
	    	  p=stats.next();
	      }
	      
	      p=team.first();
	      nextP=team.first();
	      int max=0;
	      int min=p.getMinutes();
	      while(p!=null) {
	    	  if(min>max) {
	    		 max=min;
	    	  }
	    	  if(p.getTeam().equals(nextP.getTeam())) {
	    		 total+=max;
	    	  }
	    	  result=""+p.getTeam();
	    	  p=team.next();
	    	  nextP=team.next();
	      }
	      return result;
	}
	
	//Display the team name for the team that had the most game winning goals (sum of all game
	//winning goals for all players on a team).
	public String mostGoals() {
		int total=0;
	    String result="";
	    List <PlayerRecord> team = new List<PlayerRecord>();
	    PlayerRecord p= stats.first();
	    PlayerRecord nextP=stats.next();
	    while(p!=null) {
	    	if(!p.getTeam().equals(nextP.getTeam())){
	    		team.add(nextP);	
	    		total+=p.getWins();

	    	}
	    	p=stats.next();
	    }
	      
	    p=team.first();
	    nextP=team.first();
	    int max=0;
	    int min=p.getWins();
	    while(p!=null) {
	    	if(min>max) {
	    		max=min;
	    	}
	    	if(team.size()!=0) {
	    	  total+=max; 
	    	}
	    	  
	    	if(p.getTeam().equals(nextP.getTeam())) {
	    		result=" "+nextP.getTeam()+"\t"+p.getTeam();    		  
	    	}
	    		else {
	    		  result=" "+p.getTeam(); 
	    	}
	    	p=team.next();
	     }
	     return result;
	}
	
	
	//print the NHL stats from the list ---just extra... to check if the file is outputting the file list properly
	public void printStats() {
		PlayerRecord p = stats.first();
		while(p!=null) {
			System.out.println(p.getPlayer()+"\t"+p.getPosition()+"\t"+p.getTeam()+"\t"+p.getPlayed()+"\t"+p.getScored()
								+"\t"+p.getAssists()+"\t"+p.getMinutes()+"\t"+p.getShots()+"\t"+p.getWins());
			p=stats.next();
		}
	}
}
