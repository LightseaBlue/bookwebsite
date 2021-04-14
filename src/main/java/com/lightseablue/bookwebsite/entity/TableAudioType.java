package com.lightseablue.bookwebsite.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

/**
 * 大类型下的小类型   ps:    音乐:流行音乐(TableAudioType)实体类
 *
 * @author LightseaBlue
 * @since 2021-01-13 18:20:54
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "大类型下的小类型   ps:    音乐:流行音乐")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TableAudioType extends Model<TableAudioType> implements Serializable {
    private static final long serialVersionUID = 239731521491467668L;

    @ApiModelProperty("主键id ")
    private Integer audioTypeId;

    @ApiModelProperty("所有类型id   做关联使用")
    private Integer allTypeId;

    @ApiModelProperty("小类型名")
    private String audioTypeName;

    @ApiModelProperty("创建人")
    private String audioTypeUser;

    @ApiModelProperty("图片")
    private String audioTypeImg;

    private String reserved1;

    private String reserved2;
}