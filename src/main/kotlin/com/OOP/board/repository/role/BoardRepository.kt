package com.OOP.board.repository.role

import com.OOP.board.domain.Board
import com.OOP.board.dto.request.CreateBoardRequestDto


interface BoardRepository {
    fun saveBoard(createBoardRequestDto: CreateBoardRequestDto): Board
    fun cleanUp()
}