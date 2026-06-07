package class_relationships._02_aggregation.company_team_management;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Employee> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addMember(Employee employee) {
        members.add(employee);
        employee.addTeam(this);
    }

    public void dissolve() {
        members.forEach(e -> e.removeTeam(this));
        members.clear();
    }

    public String getName() {
        return name;
    }

    public List<Employee> getMembers() {
        return members;
    }

    public int getMemberCount() {
        return members.size();
    }
}
