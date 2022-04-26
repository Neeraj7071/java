package com.masai;

import java.time.LocalDate;
import java.util.Comparator;

public class LibraryManagement implements Comparator<LibraryManagement>  {
	private int memberId;
	private String memberName;
	private int membershipNo;
	private LocalDate membershipEnddate;
	
	public LibraryManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return " MemberId "+this.memberId+",MemberName "+this.memberName+",MembershipNo "+this.membershipNo+",MemmershipEnddate "+this.getMembershipEnddate();
	}

	public LibraryManagement(int memberId, String memberName, int membershipNo, LocalDate membershipEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershipEnddate = membershipEnddate;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getMembershipNo() {
		return membershipNo;
	}
	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}
	public LocalDate getMembershipEnddate() {
		return membershipEnddate;
	}
	public void setMembershipEnddate(LocalDate membershipEnddate) {
		this.membershipEnddate = membershipEnddate;
	}
	@Override
	public int compare(LibraryManagement o1, LibraryManagement o2) {
		if(o1.getMemberId()!=o2.getMemberId() &&o1.getMembershipNo() !=o2.getMembershipNo()) {
			if(o1.getMembershipEnddate().compareTo(o2.getMembershipEnddate())>0) {
			return 1;	
			}
			else if(o1.getMembershipEnddate().compareTo(o2.getMembershipEnddate())<0) {
				return -1;	
				}
			else {
				if(o1.getMemberId()>o2.memberId)
					return 1;
				else
					return -1;
			}
		}
		else {
			return 0;
		}
	}
}

