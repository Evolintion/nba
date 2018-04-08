package com.enesmumu.nba.platform.user.pojo;

/**
 * @author 作者:BoXuelin
 * @date 创建时间：2017年10月18日
 * @version 1.0
 */
public class User {
	private Long id;//主键
	private String userName;//用户名
	private String nickName;//昵称
	private String password;//账号
	private String teamName;//队伍名
	private Long gold;//金币
	private Long ep;//ep

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Long getGold() {
		return gold;
	}

	public void setGold(Long gold) {
		this.gold = gold;
	}

	public Long getEp() {
		return ep;
	}

	public void setEp(Long ep) {
		this.ep = ep;
	}

}
