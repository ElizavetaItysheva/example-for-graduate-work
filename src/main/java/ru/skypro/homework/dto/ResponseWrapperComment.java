package ru.skypro.homework.dto;

import lombok.Data;
import java.util.List;
@Data
public class ResponseWrapperComment {
    private Long count;
    private List<Comment> results;
}
