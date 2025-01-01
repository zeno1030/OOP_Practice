package com.OOP.board.dto.request

import com.OOP.board.domain.Board
import org.jetbrains.annotations.NotNull


data class CreateBoardRequestDto(
    @NotNull("작성자는 null 일 수 없습니다.")
    val name: String,
    @NotNull("제목은 필 수 항목입니다.")
    val title: String,
    @NotNull("내용은 필수 입니다.")
    val content: String
){
    fun toBoard(): Board {
        return Board(
            writer = name,
            title = title,
            content = content
        )
    }
}