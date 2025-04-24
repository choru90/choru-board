package choru.board.article.service.response;

import choru.board.article.entity.Comment;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class CommentResponse {
    private Long articleId;
    private String title;
    private String content;
    private Long boardId;
    private Long writerId;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public static CommentResponse from(Comment comment) {
        CommentResponse response = new CommentResponse();
        response.articleId = comment.getArticleId();
        response.title = comment.getTitle();
        response.content = comment.getContent();
        response.boardId = comment.getBoardId();
        response.writerId = comment.getWriterId();
        response.createdAt =  comment.getCreatedAt();
        response.modifiedAt =  comment.getModifiedAt();
        return response;
    }
}
