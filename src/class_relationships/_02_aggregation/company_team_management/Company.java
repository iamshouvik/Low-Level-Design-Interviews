package class_relationships._02_aggregation.company_team_management;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees = new ArrayList<>();
    private List<Team> teams = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void dissolveTeam(Team team) {
        team.dissolve();
        teams.remove(team);
    }

    public String getName() {
        return name;
    }

    public int getEmployeeCount() {
        return employees.size();
    }

    public int getTeamCount() {
        return teams.size();
    }
}
