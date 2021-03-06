package com.mdy.dzs.game.domain.union;

import java.io.Serializable;
import java.util.List;

public class CheckShopTimeVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1324488649253860250L;
	private int isOver;
	private long leftTime;
	private List<ShopInfo> shopListA;

	public int getIsOver() {
		return isOver;
	}

	public void setIsOver(int isOver) {
		this.isOver = isOver;
	}

	public long getLeftTime() {
		return leftTime;
	}

	public void setLeftTime(long leftTime) {
		this.leftTime = leftTime;
	}

	public List<ShopInfo> getShopListA() {
		return shopListA;
	}

	public void setShopListA(List<ShopInfo> shopListA) {
		this.shopListA = shopListA;
	}
}
