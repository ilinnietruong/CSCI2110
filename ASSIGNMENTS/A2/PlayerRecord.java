/**CSCI2110:
 * A2:Excercise 1
 *Linh Truong |B00708389
 */
public class PlayerRecord {
	private String player,position,team;
	private int played,scored,assists,minutes,shots,wins;
	
	//constructor
	public PlayerRecord(String n, String p,String t, int pl, int s,int a,int m, int sh,int w) {
		player=n;
		position=p;
		team=t;
		played=pl;
		scored=s;
		assists=a;
		minutes=m;
		shots=sh;
		wins=w;	
	}
	public PlayerRecord() {
	
	}
	
	//getters
	
	public String getPlayer() {
		return player;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String getTeam() {
		return team;
	}
	
	public int getPlayed() {
		return played;
	}
	
	public int getScored() {
		return scored;
	}
	
	public int getAssists() {
		return assists;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getShots() {
		return shots;
	}
	
	public int getWins() {
		return wins;
	}
	
	//toString
	public String toString() {
		return player+"\t"+position+"\t"+team+"\t"+played+"\t"+scored+"t"+assists+"t"+
			minutes+"\t"+shots+"t"+wins;				
	}
	
	//total points from scored and assists
	public int totalPoints() {	
		int total=scored+assists;
		return total;
	}

	//to see if the  playerRecord equal to each other
	public boolean equals (PlayerRecord other) {
		return (player.equals(other.getPlayer()) && position.equals(other.getPosition()) && team.equals(other.getTeam()) && 
				played==(other.getPlayed()) && scored==(other.getScored()) && assists==(other.getAssists()) && minutes==(other.getMinutes())
				&& shots==(other.getShots()) && wins==(other.getWins()));	
	}
} //end class
	
	

