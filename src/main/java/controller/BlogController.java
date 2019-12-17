package

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

.controller;
        .entity.Blog;
        .service.BlogService;

/**
 * (Blog)表控制层
 *
 * @author makejava
 * @since 2019-12-17 20:03:41
 */
@RestController
@RequestMapping("blog")
public class BlogController {
    /**
     * 服务对象
     */
    @Resource
    private BlogService blogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Blog selectOne(String id) {
        return this.blogService.queryById(id);
    }

}