package com.OOP.board.repository.jpa

import com.OOP.board.domain.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardJpaRepository : JpaRepository<Board, Long> {
}
