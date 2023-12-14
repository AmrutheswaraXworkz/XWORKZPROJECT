package com.xworkz.app.dto;


public class PlayGroundDTO {

	private String playgroundName;
	private String playgroundType;
	private int capacity;
	private boolean isIndoor;

	public PlayGroundDTO(String playgroundName, String playgroundType, int capacity, boolean isIndoor) {
		this.playgroundName = playgroundName;
		this.playgroundType = playgroundType;
		this.capacity = capacity;
		this.isIndoor = isIndoor;
	}

	@Override
	public String toString() {
		return "PlayGroundDTO [playgroundName=" + playgroundName + ", playgroundType=" + playgroundType + ", capacity="
				+ capacity + ", isIndoor=" + isIndoor + "]";
	}

	public String getPlaygroundName() {
		return playgroundName;
	}

	public String getPlaygroundType() {
		return playgroundType;
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean isIndoor() {
		return isIndoor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + (isIndoor ? 1231 : 1237);
		result = prime * result + ((playgroundName == null) ? 0 : playgroundName.hashCode());
		result = prime * result + ((playgroundType == null) ? 0 : playgroundType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PlayGroundDTO)) {
			return false;
		}
		PlayGroundDTO other = (PlayGroundDTO) obj;
		if (capacity != other.capacity) {
			return false;
		}
		if (isIndoor != other.isIndoor) {
			return false;
		}
		if (playgroundName == null) {
			if (other.playgroundName != null) {
				return false;
			}
		} else if (!playgroundName.equals(other.playgroundName)) {
			return false;
		}
		if (playgroundType == null) {
			if (other.playgroundType != null) {
				return false;
			}
		} else if (!playgroundType.equals(other.playgroundType)) {
			return false;
		}
		return true;
	}

}
