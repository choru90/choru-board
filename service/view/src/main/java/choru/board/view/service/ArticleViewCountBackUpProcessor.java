package choru.board.view.service;


import choru.board.view.entity.ArticleViewCount;
import choru.board.view.repository.ArticleViewCountBackUpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ArticleViewCountBackUpProcessor {
    private final ArticleViewCountBackUpRepository backUpRepository;

    public void backUp(Long articleId, Long viewCount){
        int result = backUpRepository.updateViewCount(articleId, viewCount);
        if(result == 0){
            backUpRepository.findById(articleId)
                    .ifPresentOrElse(ignored -> {},
                            () -> backUpRepository.save(ArticleViewCount.init(articleId, viewCount)));
        }

    }
}
