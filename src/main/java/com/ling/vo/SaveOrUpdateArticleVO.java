package com.ling.vo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @author 傅帅  QQ:1766281636
 * @creat 2020- 11-24-下午 15:41
 **/

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SaveOrUpdateArticleVO {
    
    @ApiModelProperty(value = "//文章主键id")
    private Integer id;

    @ApiModelProperty(value = "//文章标题")
    private String articleTitle;

    @ApiModelProperty(value = "//文章内容")
    private String articleContent;

    @ApiModelProperty(value = "//文章封面")
    private String articleCover;

    @ApiModelProperty(value = "//分类id")
    private Integer categoryId;

    @ApiModelProperty(value = "//是否置顶 0：不置顶 1：置顶")
    private Boolean isTop;

    @ApiModelProperty(value = "//是否草稿 0：不是草稿 1:草稿")
    private Boolean isDraft;

    @ApiModelProperty(value = "//创建时间")
    private Date createTime;

    @ApiModelProperty(value = "//更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "标签列表ID")
    private List<Integer> tagIdList;

}
