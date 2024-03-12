package services;

import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
public class UserService {

    private final CommentRepository repo;

    public UserService(CommentRepository repo) {
        this.repo = repo;
    }

    public CommentRepository getCommentRepository() {
        return repo;
    }
}
