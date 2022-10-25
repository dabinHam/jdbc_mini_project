package rank;

public class Rank {
	private int serialnum;
	private int exploiternum;
	private int score;
	private String cleartime;
	private String nickname = null;
	private String gamename = null;
	
	public Rank(int serialnum, int exploiternum, int score, String cleartime)
	{
		this.serialnum = serialnum;
		this.exploiternum = exploiternum;
		this.score = score;
		this.cleartime = cleartime;
	}
	
	public Rank() 
	{
		
	}
	
	public int getSerialNum() {
		return serialnum;
	}
	
	public void setSerialNum(int serialnum) {
		this.serialnum = serialnum;
	}
	
	public int getExploiterNum() {
		return exploiternum;
	}
	
	public void setExploiterNum(int exploiternum) {
		this.exploiternum = exploiternum;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getCleartime() {
		return cleartime;
	}
	
	public void setCleartime(String cleartime) {
		this.cleartime = cleartime;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(nickname != null)
			return "�̸� : "+ this.nickname +  "Ŭ���� ���� : " + this.score + "Ŭ���� �ð� : " + this.cleartime;
		
		else if (gamename != null)
			return "���� �̸� : "+ this.nickname +  "Ŭ���� ���� : " + this.score + "Ŭ���� �ð� : " + this.cleartime;
		
		else
			return "Ŭ���� ���� : " + this.score + "Ŭ���� �ð� : " + this.cleartime;
	}

	
}
