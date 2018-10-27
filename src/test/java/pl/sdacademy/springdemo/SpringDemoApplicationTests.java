package pl.sdacademy.springdemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

@SpringJUnitConfig
@SpringBootTest
public class SpringDemoApplicationTests {

	@Autowired
	private ApplicationContext context;

	@DisplayName("should load context")
	@Test
	public void contextLoads() {
		assertThat(context).isNotNull();
	}

	@DisplayName("should custom load bean from context")
	@Test
	void test() throws Exception {
		context.getBean(Dashboard.class);
	}

}
