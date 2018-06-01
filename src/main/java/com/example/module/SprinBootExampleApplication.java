package com.example.module;

import com.example.module.domain.es.Article;
import com.example.module.domain.es.Author;
import com.example.module.domain.es.Tutorial;
import com.example.module.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@EnableSwagger2
@Slf4j
public class SprinBootExampleApplication implements CommandLineRunner {
	@Autowired
	private ElasticsearchOperations es;

	@Autowired
	private ArticleService articleService;

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SprinBootExampleApplication.class, args);

//		KafkaSender sender = context.getBean(KafkaSender.class);
//
//		for (int i = 0; i < 3; i++) {
//			//调用消息发送类中的消息发送方法
//			sender.send();
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//=========================================================================
	}


	@Override
	public void run(String... strings) throws Exception {
		printElasticSearchInfo();
		//插入10条信息
		for (long i = 0; i < 10; i++) {
			Author author = new Author(null, "xmp", null);
//            System.out.println(author);
			Tutorial tutorial = new Tutorial(i, "test" + String.valueOf(i));
			Article article = new Article(i, "title", "abs", "content", new Date(), i, author, tutorial);
			articleService.save(article);
		}
		//fuzzey search
		Page<Article> articles = articleService.findByTitle("title", new PageRequest(0, 5));

		List<Article> articleList = articleService.findByTitle("title");

//        articles.forEach(x -> System.out.println(x));
//        articleList.forEach(article -> {
//            System.out.println(article);
//        });

		String queryString = "test1";//搜索关键字
		Iterable<Article> searchResult = articleService.search(queryString);
		Iterator<Article> iterator = searchResult.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private void printElasticSearchInfo() {
		log.info("--ElasticSearch-->");
		Client client = es.getClient();
		Map<String, String> asMap = client.settings().getAsMap();
		asMap.forEach((k, v) -> {
			log.info(k + "=" + v);
		});
	}


}
