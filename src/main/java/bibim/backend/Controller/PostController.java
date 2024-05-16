package bibim.backend.Controller;

import bibim.backend.domain.Post;
import bibim.backend.domain.dto.CreatePostDto;
import bibim.backend.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping("/post")
    public Long createPost(
            @RequestBody CreatePostDto createPostDto
    ) {
        return postService.createPost(createPostDto.getTitle(), createPostDto.getContent());
    }

    @GetMapping("/post/{postId}")
    public Post getPost(
            @PathVariable Long postId
    ) {
        return postService.findPost(postId);
    }
}
