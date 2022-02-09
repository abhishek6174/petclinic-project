package om.eternal.petclinic.model;

import java.util.Set;

public class Vet extends Person implements Comparable<Vet>{
    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

    @Override
    public int compareTo(Vet o) {
        return (int)(this.id - o.id);
    }
}
