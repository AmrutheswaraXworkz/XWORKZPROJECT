package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.PrinterDto;
import com.xworkz.dto.app.repository.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {

	private PrinterRepository printerRepository;

	public PrinterServiceImpl(PrinterRepository printerRepository) {
		this.printerRepository = printerRepository;
	}

	@Override
	public boolean validSave(PrinterDto printerDto) {
		if (printerDto != null) {
			System.out.println("printerDto is not null");
			String device = printerDto.getDeviceName();
			int copy = printerDto.getCopies();
			double price = printerDto.getPrice();
			String color = printerDto.getColor();

			if (device != null && !device.isEmpty() && device.length() > 5) {
				System.out.println("device is valide");

			} else {
				System.err.println("device is invalid");
				return false;
			}
			if (copy > 0 && price > 0) {
				System.out.println("copy and price are valid");
			} else {
				System.err.println("copy and price are invalid");
				return false;
			}
			if (color != null && !color.isEmpty() && color.length() > 2) {
				System.out.println("color is valid");
			} else {
				System.err.println("color is invalid");
				return false;
			}
			this.printerRepository.save(printerDto);
			return true;
		}
		else {
			System.err.println("adhaarDto is null");
		}

		return false;
	}

}
