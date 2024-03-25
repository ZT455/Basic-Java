package model1;

import java.util.List;
import java.util.Objects;

public class Department  {

    private int maxNumberOfGroups;
    private List<Group> listGroups;

    public List<Group> getListGroups() {
        return listGroups;
    }

    public void setListGroups(List<Group> listGroups) {
        this.listGroups = listGroups;
    }

    public int getMaxNumberOfGroups() {
        return maxNumberOfGroups;
    }

    public void setMaxNumberOfGroups(int maxNumberOfGroups) {
        this.maxNumberOfGroups = maxNumberOfGroups;
    }

    @Override
    public String toString() {

        return "Department{" +
                "maxGroupsCount=" + maxNumberOfGroups +
                ", groups=" + listGroups +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Department)) return false;

        Department that = (Department) o;

        return maxNumberOfGroups == that.maxNumberOfGroups &&
                listGroups.equals(that.listGroups);
    }

    @Override
    public int hashCode() {

        return Objects.hash(maxNumberOfGroups, listGroups);
    }
}

