package bibim.backend.service;

import bibim.backend.domain.Post;
import bibim.backend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Long createPost(String title, String content) {
        Post post = Post.create(title, content);
        postRepository.save(post);
        return post.getId();
    }

    public Post findPost(Long postId) {
        return postRepository.findById(postId);
    }
}
