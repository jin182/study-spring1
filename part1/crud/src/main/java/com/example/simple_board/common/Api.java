package com.example.simple_board.common;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Api <T>{
    private T body;

    private Pagination pagination;

}
