package com.OOP.board.service.role

import com.OOP.board.dto.request.CreateBoardRequestDto
import com.OOP.board.dto.response.CreateBoardResponseDto

interface BoardQueryService {
    fun createBoard(createBoardRequestDto: CreateBoardRequestDto): CreateBoardResponseDto
}