package com.study.generator;

import com.study.generator.entity.Person;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.junit.Test;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VelocityStudy2 {

    public static void main(String[] args) {
        VelocityEngine ve = new VelocityEngine();
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());

        ve.init();

        Template t = ve.getTemplate("hellovelocity2.vm");
        VelocityContext ctx = new VelocityContext();

        ctx.put("person", new Person("张三",18));
        ctx.put("date", (new Date()).toString());

        List temp = new ArrayList();
        temp.add("杨雪");
        temp.add("赵丽颖");
        temp.add("安哥拉baby");
        ctx.put("list", temp);

        StringWriter sw = new StringWriter();

        t.merge(ctx, sw);

        System.out.println(sw.toString());
    }
}
