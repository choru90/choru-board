package choru.board.article.service;

import choru.board.article.entity.Comment;
import choru.board.article.repository.CommentRepository;
import choru.board.article.service.request.CommentCreateRequest;
import choru.board.article.service.request.CommentUpdateRequest;
import choru.board.article.service.response.CommentPageResponse;
import choru.board.article.service.response.CommentResponse;
import kuke.board.common.snowflake.Snowflake;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final Snowflake snowflake = new Snowflake();

}
