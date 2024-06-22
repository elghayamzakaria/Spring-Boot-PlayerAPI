package com.spring.player.dao;

import com.spring.player.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerDAO extends JpaRepository<Player, Integer> {


    /*  Player
    Get ======>   http://localhost:8080/players
    Get ======>   http://localhost:8080/players/id
    Post ======>   http://localhost:8080/players    body   Player
    Put/Post ======>   http://localhost:8080/players    body   Player (Aussi Pour modifier)
    Delete ======>   http://localhost:8080/players/id    body   Player


======> Pagination With Spring >> (par defaut 20 element par page)

    http://localhost:8080/players?page=0&size=2

    *
    * */
}
