package com.xworkz.app.dto;

public class HangerDTO {

	private String hangarName;
	private String hangarType;
	private int capacity;
	private boolean hasSecuritySystem;

	public HangerDTO(String hangarName, String hangarType, int capacity, boolean hasSecuritySystem) {
		this.hangarName = hangarName;
		this.hangarType = hangarType;
		this.capacity = capacity;
		this.hasSecuritySystem = hasSecuritySystem;
	}

	public String getHangarName() {
		return hangarName;
	}

	public String getHangarType() {
		return hangarType;
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean isHasSecuritySystem() {
		return hasSecuritySystem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((hangarName == null) ? 0 : hangarName.hashCode());
		result = prime * result + ((hangarType == null) ? 0 : hangarType.hashCode());
		result = prime * result + (hasSecuritySystem ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof HangerDTO)) {
			return false;
		}
		HangerDTO other = (HangerDTO) obj;
		if (capacity != other.capacity) {
			return false;
		}
		if (hangarName == null) {
			if (other.hangarName != null) {
				return false;
			}
		} else if (!hangarName.equals(other.hangarName)) {
			return false;
		}
		if (hangarType == null) {
			if (other.hangarType != null) {
				return false;
			}
		} else if (!hangarType.equals(other.hangarType)) {
			return false;
		}
		if (hasSecuritySystem != other.hasSecuritySystem) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "HangerDTO [hangarName=" + hangarName + ", hangarType=" + hangarType + ", capacity=" + capacity
				+ ", hasSecuritySystem=" + hasSecuritySystem + "]";
	}

}

