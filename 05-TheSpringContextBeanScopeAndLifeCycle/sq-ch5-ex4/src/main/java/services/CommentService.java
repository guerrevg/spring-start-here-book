package services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy // tells Spring to create the bean only when someone refers to the bean
public class CommentService {

    public CommentService() {
        System.out.println("CommentService instance created!");
    }
}
