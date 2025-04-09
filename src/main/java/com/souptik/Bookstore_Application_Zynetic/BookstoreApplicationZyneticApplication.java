package com.souptik.Bookstore_Application_Zynetic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(
		exclude = {
				DataSourceAutoConfiguration.class,
				HibernateJpaAutoConfiguration.class
		}
)
public class BookstoreApplicationZyneticApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplicationZyneticApplication.class, args);
	}

}
