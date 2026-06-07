package class_relationships._02_aggregation.company_team_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String role;
    private List<Team> teams = new ArrayList<>();

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void removeTeam(Team team) {
        if (teams.isEmpty()){
            return;
        }
        teams.remove(team);
    }

    public List<String> getTeamNames() {
        return teams.stream()
                .map(Team::getName)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
}
