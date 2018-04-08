package com.enesmumu.nba.platform.player.pojo;

/**
 * 球员
 * @author 作者:BoXuelin
 * @date 创建时间：2017年10月18日
 * @version 1.0
 */
public class Player {
	private Long id;
	private String name;//姓名
	private String season;//赛季
	private Double height;//身高
	private Double weight;//体重
	private Integer attr;//属性

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getAttr() {
		return attr;
	}

	public void setAttr(Integer attr) {
		this.attr = attr;
	}

}
