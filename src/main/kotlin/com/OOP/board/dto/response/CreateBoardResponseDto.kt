package com.OOP.board.dto.response

import com.OOP.board.domain.Board

data class CreateBoardResponseDto(
    val id: Long
){
    companion object {
        fun of(board: Board): CreateBoardResponseDto {
            return CreateBoardResponseDto(board.id)
        }
    }
}
