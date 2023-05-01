package com.inditex.ecommerce.utils;
import com.inditex.ecommerce.model.dto.request.ProductRequest;
import com.inditex.ecommerce.model.dto.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDateTime;

@Component
public class UtilsCommonsTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @LocalServerPort
    private Integer localPort;



    public ResponseEntity<ProductResponse> callToController(ProductRequest productRequest) {
        UriComponentsBuilder paramBuilder = this.queryParamBuilder(productRequest.getCurrentDate(),
                productRequest.getProductId(), productRequest.getBrandId());

        ResponseEntity<ProductResponse> response = this.doGet(paramBuilder);
        return response;
    }

    public UriComponentsBuilder queryParamBuilder(LocalDateTime currentDate, Long productId, Long brandId) {
        return UriComponentsBuilder.fromHttpUrl("http://localhost:" + localPort + "/api/v1/product")
                .queryParam("currentDate", currentDate)
                .queryParam("productId", productId)
                .queryParam("brandId", brandId);
    }

    public ResponseEntity<ProductResponse> doGet(UriComponentsBuilder builder) {
        return testRestTemplate.exchange(
                builder.build().encode().toUri(),
                HttpMethod.GET, null, ProductResponse.class);
    }

    public ProductRequest generateRequest(int day, int hour) {
        ProductRequest productRequest = new ProductRequest();
        productRequest.setCurrentDate(this.generateDate(day, hour));
        productRequest.setBrandId(1L);
        productRequest.setProductId(35455L);
        return productRequest;
    }

    public LocalDateTime generateDate(int day, int hour) {
        return LocalDateTime.of(2020, 6, day, hour, 0, 0);
    }

    public boolean dateIncludedBetweenDates(LocalDateTime currenDate, ProductResponse productResponse) {
        return true;
    }
}
