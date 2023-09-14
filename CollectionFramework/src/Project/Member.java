package Project;

public class Member {
private int memberId;
private String memberName;
private String position;

public Member() {
	super();
	// TODO Auto-generated constructor stub
}
public Member(int memberId, String memberName, String position) {
	super();
	this.memberId = memberId;
	this.memberName = memberName;
	this.position = position;
}
public int getMemberId() {
	return memberId;
}
public void setMemberId(int memberId) {
	this.memberId = memberId;
}
public String getMemberName() {
	return memberName;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}


@Override
public String toString() {
	return "Member [memberId=" + memberId + ", memberName=" + memberName + ", position=" + position+"]";
}



}
