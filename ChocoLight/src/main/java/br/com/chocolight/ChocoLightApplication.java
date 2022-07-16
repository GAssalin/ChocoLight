package br.com.chocolight;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.chocolight.model.Category;
import br.com.chocolight.model.Product;
import br.com.chocolight.repository.ProductRepository;
import br.com.chocolight.service.CategoryService;

@SpringBootApplication
public class ChocoLightApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChocoLightApplication.class, args);
	}

	@Autowired
	private CategoryService catService;
	@Autowired
	private ProductRepository proRepository;

	@Override
	public void run(String... args) throws Exception {
		Category c = new Category();
		c.setName("Chocolate");
		Category c2 = new Category();
		c2.setName("Biscoito");
		Category c3 = new Category();
		c3.setName("Bala");
		Category c4 = new Category();
		c4.setName("Snacks");

		catService.save(c);
		catService.save(c2);
		catService.save(c3);
		catService.save(c4);

		Product p = new Product();
		p.setName("DARK CHOCOLATE WITH ALMONDS");
		p.setDescription("É um delicioso chocolate meio amargo com redução de açúcar.");
		p.setPrice(new BigDecimal(19.99));
		p.setBrand("BELGIAN");
		p.setUrlImage(
				"https://www.rickdoces.com.br/estatico/rickdoces/images/temp/620_ece6193b2880bb3aeb536117391b3276.jpeg?v=1657892109?v=1657895157");
		p.setWeight("100GR");
		p.setCategory(catService.getById(1L));

		Product p2 = new Product();
		p2.setName("PRINGLES ROTISSERIE CHICKEN");
		p2.setDescription("São as batatas mais amadas do mundo no sabor frango assado. Impossivel não amar.");
		p2.setPrice(new BigDecimal(34.99));
		p2.setBrand("PRINGLES");
		p2.setUrlImage(
				"https://www.rickdoces.com.br/estatico/rickdoces/images/temp/620_a44a11c1a069b32cea9c4fb9ef6699b1.jpeg?v=1654187705?v=1654198397");
		p2.setWeight("158GR");
		p2.setCategory(catService.getById(4L));

		Product p3 = new Product();
		p3.setName("TOBLERONE TINY MILK, WHITE E CRUNCHY ALMONDS");
		p3.setDescription(
				"São minis toblerones de chocolate ao leite suiço, chocolate amargo suiço, ambos com mel e nougat de amêndoas e chocolate ao leite suiço com amêndoas caramelizadas salgadas mel e nougat de amêndoas. ");
		p3.setPrice(new BigDecimal(69.99));
		p3.setBrand("MONDELÉZ");
		p3.setUrlImage(
				"https://www.rickdoces.com.br/estatico/rickdoces/images/temp/620_4dd574bb23802d528e2b342ca0e82af2.jpeg?v=1657838113?v=1657850114");
		p3.setWeight("272GR");
		p3.setCategory(catService.getById(1L));

		Product p4 = new Product();
		p4.setName("FEINY BISCUITS CHOCO-CHIP COOKIES");
		p4.setDescription("São deliciosos cookies de chocolate com gotas de chocolate ao leite.");
		p4.setPrice(new BigDecimal(14.99));
		p4.setBrand("FEINY BISCUIT");
		p4.setUrlImage(
				"https://www.rickdoces.com.br/estatico/rickdoces/images/temp/620_276b69957c5352506394b3b437db9f2e.jpeg?v=1657571712?v=1657661467");
		p4.setWeight("125GR");
		p4.setCategory(catService.getById(2L));

		proRepository.save(p);
		proRepository.save(p2);
		proRepository.save(p3);
		proRepository.save(p4);
	}

}
