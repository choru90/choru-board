package choru.board.article.controller;

import choru.board.article.service.CommentService;
import choru.board.article.service.request.CommentCreateRequest;
import choru.board.article.service.request.CommentUpdateRequest;
import choru.board.article.service.response.CommentPageResponse;
import choru.board.article.service.response.CommentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final CommentService commentService;

    @GetMapping("/v1/articles/{articleId}")
    public CommentResponse read(@PathVariable Long articleId) {
        return commentService.read(articleId);
    }

    @GetMapping("/v1/articles")
    public CommentPageResponse readAll(
            @RequestParam("boardId") Long boardId,
            @RequestParam("page") Long page,
            @RequestParam("pageSize") Long pageSize
    ) {
        return commentService.readAll(boardId, page, pageSize);
    }

    @GetMapping("/v1/articles/infinite-scroll")
    public List<CommentResponse> readAllInfiniteScroll(
            @RequestParam("boardId") Long boardId,
            @RequestParam("pageSize") Long pageSize,
            @RequestParam(value = "lastArticleId", required = false) Long lastArticleId
    ) {
        return commentService.readAllInfiniteScroll(boardId, pageSize, lastArticleId);
    }

    @PostMapping("/v1/articles")
    public CommentResponse create(@RequestBody CommentCreateRequest request) {
        return commentService.create(request);
    }

    @PutMapping("/v1/articles/{articleId}")
    public CommentResponse update(@PathVariable Long articleId, @RequestBody CommentUpdateRequest request) {
        return commentService.update(articleId, request);
    }

    @DeleteMapping("/v1/articles/{articleId}")
    public void delete(@PathVariable Long articleId) {
        commentService.delete(articleId);
    }
}
