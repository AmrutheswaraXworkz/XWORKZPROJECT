package com.xworkz.app.dto;

public class TyreDTO {

	private String tireSize;
	private String tireType;
	private String treadPattern;
	private int recommendedTirePressure;

	public TyreDTO(String tireSize, String tireType, String treadPattern, int recommendedTirePressure) {
		super();
		this.tireSize = tireSize;
		this.tireType = tireType;
		this.treadPattern = treadPattern;
		this.recommendedTirePressure = recommendedTirePressure;
	}

	@Override
	public String toString() {
		return "TyreDTO [tireSize=" + tireSize + ", tireType=" + tireType + ", treadPattern=" + treadPattern
				+ ", recommendedTirePressure=" + recommendedTirePressure + "]";
	}

	public String getTireSize() {
		return tireSize;
	}

	public String getTireType() {
		return tireType;
	}

	public String getTreadPattern() {
		return treadPattern;
	}

	public int getRecommendedTirePressure() {
		return recommendedTirePressure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + recommendedTirePressure;
		result = prime * result + ((tireSize == null) ? 0 : tireSize.hashCode());
		result = prime * result + ((tireType == null) ? 0 : tireType.hashCode());
		result = prime * result + ((treadPattern == null) ? 0 : treadPattern.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof TyreDTO)) {
			return false;
		}
		TyreDTO other = (TyreDTO) obj;
		if (recommendedTirePressure != other.recommendedTirePressure) {
			return false;
		}
		if (tireSize == null) {
			if (other.tireSize != null) {
				return false;
			}
		} else if (!tireSize.equals(other.tireSize)) {
			return false;
		}
		if (tireType == null) {
			if (other.tireType != null) {
				return false;
			}
		} else if (!tireType.equals(other.tireType)) {
			return false;
		}
		if (treadPattern == null) {
			if (other.treadPattern != null) {
				return false;
			}
		} else if (!treadPattern.equals(other.treadPattern)) {
			return false;
		}
		return true;
	}

}
