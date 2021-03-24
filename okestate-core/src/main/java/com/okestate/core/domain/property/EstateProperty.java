package com.okestate.core.domain.property;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "estate_property")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
class EstateProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "room_amount", columnDefinition = "number not null default 0 comment '방 갯수'")
    private int roomAmount;

    @Column(name = "bathroom_amount", columnDefinition = "number not null default 0 comment '화장실 갯수'")
    private int bathroomAmount;
}
