package com.okestate.adminapi.domain.property;

import static org.assertj.core.api.Assertions.assertThat;

import com.okestate.adminapi.repository.EstatePropertyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EstatePropertyTest {

    @Autowired
    private EstatePropertyRepository estatePropertyRepository;

    @Test
    void saveEstateProperty() {

        EstateProperty estateProperty = EstateProperty.builder()
            .roomAmount(3)
            .bathroomAmount(5)
            .build();
        estatePropertyRepository.save(estateProperty);

        EstateProperty retrivedProperty = estatePropertyRepository.findById(estateProperty.getId())
            .orElseGet(EstateProperty::new);

        assertThat(retrivedProperty.getRoomAmount()).isSameAs(3);
        assertThat(retrivedProperty.getBathroomAmount()).isSameAs(5);
    }
}