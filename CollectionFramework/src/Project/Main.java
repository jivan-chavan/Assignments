package Project;

public class Main {


	public static void main(String[] args) {


		ProjectOperation projectOperation = new ProjectOperation();
		
		
		projectOperation.addProject(1, "Project1");
		projectOperation.addProject(2, "Project2");
		projectOperation.addProject(3, "Project3");
		
		projectOperation.listAllProjects();
		
		Member member1 = new Member(101, "A", "Team Lead");
		Member member2 = new Member(102, "B", "Developer");
		Member member3 = new Member(103, "C", "Designer");
		Member member4 = new Member(104, "D", "QA Engineer");
		Member member5 = new Member(105, "E", "Scrum Master");
		Member member6 = new Member(106, "F", "Product Manager");
		Member member7 = new Member(107, "G", "Business Analyst");
		Member member8 = new Member(108, "H", "Architect");
		Member member9 = new Member(109, "I", "Support Specialist");
		
		projectOperation.assignTeamMember(3, member1);
		projectOperation.assignTeamMember(2, member6);
		projectOperation.assignTeamMember(1, member7);
		projectOperation.assignTeamMember(3, member2);
		projectOperation.assignTeamMember(2, member5);
		projectOperation.assignTeamMember(1, member9);
		projectOperation.assignTeamMember(3, member3);
		projectOperation.assignTeamMember(2, member4);
		projectOperation.assignTeamMember(1, member8);
		

		projectOperation.viewProjectDetails(1);
		
		projectOperation.listAllProjects();

	}

}
