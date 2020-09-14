package com.liushi.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.IOException;

/**
 * @ClassName JacksonConfig
 * @Description 测试Jackson中对null的处理, 期望将所有的null值变成""空字符串
 * @Author liushi
 * @Date 2020/9/14 19:55
 * @Version V1.0
 **/
@Configuration
public class JacksonConfig {

    @Bean
    @Primary
    @ConditionalOnMissingBean(ObjectMapper.class)
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
        // setNullValueSerializer将key-value串的value为空是,设置想要的结果
        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
            @Override
            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                // 期望将所有的null值转换为""控制符
                jsonGenerator.writeString("");
            }
        });
        return objectMapper;
    }
}
