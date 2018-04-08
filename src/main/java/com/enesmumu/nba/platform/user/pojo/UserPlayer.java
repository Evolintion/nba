package com.enesmumu.nba.platform.user.pojo;

/**
 * 用户球员表
 * 
 * @author BoXuelin
 * @date 2017年10月18日
 * @version 1.0
 */
public class UserPlayer {
	private Long id;//主键
	private Long userId;//用户主键
	private Long playerId;//球员id
	private Integer intensive;//强化等级
	private Integer experience;//经验

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public Integer getIntensive() {
		return intensive;
	}

	public void setIntensive(Integer intensive) {
		this.intensive = intensive;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}
}
