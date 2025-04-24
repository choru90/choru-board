package choru.board.article.service.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CommentCreateRequest {
    private String title;
    private String content;
    private Long writerId;
    private Long boardId;
}
