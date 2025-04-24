package choru.board.article.service.response;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class CommentPageResponse {
    private List<CommentResponse> articleList;
    private Long articleCount;

    public static CommentPageResponse of(List<CommentResponse> articleList, Long articleCount) {
        CommentPageResponse response = new CommentPageResponse();
        response.articleList = articleList;
        response.articleCount = articleCount;
        return response;
    }

}
