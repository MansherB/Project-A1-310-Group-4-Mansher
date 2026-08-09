package nz.ac.auckland.grocerfy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GrocerfyApplicationTests {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	void seedDataIsLoaded() {
		Integer productCount = jdbcTemplate.queryForObject("select count(*) from products", Integer.class);
		Integer storeCount = jdbcTemplate.queryForObject("select count(*) from stores", Integer.class);
		Integer priceCount = jdbcTemplate.queryForObject("select count(*) from store_prices", Integer.class);

		assertThat(productCount).isEqualTo(3);
		assertThat(storeCount).isEqualTo(3);
		assertThat(priceCount).isEqualTo(5);
	}

}
