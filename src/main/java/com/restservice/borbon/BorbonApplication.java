package com.restservice.borbon;

import com.restservice.borbon.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories
public class BorbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(BorbonApplication.class, args);

		/*Emails emails1 = new Emails("luanemiliano@gmail.com");
		Emails emails2 = new Emails("luanalberto@gmail.com");
		Emails emails3 = new Emails("bruna-emiliano@hotmail.com");

		Phones phone1 = new Phones("11988256687");
		Phones phone2 = new Phones("11968287779");
		Phones phone3 = new Phones("1122110230");
		Phones phone4 = new Phones("1134925101");

		Addresses addresses1 = new Addresses("R BEBEDOURO DE CIMA, 12, SAO PAULO - SP (CEP: 03383-140)","CAPAO DO EMBIRA","SAO PAULO","SP","3383140","12",null,"BEBEDOURO DE CIMA");
		Addresses addresses2 = new Addresses("R BEBEDOURO DE CIMA, 12, SAO PAULO - SP (CEP: 03383-140)","CAPAO DO EMBIRA","SAO PAULO","SP","3383140","12",null,"BEBEDOURO DE CIMA");

		RelatedPersons relatedPersonsHijo1 = new RelatedPersons("36042656813","LUIZ ALBERTO DE MELLO VIEIRA","Sibling",null,null,null);
		RelatedPersons relatedPersonsHijo2 new RelatedPersons("40850589835","DAVI ALBERTO DE MELLO VIEIRA","Sibling",null,null,null);
		RelatedPersons relatedPersonsMother = new RelatedPersons("60177144734","ELOA PACHECO DE MELLO VIEIRA","Mother",null,null,null);
		RelatedPersons relatedPersonsHijo3 = new RelatedPersons("40850807840","DANIEL ALBERTO DE MELLO VIEIRA","Sibling",null,null,null);

		Databusca db = new Databusca();*/

	}

}
