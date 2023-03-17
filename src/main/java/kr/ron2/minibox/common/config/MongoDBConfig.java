package kr.ron2.minibox.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "kr.ron2.minibox")
public class MongoDBConfig {

}
