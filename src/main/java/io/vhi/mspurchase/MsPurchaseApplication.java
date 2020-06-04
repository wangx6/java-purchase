package io.vhi.mspurchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsPurchaseApplication {

	public static void main(String[] args) {
		System.out.print("###################  PURCHASE SERVICE  ########################");
		SpringApplication.run(MsPurchaseApplication.class, args);
	}

}
