package com.OOP.board.controller

import com.OOP.board.dto.request.CreateBoardRequestDto
import com.OOP.board.dto.response.CreateBoardResponseDto
import com.OOP.board.service.role.BoardQueryService
import lombok.Getter
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@Getter
@RestController
abstract class BoardController(
    private val boardQueryService: BoardQueryService
){
    @PostMapping("/board")
    fun createBoard(
        @RequestBody createBoardRequestDto: CreateBoardRequestDto
    ): ResponseEntity<CreateBoardResponseDto>
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(boardQueryService.createBoard(createBoardRequestDto))
    }
}