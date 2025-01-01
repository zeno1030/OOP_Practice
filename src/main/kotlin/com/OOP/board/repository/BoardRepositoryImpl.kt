package com.OOP.board.repository

import com.OOP.board.domain.Board
import com.OOP.board.dto.request.CreateBoardRequestDto
import com.OOP.board.repository.jpa.BoardJpaRepository
import com.OOP.board.repository.role.BoardRepository
import org.springframework.stereotype.Repository

@Repository
class BoardRepositoryImpl(private val boardJpaRepository: BoardJpaRepository): BoardRepository {
    override fun saveBoard(createBoardRequestDto: CreateBoardRequestDto): Board {
        return boardJpaRepository.save(createBoardRequestDto.toBoard())
    }
    override fun cleanUp() {
        return boardJpaRepository.deleteAllInBatch()
    }
}