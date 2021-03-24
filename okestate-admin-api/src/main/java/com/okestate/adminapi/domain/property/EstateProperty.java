package com.okestate.adminapi.domain.property;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "estate_property")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstateProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "room_amount", columnDefinition = "number not null default 0 comment '방 갯수'")
    private int roomAmount;

    @Column(name = "bathroom_amount", columnDefinition = "number not null default 0 comment '화장실 갯수'")
    private int bathroomAmount;
}
