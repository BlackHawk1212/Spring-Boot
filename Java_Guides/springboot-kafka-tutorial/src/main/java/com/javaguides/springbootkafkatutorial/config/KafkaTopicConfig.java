package com.javaguides.springbootkafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaGuidesTopic(){
        return TopicBuilder.name("javaguides")
//                .partitions()                 You can give any number of value to create partitions
                .build();
    }

    @Bean
    public NewTopic javaGuidesJsonTopic(){
        return TopicBuilder.name("javaguides_json")
                .build();
    }

}
