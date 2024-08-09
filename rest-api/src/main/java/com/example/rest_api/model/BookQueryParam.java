package com.example.rest_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookQueryParam {
    private String category;
    private String issuedYear;
    private String issuedMonth;
    private String issuedDay;
}
