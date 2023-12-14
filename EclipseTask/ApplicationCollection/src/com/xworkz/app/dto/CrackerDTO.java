package com.xworkz.app.dto;


public class CrackerDTO {

	private String crackerName;
	private String crackerType;
	private boolean isLoud;
	private int explosionLevel;

	// Constructors
	public CrackerDTO(String crackerName, String crackerType, boolean isLoud, int explosionLevel) {
		this.crackerName = crackerName;
		this.crackerType = crackerType;
		this.isLoud = isLoud;
		this.explosionLevel = explosionLevel;
	}

	@Override
	public String toString() {
		return "CrackerDTO [crackerName=" + crackerName + ", crackerType=" + crackerType + ", isLoud=" + isLoud
				+ ", explosionLevel=" + explosionLevel + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crackerName == null) ? 0 : crackerName.hashCode());
		result = prime * result + ((crackerType == null) ? 0 : crackerType.hashCode());
		result = prime * result + explosionLevel;
		result = prime * result + (isLoud ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CrackerDTO)) {
			return false;
		}
		CrackerDTO other = (CrackerDTO) obj;
		if (crackerName == null) {
			if (other.crackerName != null) {
				return false;
			}
		} else if (!crackerName.equals(other.crackerName)) {
			return false;
		}
		if (crackerType == null) {
			if (other.crackerType != null) {
				return false;
			}
		} else if (!crackerType.equals(other.crackerType)) {
			return false;
		}
		if (explosionLevel != other.explosionLevel) {
			return false;
		}
		if (isLoud != other.isLoud) {
			return false;
		}
		return true;
	}

	public String getCrackerName() {
		return crackerName;
	}

	public String getCrackerType() {
		return crackerType;
	}

	public boolean isLoud() {
		return isLoud;
	}

	public int getExplosionLevel() {
		return explosionLevel;
	}

}
