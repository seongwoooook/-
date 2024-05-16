package bibim.backend.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreatePostDto {
    private String title;
    private String content;

    public CreatePostDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
