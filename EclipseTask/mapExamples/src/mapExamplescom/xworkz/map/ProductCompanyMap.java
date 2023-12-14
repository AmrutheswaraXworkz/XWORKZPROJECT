package mapExamplescom.xworkz.map;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import mapExamplescom.xworkz.map.dto.CompanyDTO;
import mapExamplescom.xworkz.map.dto.ProductDTO;

public class ProductCompanyMap {

	public static void main(String[] args) {
		ProductDTO productDto1 = new ProductDTO("Maggie", 12D, 1, 200, LocalDate.now());
		ProductDTO productDto2 = new ProductDTO("ParleG", 10D, 2, 50, LocalDate.now());
		ProductDTO productDto3 = new ProductDTO("Oreo", 20D, 3, 50, LocalDate.now());

		CompanyDTO companyDto1 = new CompanyDTO("Nestle", "Banglore", 28);
		CompanyDTO companyDto2 = new CompanyDTO("Britania", "Gujrat", 30);
		CompanyDTO companyDto3 = new CompanyDTO("Fantasy", "Mumbai", 32);

		Map<ProductDTO, CompanyDTO> pair = new HashMap<ProductDTO, CompanyDTO>();
		pair.put(productDto1, companyDto1);
		pair.put(productDto2, companyDto2);
		pair.put(productDto3, companyDto3);

		Set<ProductDTO> keys = pair.keySet();
		keys.forEach(s -> System.out.println(s.getName()));
		System.err.println("------------------");
		Collection<CompanyDTO> values = pair.values();
		values.forEach(s -> System.out.println(s.getName()));
		System.err.println("------------------");

		Set<Entry<ProductDTO, CompanyDTO>> entires = pair.entrySet();
		entires.forEach(c -> System.out.println(c));

	}
}
