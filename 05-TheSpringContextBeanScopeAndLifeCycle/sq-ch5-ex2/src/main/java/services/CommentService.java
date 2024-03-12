package services;

import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
public class CommentService {

    private final CommentRepository repo;

    public CommentService(CommentRepository repo) {
        this.repo = repo;
    }

    public CommentRepository getCommentRepository() {
        return repo;
    }
}
