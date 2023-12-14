package com.xworkz.app.dto;

public class PinDTO {

	private String pinCode;
	private String city;
	private String state;
	private boolean isDeliverable;

	public PinDTO(String pinCode, String city, String state, boolean isDeliverable) {
		this.pinCode = pinCode;
		this.city = city;
		this.state = state;
		this.isDeliverable = isDeliverable;
	}

	public String getPinCode() {
		return pinCode;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public boolean isDeliverable() {
		return isDeliverable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + (isDeliverable ? 1231 : 1237);
		result = prime * result + ((pinCode == null) ? 0 : pinCode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PinDTO)) {
			return false;
		}
		PinDTO other = (PinDTO) obj;
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (isDeliverable != other.isDeliverable) {
			return false;
		}
		if (pinCode == null) {
			if (other.pinCode != null) {
				return false;
			}
		} else if (!pinCode.equals(other.pinCode)) {
			return false;
		}
		if (state == null) {
			if (other.state != null) {
				return false;
			}
		} else if (!state.equals(other.state)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PinDTO [pinCode=" + pinCode + ", city=" + city + ", state=" + state + ", isDeliverable=" + isDeliverable
				+ "]";
	}

}

