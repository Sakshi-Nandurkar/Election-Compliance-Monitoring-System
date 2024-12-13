package com.tka.client;

import java.util.List;
import java.util.Scanner;

import com.tka.Entity.Candidate;
import com.tka.controller.CandidateController;

public class CandidateClient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CandidateController controller = new CandidateController();

		while (true) {
			System.out.println("\nMain Menu:");
			System.out.println("1. Insert Candidate");
			System.out.println("2. Update Candidate");
			System.out.println("3. Delete Candidate");
			System.out.println("4. Retrieve Candidate");
			System.out.println("5. Retrieve Candidate by party");
			System.out.println("6. Retrieve female Candidates only");
			System.out.println("7. Retrieve male Candidates only");
			System.out.println("8. Retrieve Male Candidate With Age above __");
			System.out.println("9. Retrieve female Candidate With Age above__");
			System.out.println("10. Retrieve all Candidate With Age above__");
			System.out.println("11. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();
			sc.nextLine();  

			switch (choice) {
			case 1:controller.insertCandidateData();
			break;
			case 2:controller.updateCandidate();
			break;
			case 3:controller.deleteCandidate();
			break;
			case 4:List<Candidate> allcandidate = controller.getAllCandidate();
					for (Candidate candidate : allcandidate) {
						System.out.println(candidate);
					}
			break;
			case 5 : controller.candidateParty();
			break;
			case 6 :controller.femaleCandidate();
			break;
			case 7 :controller.maleCandidate();
			break;
			case 8 :controller.MaleCandidateWithAgeabove();
			break;
			case 9 :controller.femaleCandidateWithAgeabove();
			break;
			case 10 :controller.allCandidateWithAgeabove();
			break;
			case 11:System.out.println("Exiting...");
			System.exit(0);
			break;
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}




	}
}
