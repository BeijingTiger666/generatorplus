package com.study.generator;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.generator.dao.MovieDao;
import com.study.generator.entity.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Mybatistest {
    @Autowired
    private MovieDao dao;

    @Test
    public void wqerqwe(){
        final QueryWrapper<Movie> wrapper = new QueryWrapper<Movie>();
        wrapper.eq("movie_id",2);
        final List<Movie> movies = dao.selectList(wrapper);
        movies.stream().forEach(movie -> System.out.println(movie));
    }

}
