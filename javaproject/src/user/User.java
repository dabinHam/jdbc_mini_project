package user;

public class User 
{
	private int usernum;
	private String id;
	private String password;
	private String nickname;
	private int isAdmin;
	
	User()
	{
		
	}
	
	User(int usernum, String id, String password, String nickname, int isAdmin)
	{
		this.usernum = usernum;
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.isAdmin = isAdmin;
	}
	
	public int getUsernum() {
		return usernum;
	}
	public void setUsernum(int usernum) {
		this.usernum = usernum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int isAdmin() {
		return isAdmin;
	}
	public void setAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
}
