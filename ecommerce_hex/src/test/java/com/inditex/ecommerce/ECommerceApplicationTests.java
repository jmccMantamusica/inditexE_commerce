package com.inditex.ecommerce;

import com.inditex.ecommerce.application.request.ProductRequest;
import com.inditex.ecommerce.application.response.ProductResponse;
import com.inditex.ecommerce.infrastructure.config.ECommerceServiceApplication;
import com.inditex.ecommerce.utils.UtilsCommonsTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@SpringBootTest(classes = ECommerceServiceApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class ECommerceApplicationTests {

	private final UtilsCommonsTest utilsCommonsTest;

	ECommerceApplicationTests(UtilsCommonsTest utilsCommonsTest) {
		this.utilsCommonsTest = utilsCommonsTest;
	}


	@Test
	void Test1() {

		int day = 14;
		int hour = 10;
		ProductRequest productRequest = utilsCommonsTest.generateRequest(day,hour);
		ResponseEntity<ProductResponse> response = utilsCommonsTest.callToController(productRequest);
		ProductResponse productResponse = response.getBody();
		Assertions.assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
				() -> Assertions.assertEquals(35.5F, productResponse.getPrice()),
				() -> Assertions.assertEquals(Boolean.TRUE,
						utilsCommonsTest.dateIncludedBetweenDates(
								utilsCommonsTest.generateDate(day, hour), productResponse)),
				() -> Assertions.assertEquals(1, productResponse.getBrandId()),
				() -> Assertions.assertEquals(1, productResponse.getPriceList()),
				() -> Assertions.assertEquals("EUR", productResponse.getPrice()));
	}

	@Test
	void Test2() {

		int day = 14;
		int hour = 16;
		ProductRequest productRequest = utilsCommonsTest.generateRequest(day,hour);
		ResponseEntity<ProductResponse> response = utilsCommonsTest.callToController(productRequest);
		ProductResponse productResponse = response.getBody();
		Assertions.assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
				() -> Assertions.assertEquals(25.45D, productResponse.getPrice()),
				() -> Assertions.assertEquals(Boolean.TRUE,
						utilsCommonsTest.dateIncludedBetweenDates(
								utilsCommonsTest.generateDate(day, hour), productResponse)),
				() -> Assertions.assertEquals(1, productResponse.getBrandId()),
				() -> Assertions.assertEquals(2, productResponse.getPriceList()));
	}

	@Test
	void Test3() {

		int day = 14;
		int hour = 21;
		ProductRequest productRequest = utilsCommonsTest.generateRequest(day,hour);
		ResponseEntity<ProductResponse> response = utilsCommonsTest.callToController(productRequest);
		ProductResponse productResponse = response.getBody();
		Assertions.assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
				() -> Assertions.assertEquals(35.5F, productResponse.getPrice()),
				() -> Assertions.assertEquals(Boolean.TRUE,
						utilsCommonsTest.dateIncludedBetweenDates(
								utilsCommonsTest.generateDate(day, hour), productResponse)),
				() -> Assertions.assertEquals(1, productResponse.getBrandId()),
				() -> Assertions.assertEquals(1, productResponse.getPriceList()));
	}

	@Test
	void Test4() {

		int day = 15;
		int hour = 10;
		ProductRequest productRequest = utilsCommonsTest.generateRequest(day,hour);
		ResponseEntity<ProductResponse> response = utilsCommonsTest.callToController(productRequest);
		ProductResponse productResponse = response.getBody();
		Assertions.assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
				() -> Assertions.assertEquals(30.5F, productResponse.getPrice()),
				() -> Assertions.assertEquals(Boolean.TRUE,
						utilsCommonsTest.dateIncludedBetweenDates(
								utilsCommonsTest.generateDate(day, hour), productResponse)),
				() -> Assertions.assertEquals(1, productResponse.getBrandId()),
				() -> Assertions.assertEquals(3, productResponse.getPriceList()));
	}

	@Test
	void Test5() {

		int day = 16;
		int hour = 21;
		ProductRequest productRequest = utilsCommonsTest.generateRequest(day,hour);
		ResponseEntity<ProductResponse> response = utilsCommonsTest.callToController(productRequest);
		ProductResponse productResponse = response.getBody();
		Assertions.assertAll(() -> Assertions.assertEquals(HttpStatus.OK, response.getStatusCode()),
				() -> Assertions.assertEquals(38.95D, productResponse.getPrice()),
				() -> Assertions.assertEquals(Boolean.TRUE,
						utilsCommonsTest.dateIncludedBetweenDates(
								utilsCommonsTest.generateDate(day, hour), productResponse)),
				() -> Assertions.assertEquals(1, productResponse.getBrandId()),
				() -> Assertions.assertEquals(4, productResponse.getPriceList()));
	}

}
