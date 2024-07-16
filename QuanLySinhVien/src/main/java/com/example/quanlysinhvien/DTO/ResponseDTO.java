package com.example.quanlysinhvien.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ResponseDTO <T>{
    private T data;
    private String message;

    public ResponseDTO(T data, String message) {
        this.data = data;
        this.message = message;
    }

    public ResponseDTO(T data) {
        this.data = data;
    }
    public ResponseDTO(String message) {
        this.message = message;
    }
}
