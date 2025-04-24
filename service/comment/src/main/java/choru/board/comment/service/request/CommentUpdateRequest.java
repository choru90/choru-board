package choru.board.article.service.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CommentUpdateRequest {
    private String title;
    private String content;
}
