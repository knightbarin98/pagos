package com.curame.fianzas.pagos.config;

import com.curame.fianzas.pagos.models.entity.Concept;
import com.curame.fianzas.pagos.models.entity.Pacient;
import com.curame.fianzas.pagos.models.entity.Payment;
import com.curame.fianzas.pagos.models.entity.PaymentType;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Concept.class, Pacient.class, PaymentType.class, Payment.class);
    }
}
