package bibim.backend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private Long id;
    private String title;
    private String content;

    @Builder
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static Post create(String title, String content) {
        return Post.builder()
                .title(title)
                .content(content)
                .build();
    }
}
