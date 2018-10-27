package pl.sdacademy.springdemo;

import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class InMemoryDashboardImpl implements Dashboard {
	@Override
	public Stream<String> findAllMsg() {
		return Stream.of("one", "two");
	}
}
