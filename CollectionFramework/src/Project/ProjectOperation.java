package Project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProjectOperation {



    private Map<Integer, Project> projects=new HashMap<>();

    
    public void addProject(int projectId, String projectName) {
        Project project = new Project(projectId, projectName);
        projects.put(projectId, project);
        System.out.println("Project added successfully.");
    }

    public void assignTeamMember(int projectId, Member member) {
    	
        Project project = projects.get(projectId);
        
        Set<Member>	team = new HashSet<>(); 
        if (project != null) {       	
        	if(project.getTeamMembers()!=null) {
        		team=project.getTeamMembers();
        	}
        team.add(member);
        
        project.setTeamMembers(team);
            System.out.println("Team member assigned to project.");
        } else {
            System.out.println("Project not found.");
        }
    }
    
    public void viewProjectDetails(int projectId) {
        Project project = projects.get(projectId);
        if (project != null) {
System.out.println(project);       
} else {
            System.out.println("Project not found.");
        }
    }
    public void listAllProjects() {
        System.out.println("List of all projects:");
        for (Map.Entry<Integer, Project> entry : projects.entrySet()) {
            Project project = entry.getValue();
            System.out.println(project);
        }
    }

	
}
