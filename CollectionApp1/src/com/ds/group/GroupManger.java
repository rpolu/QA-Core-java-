package com.ds.group;

import java.util.List;

public interface GroupManger {
	
	public void addGroup(GroupDto dto);
	
	public GroupDto getGroupDetails(int groupId);
	
	public List<GroupDto> getAllGroups(int servicpid);
	
	public void addMultiGrps(List<GroupDto> list);
	
	public void deleteGroup(int groupId);
	
	public void modifyGroup(GroupDto dto);
	
	

}
