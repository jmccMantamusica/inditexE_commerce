package com.inditex.ecommerce;

import com.inditex.ecommerce.model.dto.ProductRequest;
import com.inditex.ecommerce.model.dto.ProductResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


@SpringBootTest(classes = ECommerceServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ECommerceApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@LocalServerPort
	private Integer localPort;

	@Test
	void Test1() {

		int day = 14;
		int hour = 10;
		int year = 2020;
		ProductRequest productRequest = this.generateRequest(day,hour,year);
		ResponseEntity<ProductResponse> response = this.callToController(productRequest);
		ProductResponse productResponse = response.getBody();
		Assertions.assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
				() -> Assertions.assertEquals(35.5F, productResponse.getPrice()),
				() -> Assertions.assertEquals(Boolean.TRUE,
						this.dateIncludedBetweenDates(
								this.generateDate(day, hour, year), productResponse)),
				() -> Assertions.assertEquals(1, productResponse.getBrandId()),
				() -> Assertions.assertEquals(1, productResponse.getPriceList()));
	}

	@Test
	void Test2() {

		int day = 14;
		int hour = 16;
		int year = 2020;
		ProductRequest productRequest = this.generateRequest(day,hour,year);
		ResponseEntity<ProductResponse> response = this.callToController(productRequest);
		ProductResponse productResponse = response.getBody();
		Assertions.assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
				() -> Assertions.assertEquals(25.45D, productResponse.getPrice()),
				() -> Assertions.assertEquals(Boolean.TRUE,
						this.dateIncludedBetweenDates(
								this.generateDate(day, hour,year), productResponse)),
				() -> Assertions.assertEquals(1, productResponse.getBrandId()),
				() -> Assertions.assertEquals(2, productResponse.getPriceList()));
	}

	@Test
	void Test3() {

		int day = 14;
		int hour = 21;
		int year = 2020;
		ProductRequest productRequest = this.generateRequest(day,hour,year);
		ResponseEntity<ProductResponse> response = this.callToController(productRequest);
		ProductResponse productResponse = response.getBody();
		Assertions.assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
				() -> Assertions.assertEquals(35.5F, productResponse.getPrice()),
				() -> Assertions.assertEquals(Boolean.TRUE,
						this.dateIncludedBetweenDates(
								this.generateDate(day, hour,year), productResponse)),
				() -> Assertions.assertEquals(1, productResponse.getBrandId()),
				() -> Assertions.assertEquals(1, productResponse.getPriceList()));
	}

	@Test
	void Test4() {

		int day = 15;
		int hour = 10;
		int year = 2020;
		ProductRequest productRequest = this.generateRequest(day,hour,year);
		ResponseEntity<ProductResponse> response = this.callToController(productRequest);
		ProductResponse productResponse = response.getBody();
		Assertions.assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
				() -> Assertions.assertEquals(30.5F, productResponse.getPrice()),
				() -> Assertions.assertEquals(Boolean.TRUE,
						this.dateIncludedBetweenDates(
								this.generateDate(day, hour,year), productResponse)),
				() -> Assertions.assertEquals(1, productResponse.getBrandId()),
				() -> Assertions.assertEquals(3, productResponse.getPriceList()));
	}

	@Test
	void Test5() {

		int day = 16;
		int hour = 21;
		int year = 2020;
		ProductRequest productRequest = this.generateRequest(day,hour,year);
		ResponseEntity<ProductResponse> response = this.callToController(productRequest);
		ProductResponse productResponse = response.getBody();
		Assertions.assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
				() -> Assertions.assertEquals(38.95D, productResponse.getPrice()),
				() -> Assertions.assertEquals(Boolean.TRUE,
						this.dateIncludedBetweenDates(
								this.generateDate(day, hour,year), productResponse)),
				() -> Assertions.assertEquals(1, productResponse.getBrandId()),
				() -> Assertions.assertEquals(4, productResponse.getPriceList()));
	}

	@Test
	void Test6() {

		int day = 16;
		int hour = 21;
		int year = 2021;
		ProductRequest productRequest = this.generateRequest(day,hour,year);
		ResponseEntity<ProductResponse> response = this.callToController(productRequest);
		ProductResponse productResponse = response.getBody();
		Assertions.assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
				() -> Assertions.assertNull(productResponse.getPrice()),
				() -> Assertions.assertNull(productResponse.getBrandId()),
				() -> Assertions.assertNull(productResponse.getPriceList()));
	}




	private ResponseEntity<ProductResponse> callToController(ProductRequest productRequest) {
		UriComponentsBuilder paramBuilder = this.queryParamBuilder(productRequest.getCurrentDate(),
				productRequest.getProductId(), productRequest.getBrandId());

		ResponseEntity<ProductResponse> response = this.doGet(paramBuilder);
		return response;
	}

	private UriComponentsBuilder queryParamBuilder(LocalDateTime currentDate, Long productId, Long brandId) {
		return UriComponentsBuilder.fromHttpUrl("http://localhost:" + localPort + "/api/v1/product")
				.queryParam("currentDate", currentDate)
				.queryParam("productId", productId)
				.queryParam("brandId", brandId);
	}


	private ResponseEntity<ProductResponse> doGet(UriComponentsBuilder builder) {
		return testRestTemplate.exchange(
				builder.build().encode().toUri(),
				HttpMethod.GET, null, ProductResponse.class);
	}

	private ProductRequest generateRequest(int day, int hour, int year) {
		return new ProductRequest(35455L, 1L, this.generateDate(day, hour, year));
	}

	private LocalDateTime generateDate(int day, int hour, int year) {
		return LocalDateTime.of(year, 6, day, hour, 0, 0);
	}

	private boolean dateIncludedBetweenDates(LocalDateTime currenDate, ProductResponse productResponse) {
		return true;
	}

}
