package com.xworkz.app.dto;



public class BridgeDTO {

	private String bridgeName;
	private String bridgeType;
	private int lengthInMeters;
	private boolean isPedestrianFriendly;

	public BridgeDTO(String bridgeName, String bridgeType, int lengthInMeters, boolean isPedestrianFriendly) {
		this.bridgeName = bridgeName;
		this.bridgeType = bridgeType;
		this.lengthInMeters = lengthInMeters;
		this.isPedestrianFriendly = isPedestrianFriendly;
	}

	public String getBridgeName() {
		return bridgeName;
	}

	public String getBridgeType() {
		return bridgeType;
	}

	public int getLengthInMeters() {
		return lengthInMeters;
	}

	public boolean isPedestrianFriendly() {
		return isPedestrianFriendly;
	}

	@Override
	public String toString() {
		return "BridgeDTO [bridgeName=" + bridgeName + ", bridgeType=" + bridgeType + ", lengthInMeters="
				+ lengthInMeters + ", isPedestrianFriendly=" + isPedestrianFriendly + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bridgeName == null) ? 0 : bridgeName.hashCode());
		result = prime * result + ((bridgeType == null) ? 0 : bridgeType.hashCode());
		result = prime * result + (isPedestrianFriendly ? 1231 : 1237);
		result = prime * result + lengthInMeters;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof BridgeDTO)) {
			return false;
		}
		BridgeDTO other = (BridgeDTO) obj;
		if (bridgeName == null) {
			if (other.bridgeName != null) {
				return false;
			}
		} else if (!bridgeName.equals(other.bridgeName)) {
			return false;
		}
		if (bridgeType == null) {
			if (other.bridgeType != null) {
				return false;
			}
		} else if (!bridgeType.equals(other.bridgeType)) {
			return false;
		}
		if (isPedestrianFriendly != other.isPedestrianFriendly) {
			return false;
		}
		if (lengthInMeters != other.lengthInMeters) {
			return false;
		}
		return true;
	}

}
