package com.souptik.Bookstore_Application_Zynetic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;


@SpringBootApplication(

		// excluding auto configure
		exclude = {
				DataSourceAutoConfiguration.class,
				HibernateJpaAutoConfiguration.class
		}
)

// for the created date and other mongo db features
@EnableMongoAuditing
public class BookstoreApplicationZyneticApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplicationZyneticApplication.class, args);
	}

}
