package com.OOP.board.domain

import jakarta.persistence.*

@Entity
@Table(name = "board")
data class Board (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id", nullable = false)
    val id: Long = 0L,

    @Column(name = "title", nullable = false)
    val title: String,

    @Column(name = "content", columnDefinition = "TEXT")
    val content: String,

    @Column(name = "writer", nullable = false)
    val writer: String,

){
}


