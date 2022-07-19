package com.example.gamestudio.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ImageDTO {
    private Long imageId;
    private String urlFull;
    private String urlMiddle;
    private String urlThumb;
}
