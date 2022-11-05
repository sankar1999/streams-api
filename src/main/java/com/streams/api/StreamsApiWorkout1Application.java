package com.streams.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class StreamsApiWorkout1Application {

	static List<Company> companies = new ArrayList<>();
	static{
		companies.add(new Company("SpaceX", "USA", "450000", List.of("Project1", "Project2")));
		companies.add(new Company("Tesla", "UK", "450000", List.of("Project1", "Project2")));
		companies.add(new Company("Solarcity", "Australia", "450000", List.of("Project1", "Project2")));

	}

	public static void main(String[] args) {
//		SpringApplication.run(StreamsApiWorkout1Application.class, args);

//		companies.stream()
//				.forEach(company -> System.out.println(company));

//		List<Company> legalCorporation = companies.stream()
//				.map(company -> new Company(
//						company.getCompanyName() + " inc",
//						company.getCompanyLocation(),
//						company.getCompanySalary(),
//						company.getCompanyProjects()
//				)).collect(Collectors.toList());
//
//		System.out.println(legalCorporation);

//		List<Company> filtereCompanies = companies.stream()
//				.filter(company -> company.getCompanyName().contains("T"))
//				.map(company -> new Company(
//						company.getCompanyName(),
//						company.getCompanyLocation(),
//						company.getCompanySalary(),
//						company.getCompanyProjects()
//				)).collect(Collectors.toList());
//
//		System.out.println(filtereCompanies);

		//Find First

//		Company findFirstCompany = companies.stream()
//				.filter(company -> company.getCompanyName().contains("S"))
//				.map(company -> new Company(
//						company.getCompanyName(),
//						company.getCompanyLocation(),
//						company.getCompanySalary(),
//						company.getCompanyProjects()
//				)).findFirst().orElse(null);
//		System.out.println(findFirstCompany);


	//FlatMap
//	String projects = companies.stream()
//			.map(company -> company.getCompanyProjects())
//			.flatMap(strings -> strings.stream())
//			.collect(Collectors.joining(","));
//
//		System.out.println(projects);

		//short circuit operations
//		List<Company> shortCircuit =
//				companies.stream()
//						.skip(2)
//						.limit(2)
//						.collect(Collectors.toList());
//		System.out.println(shortCircuit);

		//Finite Data
//		Stream.generate(Math::random)
//				.limit(5)
//				.forEach(value -> System.out.println(value));

		//sorting
		List<Company> sortedCompanies =
				companies
						.stream()
						.sorted((o1, o2) -> o1.getCompanyName().compareToIgnoreCase(o2.getCompanyName()))
						.collect(Collectors.toList());
		System.out.println(sortedCompanies);

	}
}
