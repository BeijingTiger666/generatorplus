package com.study.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author yangming
 * @since 2020-11-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "movie_id", type = IdType.AUTO)
    private Integer movieId;

    private Integer detailId;

    private String movieName;

    private String sname;

    private String namehash;

    private String movieType;

    private String movieUrl;

    private Date collectingTime;


}
