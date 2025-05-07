package choru.board.view.service.response;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class ArticlePageResponse {
    private List<ArticleResponse> articleList;
    private Long articleCount;

    public static ArticlePageResponse of(List<ArticleResponse> articleList, Long articleCount) {
        ArticlePageResponse response = new ArticlePageResponse();
        response.articleList = articleList;
        response.articleCount = articleCount;
        return response;
    }

}
