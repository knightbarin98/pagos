package com.curame.fianzas.pagos.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double subtotal;
    private Double total;
    @Column(length = 13)
    private String rfc;
    private Boolean voice;
    @OneToOne
    @JoinColumn(name="concept_id")
    private Concept concept;
    @OneToOne
    @JoinColumn(name="payment_type_id")
    private PaymentType paymentType;
    @OneToOne
    @JoinColumn(name="pacient_id")
    private Pacient pacient;

}
