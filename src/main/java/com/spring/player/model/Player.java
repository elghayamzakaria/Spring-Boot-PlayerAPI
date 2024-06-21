package com.spring.player.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private int id;

    @Column(name = "player_name")
    private String name;

    @Column(name ="player_number")
    private int number;

    @Column(name = "player_adresse")
    private String adresse;

    @Column(name = "player_phone")
    private String phone;
}
