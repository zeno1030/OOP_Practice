package com.OOP.board.service

import com.OOP.board.domain.Board
import com.OOP.board.dto.request.CreateBoardRequestDto
import com.OOP.board.repository.role.BoardRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BoardQueryServiceImplTest @Autowired constructor(
    private val boardRepository: BoardRepository
){
    @AfterEach
    fun cleanUp() {
        boardRepository.cleanUp()
    }

    @DisplayName("사용자는 게시판을 작성할 수 있다.")
    @Test
    fun createBoardTest(){
        val createBoardRequestDto = CreateBoardRequestDto("권지환", "객체지향프로그래밍", "재밌다")

        val board : Board = boardRepository.saveBoard(createBoardRequestDto)

        assertThat(board.writer).isEqualTo("권지환")
        assertThat(board.title).isEqualTo("객체지향프로그래밍")
    }

}