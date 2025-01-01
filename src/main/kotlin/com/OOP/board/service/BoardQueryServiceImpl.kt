package com.OOP.board.service

import com.OOP.board.domain.Board
import com.OOP.board.dto.request.CreateBoardRequestDto
import com.OOP.board.dto.response.CreateBoardResponseDto
import com.OOP.board.repository.role.BoardRepository
import com.OOP.board.service.role.BoardQueryService
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class BoardQueryServiceImpl(
    private val boardRepository: BoardRepository
): BoardQueryService {
    @Transactional
    override fun createBoard(createBoardRequestDto: CreateBoardRequestDto): CreateBoardResponseDto{
        val board: Board = boardRepository.saveBoard(createBoardRequestDto)
        return CreateBoardResponseDto.of(board)
    }
}