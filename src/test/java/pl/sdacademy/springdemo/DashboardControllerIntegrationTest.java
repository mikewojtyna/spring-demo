package pl.sdacademy.springdemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet
	.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request
	.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result
	.MockMvcResultMatchers.*;

@SpringJUnitConfig
@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser
public class DashboardControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@DisplayName("should show msg page when GET on /dashboard")
	@Test
	void test() throws Exception {
		// when
		// @formatter:off
		mockMvc.perform(get("/dashboard"))

		// then
		.andExpect(status().isOk())
		.andExpect(model().attribute("msg", "one"))
		.andExpect(view().name("all-msg"));
		// @formatter:on
	}
}
