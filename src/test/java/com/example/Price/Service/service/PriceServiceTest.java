package com.example.Price.Service.service;

import com.example.Price.Service.dto.PriceRequest;
import com.example.Price.Service.dto.PriceResponse;
import com.example.Price.Service.entity.Product;
import com.example.Price.Service.entity.ProductComponent;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PriceServiceTest {

    @Test
    void sumTotalPriceOfPriceRequest() {

        final PriceService priceService = new PriceService();

        final PriceResponse priceResponse = priceService.sumComponentPrices(getPriceRequest());

        assertThat(priceResponse.getTotalPrice()).isEqualTo(55);
    }



    private PriceRequest getPriceRequest() {

        return new PriceRequest()
                .setId(0L)
                .setProduct(
                        new Product()
                                .setName("test")
                                .setComponents(getListOfTestComponents())
                );

    }

    private List<ProductComponent> getListOfTestComponents() {

        return List.of(
                new ProductComponent()
                        .setId(0L)
                        .setName("Pineapple")
                        .setPrice(17)
                        .setWeight(0)
                        .setColor("Yellow")
                        .setOrigin("Mexico")
                        .setAwesomeness(9)
                        .setFarmer("Alice")
                        .setOrganic(true)
                        .setCalories(50),
                new ProductComponent()
                        .setId(1L)
                        .setName("Banana")
                        .setPrice(23)
                        .setWeight(9)
                        .setColor("Yellow")
                        .setOrigin("Brazil")
                        .setAwesomeness(7)
                        .setFarmer("Bob")
                        .setOrganic(false)
                        .setCalories(88),
                new ProductComponent()
                        .setId(2L)
                        .setName("Apple")
                        .setPrice(15)
                        .setWeight(8)
                        .setColor("Red")
                        .setOrigin("France")
                        .setAwesomeness(6)
                        .setFarmer("Charlie")
                        .setOrganic(true)
                        .setCalories(52)
        );
    }



}