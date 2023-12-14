package com.xworkz.app.dto;


public class WireDTO {
	private String type;
	private double cost;
	private String usedFor;
	private double thickness;

	public WireDTO(String type, double cost, String usedFor, double thickness) {
		super();
		this.type = type;
		this.cost = cost;
		this.usedFor = usedFor;
		this.thickness = thickness;
	}

	public String getType() {
		return type;
	}

	public double getCost() {
		return cost;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public double getThickness() {
		return thickness;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof WireDTO) {
				WireDTO dto = (WireDTO) obj;
				if (dto.getType().equals(this.getType()) && dto.getUsedFor().equals(this.getUsedFor())) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "WireDTO [type=" + type + ", cost=" + cost + ", usedFor=" + usedFor + ", thickness=" + thickness + "]";
	}

	@Override
	public int hashCode() {
		return 10;
	}

}
