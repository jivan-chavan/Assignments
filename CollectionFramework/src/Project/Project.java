package Project;

import java.util.Set;

public class Project {
 private int projectId;
 private String projectName;
 private Set<Member> teamMembers;
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(int projectId, String projectName, Set<Member> teamMembers) {
	super();
	this.projectId = projectId;
	this.projectName = projectName;
	this.teamMembers = teamMembers;
}
public Project(int projectId, String projectName) {
	super();
	this.projectId = projectId;
	this.projectName = projectName;

}
public int getProjectId() {
	return projectId;
}
public void setProjectId(int projectId) {
	this.projectId = projectId;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}

public Set<Member> getTeamMembers() {
	return teamMembers;
}
public void setTeamMembers(Set<Member> teamMembers) {
	this.teamMembers = teamMembers;
}
@Override
public String toString() {
	return "Project [projectId=" + projectId + ", projectName=" + projectName + ", teamMembers=" + teamMembers + "]";
}

 
 
}
