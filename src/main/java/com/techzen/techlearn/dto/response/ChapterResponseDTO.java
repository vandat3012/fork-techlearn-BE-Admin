package com.techzen.techlearn.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChapterResponseDTO {

    Long id;
    String name;
    Integer chapter_order;
    Boolean isPublic;
    Long courseId;
}